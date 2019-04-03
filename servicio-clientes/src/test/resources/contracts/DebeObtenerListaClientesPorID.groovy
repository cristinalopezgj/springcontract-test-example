import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url value(consumer(regex('/cliente/[0-9]+')))
    }
    response {
        status 200
        body([
                idcliente: 1,
                nombre: 'Cristina',
                apellidos: 'López',
                ciudad: 'Barcelona',
                provincia: 'Barcelona'
        ])
        headers {
            contentType(applicationJson())
        }
    }
}
