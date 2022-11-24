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

WebUI.navigateToUrl('https://app.tandatanganku.com/login.html?next=DO8Xbov9uppmT8XxeCpSLA%3D%3D')

WebUI.click(findTestObject('Object Repository/Page_Digisign/a_Create account'))

WebUI.setText(findTestObject('Object Repository/Page_Digisign Pendaftaran/input_NIK_idcard'), '3275025302090003')

WebUI.setText(findTestObject('Object Repository/Page_Digisign Pendaftaran/input_Tempat Lahir_lbrith'), 'jakarta')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Digisign Pendaftaran/select_Laki-laki                           _9d22b4'), 
    'P', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Digisign Pendaftaran/select_194019411942194319441945194619471948_084b5a'), 
    '1953', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Digisign Pendaftaran/select_194019411942194319441945194619471948_084b5a'), 
    '1970', true)

WebUI.click(findTestObject('Object Repository/Page_Digisign Pendaftaran/button_Next'))

WebUI.verifyElementPresent(findTestObject('Page_Digisign Pendaftaran/validationName'), 0)

WebUI.closeBrowser()

