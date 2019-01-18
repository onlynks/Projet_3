
package com.projet3.webapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookService", targetNamespace = "http://Service.webservice.projet3.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDescription", targetNamespace = "http://Service.webservice.projet3.com/", className = "com.projet3.webapp.GetDescription")
    @ResponseWrapper(localName = "getDescriptionResponse", targetNamespace = "http://Service.webservice.projet3.com/", className = "com.projet3.webapp.GetDescriptionResponse")
    @Action(input = "http://Service.webservice.projet3.com/BookService/getDescriptionRequest", output = "http://Service.webservice.projet3.com/BookService/getDescriptionResponse")
    public String getDescription(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}