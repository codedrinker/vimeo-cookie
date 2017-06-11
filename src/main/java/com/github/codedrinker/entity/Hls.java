
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Hls {

    private Boolean separate_av;
    private String default_cdn;
    private Cdns_ cdns;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getSeparate_av() {
        return separate_av;
    }

    public void setSeparate_av(Boolean separate_av) {
        this.separate_av = separate_av;
    }

    public String getDefault_cdn() {
        return default_cdn;
    }

    public void setDefault_cdn(String default_cdn) {
        this.default_cdn = default_cdn;
    }

    public Cdns_ getCdns() {
        return cdns;
    }

    public void setCdns(Cdns_ cdns) {
        this.cdns = cdns;
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
