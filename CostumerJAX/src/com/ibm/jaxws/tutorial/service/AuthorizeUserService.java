package com.ibm.jaxws.tutorial.service;

import com.ibm.jaxws.tutorial.service.bean.OrderBean;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


//JWS annotation that specifies that the porType name of the 
//Web Service is "OrderProcessPort", the service name 
//is "OrderProcess", and the targetNamespace used in the generated
//WSDL is "http://jawxs.ibm.tutorial/jaxws/orderprocess"

@WebService(serviceName = "AuthorizeUser",
		portName = "AuthorizeUserPort",	
		targetNamespace = "http://jawxs.ibm.tutorial/jaxws/authorizeuser")
	
//JWS annotation that specifies the mapping of the service onto the
// SOAP message protocol.In particular, it specifies that the SOAP messages 
//are document-literal.
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

public class AuthorizeUserService {
	
        @WebMethod
        public String authUser(String userName, String password) {
            if (userName.equals("victoraldecoa") && password.equals("123456")) {
                return "jfdoKJgUOUG8SD89568gGDhjkgid";
            }
            else {
                return null;
            }
        }

}
