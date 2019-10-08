
package org.xmltoyaml.bean;

import java.util.ArrayList;
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
    "swagger",
    "info",
    "host",
    "basePath",
    "tags",
    "paths",
    "definitions"
})
public class YamlObject {

    @JsonProperty("swagger")
    private String swagger = "2.0";
    @JsonProperty("info")
    private Info info = new Info();
    @JsonProperty("host")
    private String host="localhost:8088";
    @JsonProperty("basePath")
    private String basePath="/";
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("paths")
    private Paths paths;
    @JsonProperty("definitions")
    private Definitions definitions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("swagger")
    public String getSwagger() {
        return swagger;
    }

    @JsonProperty("swagger")
    public void setSwagger(String swagger) {
        this.swagger = swagger;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("basePath")
    public String getBasePath() {
        return basePath;
    }

    @JsonProperty("basePath")
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("paths")
    public Paths getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    @JsonProperty("definitions")
    public Definitions getDefinitions() {
        return definitions;
    }

    @JsonProperty("definitions")
    public void setDefinitions(Definitions definitions) {
        this.definitions = definitions;
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
