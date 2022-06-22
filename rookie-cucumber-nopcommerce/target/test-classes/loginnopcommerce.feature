Feature: nop commerce
  
  In Nop commerce admin after login in ,need to add a new product and modify the values of the product
  then verify , delete the product and logout from nopcommerce.

  Scenario: login nopcommerce
    Given open the browser and launch the nopcommerce website
    When the valid credential entered for login the nopcommerce.
    Then the homepage should open and validate the homepage title
    And select the product from the catalog side bar
    Then the product tab should open
    
    
 
 
    

