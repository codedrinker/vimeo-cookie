
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Request {

    private Files files;
    private String lang;
    private String ga_account;
    private Sentry sentry;
    private Thumb_preview thumb_preview;
    private Object referrer;
    private String cookie_domain;
    private Integer timestamp;
    private Gc_debug gc_debug;
    private Integer expires;
    private String currency;
    private String comscore_id;
    private String session;
    private Cookie cookie;
    private Build build;
    private Urls urls;
    private String signature;
    private Flags flags;
    private String country;
    private Ab_tests ab_tests;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Files getFiles() {
        return files;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getGa_account() {
        return ga_account;
    }

    public void setGa_account(String ga_account) {
        this.ga_account = ga_account;
    }

    public Sentry getSentry() {
        return sentry;
    }

    public void setSentry(Sentry sentry) {
        this.sentry = sentry;
    }

    public Thumb_preview getThumb_preview() {
        return thumb_preview;
    }

    public void setThumb_preview(Thumb_preview thumb_preview) {
        this.thumb_preview = thumb_preview;
    }

    public Object getReferrer() {
        return referrer;
    }

    public void setReferrer(Object referrer) {
        this.referrer = referrer;
    }

    public String getCookie_domain() {
        return cookie_domain;
    }

    public void setCookie_domain(String cookie_domain) {
        this.cookie_domain = cookie_domain;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Gc_debug getGc_debug() {
        return gc_debug;
    }

    public void setGc_debug(Gc_debug gc_debug) {
        this.gc_debug = gc_debug;
    }

    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getComscore_id() {
        return comscore_id;
    }

    public void setComscore_id(String comscore_id) {
        this.comscore_id = comscore_id;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Ab_tests getAb_tests() {
        return ab_tests;
    }

    public void setAb_tests(Ab_tests ab_tests) {
        this.ab_tests = ab_tests;
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
