package com.example.testNgrok;

import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONArray;
import org.json.JSONObject;

@RestController
public class Controller {
    @GetMapping(path = "/hello")
    public String getHelloWorld(){
        return "Hello World.";
    }

    @PostMapping(path = "/Webhook")
    public void getHelloWorld2(@RequestBody String object) throws JSONException {
        System.out.println();
        System.out.println(object);
        System.out.println();
    }

}
