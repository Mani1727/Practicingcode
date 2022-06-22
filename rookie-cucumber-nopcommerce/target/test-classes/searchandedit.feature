Feature: Search the product
  As a admin
  I want to search a product and edit.

  @Search
  Scenario: Searching the Product
    Given : The user is on the productpage
    When : The user searches for "Product name"
    And :click on search button
    Then :The product details should dislayed

  @edit
  Scenario: Edit the product details
    Given: The user is on the product info page

    When : The user click on edit button
    And : The User able to edit the product details
    And : Click on save
    Then : "The product has been updated successfully" the message should be displayed.
