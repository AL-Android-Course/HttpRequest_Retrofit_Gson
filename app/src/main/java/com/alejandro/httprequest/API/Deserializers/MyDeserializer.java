package com.alejandro.httprequest.API.Deserializers;

import com.alejandro.httprequest.Models.City;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.json.JSONObject;

import java.lang.reflect.Type;

/**
 * Created by Alejandro on 19/3/17.
 */

public class MyDeserializer implements JsonDeserializer<City> {


    @Override
    public City deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        int id = json.getAsJsonObject().get("id").getAsInt();
        String name = json.getAsJsonObject().get("name").getAsString();
        String country = json.getAsJsonObject().get("sys").getAsJsonObject().get("country").getAsString();
        // JsonObject obj = json.getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject();
        String icon = json.getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject().get("icon").getAsString();
        String description = json.getAsJsonObject().get("weather").getAsJsonArray().get(0).getAsJsonObject().get("description").getAsString();
        int temp = json.getAsJsonObject().get("main").getAsJsonObject().get("temp").getAsInt();

        City city = new City(id, name, country, icon, description, temp);
        return city;
    }
}
