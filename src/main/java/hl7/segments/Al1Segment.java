package hl7.segments;

public class Al1Segment extends Hl7segment {
    //listing all fields in AL1
    private String _setID;
    private String _allergyType;
    private String _allergyCodeMnemonicDesc;
    private String _allergySeverity;
    private String _allergyReaction;
    private String _identificationDate;


    public Al1Segment(String[] fields){
        _setID = get(fields, 1);
        _allergyType = get(fields, 2);
        _allergyCodeMnemonicDesc = get(fields, 3);
        _allergySeverity = get(fields, 4);
        _allergyReaction = get(fields, 5);
        _identificationDate = get(fields, 6);
    }

    public String getSetID() {
        return _setID;
    }

    public String getAllergyType() {
        return _allergyType;
    }

    public String getAllergyCodeMnemonicDesc() {
        return _allergyCodeMnemonicDesc;
    }

    public String getAllergySeverity() {
        return _allergySeverity;
    }

    public String getAllergyReaction() {
        return _allergyReaction;
    }

    public String getIdentificationDate() {
        return _identificationDate;
    }
}
