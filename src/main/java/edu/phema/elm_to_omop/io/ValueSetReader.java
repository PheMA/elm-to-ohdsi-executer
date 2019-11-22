package edu.phema.elm_to_omop.io;

import edu.phema.elm_to_omop.model.omop.ConceptSet;
import edu.phema.elm_to_omop.model.omop.Expression;
import edu.phema.elm_to_omop.model.omop.Items;
import edu.phema.elm_to_omop.model.phema.PhemaCode;
import edu.phema.elm_to_omop.model.phema.PhemaValueSet;
import edu.phema.elm_to_omop.repository.IOmopRepositoryService;
import edu.phema.elm_to_omop.repository.OmopRepositoryException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.ohdsi.circe.vocabulary.Concept;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads Value sets from a spreadsheet formatted in PhEMA authoring tool standard.
 */
public class ValueSetReader {
    private IOmopRepositoryService repository;

    public ValueSetReader(IOmopRepositoryService repository) {
        this.repository = repository;
    }

    public List<ConceptSet> getConceptSets(String valueSetPath, String tab) throws IOException, OmopRepositoryException, InvalidFormatException {
        SpreadsheetReader vsReader = new SpreadsheetReader();
        ArrayList<PhemaValueSet> codes = vsReader.getSpreadsheetData(valueSetPath, tab);
        return getConceptSets(codes);
    }

    private List<ConceptSet> getConceptSets(ArrayList<PhemaValueSet> pvsList) throws OmopRepositoryException {
        List<ConceptSet> conceptSets = new ArrayList<ConceptSet>();
        Expression expression = null;

        int conceptSetId = 0;
        ConceptSet conceptSet = null;
        Items items = null;
        for (PhemaValueSet pvs : pvsList) {
            expression = new Expression();
            conceptSet = new ConceptSet();
            conceptSet.setId(conceptSetId);
            conceptSet.setOid(pvs.getOid());
            conceptSet.setName(pvs.getName());


            ArrayList<PhemaCode> codes = pvs.getCodes();
            for (PhemaCode code : codes) {
                Concept concept = repository.getConceptMetadata(code.getCode());

                items = new Items();
                items.setConcept(concept);
                expression.addItem(items);
            }

            conceptSet.setExpression(expression);
            conceptSets.add(conceptSet);
            conceptSetId++;
        }

        return conceptSets;
    }

}
