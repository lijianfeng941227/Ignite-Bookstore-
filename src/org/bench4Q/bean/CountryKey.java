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
 * CountryKey definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 09/27/2016.
 */
public class CountryKey implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for coId. */
    private int coId;

    /**
     * Gets coId.
     *
     * @return Value for coId.
     */
    public int getCoId() {
        return coId;
    }

    /**
     * Sets coId.
     *
     * @param coId New value for coId.
     */
    public void setCoId(int coId) {
        this.coId = coId;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof CountryKey))
            return false;

        CountryKey that = (CountryKey)o;

        if (coId != that.coId)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = coId;

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "CountryKey [coId=" + coId +
            "]";
    }
}

