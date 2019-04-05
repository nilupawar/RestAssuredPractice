package com.nilesh.practice;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class RestAssuredSyntax {
    public static void main(String[] args){

        given().contentType(ContentType.JSON);
        given().baseUri("").when().get("").then();

    }
}
