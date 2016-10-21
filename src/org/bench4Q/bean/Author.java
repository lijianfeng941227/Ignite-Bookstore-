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
 * Author definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 09/27/2016.
 */
public class Author implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for aId. */
    private int aId;

    /** Value for aFname. */
    private String aFname;

    /** Value for aLname. */
    private String aLname;

    /** Value for aMname. */
    private String aMname;

    /** Value for aDob. */
    private java.sql.Date aDob;

    /** Value for aBio. */
    private String aBio;

    /**
     * Gets aId.
     *
     * @return Value for aId.
     */
    public int getAId() {
        return aId;
    }

    /**
     * Sets aId.
     *
     * @param aId New value for aId.
     */
    public void setAId(int aId) {
        this.aId = aId;
    }

    /**
     * Gets aFname.
     *
     * @return Value for aFname.
     */
    public String getAFname() {
        return aFname;
    }

    /**
     * Sets aFname.
     *
     * @param aFname New value for aFname.
     */
    public void setAFname(String aFname) {
        this.aFname = aFname;
    }

    /**
     * Gets aLname.
     *
     * @return Value for aLname.
     */
    public String getALname() {
        return aLname;
    }

    /**
     * Sets aLname.
     *
     * @param aLname New value for aLname.
     */
    public void setALname(String aLname) {
        this.aLname = aLname;
    }

    /**
     * Gets aMname.
     *
     * @return Value for aMname.
     */
    public String getAMname() {
        return aMname;
    }

    /**
     * Sets aMname.
     *
     * @param aMname New value for aMname.
     */
    public void setAMname(String aMname) {
        this.aMname = aMname;
    }

    /**
     * Gets aDob.
     *
     * @return Value for aDob.
     */
    public java.sql.Date getADob() {
        return aDob;
    }

    /**
     * Sets aDob.
     *
     * @param aDob New value for aDob.
     */
    public void setADob(java.sql.Date aDob) {
        this.aDob = aDob;
    }

    /**
     * Gets aBio.
     *
     * @return Value for aBio.
     */
    public String getABio() {
        return aBio;
    }

    /**
     * Sets aBio.
     *
     * @param aBio New value for aBio.
     */
    public void setABio(String aBio) {
        this.aBio = aBio;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Author))
            return false;

        Author that = (Author)o;

        if (aId != that.aId)
            return false;

        if (aFname != null ? !aFname.equals(that.aFname) : that.aFname != null)
            return false;

        if (aLname != null ? !aLname.equals(that.aLname) : that.aLname != null)
            return false;

        if (aMname != null ? !aMname.equals(that.aMname) : that.aMname != null)
            return false;

        if (aDob != null ? !aDob.equals(that.aDob) : that.aDob != null)
            return false;

        if (aBio != null ? !aBio.equals(that.aBio) : that.aBio != null)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = aId;

        res = 31 * res + (aFname != null ? aFname.hashCode() : 0);

        res = 31 * res + (aLname != null ? aLname.hashCode() : 0);

        res = 31 * res + (aMname != null ? aMname.hashCode() : 0);

        res = 31 * res + (aDob != null ? aDob.hashCode() : 0);

        res = 31 * res + (aBio != null ? aBio.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "Author [aId=" + aId +
            ", aFname=" + aFname +
            ", aLname=" + aLname +
            ", aMname=" + aMname +
            ", aDob=" + aDob +
            ", aBio=" + aBio +
            "]";
    }
}
