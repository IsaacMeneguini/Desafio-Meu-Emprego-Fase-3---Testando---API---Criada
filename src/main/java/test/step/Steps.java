package test.step;

import io.restassured.http.ContentType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Steps {

    cadastroUser user = new cadastroUser("joao", "voador");
    String url = "http://localhost:8080/estrutura";
    @Test
    @DisplayName("lancando no body")

    public void lancandoDados(){

        given()
                .contentType(ContentType.JSON)
                .body(user)
                .when().post(url)
                .then()
                .log().all()
                .statusCode(201)
        ;
    }
    @Test
    @DisplayName("Validando body")

    public void consultarDados() {

        given()
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .body("nome", hasItem("joao"))




;

    }

}
