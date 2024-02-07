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

WebUI.navigateToUrl('https://us21n.safepaas.com/')

WebUI.setText(findTestObject('Object Repository/Extract Data JDBC/input_IQA - Fall 2023_P101_COMPANY'), 'kat')

WebUI.setText(findTestObject('Object Repository/Extract Data JDBC/input_OR CONTINUE WITH_P101_USERNAME'), 'katalon_admin')

WebUI.click(findTestObject('Object Repository/Extract Data JDBC/input_OR CONTINUE WITH_P101_USERNAME'))

WebUI.setEncryptedText(findTestObject('Object Repository/Extract Data JDBC/input_New_P101_PASSWORD'), 'N3mGwrN6bT8efSdTK/YVUw==')

WebUI.click(findTestObject('Object Repository/Extract Data JDBC/button_Login'))

WebUI.click(findTestObject('Object Repository/Extract Data JDBC/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Extract-Data/a_Manage Snapshot2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Extract-Data/select_Select any oneKTLN_OBJECT_SET'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Extract-Data/select_Select any oneKTLN_OBJECT_SET'), 'KTLN_OBJECT_SET', true, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Extract Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_-- Select any one ---- Local File --_b47e4a'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Component (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/span_Extract Snapshot'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Object Sets (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/span_KTLN_OBJECT_SET'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Type (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Occurrences'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Change Tracker'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/div_Security'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/div_Security'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Datasource (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Extract-Data/select_KTLN_LocalFilesKTLN_LocalFilesKTLN_Dev22'), 'Dev22_DataSource', 
    true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_Users_KTLN'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_EntryRoles_KTLN'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_EntryPrivileges_KTLN'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_Attribute_KTLN'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_UserEntry_KTLN'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_EntryHierarchy_KTLN'), FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_EntryAttribute_KTLN'))

WebUI.verifyElementClickable(findTestObject('Extract-Data/td_UserEntryAttribute_KTLN'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 'KTLN_NOV17_V1', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Name (Value Required)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Comments'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/input_(Value Required)_P30_SCHEDULER_JOB_NAME'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Extract Data/textarea_Comments_P30_SCHEDULER_JOB_COMMENTS'), 'KTLN Extract', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Repeat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/select_NeverMinutesDailyWeeklyMonthlyYearly'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/label_Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Popup Calendar Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Extract Data/button_Create'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Extract Data/button_Create'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

