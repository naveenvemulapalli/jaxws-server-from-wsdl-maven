
package test.service;

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
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TestWebService", targetNamespace = "http://test.com/testwebservice/1.0", wsdlLocation = "file:/home/linbutu/Downloads/jaxws-server-from-wsdl-maven/src/main/resources/wsdl/TestWebService.wsdl")
public class TestWebService
    extends Service
{

    private final static URL TESTWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TESTWEBSERVICE_EXCEPTION;
    private final static QName TESTWEBSERVICE_QNAME = new QName("http://test.com/testwebservice/1.0", "TestWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/linbutu/Downloads/jaxws-server-from-wsdl-maven/src/main/resources/wsdl/TestWebService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TESTWEBSERVICE_WSDL_LOCATION = url;
        TESTWEBSERVICE_EXCEPTION = e;
    }

    public TestWebService() {
        super(__getWsdlLocation(), TESTWEBSERVICE_QNAME);
    }

    public TestWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TESTWEBSERVICE_QNAME, features);
    }

    public TestWebService(URL wsdlLocation) {
        super(wsdlLocation, TESTWEBSERVICE_QNAME);
    }

    public TestWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TESTWEBSERVICE_QNAME, features);
    }

    public TestWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TestWebServicePortType
     */
    @WebEndpoint(name = "TestWebServicePort")
    public TestWebServicePortType getTestWebServicePort() {
        return super.getPort(new QName("http://test.com/testwebservice/1.0", "TestWebServicePort"), TestWebServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestWebServicePortType
     */
    @WebEndpoint(name = "TestWebServicePort")
    public TestWebServicePortType getTestWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://test.com/testwebservice/1.0", "TestWebServicePort"), TestWebServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TESTWEBSERVICE_EXCEPTION!= null) {
            throw TESTWEBSERVICE_EXCEPTION;
        }
        return TESTWEBSERVICE_WSDL_LOCATION;
    }

}
