package com.example;


import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class DataController {


    String dateTime = "11/27/2020 05:35:00";
    DateTimeFormatter datetimeformat = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");

    org.joda.time.DateTime joda_time = datetimeformat.parseDateTime(dateTime);



    long longId = 115101;


    @GetMapping(path = "/datagroups")
    public List<DatagroupOverviewTo> getDatagroups(HttpServletRequest request,
                                                   @RequestParam(required = false) String beschreibung,
                                                   @RequestParam(required = false) String postProcessorVersion,
                                                   @RequestParam(value ="buildNumber", required = false) String adcBuildNumber) {
        return List.of(getDatagroupOverviewTo(1), getDatagroupOverviewTo(2),getDatagroupOverviewTo(3),getDatagroupOverviewTo(4),
                getDatagroupOverviewTo(5),getDatagroupOverviewTo(6));
    }

    private DatagroupOverviewTo getDatagroupOverviewTo(int idx) {


        DatagroupOverviewTo datagroupOverviewTo = new DatagroupOverviewTo();
        datagroupOverviewTo.setAdcBuildNumber("Build"+idx);
        datagroupOverviewTo.setAdcDump("null");
        datagroupOverviewTo.setAdcTemporal(false);
        datagroupOverviewTo.setBeschreibung("Lorem");
        datagroupOverviewTo.setErstellungsZeitpunkt(joda_time);
        datagroupOverviewTo.setExporterVersion("null");
        datagroupOverviewTo.setStatus("CONFIRMED");
        datagroupOverviewTo.setPostProcessorVersion("null");
        datagroupOverviewTo.setReadyForSmoke(false);
        datagroupOverviewTo.setId(longId);
        datagroupOverviewTo.setLatestPlandatenId("null");
        datagroupOverviewTo.setUrl("http://datenrepo-novap-dev.sbb-cloud.net/datagroups/");

        return datagroupOverviewTo;
    }


}





