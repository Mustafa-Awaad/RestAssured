import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class OrdersNBDD {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://simple-books-api.glitch.me" ;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        request.header("Authorization","Bearer f3b0268a919015bab3fbd4a519bb84f4637936068db9af6ec3bfe96e2fb83f4a");
        request.body("{\n" +
                " \"bookId\":1 , \n" +
                " \"customerName\": \"ahmed\"\n" +
                "}");
        Response response = request.post("/orders");
        response.prettyPrint();



    }
}
