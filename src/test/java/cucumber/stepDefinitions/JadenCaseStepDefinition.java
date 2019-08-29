package cucumber.stepDefinitions;

import com.company.JadenCase;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class JadenCaseStepDefinition {

    private JadenCase testee = new JadenCase();
    private String jadenString;

    @When("I enter the sentence: {string}")
    public void iConvertToJadeCase(String sentence){
        jadenString = testee.toJadenCase(sentence);
    }

    @Then("It returns the sentence: {string}")
    public void checkReturnString(String wantedSentence){
        assertThat(jadenString).isEqualTo(wantedSentence);
    }

}
