import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url  '/clientes'
    }
    response {
        status 200
        body([
                [
                    idcliente: 1,
                    nombre: 'Cristina',
                    apellidos: 'López',
                    ciudad: 'Barcelona',
                    provincia: 'Barcelona'
                ],
                [
                    idcliente: 2,
                    nombre: 'Sandra',
                    apellidos: 'Rodríguez',
                    ciudad: 'Madrid',
                    provincia: 'Madrid'
                ],
                [
                    idcliente: 3,
                    nombre: 'Javier',
                    apellidos: 'López',
                    ciudad: 'Dos Hermanas',
                    provincia: 'Sevilla'
                ]
        ])
        headers {
            contentType(applicationJson())
        }
    }
}
