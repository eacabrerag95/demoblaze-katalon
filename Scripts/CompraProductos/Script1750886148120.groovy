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
import org.apache.commons.lang.RandomStringUtils

String user = "ERICK QA" + RandomStringUtils.randomNumeric(4)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoblaze.com/')

WebUI.click(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/input_Username_sign-username'), user)

WebUI.setEncryptedText(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/input_Password_sign-password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/button_Sign up'))

WebUI.waitForAlert(10) // Espera hasta 10 segundos a que aparezca el pop up

WebUI.acceptAlert()  // Aceptar el pop up

WebUI.click(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/a_Log in'))

WebUI.click(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/div_Log in                                 _1ec1a0'))

WebUI.setText(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/input_Username_loginusername'), user)

WebUI.setEncryptedText(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/input_Password_loginpassword'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/LoginDemoblaze/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/a_Nokia lumia 1520'))

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/a_Add to cart'))

WebUI.waitForAlert(10) // Espera hasta 10 segundos a que aparezca

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/a_Sony vaio i5'))

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/a_Add to cart_1'))

WebUI.waitForAlert(10) // Espera hasta 10 segundos a que aparezca

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/CompraProductos/Page_STORE/input_Name_name'), 'ERICK CABRERA QA')

WebUI.setText(findTestObject('Object Repository/CompraProductos/Page_STORE/input_Country_country'), 'ECUADOR')

WebUI.setText(findTestObject('Object Repository/CompraProductos/Page_STORE/input_City_city'), 'QUITO')

WebUI.setText(findTestObject('Object Repository/CompraProductos/Page_STORE/input_Credit card_card'), '1111111111111111111')

WebUI.setText(findTestObject('Object Repository/CompraProductos/Page_STORE/input_Month_month'), 'JUNIO')

WebUI.setText(findTestObject('Object Repository/CompraProductos/Page_STORE/input_Year_year'), '2026')

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/CompraProductos/Page_STORE/button_OK'))

WebUI.closeBrowser()

