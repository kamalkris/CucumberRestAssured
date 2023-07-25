Feature: Validate books details
  I want to use this template for my feature file

  #Scenario: 1.Validate title and page number from getRequest of book api
    #Given hit the URI
  #	Then Validate the title "Git Pocket Guide" and pages "234" of application
   #
  #Scenario: 2.Validate other details from getRequest of book api
    #Given hit the URI
  #	Then Validate the isbn "9781449325862" from get book request
  #	And Validate the author "Richard E. Silverman" from get book request
  #	And Validate the publisher "O'Reilly Media" from get book request
  #	And Validate the subTitle "A Working Introduction" from get book request
   #
 #Scenario: 3.Validate other details from getRequest of book api using single sd
    #Given hit the URI
  #	Then Validate the value for "books[0].isbn" is "9781449325862"
  #	Then Validate the value for "books[0].author" is "Richard E. Silverman"
  #	Then Validate the value for "books[0].publisher" is "O'Reilly Media"
  #	Then Validate the value for "books[0].subTitle" is "A Working Introduction"
  #	
 #Scenario: 4.Validate book details dynamically
    #Given hit the URI
    #Then validate value for attribute "title" is "Git Pocket Guide" present in response
    #Then validate value for attribute "author" is "Axel Rauschmayer" present in response
  #	

 Scenario: 5.Validate book details dynamically with data table
    Given hit the URI
    Then Validate the value for below data
      | books[0].isbn     |  9781449325862 |
      | books[0].author    | Richard E. Silverman |
      | books[0].publisher  | O'Reilly Media |
      | books[0].subTitle   | A Working Introduction |