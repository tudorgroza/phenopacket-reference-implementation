package org.phenopackets.api.model.condition;

import java.util.List;


/**
 * An individual occurrence of a phenotype (a type of condition)
 *
 * @author cjm
 */
public class Phenotype extends Condition {

    List<Measurement> measurements;

    public Phenotype(Phenotype.Builder builder) {
        super(builder);
    }

    public Phenotype() {
        super();
    }

    /**
     * @return the measurements
     */
    public List<Measurement> getMeasurements() {
        return measurements;
    }

    /**
     * @param measurements the measurements to set
     */
    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }


    public static class Builder extends Condition.Builder {

        public Phenotype build() {
            return new Phenotype(this);
        }
    }


}
