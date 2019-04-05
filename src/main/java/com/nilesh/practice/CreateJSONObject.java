package com.nilesh.practice;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateJSONObject {
    public static void main(String[] args) throws IOException, ParseException {

        // ----------------------------------------------------------------------
        // This example is to create JSON object which has array as well inside
        JSONObject childJsonObject = new JSONObject();
        childJsonObject.put("name","Tulja");
        childJsonObject.put("age",1);

        JSONObject childJsonObject2 = new JSONObject();
        childJsonObject2.put("name","Tulja");
        childJsonObject2.put("age",2);

        JSONObject parentJsonObject =  new JSONObject();
        parentJsonObject.put("FirstName","Nilesh");
        parentJsonObject.put("LastName","Pawar");
        parentJsonObject.put("Children", Arrays.asList(childJsonObject,childJsonObject2));

        System.out.println("Json object is " + parentJsonObject.toJSONString());
        // ----------------------------------------------------------------------

        // ----------------------------------------------------------------------
        // This example is read a json file and iterate over elements with-in
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonReader =  (JSONObject)jsonParser.parse(new FileReader("./fileResources/data.json"));
        JSONArray s = (JSONArray) jsonReader.get("Children");


    }
}
