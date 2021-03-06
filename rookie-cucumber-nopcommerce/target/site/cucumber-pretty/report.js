$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/loginnopcommerce.feature");
formatter.feature({
  "name": "nop commerce",
  "description": "  In Nop commerce admin after login in ,need to add a new product and modify the values of the product\n  then verify , delete the product and logout from nopcommerce.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login nopcommerce",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open the browser and launch the nopcommerce website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.rookie.steps.Steps_Login.open_the_browser_and_launch_the_nopcommerce_website() in file:/C:/Users/manikandansr/eclipse-workspace/rookie-cucumber-nopcommerce/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the valid credential entered for login the nopcommerce.",
  "keyword": "When "
});
formatter.match({
  "location": "com.rookie.steps.Steps_Login.the_valid_credential_entered_for_login_the_nopcommerce() in file:/C:/Users/manikandansr/eclipse-workspace/rookie-cucumber-nopcommerce/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the homepage should open and validate the homepage title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.rookie.steps.Steps_Login.the_homepage_should_open_and_validate_the_homepage_title() in file:/C:/Users/manikandansr/eclipse-workspace/rookie-cucumber-nopcommerce/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the product from the catalog side bar",
  "keyword": "And "
});
formatter.match({
  "location": "com.rookie.steps.Steps_Login.select_the_product_from_the_catalog_side_bar() in file:/C:/Users/manikandansr/eclipse-workspace/rookie-cucumber-nopcommerce/target/test-classes/"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression (//a[@class\u003d\u0027nav-link active\u0027]/p[contains(text(),\u0027Catalog\u0027)] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027(//a[@class\u003d\u0027nav-link active\u0027]/p[contains(text(),\u0027Catalog\u0027)]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d94.0.4606.71)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAVBCP3306\u0027, ip: \u0027192.168.0.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.71, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\MANIKA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:65484}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f757bf2bb0fddb2574b682668640947\n*** Element info: {Using\u003dxpath, value\u003d(//a[@class\u003d\u0027nav-link active\u0027]/p[contains(text(),\u0027Catalog\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.rookie.steps.Steps_Login.select_the_product_from_the_catalog_side_bar(Steps_Login.java:55)\r\n\tat ???.select the product from the catalog side bar(///C:/Users/manikandansr/eclipse-workspace/rookie-cucumber-nopcommerce/src/test/resources/loginnopcommerce.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the product tab should open",
  "keyword": "Then "
});
formatter.match({
  "location": "com.rookie.steps.Steps_Login.the_product_tab_should_open() in file:/C:/Users/manikandansr/eclipse-workspace/rookie-cucumber-nopcommerce/target/test-classes/"
});
formatter.result({
  "status": "skipped"
});
});