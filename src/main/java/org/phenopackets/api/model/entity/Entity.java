package org.phenopackets.api.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;

/**
 * An entity encompasses persons or non-human organisms, variants, diseases, genes, cohorts, etc
 *
 * @author cjm
 * @author Jules Jacobsen <jules.jacobsen@sanger.ac.uk>
 */
@JsonPropertyOrder({"id", "label"})
public interface Entity {

    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the entity, can be either URI or CURIE")
    @JsonldId
    public String getId();

    public void setId(String id);

    @JsonProperty("label")
    @JsonPropertyDescription("A string that contains the preferred natural language term to denote the entity")
    @JsonldProperty("http://www.w3.org/2000/01/rdf-schema#label")
    public String getLabel();

    public void setLabel(String label);

    @JsonIgnore
    public EntityType getType();


}
