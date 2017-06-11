
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Embed {

    private Integer autopause;
    private Settings settings;
    private String color;
    private Integer on_site;
    private Integer dnt;
    private String outro;
    private Object cards;
    private Integer api;
    private Boolean editor;
    private String context;
    private Integer time;
    private String player_id;
    private Integer log_plays;
    private Object quality;
    private Object email;
    private Integer loop;
    private Integer autoplay;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getAutopause() {
        return autopause;
    }

    public void setAutopause(Integer autopause) {
        this.autopause = autopause;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getOn_site() {
        return on_site;
    }

    public void setOn_site(Integer on_site) {
        this.on_site = on_site;
    }

    public Integer getDnt() {
        return dnt;
    }

    public void setDnt(Integer dnt) {
        this.dnt = dnt;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }

    public Object getCards() {
        return cards;
    }

    public void setCards(Object cards) {
        this.cards = cards;
    }

    public Integer getApi() {
        return api;
    }

    public void setApi(Integer api) {
        this.api = api;
    }

    public Boolean getEditor() {
        return editor;
    }

    public void setEditor(Boolean editor) {
        this.editor = editor;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public Integer getLog_plays() {
        return log_plays;
    }

    public void setLog_plays(Integer log_plays) {
        this.log_plays = log_plays;
    }

    public Object getQuality() {
        return quality;
    }

    public void setQuality(Object quality) {
        this.quality = quality;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Integer getLoop() {
        return loop;
    }

    public void setLoop(Integer loop) {
        this.loop = loop;
    }

    public Integer getAutoplay() {
        return autoplay;
    }

    public void setAutoplay(Integer autoplay) {
        this.autoplay = autoplay;
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
