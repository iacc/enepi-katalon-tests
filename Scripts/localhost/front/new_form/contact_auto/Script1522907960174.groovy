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

WebUI.click(findTestObject('front/estimate_form/check_box/house_kind_detached'))

WebUI.click(findTestObject('front/estimate_form/button/house_kind'))

WebUI.click(findTestObject('front/estimate_form/check_box/estimate_kind_change_contract'))

WebUI.click(findTestObject('front/estimate_form/button/estimate_kind'))

WebUI.setText(findTestObject('front/estimate_form/input/zip_code'), '1680063')

WebUI.delay(3)

WebUI.click(findTestObject('front/estimate_form/button/address'))

if (WebUI.verifyElementVisible(findTestObject('front/estimate_form/check_box/have_bill'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('front/estimate_form/check_box/have_bill'))

    WebUI.click(findTestObject('front/estimate_form/button/have_bill'))
}

WebUI.selectOptionByValue(findTestObject('front/estimate_form/select/gas_meter_checked_month'), 'february', true)

WebUI.setText(findTestObject('front/estimate_form/input/gas_used_amount'), '5')

WebUI.setText(findTestObject('front/estimate_form/input/gas_latest_billing_amount'), '12000')

WebUI.setText(findTestObject('front/estimate_form/input/gas_contracted_shop_name'), 'GasBombe')

WebUI.click(findTestObject('front/estimate_form/button/gas_usage_btn'))

WebUI.setText(findTestObject('front/estimate_form/input/name'), 'GasMan')

WebUI.setText(findTestObject('front/estimate_form/input/tel'), '08000000000')

WebUI.setText(findTestObject('front/estimate_form/input/email'), 'gasman@gmail.com')

WebUI.click(findTestObject('front/estimate_form/button/contact_btn'))

