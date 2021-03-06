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
 * ShoppingCartLine definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 09/27/2016.
 */
public class ShoppingCartLine implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for sclScId. */
    private int sclScId;

    /** Value for sclQty. */
    private Integer sclQty;

    /** Value for sclIId. */
    private int sclIId;

    /**
     * Gets sclScId.
     *
     * @return Value for sclScId.
     */
    public int getSclScId() {
        return sclScId;
    }

    /**
     * Sets sclScId.
     *
     * @param sclScId New value for sclScId.
     */
    public void setSclScId(int sclScId) {
        this.sclScId = sclScId;
    }

    /**
     * Gets sclQty.
     *
     * @return Value for sclQty.
     */
    public Integer getSclQty() {
        return sclQty;
    }

    /**
     * Sets sclQty.
     *
     * @param sclQty New value for sclQty.
     */
    public void setSclQty(Integer sclQty) {
        this.sclQty = sclQty;
    }

    /**
     * Gets sclIId.
     *
     * @return Value for sclIId.
     */
    public int getSclIId() {
        return sclIId;
    }

    /**
     * Sets sclIId.
     *
     * @param sclIId New value for sclIId.
     */
    public void setSclIId(int sclIId) {
        this.sclIId = sclIId;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof ShoppingCartLine))
            return false;

        ShoppingCartLine that = (ShoppingCartLine)o;

        if (sclScId != that.sclScId)
            return false;

        if (sclQty != null ? !sclQty.equals(that.sclQty) : that.sclQty != null)
            return false;

        if (sclIId != that.sclIId)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = sclScId;

        res = 31 * res + (sclQty != null ? sclQty.hashCode() : 0);

        res = 31 * res + sclIId;

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "ShoppingCartLine [sclScId=" + sclScId +
            ", sclQty=" + sclQty +
            ", sclIId=" + sclIId +
            "]";
    }
}

