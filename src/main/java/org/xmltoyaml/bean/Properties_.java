
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
    "data",
    "includeSuccessRecords"
})
public class Properties_ {

    @JsonProperty("data")
    private Data data;
    @JsonProperty("includeSuccessRecords")
    private IncludeSuccessRecords includeSuccessRecords;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("includeSuccessRecords")
    public IncludeSuccessRecords getIncludeSuccessRecords() {
        return includeSuccessRecords;
    }

    @JsonProperty("includeSuccessRecords")
    public void setIncludeSuccessRecords(IncludeSuccessRecords includeSuccessRecords) {
        this.includeSuccessRecords = includeSuccessRecords;
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
