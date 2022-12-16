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

WebUI.openBrowser(GlobalVariable.BASE_URL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Digisign/input_to continue to Digisign_uname'), 'ditest6@tandatanganku.com')

WebUI.click(findTestObject('Object Repository/Page_Digisign/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_770465'), 'VJTb+dvhjXsSHjOFnDGWjg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_770465'), Keys.chord(Keys.ENTER))

WebUI.uploadFile(findTestObject('Object Repository/Page_Digisign/inputfile'), 'C:\\\\Users\\\\dignitas\\\\Downloads\\\\company_image_20221101070631.pdf')

WebUI.click(findTestObject('Object Repository/Page_Digisign/button_Unggah Dokumen'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/button_Tambah Saya'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/button_Tandatangan'))

WebUI.dragAndDropByOffset(findTestObject('Object Repository/Page_Digisign Kirim/div_Sign Here'), 5, 179)

WebUI.dragAndDropByOffset(findTestObject('Page_Digisign Kirim/div_Sign Here_ui-resizable-handle ui-resiza_f3e899'), 130, 
    55)

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/button_Sign Here_lock1'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/button_Set Email'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/button_Kirim Dokumen'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/button_Proses'))

WebUI.verifyElementPresent(findTestObject('Page_Digisign Kirim/div_Dokumen berhasil dikirim'), 3000)

WebUI.delay(7)

WebUI.closeBrowser()
