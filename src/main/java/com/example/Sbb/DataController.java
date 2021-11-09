package com.example.Sbb;


import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class DataController {

    DateTime dateTime = DateTime.parse("2018-05-05T11:50:55");
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
        datagroupOverviewTo.setAdcBuildNumber("dsfdsfds"+idx);
        datagroupOverviewTo.setAdcDump("dsfdsfds");
        datagroupOverviewTo.setAdcTemporal(false);
        datagroupOverviewTo.setBeschreibung("Lorem");
        datagroupOverviewTo.setErstellungsZeitpunkt(dateTime);
        datagroupOverviewTo.setExporterVersion("dsfdsfds");
        datagroupOverviewTo.setStatus("dsfdsfds");
        datagroupOverviewTo.setPostProcessorVersion("dsfdsfds");
        datagroupOverviewTo.setReadyForSmoke(false);
        datagroupOverviewTo.setId(longId);
        datagroupOverviewTo.setLatestPlandatenId("dsfdsfds");


        return datagroupOverviewTo;
    }


}





