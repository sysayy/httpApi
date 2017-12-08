package api.test.postman;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import net.sf.json.JSONObject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.test.obj.postObj;
import api.test.util.Assertion;
import api.test.util.BaseTest;
import api.test.util.JsonToObj;


@Listeners({ api.test.util.AssertionListener.class })
public class Test002_post extends BaseTest {


    @Test
    public void Post() throws Exception {
    	JSONObject js = new JSONObject();
		JsonToObj cj = new JsonToObj();
		postObj pj = new postObj(getId("id"), getId("name"), getId("description"));
		String json = cj.Object2Json(pj);
		System.err.println(json);
        Response response = given().contentType("application/json").body(json).post(getId("url"));
        String response1 = given().contentType("application/json").body(json).get(getId("url")).asString();
        System.err.println(response1);
        Assertion.verifyEquals(getId("id"), response.jsonPath().getString("info._postman_id"), "获取 info.name 不准确");
        Assertion.verifyEquals(getId("name"), response.jsonPath().getString("info.name"), "获取 info._postman_id 不准确");
        Assertion.verifyEquals(getId("description"), response.jsonPath().getString("info.description"), "获取 info.description 不准确");

    }


}
