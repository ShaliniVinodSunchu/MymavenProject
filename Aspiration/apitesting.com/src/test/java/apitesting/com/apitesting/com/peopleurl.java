package apitesting.com.apitesting.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class peopleurl {
	
	@Test
	void visitSite()
	{
		
		
		
		RestAssured.baseURI="https://swapi.dev/";
		RequestSpecification reqspc=RestAssured.given();
		Response response=reqspc.request(Method.GET,"people");
		String result=response.getBody().asString();
		int statuscode=response.getStatusCode();
		//System.out.println("Success before");
		Assert.assertEquals(statuscode, 404);
			System.out.println("Success");
			int n[]=new int[82];
			String s[]=new String[11];
			int count=0;
			String name[]=new String[82];
			String namelist[]= {"Darth Vader","Chewbacca","Roos Tarpals","Rugor Nass","Yarael Poof"," Lama Su","Tuan Wu","Grievous","Tarfful","Tion Medon"};
			for(int i=0;i<82;i++)
			{
		     n[i]=response.jsonPath().get("height");
		     if(n[i]>200)
		     {
		    	 count++;
		    	 s[i]=response.jsonPath().get("name");
		    	 System.out.println(s);
		    	
		     }
		    Assert.assertEquals(s, namelist); 
		    s.equals(namelist);
		     
			}
			
			
			
	Assert.assertEquals(count, 10);
	
	
	int c=response.jsonPath().get("count");
	Assert.assertEquals(c, 82);

	}

	
	
}
