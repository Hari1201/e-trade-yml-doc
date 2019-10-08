
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
    "/eeo/async/ReleaseTax",
    "/eeo/async/status/{handle}",
    "/eeo/async/re/{handle}"
})
public class Paths {

    @JsonProperty("/eeo/async/ReleaseTax")
    private EeoAsyncReleaseTax eeoAsyncReleaseTax = new EeoAsyncReleaseTax();;
    @JsonProperty("/eeo/async/status/{handle}")
    private EeoAsyncStatusHandle eeoAsyncStatusHandle;
    @JsonProperty("/eeo/async/re/{handle}")
    private EeoAsyncReHandle eeoAsyncReHandle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("/eeo/async/ReleaseTax")
    public EeoAsyncReleaseTax getEeoAsyncReleaseTax() {
        return eeoAsyncReleaseTax;
    }

    @JsonProperty("/eeo/async/ReleaseTax")
    public void setEeoAsyncReleaseTax(EeoAsyncReleaseTax eeoAsyncReleaseTax) {
        this.eeoAsyncReleaseTax = eeoAsyncReleaseTax;
    }

    @JsonProperty("/eeo/async/status/{handle}")
    public EeoAsyncStatusHandle getEeoAsyncStatusHandle() {
        return eeoAsyncStatusHandle;
    }

    @JsonProperty("/eeo/async/status/{handle}")
    public void setEeoAsyncStatusHandle(EeoAsyncStatusHandle eeoAsyncStatusHandle) {
        this.eeoAsyncStatusHandle = eeoAsyncStatusHandle;
    }

    @JsonProperty("/eeo/async/re/{handle}")
    public EeoAsyncReHandle getEeoAsyncReHandle() {
        return eeoAsyncReHandle;
    }

    @JsonProperty("/eeo/async/re/{handle}")
    public void setEeoAsyncReHandle(EeoAsyncReHandle eeoAsyncReHandle) {
        this.eeoAsyncReHandle = eeoAsyncReHandle;
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
