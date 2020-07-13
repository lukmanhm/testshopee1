import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Object Repository/Page_Discover gists  GitHub/a_Signin'))

WebUI.waitForPageLoad(15)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), GlobalVariable.pass)

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/Page_Discover gists/svg_Back to GitHub_octicon octicon-plus'))

WebUI.waitForPageLoad(15)

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_See all of your gists_gistdescription'), 'test create')

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_See all of your gists_gistcontentsname'), 'test.java')

WebUI.setText(findTestObject('Page_Create a new Gist/Text area'), 'System.println("hello")')

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/button_Create public gist'))

WebUI.verifyElementText(findTestObject('Page_Create a new Gist/Textverif1'), 'test.java')

WebUI.click(findTestObject('Object Repository/Page_test create/a_Edit'))

WebUI.waitForPageLoad(15)

WebUI.setText(findTestObject('Object Repository/Page_Editing testjava/input_Delete_gistdescription'), 'test create edit')

WebUI.click(findTestObject('Object Repository/Page_Editing testjava/button_Update public gist'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/Page_test create edit/button_Delete'))

WebUI.waitForAlert(5)

WebUI.acceptAlert()

WebUI.waitForPageLoad(15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_lukmanhms gists/a_All gists    1'), 3)

WebUI.closeBrowser()

