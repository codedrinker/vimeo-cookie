
package com.github.codedrinker.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class User {

    private Integer liked;
    private String account_type;
    private Integer progress;
    private Integer owner;
    private Integer watch_later;
    private Integer logged_in;
    private Integer id;
    private Integer mod;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getLiked() {
        return liked;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getWatch_later() {
        return watch_later;
    }

    public void setWatch_later(Integer watch_later) {
        this.watch_later = watch_later;
    }

    public Integer getLogged_in() {
        return logged_in;
    }

    public void setLogged_in(Integer logged_in) {
        this.logged_in = logged_in;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMod() {
        return mod;
    }

    public void setMod(Integer mod) {
        this.mod = mod;
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
