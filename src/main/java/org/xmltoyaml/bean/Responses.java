
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
    "404"
})
public class Responses {

    @JsonProperty("200")
    private org.xmltoyaml.bean._200 _200;
    @JsonProperty("401")
    private org.xmltoyaml.bean._401 _401;
    @JsonProperty("403")
    private org.xmltoyaml.bean._403 _403;
    @JsonProperty("404")
    private org.xmltoyaml.bean._404 _404;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("200")
    public org.xmltoyaml.bean._200 get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(org.xmltoyaml.bean._200 _200) {
        this._200 = _200;
    }

    @JsonProperty("401")
    public org.xmltoyaml.bean._401 get401() {
        return _401;
    }

    @JsonProperty("401")
    public void set401(org.xmltoyaml.bean._401 _401) {
        this._401 = _401;
    }

    @JsonProperty("403")
    public org.xmltoyaml.bean._403 get403() {
        return _403;
    }

    @JsonProperty("403")
    public void set403(org.xmltoyaml.bean._403 _403) {
        this._403 = _403;
    }

    @JsonProperty("404")
    public org.xmltoyaml.bean._404 get404() {
        return _404;
    }

    @JsonProperty("404")
    public void set404(org.xmltoyaml.bean._404 _404) {
        this._404 = _404;
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
