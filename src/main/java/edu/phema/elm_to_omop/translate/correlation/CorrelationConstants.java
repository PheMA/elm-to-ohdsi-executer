package edu.phema.elm_to_omop.translate.correlation;

import edu.phema.elm_to_omop.translate.PhemaElmaToOmopTranslatorContext;
import org.ohdsi.circe.cohortdefinition.CriteriaGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorrelationConstants {

    /**
     * Represents the QUICK resources we support
     */
    public enum QuickResourceType {
        ENCOUNTER("Encounter"),
        CONDITION("Condition");

        private final String quickResource;

        QuickResourceType(final String typeString) {
            this.quickResource = typeString;
        }

        public String toString() {
            return quickResource;
        }

        public static QuickResourceType create(String quickResourceName) throws CorrelationException {
            switch (quickResourceName.toUpperCase()) {
                case "ENCOUNTER":
                    return QuickResourceType.ENCOUNTER;
                case "CONDITION":
                    return QuickResourceType.CONDITION;
                default:
                    throw new CorrelationException(String.format("%s resource not supported for correlation", quickResourceName));
            }
        }
    }

    /**
     * Represents the QUICK resource attributes we support
     */
    public enum QuickResourceAttribute {
        ID("id"),
        ONSET_DATE_TIME("onsetDateTime"),
        ENCOUNTER("encounter");

        private final String quickResourceAttribute;

        QuickResourceAttribute(final String typeString) {
            this.quickResourceAttribute = typeString;
        }

        public String toString() {
            return quickResourceAttribute;
        }

        public static QuickResourceAttribute create(String quickResourceAttributeName) throws CorrelationException {
            switch (quickResourceAttributeName.toUpperCase()) {
                case "ID":
                    return QuickResourceAttribute.ID;
                case "ONSETDATETIME":
                    return QuickResourceAttribute.ONSET_DATE_TIME;
                case "ENCOUNTER":
                    return QuickResourceAttribute.ENCOUNTER;
                default:
                    throw new CorrelationException(String.format("%s resource not supported for correlation", quickResourceAttributeName));
            }
        }
    }

    /**
     * Represents the Circe criteria we support
     */
    public enum CirceCriteria {
        // Domain criteria
        CONDITION_OCCURRENCE,
        PROCEDURE_OCCURRENCE,

        // Correlation criteria
        CORRLATED_CRITERIA
    }

    /**
     * Represents the Circe criteria attributes we support
     */
    public enum CirceCriteriaAttribute {
        RESTRICT_VISIT,
        CODESET_ID
    }

    /**
     * Contains the QUICK resource-attribute pairs for which we support correlation
     */
    public static List<CorrelatedQuickPair> supportedQuickCorrelations = new ArrayList<>();

    public static List<QuickCirceMapping> quickCirceMappings = new ArrayList<>();

    public static Map<Correlation, CorrelatedQueryCriteriaGroupGeneratorFunction<Correlation, PhemaElmaToOmopTranslatorContext, CriteriaGroup>> generators = new HashMap<>();

    static {
        try {
            // Encounter.id = Condition.encounter
            supportedQuickCorrelations.add(new CorrelatedQuickPair(new QuickResource(QuickResourceType.ENCOUNTER, null), QuickResourceAttribute.ID, new QuickResource(QuickResourceType.CONDITION, null), QuickResourceAttribute.ENCOUNTER));

            // TODO: Condition.onsetDateTime <temporal operator> Condition.onsetDateTime

            // QUICK to Circe mappings
            quickCirceMappings.add(new QuickCirceMapping(QuickResourceType.ENCOUNTER, QuickResourceAttribute.ID, CirceCriteria.PROCEDURE_OCCURRENCE, CirceCriteriaAttribute.CODESET_ID));

            // Functions for generating correlated criteria

            generators.put(Correlation.from("Encounter", "id", "Condition", "encounter"), CorrelatedQueryCriteriaGroupGenerator::encounterCondition);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
