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
        body([

                "Id":"154101",
                "Beschreibung":"DATAGROUP_117.2.20191206-2201.P.P.22331107.0_MIN",
                "AdcDump":null,
                "ReadyForSmoke":false,
                "Url":anyAlphaUnicode(),
                "ErstellungsZeitpunkt":anyAlphaUnicode(),
                "status":anyAlphaUnicode(),
                "postProcessorVersion":null,
                "ExporterVersion":null,
                "AdcTemporal":false,
                "AdcBuildNumber":null,
                "LatestPlandatenId":null
        ])
        headers {
            contentType('application/json')
        }
    }
}

