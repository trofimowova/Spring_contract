package com.example.Sbb;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping(value = "/datagroups", consumes = "application/json", produces = "application/json")
    public String check(@RequestBody DataClass dataClass) {

        if (dataClass.getId() == 154101) {
            return "{id: 154101, beschreibung:DATAGROUP_117.2.20191206-2201.P.P.22331107.0_MIN}";
        }

        return null;
    }
}




 /* {"id ":"154101",
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
                "latestPlandatenId":null};*/
