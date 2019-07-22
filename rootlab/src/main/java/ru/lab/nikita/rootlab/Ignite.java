package ru.lab.nikita.rootlab;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedHashMap;

public class Ignite {
    public static void main(String[] args) throws IOException {
        String json = "{\"name\": \"nikita\"}";
        ObjectMapper mapper = new ObjectMapper();
        LinkedHashMap<String, String> linkedHashMap = mapper.readValue(json, LinkedHashMap.class);
        System.out.println("Hello world");
    }
}
