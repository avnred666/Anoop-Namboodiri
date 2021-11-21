# Exploratory Test Charter - Monefy iOS App

**Note: This charter is from the perspective of a free user**
|  Charter 1| Accounts |
|--|--|
| Explore| Accounts component for free users  |
| With| Functions <br/> *Add account<br/>*Transfer <br/> Data set <br/> *Valid inputs <br/> *Invalid inputs<br/>*Chosen icons<br/>*Cancelations mid-transaction |
| To Discover| -Can user edit an existing account<br/>    -Can user add a new account<br/>-Can user transfer an amount between accounts<br/>-Can user delete an existing account<br/>-Can user disable an existing account  |
| Priority| High  |
| Time Estimate| 30 minutes |

|  Charter 2| Categories|
|--|--|
| Explore| Categories component for free users  |
| With| Functions <br/> *Update category <br/> Data set <br/> *Valid inputs <br/> *Invalid inputs<br/>*Chosen icons<br/>*Cancelations mid-transaction<br/>*Categories with and without values|
| To Discover| -Can user edit an existing category <br/>    -Can user disable an existing category <br/>-Can user delete an existing category <br/>-Can user merge two existing categories <br/>-Can user re-enable a merged category <br/>-Undo actions from confirmation message |
| Priority| High  |
| Time Estimate| 40 minutes |

|  Charter 3| Income|
|--|--|
| Explore| Expenses component for free users  |
| With| Functions <br/> *Add income <br/> *Edit income <br/> *Schedule income<br/> Data set <br/> *Valid inputs <br/> *Invalid inputs<br/>*Chosen icons<br/>*Cancelations mid-transaction<br/>*Incomes with and without values|
| To Discover| -Can user add a new income <br/>-Can user edit an existing income <br/>-Can user select an existing account for new/edit income <br/>-Can user select an existing category for new/edit income<br/>-Can user quick-add a category for new/edit income <br/>-Can user add a note for new/edit income<br/>-Can user schedule income|
| Priority| High  |
| Time Estimate| 60 minutes |

|  Charter 4| Expenses |
|--|--|
| Explore| Expenses component for free users  |
| With| Functions <br/> *Add expense <br/> *Edit expense <br/> *Schedule expense <br/> Data set <br/> *Valid inputs <br/> *Invalid inputs<br/>*Chosen icons<br/>*Cancelations mid-transaction<br/>*Expenses with and without values|
| To Discover| -Can user add a new expense <br/>-Can user edit an existing expense <br/>-Can user select an existing account for new/edit expense <br/>-Can user select an existing category for new/edit expense <br/>-Can user quick-add a category for new/edit expense <br/>-Can user add a note for new/edit expense <br/>-Can user schedule expense |
| Priority| High  |
| Time Estimate| 60 minutes |

|  Charter 5| Homepage Actions|
|--|--|
| Explore| Homepage View component for free users  |
| With| Functions <br/> *Time based filters <br/> *Account filters <br/> Data set <br/> *Transitions between all filters <br/>*All categories with income and expenses values <br/>*Income and expenses values for different dates|
| To Discover| -Can user view summary by account <br/>-Can user view the correct pie-chart summary by Day/Week/Month/Year/All/Interval/Chosen Date <br/>-Can user view list summary by Day/Week/Month/Year/All/Interval/Chosen Date <br/>-Can user sort list summary by category/date|
| Priority| Very High  |
| Time Estimate| 90 minutes |

|  Charter 6| UX and usability |
|--|--|
| Explore| UX for free users (English)  |
| With| Functions <br/> *Transitions <br/> *Spelling and Grammar <br/> *Text overlap and other UI blemishes <br/>*Intu |
| To Discover| -Is the user experience on all pages consistent across the application <br/> -Are the transitions smooth when moving between functions <br/>-Are there any jarring spelling or grammar mistakes<br/>-Are there any text overlap or other UI blemishes<br/>-Does the application handle transitions from portrait to landscape view well|
| Priority| Very High  |
| Time Estimate| 30 minutes |

|  Charter 7| Search|
|--|--|
| Explore| Search component for free users  |
| With| Functions <br/> *Text search <br/> *Date search <br/> Data set <br/>*All categories with income and expenses values <br/>*Income and expenses values for different dates|
| To Discover| -Can user search for categories <br/>-Can user search for specific dates <br/>-Can user search for accounts <br/>-Can user search for expense notes <br/>-Can user search for income notes  |
| Priority| Low |
| Time Estimate| 30 minutes |

|  Charter 8| Balance Settings |
|--|--|
| Explore| Balance settings component for free users  |
| With| Functions <br/> *Budget mode  <br/> *Carry over <br/> Future recurring records <br/> Data set <br/>*All categories with income and expenses values <br/>*Income and expenses values for different dates|
| To Discover| -Can user view charts based on their budget in budget mode <br/>-Can user view the right charts based on carry over in Carry over mode when switching between views <br/> -Can user use the Future recurring records mode |
| Priority| Medium |
| Time Estimate| 30 minutes |

|  Charter 9| General Settings |
|--|--|
| Explore| General settings component for free users  |
| With| Functions <br/> *Language  <br/> *Currency <br/> *First day of week <br/> *First day of month <br/>Data set <br/>*All categories with income and expenses values <br/>*Income and expenses values for different dates|
| To Discover| -Can user change the language of the app <br/> -Can user change the currency used in the app and get the data reflected correctly <br/> Can user change the day of week and month and get data reflected correctly|
| Priority| Medium |
| Time Estimate| 30 minutes |

|  Charter 10| File/ Data Backup Settings |
|--|--|
| Explore| File/ Data backup settings component for free users  |
| With| Functions <br/> *Export to file  <br/> *Create data backup <br/> *Restore data <br/> *Clear data <br/>Data set <br/>*All categories with income and expenses values <br/>*Income and expenses values for different dates|
| To Discover| -Can user export their data to a csv file <br/> -Can user back up their data successfully <br/> Can user restore their data from a backup file <br/>-Can user clear their data from the application and start anew|
| Priority| High|
| Time Estimate| 30 minutes |

|  Charter 11| Pro Settings |
|--|--|
| Explore| Pro settings pop up for free users  |
| With| Functions <br/> Pro settings for free users|
| To Discover| -Can a free user use any of the pro settings such as change category, change account currency, google drive/drop box sync etc.|
| Priority| Medium |
| Time Estimate| 5 minutes |

# Prioritization Logic
**Very High** - Charters 5 and 6: Homepage Actions and UX
The highest priority is given to the homepage functionality and UX. A user that downloads the app will be seriously put off if the basic functionality is not working. The component(Income, Expenses etc.) specific testing is covered at a high level with these charters while at the same time we are testing that the minimum set of functionality(Financial tracking) offered by the app works fine.

**High** 
Charters 1,2,3,4 - Accounts, Categories, Income and Expenses
Here we do a deep dive into the individual components that make up the app. This is a high priority area as these are the building blocks of app functionality.
Charter 10 - File/Data Backup settings
Major actions such as modification of categories, accounts, clearing of data lead to backup file creation. This is likely to be a frequently used area by the user. It is very likely that user perform certain destructive actions that they want to revert. It can be very frustrating to lose all your data that you may have spent hours filling in.

**Medium**
Charter 8,9 - Balance and General Settings
This is by no means an area to be ignored. However, compared to the other functional areas these may be slightly lesser used (except for Language and Currency which I will cover in Risks). In comparison with the other areas, therefore this is given a lower priority

Charter 11 - Pro Settings
This is an interesting one. As an app developer, we do not want to lose out on revenue. Hence it is important that pro settings remain locked for a free user. If this charter is written from the perspective of a premium user, areas which are not covered in the charter will move up in priority such as synchronization, expenses/income schedule etc.

**Low**
Charter 7 - Search
Compared to other functions this is likely to be lesser used. With this assumption, this shall be marked a low priority.

# Findings and Observations
The app appears to be stable. Following observations are made:
1.  When an expense is added after transferring an amount from account A to account B, balance amount of account A shown in home page is incorrect.
**Severity:** Medium, **Priority:** High
**Steps:**
	a. Account A has 10000, Account B has 5000
	b. Transfer 1000 from A to B. Account A balance (in green) shows in central circle as 9000 and an new transfer expense category is added
	c. Add any expense in A
	d. Account A balance shows in central circle as 10000 and B as 6000 when switching between account views.
2. Changing language does not change the language for Search help text 
**Severity:** Low, **Priority:** Low
**Steps:**
	a. Change language from English to Deutsch
	c. Search help text retains English
3. Search does not allow searching for Dates or Months. User cannot retrieve transactions for November by searching for "November"
**Severity:** Low, **Priority:** Low (Could be a future enhancement  
4. More of an observation than a bug: Application does not support landscape mode
5. Though the app is quite good looking, it is not that easy for user to understand some of the features. For example, future recurring records. Some level of help need to be provided for the user. App can be made more intuitive.


# Risks
1. User devices
With the plethora of mobile devices available today, a decision has to be taken on the devices and browsers that we need to use for testing vis-a-vis iOS/Android, device form factors. Also, should we use emulator or real devices for testing?
Mitigation: 
	a. Separate test suites for Android and iOS
	b. Test on latest and n-1 version of OS
	c. Distribute test case execution across different browsers
	d. Test on most popular mobile device models
	e. As far as possible test on real devices for new feature delivery. An external service such as BrowserStack or SauceLabs can also be used for automated testing.
	
2. User languages
What should be the default language for testing? How do we test the different languages? How comfortable is the QA team with different languages?
Mitigation:
	a. In the absence of members with different language knowledge, testing can primarily be done in English
	b. Ensure that the strings that undergo translation can be verified before language implementation
	c. Even if the tester does not know the language, they should be able to verify whether translation has happened in different app pages or not
	d. Functionality can be tested in different languages by running automation test suite on different languages. Need to ensure automation tests does not depend on app language
	
3. User accessibility
Accessibility is an important feature that every app needs to have. The app should be inclusive and should be easy to use for everyone
Mitigation:
	a. Perform accessibility testing with features provided by the device
	b. Manual testing can be performed using out of the box functions provided by iOS/Android
	
4. Regression and Time
Regression of fixed issues can occur in the fast paced development cycles. Additionally, previously working functions can be broken when there is an OS upgrade or device upgrade
Mitigation:
	Lightweight regression suite with coverage of most used functions which can be run without supervision
	
5. Performance Risks
What is the performance benchmark for the app? Does it work only on certain connection speeds? 

6. App Security and Data Security
Is the application vulnerable to security risks? Does it support government regulations such as GDPR?
Mitigation:
	Choose a security testing tool that covers OWASP Top 10 vulnerabilities. Some level of knowledge ramp up will be required for team.

7. Investment in QA
Of course mitigation of some of the above risks depends on the level of investment of QA. Still, we can mitigate many of the risks with open source tools and with experienced testers.