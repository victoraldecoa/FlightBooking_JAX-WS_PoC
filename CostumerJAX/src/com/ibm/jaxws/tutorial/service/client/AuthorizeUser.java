/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.jaxws.tutorial.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author aldecoa
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authUser", propOrder = {
    "arg0",
    "arg1"
})
public class AuthorizeUser {
    protected String arg0;
    protected String arg1;

    public String getArg0() {
        return arg0;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }
    
    
}
