# Testing SauceDemo webpage functionality 

## Table of content

<h4> <ol>
  <li><a href="#About this project">About this project</a></li>
  <li><a href="#Prerequisites">Prerequisites</a></li>
  <li><a href="#Installation">Installation</a></li>
  <li><a href="#Architecture">Architecture</a></li>
  <li><a href="#Contact">Contact</a></li>
</ol> </h4>

## <a id ="About this project"></a>About this project

<img src="SauceDemo.png">

* In this project are presented automated tests to check SauceDemo website functionality. 
* Testing environment can be found <a href="https://www.saucedemo.com/">here</a>. 
* The code is written in Java language, using Selenium and Maven.
* Cucumber is used to provide more understanding on how the code works.

## <a id = "Prerequisites"></a>Prerequisites

In order to utilise this project you need to have the following installed locally:

* Maven:
<br> On Windows install <a href="https://chocolatey.org/install">Chocolatey</a> and use the following command:
<div class="highlight highlight-source-shell notranslate position-relative overflow-auto" dir="auto"><pre>choco install maven</pre><div class="zeroclipboard-container position-absolute right-0 top-0"><clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="choco install maven" tabindex="0" role="button"><svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2"><path d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 0 1 0 1.5h-1.5a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-1.5a.75.75 0 0 1 1.5 0v1.5A1.75 1.75 0 0 1 9.25 16h-7.5A1.75 1.75 0 0 1 0 14.25Z"></path><path d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0 1 14.25 11h-7.5A1.75 1.75 0 0 1 5 9.25Zm1.75-.25a.25.25 0 0 0-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 0 0 .25-.25v-7.5a.25.25 0 0 0-.25-.25Z"></path></svg><svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2"><path d="M13.78 4.22a.75.75 0 0 1 0 1.06l-7.25 7.25a.75.75 0 0 1-1.06 0L2.22 9.28a.751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018L6 10.94l6.72-6.72a.75.75 0 0 1 1.06 0Z"></path></svg></clipboard-copy></div></div>
On MacOS install <a href="https://brew.sh/">HomeBrew</a> and use the following command:
<br> <pre>brew install maven</pre>
* JDK (can be installed via <a href="https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html">Amazon Corretto</a>)
* Chrome browser
* <a href="https://git-scm.com/downloads">Git</a>

## <a id = "Installation"></a>Installation

To reproduce this project repeat the following steps:

* Clone the repository:
<pre>git clone mrudnyk/selenium-project</pre>
* Run all the tests by typing in terminal:
<pre>mvn test</pre>

## <a id = "Architecture"></a>Architecture
Framework is divided in such subsections:
* src/main/java/lv/acodemy/hooks - @After annotation that provides actions after each test
* src/main/java/lv/acodemy/runner - Cucumber runner for test execution
* src/main/java/lv/acodemy/sauce_pages - Objects and methods of specific pages of website
* src/main/java/lv/acodemy/step_definitions - Step definitions
* src/main/java/lv/acodemy/utils - Test data and properties utils
* src/test/java - File with test suite
* src/test/resources - File with test feature written in Gherkin language

## <a id = "Contact"></a>Contact
* Project link: <a href="https://github.com/mrudnyk/selenium-project">https://github.com/mrudnyk/selenium-project </a>
* Linkedin: <a href="https://www.linkedin.com/in/mariia-rudnyk-b86624287/">https://www.linkedin.com/in/mariia-rudnyk-b86624287/ </a>
* Personal email: <a href="mailto: mariia.rudnyk@outlook.com"> mariia.rudnyk@outlook.com </a>










