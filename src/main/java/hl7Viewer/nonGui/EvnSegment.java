package hl7Viewer.nonGui;

public class EvnSegment extends Hl7segment {

    private String _eventTypeCode;
    private String _recordedDateTime;
    private String _dateTimePlannedEvent;
    private String _eventReasonCode;
    private String _operatorID;
    private String _eventOccurred;


    public EvnSegment(String[] fields){
        _eventTypeCode = get(fields, 1);
        _recordedDateTime = get(fields, 2);
        _dateTimePlannedEvent = get(fields, 3);
        _eventReasonCode = get(fields, 4);
        _operatorID = get(fields, 5);
        _eventOccurred = get(fields, 6);
    }

    public String getEventTypeCode() {
        return _eventTypeCode;
    }

    public String getRecordedDateTime() {
        return _recordedDateTime;
    }

    public String getDateTimePlannedEvent() {
        return _dateTimePlannedEvent;
    }

    public String getEventReasonCode() {
        return _eventReasonCode;
    }

    public String getOperatorID() {
        return _operatorID;
    }

    public String getEventOccurred() {
        return _eventOccurred;
    }
}
