@address
Feature: User can add address in to account

 Scenario Outline: User can add address in to account

    Given I go to main page
    When I go to sign in
     And I login using "dupa666@gmail.com" and "secretpassword666"
     And I go to my account page
     And I go to create new address
     And I enter new alias <alias> address <address> city <city> postal <postal> country <country> phone <phone>
     And I verify created alias <alias> address <address> city <city> postal <postal> country <country> phone <phone>

     And I remove the address
    Then I can see message that address was removed with text "Address successfully deleted!"

#     And I close shop page

  Examples:
    |alias|address|city|postal|country|phone|
    |Kaer Trolde|Kaer Trolde|Skellige 2|11-111 |United Kingdom|987654321|
