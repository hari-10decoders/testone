Feature: Check the Elements and Pratice form field

Scenario: Check the name email and address field

    Given Launch the DemoQA website
    When I enter my name fullname name field
    And I enter my email address in email field
    And I enter my address address in address field
    And I enter my confirm address address in permenent address field
    Then I click the Sumbit button user able to view Enter details below 
    
    Scenario: Verifying Successful registration of Student Registration Form 
    
    When I Click the forms field
    And Click the practice form field
    And I enter my first name in name field
    And I enter my Last sname in name field
    And I enter my email in email field
    And I choose my gender 
    And I Enter the vaild mobile number 
    And I Select the date
    And I enter my choosed Subject 
    And I Click the my hobbies in Hobbies field
   
    #Then I should see a successful registration message