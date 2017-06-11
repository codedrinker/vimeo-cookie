
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Cdns_ {

    private Akfire_interconnect_quic_ akfire_interconnect_quic;
    private Fastly_skyfire_ fastly_skyfire;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Akfire_interconnect_quic_ getAkfire_interconnect_quic() {
        return akfire_interconnect_quic;
    }

    public void setAkfire_interconnect_quic(Akfire_interconnect_quic_ akfire_interconnect_quic) {
        this.akfire_interconnect_quic = akfire_interconnect_quic;
    }

    public Fastly_skyfire_ getFastly_skyfire() {
        return fastly_skyfire;
    }

    public void setFastly_skyfire(Fastly_skyfire_ fastly_skyfire) {
        this.fastly_skyfire = fastly_skyfire;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
