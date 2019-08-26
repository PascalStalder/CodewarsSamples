package cucumber;

import com.company.ShortestString;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class StepDefinitions {
    private ShortestString shortestString;

    @When("I enter the words {string}")
    public void iCheckIfTheNumberIsHappy(String words){
        shortestString = new ShortestString(words);
    }

    @Then("the answer is {int}")
    public void theAnswerIs(int length){
        assertThat(shortestString.getShortestWordLength()).isEqualTo(length);
    }

}
