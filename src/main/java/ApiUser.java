import Modle.UserRecrestModel;
import Modle.UserResponseModel;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class ApiUser {
    public UserResponseModel createUser(UserRecrestModel model) {
        return given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON)
                .body(model)
                .post("/api/users")
                .then()
                .statusCode(201)
                .log().all()
                .extract().response().as(UserResponseModel.class);



    }

}