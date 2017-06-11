
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Video {

    private Object lang;
    private Rating rating;
    private Integer allow_hd;
    private String embed_code;
    private Integer default_to_hd;
    private String title;
    private String url;
    private String privacy;
    private Owner owner;
    private String share_url;
    private Integer height;
    private Integer width;
    private String embed_permission;
    private Thumbs thumbs;
    private Float fps;
    private Integer spatial;
    private Integer duration;
    private Integer id;
    private Integer hd;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getLang() {
        return lang;
    }

    public void setLang(Object lang) {
        this.lang = lang;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Integer getAllow_hd() {
        return allow_hd;
    }

    public void setAllow_hd(Integer allow_hd) {
        this.allow_hd = allow_hd;
    }

    public String getEmbed_code() {
        return embed_code;
    }

    public void setEmbed_code(String embed_code) {
        this.embed_code = embed_code;
    }

    public Integer getDefault_to_hd() {
        return default_to_hd;
    }

    public void setDefault_to_hd(Integer default_to_hd) {
        this.default_to_hd = default_to_hd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getEmbed_permission() {
        return embed_permission;
    }

    public void setEmbed_permission(String embed_permission) {
        this.embed_permission = embed_permission;
    }

    public Thumbs getThumbs() {
        return thumbs;
    }

    public void setThumbs(Thumbs thumbs) {
        this.thumbs = thumbs;
    }

    public Float getFps() {
        return fps;
    }

    public void setFps(Float fps) {
        this.fps = fps;
    }

    public Integer getSpatial() {
        return spatial;
    }

    public void setSpatial(Integer spatial) {
        this.spatial = spatial;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHd() {
        return hd;
    }

    public void setHd(Integer hd) {
        this.hd = hd;
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
