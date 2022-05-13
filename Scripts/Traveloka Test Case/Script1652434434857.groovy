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

Mobile.startExistingApplication('com.traveloka.android')

Mobile.tap(findTestObject('Object Repository/Flight Feature Object/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Flight Feature Object/android.widget.EditText - Jakarta (JKTA)'), 0)

Mobile.tap(findTestObject('Object Repository/Flight Feature Object/android.widget.TextView - Jakarta, Indonesia'), 0)

Mobile.tap(findTestObject('Flight Feature Object/FLight To'), 0)

Mobile.setText(findTestObject('Object Repository/Flight Feature Object/android.widget.EditText - Search city or airport'), 
    'PDG', 0)

Mobile.tap(findTestObject('Object Repository/Flight Feature Object/android.widget.TextView - PDG - Minangkabau Intl'), 0)

Mobile.tap(findTestObject('Flight Feature Object/Departure Date'), 0)

Mobile.scrollToText('Sep 2022', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Flight Feature Object/Sep 2022 Text in Calendar'), 0)

Mobile.tap(findTestObject('Object Repository/Flight Feature Object/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Flight Feature Object/android.widget.Button - Search'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Flight Feature Object/android.widget.TextView - Jakarta   Padang'), 
    'Jakarta   Padang')

Mobile.verifyElementText(findTestObject('Object Repository/Flight Feature Object/android.widget.TextView - PDG'), 'PDG')

Mobile.verifyElementText(findTestObject('Object Repository/Flight Feature Object/android.widget.TextView - CGK'), 'CGK')

Mobile.tap(findTestObject('Object Repository/Flight Feature Object/android.widget.ImageView (2)'), 0)

Mobile.verifyElementText(findTestObject('Flight Feature Object/android.widget.TextView - 7 Sep'), '7 Sep')

Mobile.closeApplication()

