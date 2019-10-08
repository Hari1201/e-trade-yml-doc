
package org.xmltoyaml.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tags",
    "summary",
    "operationId",
    "consumes",
    "produces",
    "parameters",
    "responses"
})
public class Get_ {

    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("operationId")
    private String operationId;
    @JsonProperty("consumes")
    private List<String> consumes = null;
    @JsonProperty("produces")
    private List<String> produces = null;
    @JsonProperty("parameters")
    private List<Parameter_> parameters = null;
    @JsonProperty("responses")
    private Responses_ responses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("operationId")
    public String getOperationId() {
        return operationId;
    }

    @JsonProperty("operationId")
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @JsonProperty("consumes")
    public List<String> getConsumes() {
        return consumes;
    }

    @JsonProperty("consumes")
    public void setConsumes(List<String> consumes) {
        this.consumes = consumes;
    }

    @JsonProperty("produces")
    public List<String> getProduces() {
        return produces;
    }

    @JsonProperty("produces")
    public void setProduces(List<String> produces) {
        this.produces = produces;
    }

    @JsonProperty("parameters")
    public List<Parameter_> getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(List<Parameter_> parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("responses")
    public Responses_ getResponses() {
        return responses;
    }

    @JsonProperty("responses")
    public void setResponses(Responses_ responses) {
        this.responses = responses;
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
