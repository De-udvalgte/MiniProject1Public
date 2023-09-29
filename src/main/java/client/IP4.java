/**
 * IP4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public class IP4  implements java.io.Serializable {
    private client.Err error;

    private java.lang.Integer certainty;

    private java.lang.String city;

    private java.lang.String region;

    private java.lang.String country;

    private java.lang.String countryISO3;

    private java.lang.String countryISO2;

    private java.lang.String postalCode;

    private java.lang.String metroCode;

    private java.lang.String DMA;

    private java.lang.String stateFIPS;

    private java.lang.String countyFIPS;

    private java.lang.Double latitude;

    private java.lang.Double longitude;

    private java.lang.String isProxy;

    private java.lang.String proxyType;

    private java.lang.String possibleMobileDevice;

    private java.lang.String ISP;

    private java.lang.String netblockOwner;

    private java.lang.String hostNames;

    private java.lang.String IPNoteCodes;

    private java.lang.String IPNotes;

    private java.lang.String debug;

    public IP4() {
    }

    public IP4(
           client.Err error,
           java.lang.Integer certainty,
           java.lang.String city,
           java.lang.String region,
           java.lang.String country,
           java.lang.String countryISO3,
           java.lang.String countryISO2,
           java.lang.String postalCode,
           java.lang.String metroCode,
           java.lang.String DMA,
           java.lang.String stateFIPS,
           java.lang.String countyFIPS,
           java.lang.Double latitude,
           java.lang.Double longitude,
           java.lang.String isProxy,
           java.lang.String proxyType,
           java.lang.String possibleMobileDevice,
           java.lang.String ISP,
           java.lang.String netblockOwner,
           java.lang.String hostNames,
           java.lang.String IPNoteCodes,
           java.lang.String IPNotes,
           java.lang.String debug) {
           this.error = error;
           this.certainty = certainty;
           this.city = city;
           this.region = region;
           this.country = country;
           this.countryISO3 = countryISO3;
           this.countryISO2 = countryISO2;
           this.postalCode = postalCode;
           this.metroCode = metroCode;
           this.DMA = DMA;
           this.stateFIPS = stateFIPS;
           this.countyFIPS = countyFIPS;
           this.latitude = latitude;
           this.longitude = longitude;
           this.isProxy = isProxy;
           this.proxyType = proxyType;
           this.possibleMobileDevice = possibleMobileDevice;
           this.ISP = ISP;
           this.netblockOwner = netblockOwner;
           this.hostNames = hostNames;
           this.IPNoteCodes = IPNoteCodes;
           this.IPNotes = IPNotes;
           this.debug = debug;
    }


    /**
     * Gets the error value for this IP4.
     * 
     * @return error
     */
    public client.Err getError() {
        return error;
    }


    /**
     * Sets the error value for this IP4.
     * 
     * @param error
     */
    public void setError(client.Err error) {
        this.error = error;
    }


    /**
     * Gets the certainty value for this IP4.
     * 
     * @return certainty
     */
    public java.lang.Integer getCertainty() {
        return certainty;
    }


    /**
     * Sets the certainty value for this IP4.
     * 
     * @param certainty
     */
    public void setCertainty(java.lang.Integer certainty) {
        this.certainty = certainty;
    }


    /**
     * Gets the city value for this IP4.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this IP4.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this IP4.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this IP4.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the country value for this IP4.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this IP4.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the countryISO3 value for this IP4.
     * 
     * @return countryISO3
     */
    public java.lang.String getCountryISO3() {
        return countryISO3;
    }


    /**
     * Sets the countryISO3 value for this IP4.
     * 
     * @param countryISO3
     */
    public void setCountryISO3(java.lang.String countryISO3) {
        this.countryISO3 = countryISO3;
    }


    /**
     * Gets the countryISO2 value for this IP4.
     * 
     * @return countryISO2
     */
    public java.lang.String getCountryISO2() {
        return countryISO2;
    }


    /**
     * Sets the countryISO2 value for this IP4.
     * 
     * @param countryISO2
     */
    public void setCountryISO2(java.lang.String countryISO2) {
        this.countryISO2 = countryISO2;
    }


    /**
     * Gets the postalCode value for this IP4.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this IP4.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the metroCode value for this IP4.
     * 
     * @return metroCode
     */
    public java.lang.String getMetroCode() {
        return metroCode;
    }


    /**
     * Sets the metroCode value for this IP4.
     * 
     * @param metroCode
     */
    public void setMetroCode(java.lang.String metroCode) {
        this.metroCode = metroCode;
    }


    /**
     * Gets the DMA value for this IP4.
     * 
     * @return DMA
     */
    public java.lang.String getDMA() {
        return DMA;
    }


    /**
     * Sets the DMA value for this IP4.
     * 
     * @param DMA
     */
    public void setDMA(java.lang.String DMA) {
        this.DMA = DMA;
    }


    /**
     * Gets the stateFIPS value for this IP4.
     * 
     * @return stateFIPS
     */
    public java.lang.String getStateFIPS() {
        return stateFIPS;
    }


    /**
     * Sets the stateFIPS value for this IP4.
     * 
     * @param stateFIPS
     */
    public void setStateFIPS(java.lang.String stateFIPS) {
        this.stateFIPS = stateFIPS;
    }


    /**
     * Gets the countyFIPS value for this IP4.
     * 
     * @return countyFIPS
     */
    public java.lang.String getCountyFIPS() {
        return countyFIPS;
    }


    /**
     * Sets the countyFIPS value for this IP4.
     * 
     * @param countyFIPS
     */
    public void setCountyFIPS(java.lang.String countyFIPS) {
        this.countyFIPS = countyFIPS;
    }


    /**
     * Gets the latitude value for this IP4.
     * 
     * @return latitude
     */
    public java.lang.Double getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this IP4.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.Double latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this IP4.
     * 
     * @return longitude
     */
    public java.lang.Double getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this IP4.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.Double longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the isProxy value for this IP4.
     * 
     * @return isProxy
     */
    public java.lang.String getIsProxy() {
        return isProxy;
    }


    /**
     * Sets the isProxy value for this IP4.
     * 
     * @param isProxy
     */
    public void setIsProxy(java.lang.String isProxy) {
        this.isProxy = isProxy;
    }


    /**
     * Gets the proxyType value for this IP4.
     * 
     * @return proxyType
     */
    public java.lang.String getProxyType() {
        return proxyType;
    }


    /**
     * Sets the proxyType value for this IP4.
     * 
     * @param proxyType
     */
    public void setProxyType(java.lang.String proxyType) {
        this.proxyType = proxyType;
    }


    /**
     * Gets the possibleMobileDevice value for this IP4.
     * 
     * @return possibleMobileDevice
     */
    public java.lang.String getPossibleMobileDevice() {
        return possibleMobileDevice;
    }


    /**
     * Sets the possibleMobileDevice value for this IP4.
     * 
     * @param possibleMobileDevice
     */
    public void setPossibleMobileDevice(java.lang.String possibleMobileDevice) {
        this.possibleMobileDevice = possibleMobileDevice;
    }


    /**
     * Gets the ISP value for this IP4.
     * 
     * @return ISP
     */
    public java.lang.String getISP() {
        return ISP;
    }


    /**
     * Sets the ISP value for this IP4.
     * 
     * @param ISP
     */
    public void setISP(java.lang.String ISP) {
        this.ISP = ISP;
    }


    /**
     * Gets the netblockOwner value for this IP4.
     * 
     * @return netblockOwner
     */
    public java.lang.String getNetblockOwner() {
        return netblockOwner;
    }


    /**
     * Sets the netblockOwner value for this IP4.
     * 
     * @param netblockOwner
     */
    public void setNetblockOwner(java.lang.String netblockOwner) {
        this.netblockOwner = netblockOwner;
    }


    /**
     * Gets the hostNames value for this IP4.
     * 
     * @return hostNames
     */
    public java.lang.String getHostNames() {
        return hostNames;
    }


    /**
     * Sets the hostNames value for this IP4.
     * 
     * @param hostNames
     */
    public void setHostNames(java.lang.String hostNames) {
        this.hostNames = hostNames;
    }


    /**
     * Gets the IPNoteCodes value for this IP4.
     * 
     * @return IPNoteCodes
     */
    public java.lang.String getIPNoteCodes() {
        return IPNoteCodes;
    }


    /**
     * Sets the IPNoteCodes value for this IP4.
     * 
     * @param IPNoteCodes
     */
    public void setIPNoteCodes(java.lang.String IPNoteCodes) {
        this.IPNoteCodes = IPNoteCodes;
    }


    /**
     * Gets the IPNotes value for this IP4.
     * 
     * @return IPNotes
     */
    public java.lang.String getIPNotes() {
        return IPNotes;
    }


    /**
     * Sets the IPNotes value for this IP4.
     * 
     * @param IPNotes
     */
    public void setIPNotes(java.lang.String IPNotes) {
        this.IPNotes = IPNotes;
    }


    /**
     * Gets the debug value for this IP4.
     * 
     * @return debug
     */
    public java.lang.String getDebug() {
        return debug;
    }


    /**
     * Sets the debug value for this IP4.
     * 
     * @param debug
     */
    public void setDebug(java.lang.String debug) {
        this.debug = debug;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IP4)) return false;
        IP4 other = (IP4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.certainty==null && other.getCertainty()==null) || 
             (this.certainty!=null &&
              this.certainty.equals(other.getCertainty()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.countryISO3==null && other.getCountryISO3()==null) || 
             (this.countryISO3!=null &&
              this.countryISO3.equals(other.getCountryISO3()))) &&
            ((this.countryISO2==null && other.getCountryISO2()==null) || 
             (this.countryISO2!=null &&
              this.countryISO2.equals(other.getCountryISO2()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.metroCode==null && other.getMetroCode()==null) || 
             (this.metroCode!=null &&
              this.metroCode.equals(other.getMetroCode()))) &&
            ((this.DMA==null && other.getDMA()==null) || 
             (this.DMA!=null &&
              this.DMA.equals(other.getDMA()))) &&
            ((this.stateFIPS==null && other.getStateFIPS()==null) || 
             (this.stateFIPS!=null &&
              this.stateFIPS.equals(other.getStateFIPS()))) &&
            ((this.countyFIPS==null && other.getCountyFIPS()==null) || 
             (this.countyFIPS!=null &&
              this.countyFIPS.equals(other.getCountyFIPS()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.isProxy==null && other.getIsProxy()==null) || 
             (this.isProxy!=null &&
              this.isProxy.equals(other.getIsProxy()))) &&
            ((this.proxyType==null && other.getProxyType()==null) || 
             (this.proxyType!=null &&
              this.proxyType.equals(other.getProxyType()))) &&
            ((this.possibleMobileDevice==null && other.getPossibleMobileDevice()==null) || 
             (this.possibleMobileDevice!=null &&
              this.possibleMobileDevice.equals(other.getPossibleMobileDevice()))) &&
            ((this.ISP==null && other.getISP()==null) || 
             (this.ISP!=null &&
              this.ISP.equals(other.getISP()))) &&
            ((this.netblockOwner==null && other.getNetblockOwner()==null) || 
             (this.netblockOwner!=null &&
              this.netblockOwner.equals(other.getNetblockOwner()))) &&
            ((this.hostNames==null && other.getHostNames()==null) || 
             (this.hostNames!=null &&
              this.hostNames.equals(other.getHostNames()))) &&
            ((this.IPNoteCodes==null && other.getIPNoteCodes()==null) || 
             (this.IPNoteCodes!=null &&
              this.IPNoteCodes.equals(other.getIPNoteCodes()))) &&
            ((this.IPNotes==null && other.getIPNotes()==null) || 
             (this.IPNotes!=null &&
              this.IPNotes.equals(other.getIPNotes()))) &&
            ((this.debug==null && other.getDebug()==null) || 
             (this.debug!=null &&
              this.debug.equals(other.getDebug())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getCertainty() != null) {
            _hashCode += getCertainty().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCountryISO3() != null) {
            _hashCode += getCountryISO3().hashCode();
        }
        if (getCountryISO2() != null) {
            _hashCode += getCountryISO2().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getMetroCode() != null) {
            _hashCode += getMetroCode().hashCode();
        }
        if (getDMA() != null) {
            _hashCode += getDMA().hashCode();
        }
        if (getStateFIPS() != null) {
            _hashCode += getStateFIPS().hashCode();
        }
        if (getCountyFIPS() != null) {
            _hashCode += getCountyFIPS().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getIsProxy() != null) {
            _hashCode += getIsProxy().hashCode();
        }
        if (getProxyType() != null) {
            _hashCode += getProxyType().hashCode();
        }
        if (getPossibleMobileDevice() != null) {
            _hashCode += getPossibleMobileDevice().hashCode();
        }
        if (getISP() != null) {
            _hashCode += getISP().hashCode();
        }
        if (getNetblockOwner() != null) {
            _hashCode += getNetblockOwner().hashCode();
        }
        if (getHostNames() != null) {
            _hashCode += getHostNames().hashCode();
        }
        if (getIPNoteCodes() != null) {
            _hashCode += getIPNoteCodes().hashCode();
        }
        if (getIPNotes() != null) {
            _hashCode += getIPNotes().hashCode();
        }
        if (getDebug() != null) {
            _hashCode += getDebug().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IP4.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "IP4"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Err"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certainty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Certainty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryISO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CountryISO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryISO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CountryISO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metroCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "MetroCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DMA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateFIPS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "StateFIPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyFIPS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CountyFIPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProxy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "IsProxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "ProxyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possibleMobileDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "PossibleMobileDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "ISP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netblockOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "NetblockOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "HostNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPNoteCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "IPNoteCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "IPNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debug");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Debug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
