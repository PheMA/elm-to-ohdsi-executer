package edu.phema.elm_to_omop.heart_failure;

import edu.phema.elm_to_omop.PhemaTestHelper;
import edu.phema.elm_to_omop.api.ElmToOmopTranslator;
import edu.phema.elm_to_omop.repository.IOmopRepositoryService;
import edu.phema.elm_to_omop.repository.OmopRepositoryService;
import edu.phema.elm_to_omop.translate.PhemaElmToOmopTranslator;
import edu.phema.elm_to_omop.vocabulary.EmptyValuesetService;
import edu.phema.elm_to_omop.vocabulary.IValuesetService;
import edu.phema.elm_to_omop.vocabulary.PhemaJsonConceptSetService;
import edu.phema.elm_to_omop.vocabulary.phema.PhemaConceptSet;
import org.cqframework.cql.cql2elm.CqlTranslator;
import org.cqframework.cql.cql2elm.LibraryManager;
import org.cqframework.cql.cql2elm.ModelManager;
import org.hl7.elm.r1.ExpressionDef;
import org.hl7.elm.r1.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ohdsi.circe.cohortdefinition.CohortExpression;
import org.ohdsi.webapi.service.CohortDefinitionService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartFailurePhenotypeTest {
    private CqlTranslator translator;
    private Library library;

    private IValuesetService valuesetService;
    private List<PhemaConceptSet> conceptSets;

    private ModelManager modelManager;
    private LibraryManager libraryManager;

    @BeforeEach
    public void setup() throws Exception {
        modelManager = new ModelManager();
        libraryManager = new LibraryManager(modelManager);
    }

    @Test
    public void StepZeroTest() throws Exception {
        // Set up the ELM tree
        translator = CqlTranslator.fromStream(this.getClass().getClassLoader().getResourceAsStream("heart-failure/cql/step-0-anyone-with-hf-echo.phenotype.cql"), modelManager, libraryManager);
        library = translator.toELM();

        // Use the JSON file valueset service
        String valuesetJson = PhemaTestHelper.getFileAsString("heart-failure/valuesets/omop-json/2.16.840.1.999999.1.heart-failure-echocardiography-cpt-codes.valueset.omop.json");
        valuesetService = new PhemaJsonConceptSetService(valuesetJson);
        conceptSets = valuesetService.getConceptSets();

        // Generate the cohort expression
        ExpressionDef expression = PhemaTestHelper.getExpressionDefByName(library, "Case");
        CohortExpression ce = PhemaElmToOmopTranslator.generateCohortExpression(library, expression, conceptSets);

        // Assert against expected
        assertNotNull(ce);
        PhemaTestHelper.assertStringsEqualIgnoreWhitespace(
            PhemaTestHelper.getFileAsString("heart-failure/translated/step-0-anyone-with-hf-echo.omop.json"),
            PhemaTestHelper.getJson(ce));
    }

    @Test
    public void StepOneTest() throws Exception {
        // Set up the ELM tree
        translator = CqlTranslator.fromStream(this.getClass().getClassLoader().getResourceAsStream("heart-failure/cql/step-1-adults-only.phenotype.cql"), modelManager, libraryManager);
        library = translator.toELM();

        // Use the empty valueset service
        valuesetService = new EmptyValuesetService();
        conceptSets = valuesetService.getConceptSets();

        // Generate the cohort expression
        ExpressionDef expression = PhemaTestHelper.getExpressionDefByName(library, "Case");
        CohortExpression ce = PhemaElmToOmopTranslator.generateCohortExpression(library, expression, conceptSets);

        // Assert against expected
        assertNotNull(ce);
        PhemaTestHelper.assertStringsEqualIgnoreWhitespace(
            PhemaTestHelper.getFileAsString("heart-failure/translated/step-1-adults-only.omop.json"),
            PhemaTestHelper.getJson(ce));
    }

    @Test
    public void StepTwoTest() throws Exception {
        // Set up the ELM tree
        translator = CqlTranslator.fromStream(this.getClass().getClassLoader().getResourceAsStream("heart-failure/cql/step-2-adults-with-hf-echo.phenotype.cql"), modelManager, libraryManager);
        library = translator.toELM();

        // Use the JSON file valueset service
        String valuesetJson = PhemaTestHelper.getFileAsString("heart-failure/valuesets/omop-json/2.16.840.1.999999.1.heart-failure-echocardiography-cpt-codes.valueset.omop.json");
        valuesetService = new PhemaJsonConceptSetService(valuesetJson);
        conceptSets = valuesetService.getConceptSets();

        // Generate the cohort expression
        ExpressionDef expression = PhemaTestHelper.getExpressionDefByName(library, "Case");
        CohortExpression ce = PhemaElmToOmopTranslator.generateCohortExpression(library, expression, conceptSets);

        // Assert against expected
        assertNotNull(ce);
        PhemaTestHelper.assertStringsEqualIgnoreWhitespace(
            PhemaTestHelper.getFileAsString("heart-failure/translated/step-2-adults-with-hf-echo.omop.json"),
            PhemaTestHelper.getJson(ce));
    }

    @Test
    public void StepThreeTest() throws Exception {
        // Set up the ELM tree
        translator = CqlTranslator.fromStream(this.getClass().getClassLoader().getResourceAsStream("heart-failure/cql/step-3-adults-with-echo-and-dx.phenotype.cql"), modelManager, libraryManager);
        library = translator.toELM();

        // Use the JSON file valueset service
        String valuesetJson = PhemaTestHelper.getFileAsString("heart-failure/valuesets/omop-json/2.16.840.1.999999.1-and-2.16.840.1.113883.3.526.3.376.valueset.omop.json");
        valuesetService = new PhemaJsonConceptSetService(valuesetJson);
        conceptSets = valuesetService.getConceptSets();

        // Generate the cohort expression
        ExpressionDef expression = PhemaTestHelper.getExpressionDefByName(library, "Case");
        CohortExpression ce = PhemaElmToOmopTranslator.generateCohortExpression(library, expression, conceptSets);

        // Assert against expected
        assertNotNull(ce);
        PhemaTestHelper.assertStringsEqualIgnoreWhitespace(
            PhemaTestHelper.getFileAsString("heart-failure/translated/step-3-adults-with-echo-and-dx.omop.json"),
            PhemaTestHelper.getJson(ce));
    }

    @Test
    public void StepFourTest() throws Exception {
        // Set up the ELM tree
        translator = CqlTranslator.fromStream(this.getClass().getClassLoader().getResourceAsStream("heart-failure/cql/step-4-full-heart-failure.phenotype.cql"), modelManager, libraryManager);
        library = translator.toELM();

        // Use the JSON file valueset service
        String valuesetJson = PhemaTestHelper.getFileAsString("heart-failure/valuesets/omop-json/all-hf-phenotype-valuesets.omop.json");
        valuesetService = new PhemaJsonConceptSetService(valuesetJson);
        conceptSets = valuesetService.getConceptSets();

        // Generate the cohort expression
        ExpressionDef expression = PhemaTestHelper.getExpressionDefByName(library, "Case");
        CohortExpression ce = PhemaElmToOmopTranslator.generateCohortExpression(library, expression, conceptSets);

        // Assert against expected
        assertNotNull(ce);
        PhemaTestHelper.assertStringsEqualIgnoreWhitespace(
            PhemaTestHelper.getFileAsString("heart-failure/translated/step-4-full-heart-failure.omop.json"),
            PhemaTestHelper.getJson(ce));
    }

//    @Test
//    public void createHFPhenotypeInTestInstance() throws Exception {
//        // Set up the ELM tree
//        translator = CqlTranslator.fromStream(this.getClass().getClassLoader().getResourceAsStream("heart-failure/cql/step-4-full-heart-failure.phenotype.cql"), modelManager, libraryManager);
//        library = translator.toELM();
//
//        // Use the JSON file valueset service
//        String valuesetJson = PhemaTestHelper.getFileAsString("heart-failure/valuesets/omop-json/all-hf-phenotype-valuesets.omop.json");
//        valuesetService = new PhemaJsonConceptSetService(valuesetJson);
//        conceptSets = valuesetService.getConceptSets();
//
//        // Generate the cohort expression
//        ExpressionDef expression = PhemaTestHelper.getExpressionDefByName(library, "Case");
//        CohortExpression ce = PhemaElmToOmopTranslator.generateCohortExpression(library, expression, conceptSets);
//
//        // Create the cohort definition in the test instance
//        IOmopRepositoryService omopRepositoryService = new OmopRepositoryService("http://52.162.236.199/WebAPI/", "OHDSI-CDMV5");
//        ElmToOmopTranslator elmToOmopTranslator = new ElmToOmopTranslator(valuesetService);
//
//        CohortDefinitionService.CohortDefinitionDTO cohortDefinition = elmToOmopTranslator.buildCohortDefinition("HF Phenotype from CQL", "Created by test cases", ce);
//        omopRepositoryService.createCohortDefinition(cohortDefinition);
//    }
}