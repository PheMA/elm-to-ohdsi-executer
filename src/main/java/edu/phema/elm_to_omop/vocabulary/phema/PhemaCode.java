package edu.phema.elm_to_omop.vocabulary.phema;

/**
 * PhemaCode objects represent the codes used within a PhemaValueSet.
 * They are modeled based on the output from the Phema authoring tool
 */
public class PhemaCode {

    private String valueSetOid;
    private String valueSetName;
    private String code;
    private String description;
    private String codeSystem;
    private String codeSystemVersion;
    private String codeSystemOid;
    private String tty;
    private String omopConceptId;

    public PhemaCode() {
        super();
    }

    public String getValueSetOid() {
        return valueSetOid;
    }

    public String getValueSetName() {
        return valueSetName;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getCodeSystem() {
        return codeSystem;
    }

    public String getCodeSystemVersion() {
        return codeSystemVersion;
    }

    public String getCodeSystemOid() {
        return codeSystemOid;
    }

    public String getTty() {
        return tty;
    }

    public String getOmopConceptId() { return omopConceptId; }


    public void setValueSetOid(String valueSetOid) {
        this.valueSetOid = valueSetOid;
    }

    public void setValueSetName(String valueSetName) {
        this.valueSetName = valueSetName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    public void setCodeSystemVersion(String codeSystemVersion) {
        this.codeSystemVersion = codeSystemVersion;
    }

    public void setCodeSystemOid(String codeSystemOid) {
        this.codeSystemOid = codeSystemOid;
    }

    public void setTty(String tty) {
        this.tty = tty;
    }

    public void setOmopConceptId(String omopConceptId) { this.omopConceptId = omopConceptId; }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PhemaCode)) {
            return false;
        }

        PhemaCode other = (PhemaCode) obj;

        return code.equals(other.getCode()) &&
            codeSystem.equals(other.getCodeSystem());
    }
}
