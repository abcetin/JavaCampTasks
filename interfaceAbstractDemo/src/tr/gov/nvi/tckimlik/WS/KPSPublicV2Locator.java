/**
 * KPSPublicV2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

public class KPSPublicV2Locator extends org.apache.axis.client.Service implements tr.gov.nvi.tckimlik.WS.KPSPublicV2 {

    public KPSPublicV2Locator() {
    }


    public KPSPublicV2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public KPSPublicV2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for KPSPublicV2Soap
    private java.lang.String KPSPublicV2Soap_address = "https://tckimlik.nvi.gov.tr/Service/KPSPublicV2.asmx";

    public java.lang.String getKPSPublicV2SoapAddress() {
        return KPSPublicV2Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String KPSPublicV2SoapWSDDServiceName = "KPSPublicV2Soap";

    public java.lang.String getKPSPublicV2SoapWSDDServiceName() {
        return KPSPublicV2SoapWSDDServiceName;
    }

    public void setKPSPublicV2SoapWSDDServiceName(java.lang.String name) {
        KPSPublicV2SoapWSDDServiceName = name;
    }

    public tr.gov.nvi.tckimlik.WS.KPSPublicV2Soap getKPSPublicV2Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(KPSPublicV2Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getKPSPublicV2Soap(endpoint);
    }

    public tr.gov.nvi.tckimlik.WS.KPSPublicV2Soap getKPSPublicV2Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tr.gov.nvi.tckimlik.WS.KPSPublicV2SoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicV2SoapStub(portAddress, this);
            _stub.setPortName(getKPSPublicV2SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setKPSPublicV2SoapEndpointAddress(java.lang.String address) {
        KPSPublicV2Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tr.gov.nvi.tckimlik.WS.KPSPublicV2Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.gov.nvi.tckimlik.WS.KPSPublicV2SoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicV2SoapStub(new java.net.URL(KPSPublicV2Soap_address), this);
                _stub.setPortName(getKPSPublicV2SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("KPSPublicV2Soap".equals(inputPortName)) {
            return getKPSPublicV2Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicV2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicV2Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("KPSPublicV2Soap".equals(portName)) {
            setKPSPublicV2SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
