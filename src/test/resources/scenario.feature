Feature: As a user I want to be able to log in, click on a promotion and log out

  Background:
    Given I am on William Hill promotions website

  Scenario Outline: I want to go to a promotion
    And I check footer display
    And I check links <title link> in left footer panel have correct url <Expected URL>

    Examples:
      |title link        | Expected URL|
      |Terms & Conditions|https://www.williamhill.com/app/answers/detail/a_id/6719|
      |Help              |https://www.williamhill.com/help                        |
      |Jobs & Careers    |http://careers.williamhillplc.com/                      |


  Scenario: I want to Log in, go to a promotion and logout
    When I click "Log in" button
    And I type my username
    And I type my password
    And I click "Log in" button
    And I click on second promotion
    And I check I am on correct page
    Then I log out



