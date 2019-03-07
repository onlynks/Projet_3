
package com.projet3.library_webapp.library_webapp_model.user;

import java.util.List;
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
@WebService(name = "UserService", targetNamespace = "http://library_webservice_service.library_webservice.projet3.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @return
     *     returns java.util.List<com.projet3.library_webapp.library_webapp_model.user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserList", targetNamespace = "http://library_webservice_service.library_webservice.projet3.com/", className = "com.projet3.library_webapp.library_webapp_model.user.GetUserList")
    @ResponseWrapper(localName = "getUserListResponse", targetNamespace = "http://library_webservice_service.library_webservice.projet3.com/", className = "com.projet3.library_webapp.library_webapp_model.user.GetUserListResponse")
    @Action(input = "http://library_webservice_service.library_webservice.projet3.com/UserService/getUserListRequest", output = "http://library_webservice_service.library_webservice.projet3.com/UserService/getUserListResponse")
    public List<User> getUserList();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.projet3.library_webapp.library_webapp_model.user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logIn", targetNamespace = "http://library_webservice_service.library_webservice.projet3.com/", className = "com.projet3.library_webapp.library_webapp_model.user.LogIn")
    @ResponseWrapper(localName = "logInResponse", targetNamespace = "http://library_webservice_service.library_webservice.projet3.com/", className = "com.projet3.library_webapp.library_webapp_model.user.LogInResponse")
    @Action(input = "http://library_webservice_service.library_webservice.projet3.com/UserService/logInRequest", output = "http://library_webservice_service.library_webservice.projet3.com/UserService/logInResponse")
    public User logIn(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}