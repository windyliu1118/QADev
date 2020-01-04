package service.work;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Work {
    private static Work work;
    public static Work getInstance(){
        if(work == null){
            work = new Work();
        }
        return work;
    }


    String token;

    public String getToken(){
        if(token == null) {
            token = given()
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
        return token;

    }
}
