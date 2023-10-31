import io.restassured.RestAssured;

public class post_request {
    public static void main(String[] args) {

        // post request (get token)
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/api-clients/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "   \"clientName\": \"mustafaawad\",\n" +
                        "   \"clientEmail\": \"mustafa10@example.com\"\n" +
                        "}")
                .when()
                .post()
                .prettyPrint();

    }
}
