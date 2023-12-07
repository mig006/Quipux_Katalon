Feature: Como usuario de healthcare necesito navegar en el sitio web 
      
      Scenario: Navegar 
      Given Abro el navegador y me dirijo a healthcare
      When presiono el boton de make appointment
      And lleno los datos
      And inicio sesion 
      And lleno el formulario
      And Envio el formulario
      And vuelvo a la pagina de inicio
      Then cierro el navegador