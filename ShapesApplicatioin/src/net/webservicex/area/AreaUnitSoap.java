
package net.webservicex.area;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AreaUnitSoap", targetNamespace = "http://www.webserviceX.NET/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AreaUnitSoap {


    /**
     * 
     * @param toAreaUnit
     * @param areaValue
     * @param fromAreaUnit
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ChangeAreaUnit", action = "http://www.webserviceX.NET/ChangeAreaUnit")
    @WebResult(name = "ChangeAreaUnitResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "ChangeAreaUnit", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ChangeAreaUnit")
    @ResponseWrapper(localName = "ChangeAreaUnitResponse", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ChangeAreaUnitResponse")
    public double changeAreaUnit(
        @WebParam(name = "AreaValue", targetNamespace = "http://www.webserviceX.NET/")
        double areaValue,
        @WebParam(name = "fromAreaUnit", targetNamespace = "http://www.webserviceX.NET/")
        Areas fromAreaUnit,
        @WebParam(name = "toAreaUnit", targetNamespace = "http://www.webserviceX.NET/")
        Areas toAreaUnit);

}