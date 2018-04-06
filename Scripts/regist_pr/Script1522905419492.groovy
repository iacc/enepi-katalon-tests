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

WebUI.callTestCase(findTestCase('localhost/admin/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://localhost:8080/admin/tracking')

WebUI.setText(findTestObject('prepare/pr_name'), 'katalon_01')

WebUI.setText(findTestObject('prepare/pr_display_name'), 'katalon_01')

WebUI.setText(findTestObject('prepare/pr_conversion_tag'), '<div id="katalon_01">{cv_id}</div>')

WebUI.click(findTestObject('prepare/pr_submit'))

WebUI.verifyElementPresent(findTestObject('alert_success'), 20)

WebUI.setText(findTestObject('prepare/pr_name'), 'katalon_02')

WebUI.setText(findTestObject('prepare/pr_display_name'), 'katalon_02')

WebUI.selectOptionByValue(findTestObject('prepare/pr_cv_point'), 'verbal_ok', false)

WebUI.setText(findTestObject('prepare/pr_conversion_tag'), '<div id="katalon_02">{cv_id}</div>')

WebUI.click(findTestObject('prepare/pr_submit'))

WebUI.verifyElementPresent(findTestObject('alert_success'), 20)

WebUI.setText(findTestObject('prepare/pr_name'), 'katalon_03')

WebUI.setText(findTestObject('prepare/pr_display_name'), 'katalon_03')

WebUI.setText(findTestObject('prepare/pr_conversion_tag'), '<div id="katalon_03">{cv_id}</div>')

WebUI.click(findTestObject('prepare/pr_only_match'))

WebUI.click(findTestObject('prepare/pr_submit'))

WebUI.verifyElementPresent(findTestObject('alert_success'), 20)

WebUI.setText(findTestObject('prepare/pr_name'), 'katalon_04')

WebUI.setText(findTestObject('prepare/pr_display_name'), 'katalon_04')

WebUI.selectOptionByValue(findTestObject('prepare/pr_cv_point'), 'verbal_ok', false)

WebUI.setText(findTestObject('prepare/pr_conversion_tag'), '<div id="katalon_04">{cv_id}</div>')

WebUI.click(findTestObject('prepare/pr_only_match'))

WebUI.click(findTestObject('prepare/pr_submit'))

WebUI.verifyElementPresent(findTestObject('alert_success'), 20)

