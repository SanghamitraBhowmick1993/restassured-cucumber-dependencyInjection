package stepdef;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TestContext {
	
	protected RequestSpecification requestSpec;
	protected Response resp;
	//protected Scenario scn;
	protected  ValidatableResponse validateResp;
	
}
