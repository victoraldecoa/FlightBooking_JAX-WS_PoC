/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.jaxws.tutorial.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author aldecoa
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authUserResponse", propOrder = {
    "_return"
})
public class AuthorizeUserResponse {
    @XmlElement(name = "return")
    protected String _return;

    public String getReturn() {
        return _return;
    }

    public void setReturn(String _return) {
        this._return = _return;
    }
    
    
}
