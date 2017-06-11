
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Urls {

    private String zeroclip_swf;
    private String js;
    private String proxy;
    private String flideo;
    private String three_js;
    private String moog;
    private String comscore_js;
    private String blurr;
    private String chromeless_css;
    private String vuid_js;
    private String chromeless_js;
    private String moog_js;
    private String zeroclip_js;
    private String css;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getZeroclip_swf() {
        return zeroclip_swf;
    }

    public void setZeroclip_swf(String zeroclip_swf) {
        this.zeroclip_swf = zeroclip_swf;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getFlideo() {
        return flideo;
    }

    public void setFlideo(String flideo) {
        this.flideo = flideo;
    }

    public String getThree_js() {
        return three_js;
    }

    public void setThree_js(String three_js) {
        this.three_js = three_js;
    }

    public String getMoog() {
        return moog;
    }

    public void setMoog(String moog) {
        this.moog = moog;
    }

    public String getComscore_js() {
        return comscore_js;
    }

    public void setComscore_js(String comscore_js) {
        this.comscore_js = comscore_js;
    }

    public String getBlurr() {
        return blurr;
    }

    public void setBlurr(String blurr) {
        this.blurr = blurr;
    }

    public String getChromeless_css() {
        return chromeless_css;
    }

    public void setChromeless_css(String chromeless_css) {
        this.chromeless_css = chromeless_css;
    }

    public String getVuid_js() {
        return vuid_js;
    }

    public void setVuid_js(String vuid_js) {
        this.vuid_js = vuid_js;
    }

    public String getChromeless_js() {
        return chromeless_js;
    }

    public void setChromeless_js(String chromeless_js) {
        this.chromeless_js = chromeless_js;
    }

    public String getMoog_js() {
        return moog_js;
    }

    public void setMoog_js(String moog_js) {
        this.moog_js = moog_js;
    }

    public String getZeroclip_js() {
        return zeroclip_js;
    }

    public void setZeroclip_js(String zeroclip_js) {
        this.zeroclip_js = zeroclip_js;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
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
