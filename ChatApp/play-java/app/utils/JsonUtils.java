package utils;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;

/**
 * 
 * classe responsavel por converter os request para um objeto
 */
public class JsonUtils extends Json{
	
	public static <T> T fromJson(String json, Class<T> classe){
		JsonNode jsonNode = parse(json);
		return fromJson(json,classe);
	}
}
