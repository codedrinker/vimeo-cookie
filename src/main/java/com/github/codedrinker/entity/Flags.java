
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Flags {

    private Integer dnt;
    private String preload_video;
    private Integer plays;
    private Integer webp;
    private Integer flash_hls;
    private Integer android_inline;
    private Integer partials;
    private Integer blurr;
    private Integer autohide_controls;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getDnt() {
        return dnt;
    }

    public void setDnt(Integer dnt) {
        this.dnt = dnt;
    }

    public String getPreload_video() {
        return preload_video;
    }

    public void setPreload_video(String preload_video) {
        this.preload_video = preload_video;
    }

    public Integer getPlays() {
        return plays;
    }

    public void setPlays(Integer plays) {
        this.plays = plays;
    }

    public Integer getWebp() {
        return webp;
    }

    public void setWebp(Integer webp) {
        this.webp = webp;
    }

    public Integer getFlash_hls() {
        return flash_hls;
    }

    public void setFlash_hls(Integer flash_hls) {
        this.flash_hls = flash_hls;
    }

    public Integer getAndroid_inline() {
        return android_inline;
    }

    public void setAndroid_inline(Integer android_inline) {
        this.android_inline = android_inline;
    }

    public Integer getPartials() {
        return partials;
    }

    public void setPartials(Integer partials) {
        this.partials = partials;
    }

    public Integer getBlurr() {
        return blurr;
    }

    public void setBlurr(Integer blurr) {
        this.blurr = blurr;
    }

    public Integer getAutohide_controls() {
        return autohide_controls;
    }

    public void setAutohide_controls(Integer autohide_controls) {
        this.autohide_controls = autohide_controls;
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
