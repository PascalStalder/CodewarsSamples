Feature: JadenCase

  Scenario: Checking three words with Caps and no caps
    When I enter the sentence: "What the test?"
    Then It returns the sentence: "What The Test?"