Feature: login to orange hrm

  Scenario Outline: validate user able to logged in
    Given user navigated to login page
    When user enters "<username>", "<password>" and click on login button
    Then user should be able to view dashboard

    Examples: 
      | username | password |
      | Admin    | admin123 |