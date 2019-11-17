

#Author: jhvergaral@gmail.com
#language:en

Feature: Google HomePage Search

  Background:
    Given the user navigate to the homepage


  Scenario: User can search with Google Search

    When the user search The name of the wind in google
    Then the user see that the first result is The Name of the Wind - Patrick Rothfuss
    And the user see that the page showed after he clicked is Patrick Rothfuss - The Books


  Scenario: User can search by using the suggestions

    When the user search The name of the w in google using the suggestion list
    Then the user see that the first result is The Name of the Wind - Patrick Rothfuss
    And the user see that the page showed after he clicked is Patrick Rothfuss - The Books




