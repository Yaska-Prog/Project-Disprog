
package com.ubaya.disprog;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ezBookingWebService", targetNamespace = "http://disprog.ubaya.com/", wsdlLocation = "http://localhost:8080/EzBookingWebService/ezBookingWebService?wsdl")
public class EzBookingWebService_Service
    extends Service
{

    private final static URL EZBOOKINGWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException EZBOOKINGWEBSERVICE_EXCEPTION;
    private final static QName EZBOOKINGWEBSERVICE_QNAME = new QName("http://disprog.ubaya.com/", "ezBookingWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EzBookingWebService/ezBookingWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EZBOOKINGWEBSERVICE_WSDL_LOCATION = url;
        EZBOOKINGWEBSERVICE_EXCEPTION = e;
    }

    public EzBookingWebService_Service() {
        super(__getWsdlLocation(), EZBOOKINGWEBSERVICE_QNAME);
    }

    public EzBookingWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EZBOOKINGWEBSERVICE_QNAME, features);
    }

    public EzBookingWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, EZBOOKINGWEBSERVICE_QNAME);
    }

    public EzBookingWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EZBOOKINGWEBSERVICE_QNAME, features);
    }

    public EzBookingWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EzBookingWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EzBookingWebService
     */
    @WebEndpoint(name = "ezBookingWebServicePort")
    public EzBookingWebService getEzBookingWebServicePort() {
        return super.getPort(new QName("http://disprog.ubaya.com/", "ezBookingWebServicePort"), EzBookingWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns EzBookingWebService
     */
    @WebEndpoint(name = "ezBookingWebServicePort")
    public EzBookingWebService getEzBookingWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://disprog.ubaya.com/", "ezBookingWebServicePort"), EzBookingWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EZBOOKINGWEBSERVICE_EXCEPTION!= null) {
            throw EZBOOKINGWEBSERVICE_EXCEPTION;
        }
        return EZBOOKINGWEBSERVICE_WSDL_LOCATION;
    }

}
