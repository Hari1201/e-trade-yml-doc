
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
    "errors",
    "includeSuccessRecords",
    "totalRecordsCount",
    "totalRecordsSuccessfullyProcessedCount",
    "totalRecordsWithErrorCount",
    "totalRecordsWithFormattingError",
    "totalRecordsWithWarningCount",
    "totalRecordsWithoutFormattingError"
})
public class Properties___ {

    @JsonProperty("data")
    private Data_ data;
    @JsonProperty("errors")
    private Errors_ errors;
    @JsonProperty("includeSuccessRecords")
    private IncludeSuccessRecords_ includeSuccessRecords;
    @JsonProperty("totalRecordsCount")
    private TotalRecordsCount totalRecordsCount;
    @JsonProperty("totalRecordsSuccessfullyProcessedCount")
    private TotalRecordsSuccessfullyProcessedCount totalRecordsSuccessfullyProcessedCount;
    @JsonProperty("totalRecordsWithErrorCount")
    private TotalRecordsWithErrorCount totalRecordsWithErrorCount;
    @JsonProperty("totalRecordsWithFormattingError")
    private TotalRecordsWithFormattingError totalRecordsWithFormattingError;
    @JsonProperty("totalRecordsWithWarningCount")
    private TotalRecordsWithWarningCount totalRecordsWithWarningCount;
    @JsonProperty("totalRecordsWithoutFormattingError")
    private TotalRecordsWithoutFormattingError totalRecordsWithoutFormattingError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public Data_ getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data_ data) {
        this.data = data;
    }

    @JsonProperty("errors")
    public Errors_ getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(Errors_ errors) {
        this.errors = errors;
    }

    @JsonProperty("includeSuccessRecords")
    public IncludeSuccessRecords_ getIncludeSuccessRecords() {
        return includeSuccessRecords;
    }

    @JsonProperty("includeSuccessRecords")
    public void setIncludeSuccessRecords(IncludeSuccessRecords_ includeSuccessRecords) {
        this.includeSuccessRecords = includeSuccessRecords;
    }

    @JsonProperty("totalRecordsCount")
    public TotalRecordsCount getTotalRecordsCount() {
        return totalRecordsCount;
    }

    @JsonProperty("totalRecordsCount")
    public void setTotalRecordsCount(TotalRecordsCount totalRecordsCount) {
        this.totalRecordsCount = totalRecordsCount;
    }

    @JsonProperty("totalRecordsSuccessfullyProcessedCount")
    public TotalRecordsSuccessfullyProcessedCount getTotalRecordsSuccessfullyProcessedCount() {
        return totalRecordsSuccessfullyProcessedCount;
    }

    @JsonProperty("totalRecordsSuccessfullyProcessedCount")
    public void setTotalRecordsSuccessfullyProcessedCount(TotalRecordsSuccessfullyProcessedCount totalRecordsSuccessfullyProcessedCount) {
        this.totalRecordsSuccessfullyProcessedCount = totalRecordsSuccessfullyProcessedCount;
    }

    @JsonProperty("totalRecordsWithErrorCount")
    public TotalRecordsWithErrorCount getTotalRecordsWithErrorCount() {
        return totalRecordsWithErrorCount;
    }

    @JsonProperty("totalRecordsWithErrorCount")
    public void setTotalRecordsWithErrorCount(TotalRecordsWithErrorCount totalRecordsWithErrorCount) {
        this.totalRecordsWithErrorCount = totalRecordsWithErrorCount;
    }

    @JsonProperty("totalRecordsWithFormattingError")
    public TotalRecordsWithFormattingError getTotalRecordsWithFormattingError() {
        return totalRecordsWithFormattingError;
    }

    @JsonProperty("totalRecordsWithFormattingError")
    public void setTotalRecordsWithFormattingError(TotalRecordsWithFormattingError totalRecordsWithFormattingError) {
        this.totalRecordsWithFormattingError = totalRecordsWithFormattingError;
    }

    @JsonProperty("totalRecordsWithWarningCount")
    public TotalRecordsWithWarningCount getTotalRecordsWithWarningCount() {
        return totalRecordsWithWarningCount;
    }

    @JsonProperty("totalRecordsWithWarningCount")
    public void setTotalRecordsWithWarningCount(TotalRecordsWithWarningCount totalRecordsWithWarningCount) {
        this.totalRecordsWithWarningCount = totalRecordsWithWarningCount;
    }

    @JsonProperty("totalRecordsWithoutFormattingError")
    public TotalRecordsWithoutFormattingError getTotalRecordsWithoutFormattingError() {
        return totalRecordsWithoutFormattingError;
    }

    @JsonProperty("totalRecordsWithoutFormattingError")
    public void setTotalRecordsWithoutFormattingError(TotalRecordsWithoutFormattingError totalRecordsWithoutFormattingError) {
        this.totalRecordsWithoutFormattingError = totalRecordsWithoutFormattingError;
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
