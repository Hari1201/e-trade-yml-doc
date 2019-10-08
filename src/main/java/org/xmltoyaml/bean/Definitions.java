
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
    "Errors",
    "RequestBean",
    "Datum",
    "ImportResultsResponse",
    "Tax",
    "ResponseBean"
})
public class Definitions {

    @JsonProperty("Errors")
    private Errors errors;
    @JsonProperty("RequestBean")
    private RequestBean requestBean;
    @JsonProperty("Datum")
    private Datum datum;
    @JsonProperty("ImportResultsResponse")
    private ImportResultsResponse importResultsResponse;
    @JsonProperty("Tax")
    private Tax tax;
    @JsonProperty("ResponseBean")
    private ResponseBean responseBean;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Errors")
    public Errors getErrors() {
        return errors;
    }

    @JsonProperty("Errors")
    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    @JsonProperty("RequestBean")
    public RequestBean getRequestBean() {
        return requestBean;
    }

    @JsonProperty("RequestBean")
    public void setRequestBean(RequestBean requestBean) {
        this.requestBean = requestBean;
    }

    @JsonProperty("Datum")
    public Datum getDatum() {
        return datum;
    }

    @JsonProperty("Datum")
    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    @JsonProperty("ImportResultsResponse")
    public ImportResultsResponse getImportResultsResponse() {
        return importResultsResponse;
    }

    @JsonProperty("ImportResultsResponse")
    public void setImportResultsResponse(ImportResultsResponse importResultsResponse) {
        this.importResultsResponse = importResultsResponse;
    }

    @JsonProperty("Tax")
    public Tax getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @JsonProperty("ResponseBean")
    public ResponseBean getResponseBean() {
        return responseBean;
    }

    @JsonProperty("ResponseBean")
    public void setResponseBean(ResponseBean responseBean) {
        this.responseBean = responseBean;
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
