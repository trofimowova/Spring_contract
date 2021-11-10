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
                "beschreibung":anyAlphaUnicode(),
                 "adcDump":regex("null"),
                 "readyForSmoke":regex("false|true"),
                 "status":regex("CONFIRMED|UNCONFIRMED"),
                 "postProcessorVersion":regex("null"),
                 "exporterVersion":regex("null"),
                 "adcTemporal":regex("false|true"),
                 "latestPlandatenId":regex("null"),



               ]
        )
        headers {
            contentType('application/json')
        }
    }
}


