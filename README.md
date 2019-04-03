ESPAÑOL : 

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


ENGLISH:


The contracts are located within the service-clients module in "test / resources / contracts"

To generate the STUBS and install them in the Maven .m2 repository run, in the root of the project:

```
gradlew generateContractTests
```

and then:

```
gradlew clean install
```


To execute the tests:

```
gradlew -Dtest.single=ContratoClienteApplicationTests
``` 

The application will donwload the contracts located within the .m2 repository, raise an instance of Springboot on the customer service and run the tests against the service comparing the results with those of the contract.