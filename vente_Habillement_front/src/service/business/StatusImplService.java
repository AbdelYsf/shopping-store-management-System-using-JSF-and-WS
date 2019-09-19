
package service.business;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StatusImplService", targetNamespace = "http://business.service/", wsdlLocation = "http://localhost:8080/vente_hebillement_WS/status?wsdl")
public class StatusImplService
    extends Service
{

    private final static URL STATUSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException STATUSIMPLSERVICE_EXCEPTION;
    private final static QName STATUSIMPLSERVICE_QNAME = new QName("http://business.service/", "StatusImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/vente_hebillement_WS/status?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STATUSIMPLSERVICE_WSDL_LOCATION = url;
        STATUSIMPLSERVICE_EXCEPTION = e;
    }

    public StatusImplService() {
        super(__getWsdlLocation(), STATUSIMPLSERVICE_QNAME);
    }

    public StatusImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STATUSIMPLSERVICE_QNAME, features);
    }

    public StatusImplService(URL wsdlLocation) {
        super(wsdlLocation, STATUSIMPLSERVICE_QNAME);
    }

    public StatusImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STATUSIMPLSERVICE_QNAME, features);
    }

    public StatusImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StatusImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IStatus
     */
    @WebEndpoint(name = "StatusImplPort")
    public IStatus getStatusImplPort() {
        return super.getPort(new QName("http://business.service/", "StatusImplPort"), IStatus.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IStatus
     */
    @WebEndpoint(name = "StatusImplPort")
    public IStatus getStatusImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://business.service/", "StatusImplPort"), IStatus.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STATUSIMPLSERVICE_EXCEPTION!= null) {
            throw STATUSIMPLSERVICE_EXCEPTION;
        }
        return STATUSIMPLSERVICE_WSDL_LOCATION;
    }

}
