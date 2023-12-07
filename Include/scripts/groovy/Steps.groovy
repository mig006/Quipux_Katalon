import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Steps {
	
	@Given ("Abro el navegador y me dirijo a healthcare")
	def Abro_el_navegador_y_me_dirijo_a_healthcare () {
		WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')
	}
	
	@When ("presiono el boton de make appointment")
	def presiono_el_navegador_y_me_dirijo_a_healthcare () {
		WebUI.click(findTestObject('makeappointment'))
	}
	
	@And ("lleno los datos")
	def lleno_los_datos () {
		WebUI.setText(findTestObject('data'), 'John Doe')
		WebUI.setText(findTestObject('data2'), 'ThisIsNotAPassword')
	}
	
	@And ("inicio sesion")
	def inicio_sesion () {
		WebUI.click(findTestObject('login'))
	}
	
	@And ("lleno el formulario")
	def lleno_el_formulario () {
		WebUI.selectOptionByLabel(findTestObject('select'), 'Hongkong CURA Healthcare Center', false)
		WebUI.setText(findTestObject('date'), '11/11/2019')
		WebUI.setText(findTestObject('comment'), 'hola mundo')
	}
	
	@And ("Envio el formulario")
	def Envio_el_formulario () {
		WebUI.click(findTestObject('send'))
	}
	
	@And ("vuelvo a la pagina de inicio")
	def vuelvo_a_la_pagina_de_inicio () {
		WebUI.click(findTestObject('back'))
	}
	
	@Then ("cierro el navegador")
	def cierro_el_navegador () {
		WebUI.closeBrowser()
	}
}