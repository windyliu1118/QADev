package service.department.testcase;

import org.junit.BeforeClass;
import org.junit.Test;
import service.department.api.Tag;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class TestTag {

    static Tag tag = new Tag();

    @BeforeClass
    public static void beforeClass(){
        ArrayList<Integer> ids  = tag.tagList().then().extract().body().path("taglist.tagid");
        ids.forEach(id -> tag.deleteTag(id));
    }

    @Test
    public void create(){
        int id  = tag.createTag("Tag6").then().body("errmsg", equalTo("created")).extract().body().path("tagid");
        tag.tagList().then().body("taglist.tagid", hasItems(id));
    }

    @Test
    public void delete(){
        int id  = tag.createTag("Tag2").then().body("errmsg", equalTo("created")).extract().body().path("tagid");
        tag.deleteTag(id).then().body("errmsg", equalTo("deleted"));
    }
}
