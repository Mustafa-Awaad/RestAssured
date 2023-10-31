import io.restassured.RestAssured;

public class get_request {
    public static void main(String[] args) {
// get status BDD
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/status")
                .when()
                .get()
                .prettyPrint();
        // get books BDD
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/books")
                .when()
                .get()
                .prettyPrint();
        // get a single book BDD
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/books/5")//.queryParam("id","2")
                .when()
                .get()
                .prettyPrint();

    }

}
