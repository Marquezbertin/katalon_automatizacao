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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Swag Labs_user-name'), 'locked_out_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/img_Name (A to Z)_inventory_item_img'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Back to products'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/a_About'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_Sauce Labs Bike Light'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Back to products'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_Sauce Labs Onesie'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Back to products'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/span_6'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Remove'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Remove_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_9.99'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_9.99'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/span_5'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Checkout Your Information_firstName'), 
    '55555')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Checkout Your Information_lastName'), 
    '5555555555')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Checkout Your Information_postalCode'), 
    'hgadagalKXX')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Back Home'))

WebUI.openBrowser('')

WebUI.openBrowser('')

