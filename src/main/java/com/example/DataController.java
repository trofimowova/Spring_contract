package com.example;




import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
        datagroupOverviewTo.setAdcBuildNumber("dsfdsfds"+idx);
        datagroupOverviewTo.setAdcDump("dsfdsfds");
        datagroupOverviewTo.setAdcTemporal(false);
        datagroupOverviewTo.setBeschreibung("Lorem");
        datagroupOverviewTo.setErstellungsZeitpunkt(joda_time);
        datagroupOverviewTo.setExporterVersion("dsfdsfds");
        datagroupOverviewTo.setStatus("dsfdsfds");
        datagroupOverviewTo.setPostProcessorVersion("dsfdsfds");
        datagroupOverviewTo.setReadyForSmoke(false);
        datagroupOverviewTo.setId(longId);
        datagroupOverviewTo.setLatestPlandatenId("dsfdsfds");


        return datagroupOverviewTo;
    }


}





