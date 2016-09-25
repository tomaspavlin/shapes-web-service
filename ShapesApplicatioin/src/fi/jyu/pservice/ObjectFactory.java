
package fi.jyu.pservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fi.jyu.pservice package. 
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

    private final static QName _ComputeSquareArea_QNAME = new QName("http://pservice.jyu.fi/", "ComputeSquareArea");
    private final static QName _ComputeTriangleAreaByBaseAndHeight_QNAME = new QName("http://pservice.jyu.fi/", "ComputeTriangleAreaByBaseAndHeight");
    private final static QName _ComputeTriangleAreaByBaseAndHeightResponse_QNAME = new QName("http://pservice.jyu.fi/", "ComputeTriangleAreaByBaseAndHeightResponse");
    private final static QName _ComputeCircleArea_QNAME = new QName("http://pservice.jyu.fi/", "ComputeCircleArea");
    private final static QName _ComputeSquareAreaResponse_QNAME = new QName("http://pservice.jyu.fi/", "ComputeSquareAreaResponse");
    private final static QName _ComputeCircleAreaResponse_QNAME = new QName("http://pservice.jyu.fi/", "ComputeCircleAreaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fi.jyu.pservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComputeTriangleAreaByBaseAndHeightResponse }
     * 
     */
    public ComputeTriangleAreaByBaseAndHeightResponse createComputeTriangleAreaByBaseAndHeightResponse() {
        return new ComputeTriangleAreaByBaseAndHeightResponse();
    }

    /**
     * Create an instance of {@link ComputeCircleArea }
     * 
     */
    public ComputeCircleArea createComputeCircleArea() {
        return new ComputeCircleArea();
    }

    /**
     * Create an instance of {@link ComputeSquareArea }
     * 
     */
    public ComputeSquareArea createComputeSquareArea() {
        return new ComputeSquareArea();
    }

    /**
     * Create an instance of {@link ComputeTriangleAreaByBaseAndHeight }
     * 
     */
    public ComputeTriangleAreaByBaseAndHeight createComputeTriangleAreaByBaseAndHeight() {
        return new ComputeTriangleAreaByBaseAndHeight();
    }

    /**
     * Create an instance of {@link ComputeCircleAreaResponse }
     * 
     */
    public ComputeCircleAreaResponse createComputeCircleAreaResponse() {
        return new ComputeCircleAreaResponse();
    }

    /**
     * Create an instance of {@link ComputeSquareAreaResponse }
     * 
     */
    public ComputeSquareAreaResponse createComputeSquareAreaResponse() {
        return new ComputeSquareAreaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeSquareArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pservice.jyu.fi/", name = "ComputeSquareArea")
    public JAXBElement<ComputeSquareArea> createComputeSquareArea(ComputeSquareArea value) {
        return new JAXBElement<ComputeSquareArea>(_ComputeSquareArea_QNAME, ComputeSquareArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeTriangleAreaByBaseAndHeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pservice.jyu.fi/", name = "ComputeTriangleAreaByBaseAndHeight")
    public JAXBElement<ComputeTriangleAreaByBaseAndHeight> createComputeTriangleAreaByBaseAndHeight(ComputeTriangleAreaByBaseAndHeight value) {
        return new JAXBElement<ComputeTriangleAreaByBaseAndHeight>(_ComputeTriangleAreaByBaseAndHeight_QNAME, ComputeTriangleAreaByBaseAndHeight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeTriangleAreaByBaseAndHeightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pservice.jyu.fi/", name = "ComputeTriangleAreaByBaseAndHeightResponse")
    public JAXBElement<ComputeTriangleAreaByBaseAndHeightResponse> createComputeTriangleAreaByBaseAndHeightResponse(ComputeTriangleAreaByBaseAndHeightResponse value) {
        return new JAXBElement<ComputeTriangleAreaByBaseAndHeightResponse>(_ComputeTriangleAreaByBaseAndHeightResponse_QNAME, ComputeTriangleAreaByBaseAndHeightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeCircleArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pservice.jyu.fi/", name = "ComputeCircleArea")
    public JAXBElement<ComputeCircleArea> createComputeCircleArea(ComputeCircleArea value) {
        return new JAXBElement<ComputeCircleArea>(_ComputeCircleArea_QNAME, ComputeCircleArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeSquareAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pservice.jyu.fi/", name = "ComputeSquareAreaResponse")
    public JAXBElement<ComputeSquareAreaResponse> createComputeSquareAreaResponse(ComputeSquareAreaResponse value) {
        return new JAXBElement<ComputeSquareAreaResponse>(_ComputeSquareAreaResponse_QNAME, ComputeSquareAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeCircleAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pservice.jyu.fi/", name = "ComputeCircleAreaResponse")
    public JAXBElement<ComputeCircleAreaResponse> createComputeCircleAreaResponse(ComputeCircleAreaResponse value) {
        return new JAXBElement<ComputeCircleAreaResponse>(_ComputeCircleAreaResponse_QNAME, ComputeCircleAreaResponse.class, null, value);
    }

}
