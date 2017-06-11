
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Thumbs {

    private String _640;
    private String _960;
    private String _1280;
    private String base;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String get640() {
        return _640;
    }

    public void set640(String _640) {
        this._640 = _640;
    }

    public String get960() {
        return _960;
    }

    public void set960(String _960) {
        this._960 = _960;
    }

    public String get1280() {
        return _1280;
    }

    public void set1280(String _1280) {
        this._1280 = _1280;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
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
