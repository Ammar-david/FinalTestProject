package Helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TempAPI {

    RequestSpecification httpRequest;
    Response response;

    String url = "http://localhost:3000/";

    @Test
    public void testAPI(){
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");

        //Get Request
        response = httpRequest.get("/api/teams/search");

        //Post + Put + Delete Request
//        JSONObject params = new JSONObject();
//        params.put("name", "CTeam");
//        params.put("email", "Kuku@gmail.com");
//
//        httpRequest.header("Content-Type", "application/json");
//
//        httpRequest.body(params.toJSONString());
//        POST
//        response= httpRequest.post("/api/teams");
//        PUT
//        response= httpRequest.put("/api/teams/8");

//        DELETE
//        response= httpRequest.delete("/api/teams/6");

        //System.out.println(response.getBody().asString());
        response.prettyPrint();
    }


}
