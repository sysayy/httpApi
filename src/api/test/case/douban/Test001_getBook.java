package api.test.case.douban;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import api.test.util.Assertion;
import api.test.util.BaseTest;
import api.test.obj.clientCommonInfo;
import api.test.obj.Account.Get;
import api.test.util.JsonToObj;
import net.sf.json.JSONObject;


@Listeners({ api.test.util.AssertionListener.class })
public class Test001_getBook extends BaseTest {


    @Test
    public void Get() throws Exception {
        Response response = given().get(url+getId("url"));
        String response1 = given().get(url+getId("url")).asString();
        System.err.println(response1);
        Assertion.verifyEquals(getId("numRaters"), response.jsonPath().getInt("rating.numRaters"), "获取rating numRaters 不准确");

    }


}