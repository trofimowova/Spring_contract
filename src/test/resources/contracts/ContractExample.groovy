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
               [ "id":154101,
                "beschreibung":"DATAGROUP_117.2.20191206-2201.P.P.22331107.0_MIN",
                 "beschreibung":"DATAGROUP_117.2.20191206-2201.P.P.22331107.0_MIN",
                 "adcDump":null,
                 "readyForSmoke":false,
                 "url":anyAlphaUnicode(),
                 "erstellungsZeitpunkt":anyAlphaUnicode(),
                 "status":anyAlphaUnicode(),
                 "postProcessorVersion":null,
                 "exporterVersion":null,
                 "adcTemporal":false,
                 "adcBuildNumber":null,
                 "latestPlandatenId":null]

        )
        headers {
            contentType('application/json')
        }
    }
}


