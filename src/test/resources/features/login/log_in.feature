Feature: Log in

  Scenario: Try to log in with not valid credentials
    Given John Wick wants to create a new post
    When he sends his credentials
    Then he should see the dashboard