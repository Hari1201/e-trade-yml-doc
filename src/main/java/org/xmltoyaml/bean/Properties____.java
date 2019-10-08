
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
    "customFMV",
    "fmv",
    "proratedGain",
    "taxDescription",
    "ytdPaid",
    "ytdWages"
})
public class Properties____ {

    @JsonProperty("customFMV")
    private CustomFMV customFMV;
    @JsonProperty("fmv")
    private Fmv fmv;
    @JsonProperty("proratedGain")
    private ProratedGain proratedGain;
    @JsonProperty("taxDescription")
    private TaxDescription taxDescription;
    @JsonProperty("ytdPaid")
    private YtdPaid ytdPaid;
    @JsonProperty("ytdWages")
    private YtdWages ytdWages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customFMV")
    public CustomFMV getCustomFMV() {
        return customFMV;
    }

    @JsonProperty("customFMV")
    public void setCustomFMV(CustomFMV customFMV) {
        this.customFMV = customFMV;
    }

    @JsonProperty("fmv")
    public Fmv getFmv() {
        return fmv;
    }

    @JsonProperty("fmv")
    public void setFmv(Fmv fmv) {
        this.fmv = fmv;
    }

    @JsonProperty("proratedGain")
    public ProratedGain getProratedGain() {
        return proratedGain;
    }

    @JsonProperty("proratedGain")
    public void setProratedGain(ProratedGain proratedGain) {
        this.proratedGain = proratedGain;
    }

    @JsonProperty("taxDescription")
    public TaxDescription getTaxDescription() {
        return taxDescription;
    }

    @JsonProperty("taxDescription")
    public void setTaxDescription(TaxDescription taxDescription) {
        this.taxDescription = taxDescription;
    }

    @JsonProperty("ytdPaid")
    public YtdPaid getYtdPaid() {
        return ytdPaid;
    }

    @JsonProperty("ytdPaid")
    public void setYtdPaid(YtdPaid ytdPaid) {
        this.ytdPaid = ytdPaid;
    }

    @JsonProperty("ytdWages")
    public YtdWages getYtdWages() {
        return ytdWages;
    }

    @JsonProperty("ytdWages")
    public void setYtdWages(YtdWages ytdWages) {
        this.ytdWages = ytdWages;
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
