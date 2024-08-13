package com.mits;

import javax.jws.WebService;


@WebService (targetNamespace="http://mits.com/", serviceName="SampleWSService", portName="SampleWSPort")
public class SampleWSDelegate{

    com.mits.SampleWS _sampleWS = null;

    public void sampWS (String st) {
        _sampleWS.sampWS(st);
    }

    public SampleWSDelegate() {
        _sampleWS = new com.mits.SampleWS(); }

}