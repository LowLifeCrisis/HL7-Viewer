package hl7Viewer.nonGui;

public class MshSegment extends Hl7segment {
    //listing all fields in MSH
    // MSH.1 declares field separator to be used( aka "|")
    // which we use in Hl7Parse as "|" is the standard
    private String _encodingCharacters;
    private String _sendingApplication;
    private String _sendingFacility;
    private String _receivingApplication;
    private String _receivingFacility;
    private String _dateTimeOfMessage;
    private String _security;
    private String _messageType;
    private String _messageControlId;
    private String _processingId;
    private String _versionId;
    private String _sequenceNumber;
    private String _continuationPointer;
    private String _acceptAckType;
    private String _appAckType;
    private String _countryCode;
    private String _characterSet;
    private String _principalLangOfMessage;

    public MshSegment(String[] fields) {

        _encodingCharacters = get(fields, 1);
        _sendingApplication = get(fields, 2);
        _sendingFacility = get(fields, 3);
        _receivingApplication = get(fields, 4);
        _receivingFacility = get(fields, 5);
        _dateTimeOfMessage = get(fields, 6);
        _security = get(fields, 7);
        _messageType = get(fields, 8);
        _messageControlId = get(fields, 9);
        _processingId = get(fields, 10);
        _versionId = get(fields, 11);
        _sequenceNumber = get(fields, 12);
        _continuationPointer = get(fields, 13);
        _acceptAckType = get(fields, 14);
        _appAckType = get(fields, 15);
        _countryCode = get(fields, 16);
        _characterSet = get(fields, 17);
        _principalLangOfMessage = get(fields, 18);
    }

    public String getEncodingCharacters() {
        return _encodingCharacters;
    }

    public String getSendingApplication() {
        return _sendingApplication;
    }

    public String getSendingFacility() {
        return _sendingFacility;
    }

    public String getReceivingApplication() {
        return _receivingApplication;
    }

    public String getReceivingFacility() {
        return _receivingFacility;
    }

    public String getDateTimeOfMessage() {
        return _dateTimeOfMessage;
    }

    public String getSecurity() {
        return _security;
    }

    public String getMessageType() {
        return _messageType;
    }

    public String getMessageControlId() {
        return _messageControlId;
    }

    public String getProcessingId() {
        return _processingId;
    }

    public String getVersionId() {
        return _versionId;
    }

    public String getSequenceNumber() {
        return _sequenceNumber;
    }

    public String getContinuationPointer() {
        return _continuationPointer;
    }

    public String getAcceptAckType() {
        return _acceptAckType;
    }

    public String getAppAckType() {
        return _appAckType;
    }

    public String getCountryCode() {
        return _countryCode;
    }

    public String getCharacterSet() {
        return _characterSet;
    }

    public String getPrincipalLangOfMessage() {
        return _principalLangOfMessage;
    }
}