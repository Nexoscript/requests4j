package com.nexoscript.requests4j.test;

import com.nexoscript.requests4j.HttpRequest;
import com.nexoscript.requests4j.HttpResponse;
import com.nexoscript.requests4j.Method;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        HttpRequest request = new HttpRequest(Method.GET, "https://eztxm.de");
        HttpResponse response = request.send();
        System.out.println(response.statusCode());
        System.out.println(response.headers().entrySet());
        System.out.println(response.body());
    }
}
