package service.department.api;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import service.work.Work;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Tag {

    public Response createTag(String tagName) {
        HashMap<String, Object> data = new HashMap<>();
        data.put("tagname", tagName);

        return given()
                .queryParam("access_token", Work.getInstance().getToken())
                .contentType(ContentType.JSON)
                .body(data)
                .when().log().all()
                .post("https://qyapi.weixin.qq.com/cgi-bin/tag/create")
                .then().log().all()
                .body("errcode", equalTo(0))
                .extract().response();

    }

    public Response deleteTag(int tagId) {
        return given().queryParam("access_token", Work.getInstance().getToken())
                .queryParam("tagid", tagId)
                .when().log().all()
                .get("https://qyapi.weixin.qq.com/cgi-bin/tag/delete")
                .then().log().all()
                .body("errcode", equalTo(0))
                .extract().response();
    }

    public Response tagList(){
        return given().queryParam("access_token", Work.getInstance().getToken())
                .when().log().all()
                .get("https://qyapi.weixin.qq.com/cgi-bin/tag/list")
                .then().log().all()
                .body("errcode", equalTo(0))
                .extract().response();

    }
}
