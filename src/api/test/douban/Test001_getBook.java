package api.test.douban;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.test.util.Assertion;
import api.test.util.BaseTest;


@Listeners({ api.test.util.AssertionListener.class })
public class Test001_getBook extends BaseTest {


    @Test
    public void Get() throws Exception {
        Response response = given().get(url+getId("url"));
        String response1 = given().get(url+getId("url")).asString();
        System.err.println(response1);
        Assertion.verifyEquals(368, response.jsonPath().getInt("rating.numRaters"), "获取rating numRaters 不准确");
        Assertion.verifyEquals(getId("name"), response.jsonPath().getString("tags.name[0]"), "获取 tags.name[0] 不准确");
        Assertion.verifyEquals(getId("title"), response.jsonPath().getString("tags.title[1]"), "获取 tags.title[1] 不准确");

    }


}