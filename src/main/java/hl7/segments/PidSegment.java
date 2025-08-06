package hl7.segments;

public class PidSegment extends Hl7segment {
    //listing all fields in PID
    private String _setID;
    private String _patIdExternal;
    private String _patIdInternal;
    private String _patName;
    private String _mothersMaidenName;
    private String _dateOfBirth;
    private String _gender;
    private String _patAlias;
    private String _race;
    private String _patAddress;
    private String _countryCode;
    private String _phoneNumHome;
    private String _phoneNumBiz;
    private String _primaryLang;
    private String _maritalStatus;
    private String _religion;
    private String _patAccountNum;
    private String _ssnNum;
    private String _dlNum;
    private String _mothersIdentifier;
    private String _ethnicGroup;
    private String _birthPlace;
    private String _multipleBirthIndicator;
    private String _birthOrder;
    private String _citizenship;
    private String _veteranStatus;
    private String _nationalityCode;
    private String _patDeathDateTime;
    private String _patDeathIndicator;

    public PidSegment(String[] fields) {
        _setID = get(fields, 1);
        _patIdExternal = get(fields, 2);
        _patIdInternal = get(fields, 3);
        _patName = get(fields, 5);
        _mothersMaidenName = get(fields, 6);
        _dateOfBirth = get(fields, 7);
        _gender = get(fields, 8);
        _patAlias = get(fields, 9);
        _race = get(fields, 10);
        _patAddress = get(fields, 11);
        _countryCode = get(fields, 12);
        _phoneNumHome = get(fields, 13);
        _phoneNumBiz = get(fields, 14);
        _primaryLang = get(fields, 15);
        _maritalStatus = get(fields, 16);
        _religion = get(fields, 17);
        _patAccountNum = get(fields, 18);
        _ssnNum = get(fields, 19);
        _dlNum = get(fields, 20);
        _mothersIdentifier = get(fields, 21);
        _ethnicGroup = get(fields, 22);
        _birthPlace = get(fields, 23);
        _multipleBirthIndicator = get(fields, 24);
        _birthOrder = get(fields, 25);
        _citizenship = get(fields, 26);
        _veteranStatus = get(fields, 27);
        _nationalityCode = get(fields, 28);
        _patDeathDateTime = get(fields, 29);
        _patDeathIndicator = get(fields, 30);
    }

    public String getSetID() {
        return _setID;
    }

    public String getPatIdExternal() {
        return _patIdExternal;
    }

    public String getPatIdInternal() {
        return _patIdInternal;
    }

    public String getPatName() {
        return _patName;
    }

    public String getMothersMaidenName() {
        return _mothersMaidenName;
    }

    public String getDateOfBirth() {
        return _dateOfBirth;
    }

    public String getGender() {
        return _gender;
    }

    public String getPatAlias() {
        return _patAlias;
    }

    public String getRace() {
        return _race;
    }

    public String getPatAddress() {
        return _patAddress;
    }

    public String getCountryCode() {
        return _countryCode;
    }

    public String getPhoneNumHome() {
        return _phoneNumHome;
    }

    public String getPhoneNumBiz() {
        return _phoneNumBiz;
    }

    public String getPrimaryLang() {
        return _primaryLang;
    }

    public String getMaritalStatus() {
        return _maritalStatus;
    }

    public String getReligion() {
        return _religion;
    }

    public String getPatAccountNum() {
        return _patAccountNum;
    }

    public String getSsnNum() {
        return _ssnNum;
    }

    public String getDlNum() {
        return _dlNum;
    }

    public String getMothersIdentifier() {
        return _mothersIdentifier;
    }

    public String getEthnicGroup() {
        return _ethnicGroup;
    }

    public String getBirthPlace() {
        return _birthPlace;
    }

    public String getMultipleBirthIndicator() {
        return _multipleBirthIndicator;
    }

    public String getBirthOrder() {
        return _birthOrder;
    }

    public String getCitizenship() {
        return _citizenship;
    }

    public String getVeteranStatus() {
        return _veteranStatus;
    }

    public String getNationalityCode() {
        return _nationalityCode;
    }

    public String getPatDeathDateTime() {
        return _patDeathDateTime;
    }

    public String getPatDeathIndicator() {
        return _patDeathIndicator;
    }
}
