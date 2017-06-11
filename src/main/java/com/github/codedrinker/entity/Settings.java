
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Settings {

    private Integer fullscreen;
    private Integer instant_sidedock;
    private Integer byline;
    private Integer like;
    private Integer playbar;
    private Integer title;
    private Integer color;
    private Integer branding;
    private Integer share;
    private Integer scaling;
    private Integer logo;
    private Integer spatial_compass;
    private Integer collections;
    private Integer info_on_pause;
    private Integer watch_later;
    private Integer portrait;
    private Integer embed;
    private Integer badge;
    private Integer spatial_label;
    private Integer volume;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(Integer fullscreen) {
        this.fullscreen = fullscreen;
    }

    public Integer getInstant_sidedock() {
        return instant_sidedock;
    }

    public void setInstant_sidedock(Integer instant_sidedock) {
        this.instant_sidedock = instant_sidedock;
    }

    public Integer getByline() {
        return byline;
    }

    public void setByline(Integer byline) {
        this.byline = byline;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getPlaybar() {
        return playbar;
    }

    public void setPlaybar(Integer playbar) {
        this.playbar = playbar;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getBranding() {
        return branding;
    }

    public void setBranding(Integer branding) {
        this.branding = branding;
    }

    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public Integer getScaling() {
        return scaling;
    }

    public void setScaling(Integer scaling) {
        this.scaling = scaling;
    }

    public Integer getLogo() {
        return logo;
    }

    public void setLogo(Integer logo) {
        this.logo = logo;
    }

    public Integer getSpatial_compass() {
        return spatial_compass;
    }

    public void setSpatial_compass(Integer spatial_compass) {
        this.spatial_compass = spatial_compass;
    }

    public Integer getCollections() {
        return collections;
    }

    public void setCollections(Integer collections) {
        this.collections = collections;
    }

    public Integer getInfo_on_pause() {
        return info_on_pause;
    }

    public void setInfo_on_pause(Integer info_on_pause) {
        this.info_on_pause = info_on_pause;
    }

    public Integer getWatch_later() {
        return watch_later;
    }

    public void setWatch_later(Integer watch_later) {
        this.watch_later = watch_later;
    }

    public Integer getPortrait() {
        return portrait;
    }

    public void setPortrait(Integer portrait) {
        this.portrait = portrait;
    }

    public Integer getEmbed() {
        return embed;
    }

    public void setEmbed(Integer embed) {
        this.embed = embed;
    }

    public Integer getBadge() {
        return badge;
    }

    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    public Integer getSpatial_label() {
        return spatial_label;
    }

    public void setSpatial_label(Integer spatial_label) {
        this.spatial_label = spatial_label;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
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
