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

WebUI.navigateToUrl('https://us21n.safepaas.com/monitor/f?p=1000:101::::::')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Login/input_P101_COMPANY (1) (1)'), 
    'KAT')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Login/input_P101_USERNAME (1) (1)'), 
    'KTLN_EAM_USER1')

WebUI.setEncryptedText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Login/input_P101_PASSWORD (1) (1)'), 
    'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Login/button_Login (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/span_a-TreeView-toggle_1_2 (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/a_Actions (1) (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Home/a_Actions (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any oneCERP_1CloudERPEBizApp__fcbf94 (1)'), 
    'KTLN_CloudERP', true, FailureHandling.OPTIONAL)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any OneKTLN_APRIL18_V3KTLN_MA_f74cb9 (1)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any OneKTLN_APRIL18_V3KTLN_MA_f74cb9 (1)'), 
    GlobalVariable.SOD_Test, true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Go (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Go (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/span_a-Menu-statusCol (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'), 
    'VIOLATION_PATH_DESCRIPTION', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_is nullis not nulllikenot likeinnot _365127 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_is nullis not nulllikenot likeinnot _365127 (1)'), 
    'contains', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'Supplier Profile Inquiry')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/span_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'Manage Payables Activities vs. Approve Payables Activities Rule')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/span_a-Menu-statusCol (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'), 
    'START_ENTRY_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'Procurement Manager[ORA_PO_PROCUREMENT_MANAGER_JOB]')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/span_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'), 
    'VIOLATION_ENTRY_NAME', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'FND_MANAGE_FILE_IMPORT_AND_EXPORT_PRIV')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Actions (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Filter (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Filter (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Rule NameStart Entry NameViolation E_742f60 (1)'), 
    'USER_NAME', true)

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_p_ignore_10 (1)'), 
    'svcerpintgusr')

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/button_Apply (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/span_1 -                    1 of           _e353a0'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/span_1 -                    1 of           _e353a0'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_f01'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_f01'))

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'), 
    'COMPKTLN_S', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/select_Select any oneAll User Roles Violati_9ce551'), 
    'COMPKTLN_S', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/input_P122_EXCEPTION_SCOPE'))

WebUI.verifyElementClickable(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/Submit_RemediateViolation'))

WebUI.click(findTestObject('deba1/ManageCorrectiveActions_Selected/Page_Remediate Issues/Submit_RemediateViolation'))

WebUI.verifyElementText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/input_P120_JUSTIFICATION'), 
    '')

WebUI.setText(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/input_P120_JUSTIFICATION'), 
    GlobalVariable.Justification_Selected)

WebUI.verifyElementClickable(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/button_Submit'))

WebUI.click(findTestObject('Object Repository/deba1/ManageCorrectiveActions_Selected/Page_Add Remediation Action/button_Submit'))

WebUI.delay(20)

WebUI.closeBrowser()

