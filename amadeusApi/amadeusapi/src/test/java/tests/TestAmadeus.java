package tests;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;

public class TestAmadeus {
    @Test
    public void test_status() {

        given().
                get("https://flights-api.buraky.workers.dev/").
        then().
                statusCode(200);
    }
    @Test
    public void test_schema(){
        given().
                get("https://flights-api.buraky.workers.dev/").
        then().
                assertThat().body(matchesJsonSchemaInClasspath("schema.json"));
    }
    @Test
    public void test_header(){
        given().
                get("https://flights-api.buraky.workers.dev/").
        then().
                header("content-type", "application/json");
    }
}
