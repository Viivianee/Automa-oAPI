package Api;

import static io.restassured.RestAssured.given;

import org.junit.Test;
import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class MinhaPrimeiraAutomacaoApi {
	
	private Response response;
	private Request request;
	
	//@Test
   public void consultarPetsAvalibe() {
	   String get = "https://petstore.swagger.io/v2/pet";
	   response = RestAssured.request(Method.GET,get);
	   System.out.println(response.asString());
	   System.out.println(response.statusCode());
	   
	  // System.out.println(response.statusCode() ==200 );
   }
	//@Test
	public void CriarNovoPet( ) {
		given().log().all().contentType("Aplication/json").body(" \"id\": 688,\r\n"
				+ "    \"category\": {\r\n"
				+ "        \"id\": 0,\r\n"
				+ "        \"name\": \"Skay\"\r\n"
				+ "    },\r\n"
				+ "    \"name\": \"Skay\",\r\n"
				+ "    \"photoUrls\": [\r\n"
				+ "        \"string\"\r\n"
				+ "    ],\r\n"
				+ "    \"tags\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 0,\r\n"
				+ "            \"name\": \"string\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"status\": \"available\"\r\n"
				+ "}" )
		.when().post("https://petstore.swagger.io/v2/pet").then().log().all();
	} 
	// @Test
	 public void EditarCadastroDoPet() {
		 given().log().all().contentType("Aplication/json").body(" {\r\n"
		 		+ "        \"id\": 688,\r\n"
		 		+ "        \"category\": {\r\n"
		 		+ "            \"id\": 0,\r\n"
		 		+ "            \"name\": \"string\"\r\n"
		 		+ "        },\r\n"
		 		+ "        \"name\": \"DanielVargas\",\r\n"
		 		+ "        \"photoUrls\": [\r\n"
		 		+ "            \"string\"\r\n"
		 		+ "        ],\r\n"
		 		+ "        \"tags\": [\r\n"
		 		+ "            {\r\n"
		 		+ "                \"id\": 0,\r\n"
		 		+ "                \"name\": \"string\"\r\n"
		 		+ "            }\r\n"
		 		+ "        ],\r\n"
		 		+ "        \"status\": \"available\"\r\n"
		 		+ "    },")
		 .when().put("https://petstore.swagger.io/v2/pet?=688&&688&=Mel&").then().log().all();
	 }
	@Test
	public void DeletarPetAtivi ( ) {
		given().log().all().contentType("application/json").header("petId", "688").when().delete("https://petstore.swagger.io/v2/pet/688").then().log().all();  
	}
	
}
