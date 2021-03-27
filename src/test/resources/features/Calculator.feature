@calculator
Feature: Claculator

  Scenario Outline: verify calculator <type>

    Given I open the basic calculator page
    Then I select "<build option>"
    And I send first "<number1>"
    And I send second "<number2>"
    And I select operation "<type>"
    Then I click calculate
    Then I verify answer is "<result>"

    Examples:

      | type        | build option | number1     | number2 | result      |
      | Add         | 2            | 5           | 5       | 10          |
      | Add         | 2            | -5          | 5       | 0           |
      | Add         | 2            | -5          | -5      | -10         |
      | Subtract    | 2            | 5           | 5       | 0           |
      | Subtract    | 2            | -5          | 5       | -10         |
      | Subtract    | 2            | -5          | -5      | 0           |
      | Multiply    | 2            | 5           | 5       | 25          |
      | Multiply    | 2            | -5          | 5       | -25         |
      | Multiply    | 2            | -5          | -5      | 25          |
      | Divide      | 2            | 5           | 5       | 1           |
      | Divide      | 2            | -5          | 5       | -1          |
      | Divide      | 2            | -5          | -5      | 1           |
      | Concatenate | 2            | 5           | 5       | 55          |
      | Concatenate | 2            | -5          | 5       | -55         |
      | Concatenate | 2            | -5          | -5      | -5-5        |
      | Multiply    | 2            | 1000000000 | 50       | 50000000000 |