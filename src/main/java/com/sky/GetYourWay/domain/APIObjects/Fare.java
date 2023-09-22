
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
    "adults",
    "children",
    "infants"
})
@Generated("jsonschema2pojo")
public class Fare {

    @JsonProperty("adults")
    private Integer adults;
    @JsonProperty("children")
    private Integer children;
    @JsonProperty("infants")
    private Integer infants;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fare() {
    }

    /**
     * 
     * @param infants
     * @param children
     * @param adults
     */
    public Fare(Integer adults, Integer children, Integer infants) {
        super();
        this.adults = adults;
        this.children = children;
        this.infants = infants;
    }

    @JsonProperty("adults")
    public Integer getAdults() {
        return adults;
    }

    @JsonProperty("adults")
    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Fare withAdults(Integer adults) {
        this.adults = adults;
        return this;
    }

    @JsonProperty("children")
    public Integer getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(Integer children) {
        this.children = children;
    }

    public Fare withChildren(Integer children) {
        this.children = children;
        return this;
    }

    @JsonProperty("infants")
    public Integer getInfants() {
        return infants;
    }

    @JsonProperty("infants")
    public void setInfants(Integer infants) {
        this.infants = infants;
    }

    public Fare withInfants(Integer infants) {
        this.infants = infants;
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

    public Fare withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fare.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adults");
        sb.append('=');
        sb.append(((this.adults == null)?"<null>":this.adults));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("infants");
        sb.append('=');
        sb.append(((this.infants == null)?"<null>":this.infants));
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
