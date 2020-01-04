package service;

import io.restassured.http.ContentType;
import io.restassured.internal.mapping.Jackson1Mapper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class TestWork {

    static String token;
    static int parentDepartId = 2;

    @BeforeClass
    public static void getToken(){
        token =
                given()
                        .param("corpid", "ww7708b829b8d8f360")
                        .param("corpsecret", "UXIhHkQfLXB40MixRlq6BhiPMJuUWXhHhQjWlSJUVjw")
                .when()
                        .log().all()
                        .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then()
                        .log().all()
                        .body("errcode", equalTo(0))
                .extract()
                        .body().path("access_token");

        System.out.println(token);

    }

    @Test
    public void departCreate(){

        HashMap<String, Object> data = new HashMap<>();
        data.put("name", "department1");
        data.put("parentid", parentDepartId);


        given()
                .queryParam("access_token", token)
                .contentType(ContentType.JSON)
                .body(data)
        .when()
                .log().all()
                .post("https://qyapi.weixin.qq.com/cgi-bin/department/create")
        .then()
                .log().all()
                .statusCode(200)
                .body("errcode", equalTo(0));
    }
}
