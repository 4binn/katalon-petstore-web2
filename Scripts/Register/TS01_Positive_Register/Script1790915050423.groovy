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

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Account.action?newAccountForm=')

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_UserId'), user_id)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_NewPassword'), new_password)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_RepeatPassword'), repeat_password)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_FirstName'), first_name)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_LastName'), last_name)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Email'), email)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Phone'), phone)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Address1'), address1)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Address2'), address2)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_City'), city)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_State'), state)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Zip'), zip)

WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Country'), country)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Pages/Register/dropdown_LanguagePreference'), 'english', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Pages/Register/dropdown_FavouriteCategory'), 'CATS', false)

WebUI.check(findTestObject('Object Repository/Pages/Register/checkbox_EnableMyList'))

WebUI.check(findTestObject('Object Repository/Pages/Register/checkbox_EnableMyBanner'))

WebUI.click(findTestObject('Object Repository/Pages/Register/button_SaveAccountInformation'))

WebUI.closeBrowser()

