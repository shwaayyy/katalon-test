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

WebUI.setText(findTestObject('Object Repository/Page_Digisign/input_to continue to Digisign_uname'), 'wahyuhi')

WebUI.click(findTestObject('Object Repository/Page_Digisign/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_770465'), 'zJMR4cZ8NEag1qGiTsvDpA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_770465'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Digisign/div_wayyyshelbygmail.com                   _ebda70'))

WebUI.click(findTestObject('Object Repository/Page_Digisign/a_Tandatangan'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/input_Please Wait_signpng0'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_Proses'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_Proses Dokumen'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_Ya, Saya yakin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Digisign Proses Dokumen/div_Kode OTP tidak boleh kosong'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/btnoke2'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_SMS'))

WebUI.setText(findTestObject('Object Repository/Page_Digisign Proses Dokumen/input_Masukkan OTP_otp'), '782383')

WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_Proses Dokumen'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_Ya, Saya yakin'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Digisign Proses Dokumen/div_Kode verifikasi salah'), 
    30) == true) {
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Digisign Proses Dokumen/div_Kode OTP sudah dikirim sebanyak 3x. Sil_7b6418'), 
        30) == true) {
        WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_Tutup'))
    } else {
        WebUI.click(findTestObject('Object Repository/Page_Digisign Kirim/btnoke2'))
    }
} else {
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Digisign Proses Dokumen/div_Kode sudah dipakai, harap kirim kembali_398eaf'), 
        30) == false) {
        WebUI.closeBrowser()
    } else {
        WebUI.click(findTestObject('Object Repository/Page_Digisign Proses Dokumen/button_OK'))
    }
    
    WebUI.closeBrowser()
}

WebUI.closeBrowser()

