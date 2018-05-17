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

WebUI.setText(findTestObject('front/estimate_form/input/zip_code_old'), '1680063')

WebUI.delay(3)

WebUI.setText(findTestObject('front/estimate_form/select/gas_meter_checked_month_old'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('front/estimate_form/input/gas_used_amount'), '5')

WebUI.setText(findTestObject('front/estimate_form/input/gas_latest_billing_amount'), '12000')

WebUI.setText(findTestObject('front/estimate_form/input/gas_contracted_shop_name'), 'GasBombe')

WebUI.setText(findTestObject('front/estimate_form/input/name'), GlobalVariable.customer_name)

WebUI.setText(findTestObject('front/estimate_form/input/tel'), GlobalVariable.customer_tel)

WebUI.setText(findTestObject('front/estimate_form/input/email'), GlobalVariable.customer_email)

WebUI.click(findTestObject('front/estimate_form/button/old_submit'))

