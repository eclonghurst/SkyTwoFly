
package com.sky.GetYourWay.domain.APIObjects;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_fare",
    "fees"
})
@Generated("jsonschema2pojo")
public class PriceDropdown {

    @JsonProperty("base_fare")
    private Integer baseFare;
    @JsonProperty("fees")
    private Integer fees;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceDropdown() {
    }

    /**
     * 
     * @param baseFare
     * @param fees
     */
    public PriceDropdown(Integer baseFare, Integer fees) {
        super();
        this.baseFare = baseFare;
        this.fees = fees;
    }

    @JsonProperty("base_fare")
    public Integer getBaseFare() {
        return baseFare;
    }

    @JsonProperty("base_fare")
    public void setBaseFare(Integer baseFare) {
        this.baseFare = baseFare;
    }

    public PriceDropdown withBaseFare(Integer baseFare) {
        this.baseFare = baseFare;
        return this;
    }

    @JsonProperty("fees")
    public Integer getFees() {
        return fees;
    }

    @JsonProperty("fees")
    public void setFees(Integer fees) {
        this.fees = fees;
    }

    public PriceDropdown withFees(Integer fees) {
        this.fees = fees;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PriceDropdown withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriceDropdown.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseFare");
        sb.append('=');
        sb.append(((this.baseFare == null)?"<null>":this.baseFare));
        sb.append(',');
        sb.append("fees");
        sb.append('=');
        sb.append(((this.fees == null)?"<null>":this.fees));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
