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

WebUI.sendKeys(findTestObject('Object Repository/Page_Digisign/input_to continue to Digisign_uname'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_501014'), 'MbL8Xx9qjqhI3gAUDR6tiw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_501014'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Digisign/div_wayyyshelbygmail.com                   _ebda70'))

WebUI.click(findTestObject('Object Repository/Page_Digisign/span'))

WebUI.click(findTestObject('Object Repository/Page_Digisign/a_Pengaturan Akun'))

WebUI.click(findTestObject('Object Repository/Page_Digisign/a_Ganti Email'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Verifikasi melalui Email'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Kirim OTP'))

WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Proses Kode OTP'))

WebUI.setText(findTestObject('Object Repository/Page_Digisign Atur Email/input_Silakan masukkan Email Baru Anda. Kam_e93593'), 
    'memelitlord22@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Digisign Atur Email/button_Kirim kode Email'))

WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Digisign Atur Email/label_Saya menyetujui penerbitan Sertifikat Elektronik'))

WebUI.click(findTestObject('Page_Digisign Atur Email/label telah membaca'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Atur Email/button_Ya, Saya SetujuYes, I Agree'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Atur Email/button_Simpan Perubahan'))

WebUI.click(findTestObject('Page_Digisign Atur Email/button_Ya, Saya yakin'))

WebUI.delay(10)

WebUI.closeBrowser()

