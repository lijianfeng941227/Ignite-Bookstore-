/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bench4Q.bean;

import java.io.*;

/**
 * Address definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 09/27/2016.
 */
public class Address implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for addrId. */
    private int addrId;

    /** Value for addrStreet1. */
    private String addrStreet1;

    /** Value for addrStreet2. */
    private String addrStreet2;

    /** Value for addrCity. */
    private String addrCity;

    /** Value for addrState. */
    private String addrState;

    /** Value for addrZip. */
    private String addrZip;

    /** Value for addrCoId. */
    private Integer addrCoId;

    /**
     * Gets addrId.
     *
     * @return Value for addrId.
     */
    public int getAddrId() {
        return addrId;
    }

    /**
     * Sets addrId.
     *
     * @param addrId New value for addrId.
     */
    public void setAddrId(int addrId) {
        this.addrId = addrId;
    }

    /**
     * Gets addrStreet1.
     *
     * @return Value for addrStreet1.
     */
    public String getAddrStreet1() {
        return addrStreet1;
    }

    /**
     * Sets addrStreet1.
     *
     * @param addrStreet1 New value for addrStreet1.
     */
    public void setAddrStreet1(String addrStreet1) {
        this.addrStreet1 = addrStreet1;
    }

    /**
     * Gets addrStreet2.
     *
     * @return Value for addrStreet2.
     */
    public String getAddrStreet2() {
        return addrStreet2;
    }

    /**
     * Sets addrStreet2.
     *
     * @param addrStreet2 New value for addrStreet2.
     */
    public void setAddrStreet2(String addrStreet2) {
        this.addrStreet2 = addrStreet2;
    }

    /**
     * Gets addrCity.
     *
     * @return Value for addrCity.
     */
    public String getAddrCity() {
        return addrCity;
    }

    /**
     * Sets addrCity.
     *
     * @param addrCity New value for addrCity.
     */
    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    /**
     * Gets addrState.
     *
     * @return Value for addrState.
     */
    public String getAddrState() {
        return addrState;
    }

    /**
     * Sets addrState.
     *
     * @param addrState New value for addrState.
     */
    public void setAddrState(String addrState) {
        this.addrState = addrState;
    }

    /**
     * Gets addrZip.
     *
     * @return Value for addrZip.
     */
    public String getAddrZip() {
        return addrZip;
    }

    /**
     * Sets addrZip.
     *
     * @param addrZip New value for addrZip.
     */
    public void setAddrZip(String addrZip) {
        this.addrZip = addrZip;
    }

    /**
     * Gets addrCoId.
     *
     * @return Value for addrCoId.
     */
    public Integer getAddrCoId() {
        return addrCoId;
    }

    /**
     * Sets addrCoId.
     *
     * @param addrCoId New value for addrCoId.
     */
    public void setAddrCoId(Integer addrCoId) {
        this.addrCoId = addrCoId;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Address))
            return false;

        Address that = (Address)o;

        if (addrId != that.addrId)
            return false;

        if (addrStreet1 != null ? !addrStreet1.equals(that.addrStreet1) : that.addrStreet1 != null)
            return false;

        if (addrStreet2 != null ? !addrStreet2.equals(that.addrStreet2) : that.addrStreet2 != null)
            return false;

        if (addrCity != null ? !addrCity.equals(that.addrCity) : that.addrCity != null)
            return false;

        if (addrState != null ? !addrState.equals(that.addrState) : that.addrState != null)
            return false;

        if (addrZip != null ? !addrZip.equals(that.addrZip) : that.addrZip != null)
            return false;

        if (addrCoId != null ? !addrCoId.equals(that.addrCoId) : that.addrCoId != null)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = addrId;

        res = 31 * res + (addrStreet1 != null ? addrStreet1.hashCode() : 0);

        res = 31 * res + (addrStreet2 != null ? addrStreet2.hashCode() : 0);

        res = 31 * res + (addrCity != null ? addrCity.hashCode() : 0);

        res = 31 * res + (addrState != null ? addrState.hashCode() : 0);

        res = 31 * res + (addrZip != null ? addrZip.hashCode() : 0);

        res = 31 * res + (addrCoId != null ? addrCoId.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "Address [addrId=" + addrId +
            ", addrStreet1=" + addrStreet1 +
            ", addrStreet2=" + addrStreet2 +
            ", addrCity=" + addrCity +
            ", addrState=" + addrState +
            ", addrZip=" + addrZip +
            ", addrCoId=" + addrCoId +
            "]";
    }
}

