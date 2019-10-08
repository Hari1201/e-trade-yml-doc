
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
public class Responses__ {

    @JsonProperty("200")
    private _200__ _200;
    @JsonProperty("401")
    private _401__ _401;
    @JsonProperty("403")
    private _403__ _403;
    @JsonProperty("404")
    private _404__ _404;
    @JsonProperty("500")
    private _500_ _500;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("200")
    public _200__ get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(_200__ _200) {
        this._200 = _200;
    }

    @JsonProperty("401")
    public _401__ get401() {
        return _401;
    }

    @JsonProperty("401")
    public void set401(_401__ _401) {
        this._401 = _401;
    }

    @JsonProperty("403")
    public _403__ get403() {
        return _403;
    }

    @JsonProperty("403")
    public void set403(_403__ _403) {
        this._403 = _403;
    }

    @JsonProperty("404")
    public _404__ get404() {
        return _404;
    }

    @JsonProperty("404")
    public void set404(_404__ _404) {
        this._404 = _404;
    }

    @JsonProperty("500")
    public _500_ get500() {
        return _500;
    }

    @JsonProperty("500")
    public void set500(_500_ _500) {
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
