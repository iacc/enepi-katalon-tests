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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.domain + '/simple_simulations/new')

WebUI.selectOptionByValue(findTestObject('front/simulation/prefecture_code'), '13', false)

WebUI.waitForElementClickable(findTestObject('front/simulation/city_list'), 5)

WebUI.verifyOptionPresentByValue(findTestObject('front/simulation/city_list'), '682', false, 5)

WebUI.selectOptionByValue(findTestObject('front/simulation/city_list'), '682', false)

WebUI.setText(findTestObject('front/simulation/bill'), '1200')

WebUI.click(findTestObject('front/simulation/simple_simulation_btn'))

WebUI.verifyElementPresent(findTestObject('front/simulation/simulation_register_form'), 5)

WebUI.click(findTestObject('front/simulation/estimate_kind_new_contract'))

WebUI.setText(findTestObject('front/estimate_form/input/gas_contracted_shop_name'), 'MyGas')

WebUI.setText(findTestObject('front/estimate_form/input/name'), GlobalVariable.customer_name)

WebUI.setText(findTestObject('front/estimate_form/input/tel'), GlobalVariable.customer_tel)

WebUI.setText(findTestObject('front/estimate_form/input/email'), GlobalVariable.customer_email)

WebUI.click(findTestObject('front/simulation/simple_simulation_estimate_btn'))

WebUI.verifyElementPresent(findTestObject('front/estimate_form/page_done'), 30)

WebUI.callTestCase(findTestCase('localhost/front/lp/admin_contact_by_katalon'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyOptionSelectedByValue(findTestObject('admin/contact/house_kind'), 'detached', false, 1)

WebUI.verifyElementText(findTestObject('admin/contact/estimate_kind'), '新規開設')

WebUI.closeBrowser()

