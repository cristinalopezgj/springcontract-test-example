Los contratos están ubicados dentro del módulo servicio-clientes en "test/resources/contracts"

Para generar los STUBS e instalarlos en el repositorio .m2 de Maven ejecutar, en la raíz del proyecto:

```
gradlew generateContractTests
```

posteriormente:

```
gradlew clean install
```

Se deberían haber instalado dentro del repositorio ".m2" del equipo bajo el package "com.springcontract.test" los artefactos  con nombre "servicio-clientes" y "servicio-verificador-contrato"

Para ejecutar los tests:

```
gradlew -Dtest.single=ContratoClienteApplicationTests
``` 

Lo que hará el servicio verificador del contrato es descargarse los contratos ubicados dentro del repositorio, levantar una instancia de Springboot sobre el servicio de clientes y ejecutar los tests contra el servicio comparando los resultados con los del contrato.