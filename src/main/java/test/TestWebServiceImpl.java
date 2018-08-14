package test;
 
import javax.jws.WebService;

import test.service.TestWebServiceRequestType;
import test.service.TestWebServiceResponseType;
 
/**
 * @author naveenvemulapalli
 *
 */
@WebService(endpointInterface="test.service.TestWebServicePortType")
public class TestWebServiceImpl implements test.service.TestWebServicePortType {

	public TestWebServiceResponseType testOperation(TestWebServiceRequestType testWebServiceRequest) {
    	TestWebServiceResponseType testWebServiceResponse = new TestWebServiceResponseType();
    	testWebServiceResponse.setGreetings("Hello " + testWebServiceRequest.getPerson().getFirstName() + " " + testWebServiceRequest.getPerson().getLastName() + "!");
        return testWebServiceResponse;
	}

}
