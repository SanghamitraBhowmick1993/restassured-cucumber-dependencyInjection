package stepdef;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef_GetAPI {
	
	private TestContext contxt;
	public StepDef_GetAPI(TestContext contxt) {
		this.contxt = contxt;
	}

//	@Before
//	public void beforeMethod(Scenario scn) {
//		contxt.scn;
//		//this.scn = scn;
//	}
//
//	@After
//	public void afterMethod(Scenario scn) {
//		scn.write("response" + contxt.getResp());
//	}

	@Given("i have an api")
	public void i_have_an_api() {
		//contxt.requestSpec = given().baseUri(baseUri);
		contxt.requestSpec = given().baseUri(ConfigReader.getUrl());
		
		//contxt.scn = write("base uri is " + ConfigReader.getUrl());

	}

	@When("i hit api with apipath {string}")
	public void i_hit_api_with_product_id_as(String path) {
		contxt.resp = contxt.requestSpec.when().get(path);
		//contxt.setResp(resp);
		System.out.println("resp:: " + contxt.resp.getBody().asString());

	}


	@Then("status code is {int}")
	public void status_code_is(Integer statuscode) {
		contxt.validateResp = contxt.resp.then();
		contxt.validateResp.statusCode(statuscode);
	}

	@Then("response has id as {int}")
	public void response_has_product_id_as(Integer numberexp) {
		contxt.validateResp.body("data.id", equalTo(numberexp));
	}

	@Then("firstname is {string}")
	public void firstname_is(String fname) {
		contxt.validateResp.body("data.first_name", equalTo(fname));

	}

	@Then("support text message is {string}")
	public void support_text_message_is(String supportText) {
		contxt.validateResp.body("support.text", equalTo(supportText));

	}

}
