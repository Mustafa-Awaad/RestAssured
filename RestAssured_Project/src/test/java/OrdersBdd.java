import io.restassured.RestAssured;
import io.restassured.internal.RequestLogSpecificationImpl;

import static io.restassured.RestAssured.when;

public class OrdersBdd {
    private static RequestLogSpecificationImpl response;

    public static void main(String[] args) {
// create order 1
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .body("""
                        {
                            "bookId": 4,
                            "customerName": "mustafa"
                        }""")
                .when()
                .post("/orders")
                .then()
                .extract().response().prettyPrint();
//////
//////        // create order 2
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .body("{\n" +
                        "\"bookId\":1 ,\n" +
                        "\"customerName\": \"ahmed\"\n" +
                        "}" )
                .when()
                .post("/orders")
                .prettyPrint();
//////
//////
//////        // get  all orders
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/orders")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .when()
                .get()
                .prettyPrint() ;
//////        // get  an order
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/orders/NLJfjMMOgQ2ZF3KPiqg03")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .when()
                .get()
                .prettyPrint() ;
////        // update an order (patch)
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/orders/gVcQHEbcHBpBynHqEy8N_")
                //.queryParam("orderId","gVcQHEbcHBpBynHqEy8N_")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .body("\n" +
                        "{\n" +
                        "  \"customerName\": \"ali\"\n" +
                        "} ")
                .when()
                .patch()
                .prettyPrint() ;
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/orders/gVcQHEbcHBpBynHqEy8N_")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .when()
                .get()
                .prettyPrint() ;
//


//        // Delete an order
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/orders/baIvtjpsvv53U7THv2Qm_")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .when()
                .delete()
                .prettyPrint() ;
        RestAssured
                .given()
                .baseUri("https://simple-books-api.glitch.me/orders/baIvtjpsvv53U7THv2Qm_")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 8eb9b1654a73891e2d4ebe842b704077796fd960e003330b10df785b3d765449")
                .when()
                .get()
                .prettyPrint() ;





    }
}
