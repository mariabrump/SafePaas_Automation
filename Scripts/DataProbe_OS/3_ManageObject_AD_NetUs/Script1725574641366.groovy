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

WebUI.setText(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Login/input_Summer 2024_P101_COMPANY'), 'KAT')

WebUI.setText(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Login/input_OR CONTINUE WITH_P101_USERNAME'), 'KATALON_ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Login/input_New_P101_PASSWORD'), 'Ioqy8emDrxi5mkiNQATzxQ==')

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Home/span_MonitorPaaS_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Home/span_Manage Snapshot_a-TreeView-toggle'))

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Home/a_Manage Object'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Manage Objects/select_- Select an Environment -EBizApp_JDB_73a228'), 
    'Tririga_OS', false)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Manage Objects/a_AD_NetUs'))

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Manage Objects/a_AD_NetUs'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_Object Name (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_(Value Required)_P10_OBJECT_NAME'))

variableHoldingValueX = WebUI.getAttribute(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_(Value Required)_P10_OBJECT_NAME'), 
    'value')

WebUI.verifyEqual(variableHoldingValueX, 'AD_NetUs')

System.out.println(variableHoldingValueX)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_Object Description'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'))

variableHoldingValueY = WebUI.getAttribute(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_Object Description_P10_OBJECT_DESCR'), 
    'value')

WebUI.verifyEqual(variableHoldingValueY, 'AD Network Users')

System.out.println(variableHoldingValueY)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_Product Type (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/div_Enterprise Access Monitor'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_Usage (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/div_Security'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_Type of Object (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_SFTP'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_Column Delimiter (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_(Value Required)_P10_DELIMITER'))

variableHoldingValueZ = WebUI.getAttribute(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_(Value Required)_P10_DELIMITER'), 
    'value')

WebUI.verifyEqual(variableHoldingValueZ, '|')

System.out.println(variableHoldingValueZ)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/label_Path (Value Required)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_(Value Required)_P10_PATH'))

variableHoldingValueXY = WebUI.getAttribute(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/input_(Value Required)_P10_PATH'), 
    'value')

WebUI.verifyEqual(variableHoldingValueXY, '/home/dataprobe/AD_User_details.csv')

System.out.println(variableHoldingValueXY)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/span_Object Items'))

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/span_Object Items'))

WebUI.verifyElementText(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/h2_Add Object Items based on SOD'), 
    'Add Object Items based on SOD')

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Seq'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_5'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_7'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_8'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_9'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_10'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_11'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Object Item Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_group'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_employee id'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_display name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_title'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_department'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_manager id'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_company'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_when created'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_when changed'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_last logon'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_enabled'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Table Name'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_group_oItemsSodIg_ig_grid_vc_cur(td4)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_FSOD.FSOD_NETWORK_USERS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Column Name'))

WebUI.verifyElementClickable(findTestObject('DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_group_oItemsSodIg_ig_grid_vc_cur(td5)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_IDENTITY_ID'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_FIRST_NAME'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_ATTRIBUTE1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_DEPARTMENT (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_MANAGER_ID'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_ATTRIBUTE2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_ATTRIBUTE3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_ATTRIBUTE4'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_ATTRIBUTE5'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_ATTRIBUTE6'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Datatype'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_VARCHAR2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Key'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Translation Function'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/td_-'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/span_Total 11'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/button_Cancel'))

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_Add Object Items/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/button_Cancel'))

WebUI.click(findTestObject('Object Repository/DTP_OS_Obj_AD_NetUS/Page_AddEdit Object Details/button_Cancel'))

WebUI.closeBrowser()

