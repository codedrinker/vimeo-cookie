
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Files {

    private Dash dash;
    private Hls hls;
    private List<Progressive> progressive = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Dash getDash() {
        return dash;
    }

    public void setDash(Dash dash) {
        this.dash = dash;
    }

    public Hls getHls() {
        return hls;
    }

    public void setHls(Hls hls) {
        this.hls = hls;
    }

    public List<Progressive> getProgressive() {
        return progressive;
    }

    public void setProgressive(List<Progressive> progressive) {
        this.progressive = progressive;
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
