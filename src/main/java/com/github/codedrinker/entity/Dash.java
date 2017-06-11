
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Dash {

    private Boolean separate_av;
    private List<Stream> streams = null;
    private Cdns cdns;
    private String default_cdn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getSeparate_av() {
        return separate_av;
    }

    public void setSeparate_av(Boolean separate_av) {
        this.separate_av = separate_av;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    public Cdns getCdns() {
        return cdns;
    }

    public void setCdns(Cdns cdns) {
        this.cdns = cdns;
    }

    public String getDefault_cdn() {
        return default_cdn;
    }

    public void setDefault_cdn(String default_cdn) {
        this.default_cdn = default_cdn;
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
