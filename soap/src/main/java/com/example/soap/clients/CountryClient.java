package com.example.soap.clients;
/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.soap.wsdl.GetCountryRequest;
import com.example.soap.wsdl.GetCountryResponse;

public class CountryClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(CountryClient.class);

    public GetCountryResponse getCountry(String country){
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        log.info("Request location for" + country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/countries" ,request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"
                        ));
        return  response;
    }
}
*/
