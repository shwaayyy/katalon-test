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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_100658'), 'MbL8Xx9qjqhI3gAUDR6tiw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Digisign/input_Wahyu Hidayat_100658'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Digisign Atur Nomor Telepon/div_shwaayyygmail.com                      _a69926'))

WebUI.click(findTestObject('Page_Digisign/div_Spesimen Tanda Tangan_nav-btn pull-left'))

WebUI.click(findTestObject('Object Repository/Page_Digisign/a_Pengaturan Akun'))

WebUI.click(findTestObject('Object Repository/Page_Digisign/a_Ganti Nomor Telepon'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Verifikasi melalui Email'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Gunakan verifikasi lainnya'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Verifikasi melalui Kode SMS'))

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Kirim OTP'))

WebUI.delay(27, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Digisign Verifikasi Akun/button_Proses Kode OTP'))

WebUI.setText(findTestObject('Object Repository/Page_Digisign Atur Nomor Telepon/input_No ponsel baru Anda_newphone'), '85156038407')

WebUI.click(findTestObject('Object Repository/Page_Digisign Atur Nomor Telepon/button_Kirim kode OTP'))

WebUI.delay(27, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Digisign Atur Nomor Telepon/button_Simpan Perubahan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Digisign Atur Nomor Telepon/div_Sukses  Nomor HP berhasil diperbarui'), 
    0)

WebUI.closeBrowser()

