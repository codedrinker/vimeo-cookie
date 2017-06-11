
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Sentry {

    private String url;
    private Boolean enabled;
    private Boolean debug_enabled;
    private Integer debug_intent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDebug_enabled() {
        return debug_enabled;
    }

    public void setDebug_enabled(Boolean debug_enabled) {
        this.debug_enabled = debug_enabled;
    }

    public Integer getDebug_intent() {
        return debug_intent;
    }

    public void setDebug_intent(Integer debug_intent) {
        this.debug_intent = debug_intent;
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
