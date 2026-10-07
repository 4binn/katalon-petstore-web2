import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable


public class register {

	@Keyword
	def fillRegistrationForm(
			String user_id, String new_password, String repeat_password,
			String first_name, String last_name, String email,
			String phone, String address1, String city,
			String state, String zip, String country
	) {

		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_UserId'), user_id)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_NewPassword'), new_password)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_RepeatPassword'), repeat_password)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_FirstName'), first_name)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_LastName'), last_name)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Email'), email)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Phone'), phone)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Address1'), address1)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_City'), city)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_State'), state)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Zip'), zip)
		WebUI.setText(findTestObject('Object Repository/Pages/Register/Input_Country'), country)
	}
}
