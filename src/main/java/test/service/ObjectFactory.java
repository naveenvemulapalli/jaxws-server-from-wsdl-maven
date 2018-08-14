
package test.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestWebServiceResponse_QNAME = new QName("http://test.com/testwebservice/1.0", "TestWebServiceResponse");
    private final static QName _TestWebServiceRequest_QNAME = new QName("http://test.com/testwebservice/1.0", "TestWebServiceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestWebServiceRequestType }
     * 
     */
    public TestWebServiceRequestType createTestWebServiceRequestType() {
        return new TestWebServiceRequestType();
    }

    /**
     * Create an instance of {@link TestWebServiceResponseType }
     * 
     */
    public TestWebServiceResponseType createTestWebServiceResponseType() {
        return new TestWebServiceResponseType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWebServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.com/testwebservice/1.0", name = "TestWebServiceResponse")
    public JAXBElement<TestWebServiceResponseType> createTestWebServiceResponse(TestWebServiceResponseType value) {
        return new JAXBElement<TestWebServiceResponseType>(_TestWebServiceResponse_QNAME, TestWebServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWebServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.com/testwebservice/1.0", name = "TestWebServiceRequest")
    public JAXBElement<TestWebServiceRequestType> createTestWebServiceRequest(TestWebServiceRequestType value) {
        return new JAXBElement<TestWebServiceRequestType>(_TestWebServiceRequest_QNAME, TestWebServiceRequestType.class, null, value);
    }

}
