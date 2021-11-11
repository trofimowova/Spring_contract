package contracts


org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/datagroups'
        body([

        ])
        headers {
            contentType(applicationJson())
        }
    }

    response {
        status OK()
        body(
                ["id"                  : anyPositiveInt(),
                 "beschreibung"        : anyAlphaUnicode(),
                 "adcDump"             : regex("null"),
                 "readyForSmoke"       : anyBoolean(),
                 "url"                 : anyUrl(),
                 "erstellungsZeitpunkt":anyPositiveInt(),
                 "status"              : regex("CONFIRMED|UNCONFIRMED"),
                 "postProcessorVersion": regex("null"),
                 "exporterVersion"     : regex("null"),
                 "adcTemporal"         : anyBoolean(),
                 "adcBuildNumber"      :  anyNonEmptyString(),
                 "latestPlandatenId"   : regex("null"),



                ]
        )
        headers {
            contentType('application/json')
        }
    }

}


