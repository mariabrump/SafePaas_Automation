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

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle_1_2_3'))

WebUI.verifyElementPresent(findTestObject('deba1/SODTest/Page_Home/ManageSODTest_new'), 0)

WebUI.verifyElementClickable(findTestObject('deba1/SODTest/Page_Home/ManageSODTest_new'))

WebUI.click(findTestObject('deba1/SODTest/Page_Home/ManageSODTest_new'))

WebUI.verifyElementClickable(findTestObject('deba1/SODTest/Page_Manage SOD Test/oneCERP_1CloudERP_Environment'))

WebUI.selectOptionByLabel(findTestObject('deba1/SODTest/Page_Manage SOD Test/oneCERP_1CloudERP_Environment'), 'KTLN_CloudERP', 
    true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Create'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any oneCERP_1CloudERPEBizApp__fcbf94'))

WebUI.setText(findTestObject('Object Repository/deba1/Page_AddEdit Test/input_Name_P35_REQUEST_NAME'), findTestData('login SOD TEST data').getValue(
        'SOD test name', 1))

WebUI.setText(findTestObject('deba1/Page_AddEdit Test/input_Description_P35_REQUEST_DESCRIPTION - Copy'), findTestData('login SOD TEST data').getValue(
        'SOD test name', 1))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'Select any One', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_Select any OneSOD PreventiveSOD Dete_369111'), 
    'DT', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_ALL CERP RULES'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_ALL CERP RULESAR_AdjustmentProfileAl_3c352f'), 
    'ALL CERP RULES', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_AR_AdjustmentProfile'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_AR_AdjustmentProfileAllProcurementAgentRA'), 
    'AR_AdjustmentProfile', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_All'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_AllProcurementAgentRA'), 'All', 
    true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/option_ProcurementAgent'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/Page_AddEdit Test/select_ProcurementAgentRA'), 'ProcurementAgent', 
    true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Rule Tags_P35_RULE_TAGS_MOVE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Create'))

WebUI.click(findTestObject('Object Repository/deba1/Page_AddEdit Test/button_Create'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deba1/Page_Manage SOD Test/h2_Action Processed'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_47'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_47'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba/Page_Manage SOD Test/td_Running'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Action Processed_t-Button t-Button--_8cc6df'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/deba/Page_Manage SOD Test/button_Action Processed_t-Button t-Button--_8cc6df'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.click(findTestObject('Object Repository/deba1/Page_Manage SOD Test/button_Go'))

WebUI.delay(300)

WebUI.verifyElementVisible(findTestObject('deba/Page_Manage SOD Test/td_Closed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/deba1/SODTest/Page_Home/span_a-TreeView-toggle'))

