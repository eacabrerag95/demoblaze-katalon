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

WebUI.navigateToUrl('https://demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Username_loginusername'), 'erick cabrera')

WebUI.setEncryptedText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Password_loginpassword'), '+YJYkQb5J/s=')

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/button_Close'))

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/div_Sign up                                _4a22cf'))

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Username_sign-username'), 'erickcabreraQA')

WebUI.setEncryptedText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Password_sign-password'), '+YJYkQb5J/s=')

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/button_Sign up'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Username_loginusername'), 'erickcabreraQA')

WebUI.setEncryptedText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Password_loginpassword'), '+YJYkQb5J/s=')

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Sony xperia z5'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Iphone 6 32gb'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Name_name'), 'ERICK CABRERA QA')

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Country_country'), 'ECUADOR')

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_City_city'), 'QUITO')

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Credit card_card'), '2988888888')

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Month_month'), 'JUNIO')

WebUI.setText(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/input_Year_year'), '2026')

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Compra Demoblaze/Page_STORE/button_OK'))

WebUI.closeBrowser()

