
package com.lcrc.af.gw.client.stubs.vdabapi.v8;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IVDABControlAPIPortType", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IVDABControlAPIPortType {


    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
    @RequestWrapper(localName = "getAvailableObjects", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.GetAvailableObjects")
    @ResponseWrapper(localName = "getAvailableObjectsResponse", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.GetAvailableObjectsResponse")
    public String getAvailableObjects()
        throws WsiAuthenticationException_Exception
    ;

    /**
     * 
     * @param objName
     * @return
     *     returns java.lang.String
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
    @RequestWrapper(localName = "getAvailableCommands", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.GetAvailableCommands")
    @ResponseWrapper(localName = "getAvailableCommandsResponse", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.GetAvailableCommandsResponse")
    public String getAvailableCommands(
        @WebParam(name = "objName", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
        String objName)
        throws WsiAuthenticationException_Exception
    ;

    /**
     * 
     * @param cmd
     * @param objName
     * @param argStr
     * @param scopeStr
     * @return
     *     returns int
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
    @RequestWrapper(localName = "execute", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.Execute")
    @ResponseWrapper(localName = "executeResponse", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.ExecuteResponse")
    public int execute(
        @WebParam(name = "objName", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
        String objName,
        @WebParam(name = "cmd", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
        String cmd,
        @WebParam(name = "scopeStr", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
        String scopeStr,
        @WebParam(name = "argStr", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
        String argStr)
        throws WsiAuthenticationException_Exception
    ;

    /**
     * 
     * @param cmd
     * @param objName
     * @return
     *     returns com.lcrc.af.gw.client.stubs.vdabapi.v8.ControlUIInfo
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
    @RequestWrapper(localName = "getCommandUIInfo", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.GetCommandUIInfo")
    @ResponseWrapper(localName = "getCommandUIInfoResponse", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI", className = "com.lcrc.af.gw.client.stubs.vdabapi.v8.GetCommandUIInfoResponse")
    public ControlUIInfo getCommandUIInfo(
        @WebParam(name = "objName", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
        String objName,
        @WebParam(name = "cmd", targetNamespace = "http://example.com/gw/acc/vdab/web/IVDABControlAPI")
        String cmd)
        throws WsiAuthenticationException_Exception
    ;

}
