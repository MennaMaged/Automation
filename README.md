# bblog

Link of Manual Test Cases Sheet:

https://docs.google.com/spreadsheets/d/1XVvQQTZxI49bJ_o7_NEKdj7-FUVQl4pHy6qXzJc6h54/edit?usp=sharing

# Prerequisites
- Web brwoser (chrome is prefered)
- Eclipse IDE

# How to Import Project
- In eclipe: File > New > Import > Git > Projects from Git > Clone URI
- In Source Git Repository window, paste this text in the URI: https://github.com/MennaMaged/bblog.git
- Proceed till the project is imported on eclipse
- Right Click on the project and do the following:
  - Run As > Maven Clean
  - Run As > Maven Install
  - Team > Update project > check for force update

# To Execute All Test Cases
- Go to this path (src/test/resources/testSuites)
- Right click on this file (GUI_testSuite.xml)
- Run As TestNG Suite

# The Report
When execution is done successfully, go to this file (generate_allure_report.sh) in the project root and open it using terminal, The report should be opened in the browser, click on show all to review all TCs results. You can check the result of each step & see the attached gif\screenshot

# The Result of Test Cases
Two test cases will be executed, one should be passed and one should be failed
