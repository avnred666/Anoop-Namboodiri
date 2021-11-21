# Monefy Android App Automated Tests

## Setting up the Test Suite
Ensure the following are installed:
1. Java Runtime Environment JRE 1,8,0_291
2. NodeJS v16.13.0
3. Appium v1.22.1
4. Android Studio 2020.3.1
	- Android Emulator 30.9.5
	- Android SDK Build tools - I had to downgrade this to 29.0.3 due to below issue *(java.lang.UnsupportedClassVersionError: com/android/apksigner/ApkSignerTool has been compiled by a more recent version of the Java Runtime (class file version 53.0), this version of the Java Runtime only recognizes class file versions up to 52.0)*
	- Android SDK Platform tools 31.0.3
5. Apache Maven 3.8.3

Libraries and Dependencies:
6. maven-surefire-plugin 3.0.0-M5
7. appium java client  7.6.0
8. testng 7.4.0

9. Clone the github repository
10. Ensure all pom.xml dependencies are resolved
11. Update emulator details in config.properties file
12. Run test suite from command line using "mvn test" or "mvn clean test" 

## Automation approach
**Selenium (Java) and Appium**
Appium is the leading open source mobile application automation tool. Along with selenium, it provides a host of easily usable libraries which can be used to automate mobile applications both native and web. I have worked with Appium before and hence I have used it. 
Page object model is used to ensure that code is easily maintainable. UI flow is separated from verification. Changes in UI can be easily incorporated by  making the changes in one place. Code is more readable and reusable.

**TestNG**
An easily usable testing framework which can be used to structure the test cases. We can write simple validation statements, group, order and prioritize test cases, define pre-requisites and post-requisites and so on. It brings an order to testing.

**Maven**
Maven is a open source build tool which standardizes project layout and structure. Dependency management is made easier and user just need to add a dependency to pom.xml for maven to take care of it. Easy to update dependent  libraries as well.


## What to test for 

**Income component**		
|Test Case  | Priority  | Test Level |
|--|--|--|
| Can user add a new income | H | Unit Testing, Integration Testing |
 | Can user edit an existing income | H  | Unit Testing, Integration Testing
 | Can user select an existing account for new/edit income  |H | Integration Testing
 | Can user select an existing category for new/edit income  |H |Integration Testing
 | Can user quick add a category for new/edit income  |M | Integration Testing
 | Can user add a note for new/edit income  |L | Unit Testing, Integration Testing
 | Does all fields accept the valid inputs and show proper messages for invalid input | M | Unit Testing, Integration Testing
 | Can user undo transactions |M | Unit Testing

**Expenses component**
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user add a new expense  |H | Unit Testing, Integration Testing
 | Can user edit an existing expense |H  | Unit Testing, Integration Testing
 | Can user select an existing account for new/edit expense  |H | Integration Testing
 | Can user select an existing category for new/edit expense |H | Integration Testing
 | Can user quick add a category for new/edit expense  | | Integration Testing
 | Can user add a note for new/edit expense  |L | Unit Testing, Integration Testing

**Accounts component**
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user edit an existing account  |H | Unit Testing
 | Can user add a new account  |H | Unit Testing
 | Can user transfer an amount between accounts  |H |Unit Testing, Integration Testing
 | Can user delete an existing account  |H | Unit Testing, Integration Testing, System Testing
 | Can user disable an existing account |H | Unit Testing, Integration Testing, System Testing
 | Does all field accept the valid inputs and show proper messages for invalid input |M |Unit Testing, Integration Testing
 | Can user undo transactions |M | Unit Testing, Integration Testing
 
**Categories component**
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user edit an existing category  |M | Unit Testing, Integration Testing
 | Can user disable an existing category  |M | Unit Testing, Integration Testing, System Testing
 | Can user delete an existing category  |M |Unit Testing, Integration Testing, System Testing
 | Can user merge two existing categories |H |Unit Testing, Integration Testing, System Testing
 | Can user re-enable a merged category |M |Unit Testing, Integration Testing, System Testing
 | Undo actions from confirmation message |M | Unit Testing, Integration Testing

**Homepage views**
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user view summary by account  |H | Integration Testing, System Testing, Acceptance Testing
 | Can user view the correct piechart summary by Day/Week/Month/Year/All/Interval/Chosen Date  |H |Integration Testing, System Testing, Acceptance Testing
 | Can user view list summary by Day/Week/Month/Year/All/Interval/Chosen Date  |H |Integration Testing, System Testing, Acceptance Testing
 | Can user sort list summary by category/date |H |Integration Testing, System Testing. Acceptance Testing
 | Can user scroll through the days/weeks/months/years depending on the selected view |H |Integration Testing, System Testing. Acceptance Testing
 | Are the values shown correct and do they update as per the selection |H |Integration Testing, System Testing. Acceptance Testing

**Search component**
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user search for categories  |L |Integration Testing, System Testing. Acceptance Testing
 | Can user search for specific dates |L |Integration Testing, System Testing. Acceptance Testing
 | Can user search for accounts  |L| Integration Testing, System Testing. Acceptance Testing
 | Can user search for expense notes  |M |Integration Testing, System Testing. Acceptance Testing
 | Can user search for income notes |M |Integration Testing, System Testing. Acceptance Testing

**Balance Settings**
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user view charts based on their budget in budget mode  |M | System Testing, Acceptance Testing
 | Can user view the right charts based on carry over in Carry over mode when switching between views  |M | System Testing, Acceptance Testing
 | Can user use the Future recurring records mode |M | System Testing, Acceptance Testing

**General Settings**
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user change the language of the app  |M | System Testing, Acceptance Testing
 | Can user change the currency used in the app and get the data reflected correctly  |H | System Testing, Acceptance Testing
 | Can user change the day of week and month and get data reflected correctly |L | System Testing, Acceptance Testing

**File/Data Backup settings** 
|Test Case  | Priority  | Test Level |
|--|--|--|
 | Can user export their data to a csv file  |M | System Testing, Acceptance Testing
 | Can user back up their data successfully  |H |System Testing, Acceptance Testing
 | Can user restore their data from a backup file |H  |System Testing, Acceptance Testing
 | Can user clear their data from the application and start anew |H |System Testing, Acceptance Testing

**E2E flow of how a user will use the app for money management**
 - Verify that users can perform their money management using the app. We are looking at an E2E flow which contains a series of actions: - H - System Testing, Acceptance Testing
	 - Add expenses in different categories at different times
	 - Add income in different categories at different times
	 - Add incomes and expenses across multiple accounts
	 - Verify that the views are consistent and the calculation of data correct
	 - What happens when user merge some categories - Does the app track correctly?
	 - What happens when user transfer amount across accounts- Does the app track correctly?
	 - Addition of budget mode and carry over
 - The above is just a rough thought regarding the possible scenarios which need to be structured and covered in testcases

## Prioritization of test cases
I have suggested prioritization of above testing areas in the exploratory testing charter. Here also, a similar prioritization logic is to be followed with respect to the functional areas mentioned above and in the exploratory charter. Prioritization within the test cases is given above with H-High, M-Medium, L-Low

## Proposed Test Levels
**Unit Testing**
It is recommended to have automated test cases at unit testing level. If we follow the Test driver development methodology, developers would need to write the test cases first and then code to pass them. In this case, individual modules can all be unit tested to ensure that there is no trivial errors that pass through the next stage.
Pros:
 - Low cost of fixing issues. Find early, fix early.
 - There is less bug seepage into next levels
 - Automated tests are easier to code as the person developing the code is writing test cases for it
 Cons: 
 - More time consumed in development process
 - Automated tests may be less reliable as for the same reason as it is easier to code
 - 
**Integration Testing**
Owned by QA. Performed when we have modules being integrated together. When a new module is developed performing integration testing with existing and other new modules is vital.
Pros:
 - Ensures that no existing functionality is broken
 - APIs can be thoroughly checked
 - Reduces possibility of regression issues
Cons: 
 - Less oriented to user experience
 - Can slow down overall development process
 - Time constraints 

**System Testing**
Owned by QA. Test the system as a whole.
Pros:
 - Cover all happy and unhappy paths of the application
 - Covers application of general configuration and settings for the entire application
 - Comprehensive automation suite can be run on the application as and when new functionalities are added
 - Shows the true stability of the app
 Cons:
 - Lesser time to fix issues depending on project constraints
 - Higher cost of quality - of fixing the issues

**Acceptance Testing**
Generally performed by the product owner in conjunction with QA.
Pros:
 - Ensure that app matches design specifications
 - Any UX/UI related changes can be highlighted better by product owners
 Cons: 
 - Very less time for fixing issues
 - High cost of quality
 - Issues found at this stage can cause a negative outlook towards the whole development cycle
