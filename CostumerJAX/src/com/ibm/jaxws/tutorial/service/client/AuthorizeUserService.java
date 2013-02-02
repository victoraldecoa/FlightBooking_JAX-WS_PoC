/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.jaxws.tutorial.service.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author aldecoa
 */
@WebService(name = "AuthorizeUserService", targetNamespace = "http://jawxs.ibm.tutorial/jaxws/authorizeuser")
public interface AuthorizeUserService {
        
    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns string containing token
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authUser", targetNamespace = "http://jawxs.ibm.tutorial/jaxws/authorizeuser", className = "com.ibm.jaxws.tutorial.service.client.AuthorizeUser")
    @ResponseWrapper(localName = "authUserResponse", targetNamespace = "http://jawxs.ibm.tutorial/jaxws/authorizeuser", className = "com.ibm.jaxws.tutorial.service.client.AuthorizeUserResponse")
    public String authUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);
}
