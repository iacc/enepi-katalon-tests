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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.domain)

WebUI.callTestCase(findTestCase('localhost/front/new_form/contact_manual'), [('gas_used_amount') : '5'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('front/estimate_form/page_pin'), 30)

uri = new URI(WebUI.getUrl())

path = uri.getPath()

contact_id = path.substring(path.lastIndexOf('/') + 1)

KeywordLogger log = new KeywordLogger()

log.logInfo(contact_id)


WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('localhost/admin/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl((GlobalVariable.domain + '/admin/contacts/' + contact_id) + '/edit')

