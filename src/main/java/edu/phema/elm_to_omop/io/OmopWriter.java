package edu.phema.elm_to_omop.io;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.phema.elm_to_omop.model.omop.ConceptSet;
import edu.phema.elm_to_omop.model.phema.LibraryHelper;
import org.hl7.elm.r1.ExpressionDef;
import org.hl7.elm.r1.Library;
import org.ohdsi.circe.cohortdefinition.CohortExpression;
import org.ohdsi.webapi.cohortdefinition.ExpressionType;
import org.ohdsi.webapi.service.CohortDefinitionService.CohortDefinitionDTO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class OmopWriter {
    private Logger logger = null;

    public OmopWriter(Logger logger) {
        this.logger = logger;
    }

    /**
     * Makes sure the json has been created and writes it to file designated in the configuration
     * Returns the json string
     */
    public String writeOmopJson(ExpressionDef expression, Library elmContents, java.util.List<ConceptSet> conceptSets, String directory, String filename) throws Exception {
        String jsonFileName = directory + filename;
        try (FileWriter jsonFile = new FileWriter(jsonFileName)) {
            String json = generateOmopJson(expression, elmContents, conceptSets);

            logger.info(String.format("Preparing to write JSON to %s", jsonFileName));
            jsonFile.write(json);
            return json;
        }
    }

    public CohortDefinitionDTO generateCohortDefinition(ExpressionDef expressionDef, Library elmContents, List<ConceptSet> conceptSets) throws Exception {
        CohortDefinitionDTO cohortDefinition = new CohortDefinitionDTO();

        cohortDefinition.name = expressionDef.getName();
        cohortDefinition.description = elmContents.getLocalId();
        cohortDefinition.expressionType = ExpressionType.SIMPLE_EXPRESSION;

        CohortExpression cohortExpression = LibraryHelper.generateCohortExpression(elmContents, expressionDef, conceptSets);

        // This manual serialization isn't required in later versions of the WebAPI, see:
        // https://github.com/OHDSI/WebAPI/blob/v2.7.4/src/main/java/org/ohdsi/webapi/cohortdefinition/dto/CohortDTO.java#L10
        cohortDefinition.expression = new ObjectMapper().writeValueAsString(cohortExpression);

        return cohortDefinition;
    }

    /**
     * Create the OMOP JSON from an ELM Library object, and associated populated list of OMOP ConceptSets
     *
     * @param expression  The expression that defines the phenotype overall
     * @param elmContents The ELM object to transform to OMOP JSON
     * @param conceptSets
     * @return
     * @throws IOException
     */
    public String generateOmopJson(ExpressionDef expression, Library elmContents, List<ConceptSet> conceptSets) throws Exception {
        CohortDefinitionDTO cohortDefinition = this.generateCohortDefinition(expression, elmContents, conceptSets);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return mapper.writeValueAsString(cohortDefinition);
    }
}
