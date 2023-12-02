Feature: Customers

Scenario: Add a new customer
			Given user launch chrome browser
			When user open url  "https://admin-demo.nopcommerce.com/login"
			And User enters email as "admin@yourstore.com" and password as "admin"
			And Click on Login
			Then User can view the dashboard
			When User click on Customers menu
			And Click on customers menu item
			And Click on Add new button
			Then user can view the Add new customer page
			
				
			When user enter the customer info
			And click on Save button
			Then user can view the confirmation message "The new customer has been added successfully"
			And Close browser
			
			
			
Scenario: Search customer by email and username
			When User click on Customers menu
			And Click on customers menu item
			And Enter customer email
			And Click on search button
			Then User should found email in the search table
			And Close the browser
		