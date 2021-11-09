package com.example.Sbb;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataClass {

	@JsonProperty("adcDump")
	private Object adcDump;

	@JsonProperty("exporterVersion")
	private Object exporterVersion;

	@JsonProperty("postProcessorVersion")
	private Object postProcessorVersion;

	@JsonProperty("adcTemporal")
	private boolean adcTemporal;

	@JsonProperty("erstellungsZeitpunkt")
	private String erstellungsZeitpunkt;

	@JsonProperty("adcBuildNumber")
	private Object adcBuildNumber;

	@JsonProperty("id")
	private int id;

	@JsonProperty("readyForSmoke")
	private boolean readyForSmoke;

	@JsonProperty("latestPlandatenId")
	private Object latestPlandatenId;

	@JsonProperty("beschreibung")
	private String beschreibung;

	@JsonProperty("url")
	private String url;

	@JsonProperty("status")
	private String status;

	public Object getAdcDump(){
		return adcDump;
	}

	public Object getExporterVersion(){
		return exporterVersion;
	}

	public Object getPostProcessorVersion(){
		return postProcessorVersion;
	}

	public boolean isAdcTemporal(){
		return adcTemporal;
	}

	public String getErstellungsZeitpunkt(){
		return erstellungsZeitpunkt;
	}

	public Object getAdcBuildNumber(){
		return adcBuildNumber;
	}

	public int getId(){
		return id;
	}

	public boolean isReadyForSmoke(){
		return readyForSmoke;
	}

	public Object getLatestPlandatenId(){
		return latestPlandatenId;
	}

	public String getBeschreibung(){
		return beschreibung;
	}

	public String getUrl(){
		return url;
	}

	public String getStatus(){
		return status;
	}

	@Override
	public String toString(){
		return "DataGroupItem{" +
				"id='" + id + '\'' +
				", beschreibung='" + beschreibung + '\'' +
				", adcDump='" + adcDump + '\'' +
				", readyForSmoke='" + readyForSmoke + '\'' +
				", url=" + url +'\'' +
				",erstellungsZeitpunkt ="+ erstellungsZeitpunkt + '\'' +
				",status ="+ status + '\'' +
				",postProcessorVersion = " + postProcessorVersion + '\'' +
				",exporterVersion = " +exporterVersion + '\'' +
				",adcTemporal = " + adcTemporal + '\'' +
				",adcBuildNumber = "+ adcBuildNumber  + '\'' +
				",latestPlandatenId =" + latestPlandatenId +'\''+
				'}';

	}
}