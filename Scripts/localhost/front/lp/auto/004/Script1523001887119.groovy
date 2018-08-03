import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.domain + '/lp/004?pr=katalon_03')

WebUI.waitForElementPresent(findTestObject('front/estimate_form/form'), 30)

WebUI.callTestCase(findTestCase('localhost/front/new_form/contact_auto'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('front/estimate_form/page_pin'), 30)

WebUI.verifyElementPresent(findTestObject('front/lp/katalon_01'), 3)

WebUI.verifyElementPresent(findTestObject('front/lp/katalon_03'), 3)

WebUI.callTestCase(findTestCase('localhost/front/lp/admin_contact'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('admin/contact/pr_param'), 'katalon_03')

WebUI.callTestCase(findTestCase('localhost/front/new_form/auto_match'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

