package files;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class apiTesting_exercise {

	
		
		public static void main(String[] args) {
			
			RestAssured.baseURI="api.coindesk.com/v1/bpi/currentprice.json";//mahanteshbh77.atlassian.net
			//Login scenario
			
	SessionFilter session = new SessionFilter();
	
				
	String expectedMessage = "British Pound Sterling";
			
	response = getResponseFromURI(params[0], params[1]);
    
   
    String titleFromAPI = JsonPath.parse(response.getBody().asString()).read("$.GBP[0].description");
    System.out.println(titleFromAPI+" :API Responses");
   
    if(titleFromAPI.contains(expectedMessage)) {
        System.out.println("checking of parameter has been successful");
    }
}

}



