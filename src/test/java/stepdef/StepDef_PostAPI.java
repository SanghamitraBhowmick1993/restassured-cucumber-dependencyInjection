package stepdef;

import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_PostAPI {
	private TestContext contxt;
	File jsonDataInFile = new File("src/test/resources/postcallpayload.json");

	public StepDef_PostAPI(TestContext contxt) {
		this.contxt = contxt;
	}

//	@Before
//	public void beforeMethod(Scenario scn) {
//		this.scn = scn;
//	}
//
//	@After
//	public void afterMethod(Scenario scn) {
//		scn.write("response" + resp);
//	}

	@When("i hit api with create path {string}")
	public void i_hit_api_with_createPath(String postpath) {
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-type", "application/json");
		contxt.resp = contxt.requestSpec.headers(headers).body(jsonDataInFile).when().post(postpath);
		System.out.println("resp:: " + contxt.resp.getBody().asString());
		// scn.write("body is " + body.toString());

	}

	@Then("validate response has name as {string}")
	public void response_has_name(String name) {
		contxt.validateResp.body("name", equalTo(name));

	}
}
