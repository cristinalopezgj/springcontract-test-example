To generate Stubs and install to .m2 Local Maven repository:

```
gradlew generateContractTests
```

and then:

```
gradlew clean install
```


To excute tests:

```
gradlew -Dtest.single=ContratoClienteApplicationTests
``` 

