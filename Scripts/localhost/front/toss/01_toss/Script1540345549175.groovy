import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.domain + '/store_form?rk=abc')

WebUI.waitForPageLoad(1)

WebUI.selectOptionByValue(findTestObject('front/toss/house_hold'), '4', true)

WebUI.setText(findTestObject('front/toss/zip_code'), '1680063')

WebUI.click(findTestObject('front/toss/send_btn'))

WebUI.verifyElementPresent(findTestObject('front/toss/regist_form'), 2)

WebUI.click(findTestObject('front/toss/estimate_btn'))

WebUI.setText(findTestObject('front/toss/form_name'), GlobalVariable.customer_name)

WebUI.setText(findTestObject('front/toss/form_address'), GlobalVariable.customer_address)

WebUI.setText(findTestObject('front/toss/form_tel'), GlobalVariable.customer_tel)

WebUI.setText(findTestObject('front/toss/form_email'), GlobalVariable.customer_email)

WebUI.click(findTestObject('front/toss/form_send_btn'))

WebUI.verifyElementPresent(findTestObject('front/toss/done_page'), 1)

WebUI.closeBrowser()

