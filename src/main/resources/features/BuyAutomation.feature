#language: es
Característica: BUY Automation Practice


  Esquema del escenario: BUY Automation Practice
    Dado Usuario ingresa pagina selecciona sign in ingresa su mail y selecciona Create an account "<caso_prueba>"
    Cuando Usuario ingresa sus credenciales "<caso_prueba>"
    Y Se valida sus credenciales "<caso_prueba>"
    Y Ingreso al apartado Women
    Y Agrego un productos al carrito
    Entonces Valido que este el producto seleccionado
    Ejemplos:
      | caso_prueba |
      |           1 |