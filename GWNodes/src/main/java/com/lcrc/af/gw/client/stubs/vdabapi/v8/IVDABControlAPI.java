
package com.lcrc.af.gw.client.stubs.vdabapi.v8;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IVDABControlAPI", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", wsdlLocation = "http://10.195.21.105:8080/cc/ws/gw/acc/vdab/web/IVDABControlAPI?WSDL")
public class IVDABControlAPI
    extends Service
{

    private final static URL IVDABCONTROLAPI_WSDL_LOCATION;
    private final static WebServiceException IVDABCONTROLAPI_EXCEPTION;
    private final static QName IVDABCONTROLAPI_QNAME = new QName("http://example.com/gw/acc/vdab/web/IVDABControlAPI", "IVDABControlAPI");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.195.21.105:8080/cc/ws/gw/acc/vdab/web/IVDABControlAPI?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IVDABCONTROLAPI_WSDL_LOCATION = url;
        IVDABCONTROLAPI_EXCEPTION = e;
    }

    public IVDABControlAPI() {
        super(__getWsdlLocation(), IVDABCONTROLAPI_QNAME);
    }

    public IVDABControlAPI(WebServiceFeature... features) {
        super(__getWsdlLocation(), IVDABCONTROLAPI_QNAME, features);
    }

    public IVDABControlAPI(URL wsdlLocation) {
        super(wsdlLocation, IVDABCONTROLAPI_QNAME);
    }

    public IVDABControlAPI(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IVDABCONTROLAPI_QNAME, features);
    }

    public IVDABControlAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IVDABControlAPI(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IVDABControlAPIPortType
     */
    @WebEndpoint(name = "IVDABControlAPISoap11Port")
    public IVDABControlAPIPortType getIVDABControlAPISoap11Port() {
        return super.getPort(new QName("http://example.com/gw/acc/vdab/web/IVDABControlAPI", "IVDABControlAPISoap11Port"), IVDABControlAPIPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IVDABControlAPIPortType
     */
    @WebEndpoint(name = "IVDABControlAPISoap11Port")
    public IVDABControlAPIPortType getIVDABControlAPISoap11Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.com/gw/acc/vdab/web/IVDABControlAPI", "IVDABControlAPISoap11Port"), IVDABControlAPIPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IVDABCONTROLAPI_EXCEPTION!= null) {
            throw IVDABCONTROLAPI_EXCEPTION;
        }
        return IVDABCONTROLAPI_WSDL_LOCATION;
    }

}
