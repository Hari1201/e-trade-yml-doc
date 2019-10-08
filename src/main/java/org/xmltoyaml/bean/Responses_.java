
package org.xmltoyaml.bean;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "200",
    "401",
    "403",
    "404",
    "500"
})
public class Responses_ {

    @JsonProperty("200")
    private _200_ _200;
    @JsonProperty("401")
    private _401_ _401;
    @JsonProperty("403")
    private _403_ _403;
    @JsonProperty("404")
    private _404_ _404;
    @JsonProperty("500")
    private org.xmltoyaml.bean._500 _500;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("200")
    public _200_ get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(_200_ _200) {
        this._200 = _200;
    }

    @JsonProperty("401")
    public _401_ get401() {
        return _401;
    }

    @JsonProperty("401")
    public void set401(_401_ _401) {
        this._401 = _401;
    }

    @JsonProperty("403")
    public _403_ get403() {
        return _403;
    }

    @JsonProperty("403")
    public void set403(_403_ _403) {
        this._403 = _403;
    }

    @JsonProperty("404")
    public _404_ get404() {
        return _404;
    }

    @JsonProperty("404")
    public void set404(_404_ _404) {
        this._404 = _404;
    }

    @JsonProperty("500")
    public org.xmltoyaml.bean._500 get500() {
        return _500;
    }

    @JsonProperty("500")
    public void set500(org.xmltoyaml.bean._500 _500) {
        this._500 = _500;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
