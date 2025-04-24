# TEST-AUTOMATION-USING-SELENIUM

 # What is Selenium?

Introduce Selenium as an open-source automation testing framework used for automating web applications across different browsers and platforms.
Highlight its popularity, flexibility, and extensive community support. Selenium is a powerful open-source testing framework that is widely used for automating web-based applications. It is a suite of tools that allows developers and testers to write and execute test cases against web applications in various programming languages, including Java, Python, C#, and Ruby.

Selenium’s key feature is the Selenium WebDriver, which is a browser automation API that provides a simple and concise programming interface for interacting with web browsers. It supports various browsers such as Google Chrome, Mozilla Firefox, Microsoft Edge, and more, making it an incredibly versatile tool for web automation testing.

Selenium WebDriver enables users to interact with web elements, such as text fields, buttons, and links, and perform various actions, including clicking, typing, and selecting. It also supports various types of waits that help to ensure the stability of the test scripts.

Additionally, Selenium provides an integrated development environment (IDE) that allows users to record and playback their test scripts. It also supports various reporting tools that enable users to analyze test results and identify issues.

Developers often learn Selenium with Java because it offers a powerful combination of a widely used programming language and an industry-standard testing framework. Java is a popular language for automation testing because of its robustness, flexibility, and platform independence.

Additionally, Java’s object-oriented programming model makes it easy to write reusable and maintainable Selenium Java scripts.

Selenium, on the other hand, enables the creation of efficient and reliable test scripts for web-based applications. Selenium WebDriver provides a concise programming interface for interacting with web browsers, and it supports various programming languages, including Java

![Screenshot 2025-04-24 125622](https://github.com/user-attachments/assets/baf1d8e7-766d-490e-9fd0-203cb21409c4)

# 1. Selenium client Libraries
Selenium developers have developed language bindings/ Client Libraries in order to support multiple languages. There are bindings available for each language, like, Java, C#, Python, Ruby, PHP, etc. Any tester who has a basic knowledge of working with any programming language can get specific language bindings and start off.

# 2. JSON Wire Protocol over HTTP
JSON Wire Protocol does all the communication between the browser and the code. JSON is an open standard for data exchange on the web, and it supports data structures like objects and arrays. So it becomes easy to write and read data from JSON. Data is transferred using a RESTful (Representational State Transfer) API using JSON over HTTP.

# 3. Browser Drivers
Each browser (supported by Selenium) has its own implementation of the W3C standard that Selenium provides; each browser has its own separate browser driver (browser binaries). Drivers communicate with the respective browser, and it hides the implementation logic from the end user. JSON Wire protocol makes a connection between the browser binaries and the client libraries.

# 4. Browsers
There are multiple browsers supported by Selenium which are Firefox, Internet Explorer, Chrome, Opera, Safari, etc.

What happens in the background when the user executes the selenium code?

Selenium WebDriver gives you an API that will give you access to methods like sendkeys(), getTitle(), findElement(), etc.

Below are the actions that happen in the background

For each Selenium command, there is an individual HTTP request generated (every command in your script will be converted as a URL), and it is passed to the respective browser driver.
The browser driver receives the request through an HTTP server.
For e.g., the Client makes HTTP POST requests to the browser driver. findElement, click() are sent as a POST request to the browser driver from the Client.

The HTTP server decides which actions need to execute on the real browser.
The browser follows the instructions as decided in the previous step and executes them.
The HTTP server receives the execution status and then sends back the status to an automation script, which actually shows the result as either passed, failed, or error, etc.

# Key aspects of Selenium:

# Selenium WebDriver:
This is the core component that allows you to control a web browser programmatically. It enables you to interact with web elements, navigate to different pages, and execute various actions. 

# Selenium IDE:
A browser extension that can record and replay user interactions, providing a quick way to create basic test scripts. 

# Selenium Grid:
Enables parallel execution of tests across multiple machines and browsers, significantly speeding up the testing process. 

# Selenium RC (Remote Control):
A legacy component that allowed for remote control of a browser, often used for older test automation frameworks. 

# How Selenium Works:

1. Test Script Creation:esters write test scripts using Selenium WebDriver API in their preferred programming language.

2. Browser Interaction:The script interacts with the web browser through the Selenium WebDriver, simulating user actions. 

3. Verification:The script can verify if the expected behavior is occurring, by checking element presence, text content, or other attributes. 

4. Test Execution:The scripts are executed, and the results are reported. 

5. Reporting:Selenium can generate reports of test execution outcomes, highlighting passed and failed test cases. 

# Importance of Testing in Selenium
Manual testing can be time-consuming and prone to human errors. Selenium Automation allows tests to be executed quickly and accurately, reducing the likelihood of human mistakes and ensuring consistent test results.

Selenium allows developers and testers to automate the testing of web applications across different browsers and platforms.

Language Support:Selenium allows you to create test scripts in different languages like Ruby, Java, PHP, Perl, Python, JavaScript, and C#, among others.
Browser Support: Selenium enables you to test your website on different browsers such as Google Chrome, Mozilla Firefox, Microsoft Edge, Safari, Internet Explorer (IE), etc. 

Scalability:Automated testing with Selenium can easily scale to cover a wide range of test cases, scenarios, and user interactions. This scalability ensures maximum test coverage of the application’s functionality.

Reusable Test Scripts:Selenium allows testers to create reusable test scripts that can be used across different test cases and projects. This reusability saves time and effort in test script creation and maintenance.

Parallel Testing: Selenium supports parallel test execution, allowing multiple tests to run concurrently. This helps reduce the overall testing time, making the development process more efficient.

Documentation and Reporting:Selenium provides detailed test execution logs and reports, making it easier to track test results and identify areas that require attention. 

User Experience Testing: Selenium can simulate user interactions and behavior, allowing testers to assess the user experience and ensure that the application is intuitive and user-friendly.

Continuous Integration and Continuous Deployment (CI/CD):Selenium can be integrated into CI/CD pipelines to automate the testing of each code change. This integration helps identify and address issues earlier in the development cycle, allowing for faster and more reliable releases.


# Architecture of Selenium WebDriver (Selenium 3)
WebDriver Architecture is made up of four major components:

![Screenshot 2025-04-23 164908](https://github.com/user-attachments/assets/07a2de69-2e85-472e-a381-65eac56df2d5)


Selenium Client library: Selenium provides support to multiple libraries such as Ruby, Python, Java, etc as language bindings

JSON wire protocol over HTTP:JSON is an acronym for JavaScript Object Notation. It is an open standard that provides a transport mechanism for transferring data between client and server on the web.

Browser Drivers:Selenium browser drivers are native to each browser, interacting with the browser by establishing a secure connection. Selenium supports different browser drivers such as ChromeDriver, GeckoDriver, Microsoft Edge WebDriver, SafariDriver, and InternetExplorerDriver.

Browsers:Selenium provides support for multiple browsers like Chrome, Firefox, Safari, Internet Explorer etc.

 ![Screenshot 2025-04-23 165317](https://github.com/user-attachments/assets/b21ce77b-9e6e-4fce-b7c4-0909df1a5ca1)

# Benefits of using Selenium:
Cross-browser Compatibility:Selenium allows you to run the same test script on various browsers and operating systems. 

Cost-Effective:Selenium is an open-source tool, making it free to use and distribute.

Flexibility:Selenium supports multiple programming languages, allowing you to choose the one that best suits your team's expertise. 

Scalability:Selenium Grid enables parallel testing, allowing you to run tests on multiple machines simultaneously. 

Automation of repetitive tasks: Selenium automates manual testing tasks, saving time and effort. 
