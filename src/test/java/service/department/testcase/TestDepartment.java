package service.department.testcase;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.junit.Test;
import service.department.api.Department;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class TestDepartment {

    static Department department = new Department();

    @BeforeClass
    public static void beforeAll(){

        ArrayList<Integer> ids = department.getList(department.parentDepartId).then().extract().body().path("department.findAll { d -> d.parentid == " + department.parentDepartId + "}.id");
        ids.forEach(id -> department.delete(id));
    }



    @Test
    public void list(){
       department.getList(department.parentDepartId).then().body("errmsg", equalTo("ok"));
    }

    @Test
    public void create(){

//        ArrayList<Integer> ids = department.getList(department.parentDepartId).then().extract().body().path("department.findAll { d -> d.parentid == " + department.parentDepartId + "}.id");
//        System.out.println(ids);
//        //ids.forEach(id -> department.delete(id));

        int id = department.create("department4").then().body("errmsg", equalTo("created")).extract().body().path("id");
        department.getList(department.parentDepartId).then().body("department.id", hasItems(id));
    }

    @Test
    public void delete(){
        int department_id = department.create("department3").then().body("errmsg", equalTo("created")).extract().body().path("id");
        department.delete(department_id).then().body("errmsg", equalTo("deleted"));

    }
}
