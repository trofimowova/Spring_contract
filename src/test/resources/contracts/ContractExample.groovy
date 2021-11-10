package contracts


org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/datagroups'
        body([

        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body(
               [ "id":regex("\\d{6}"),
                "beschreibung":anyAlphaUnicode()]
        )
        headers {
            contentType('application/json')
        }
    }
}


