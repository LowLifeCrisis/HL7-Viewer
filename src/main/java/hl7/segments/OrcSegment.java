package hl7.segments;


public class OrcSegment extends Hl7segment{
    //listing all fields in ORC
    private String _orderControl;
    private String _placerOrderNum;
    private String _fillerOrderNum;
    private String _placerGroupNumber;
    private String _orderStatus;
    private String _responseFlag;
    private String _quantityTiming;
    private String _parentOrder;
    private String _dateTimeTransaction;
    private String _enteredBy;
    private String _verifiedBy;
    private String _orderingProvider;
    private String _enterersLocation;
    private String _callBackPhoneNum;
    private String _orderEffectiveDateTime;
    private String _orderControlCodeRsn;
    private String _enteringOrg;
    private String _enteringDevice;
    private String _actionBy;

    public OrcSegment(String[] fields) {
        _orderControl = get(fields, 1);
        _placerOrderNum = get(fields, 2);
        _fillerOrderNum = get(fields, 3);
        _placerGroupNumber = get(fields, 4);
        _orderStatus = get(fields, 5);
        _responseFlag = get(fields, 6);
        _quantityTiming = get(fields, 7);
        _parentOrder = get(fields, 8);
        _dateTimeTransaction = get(fields, 9);
        _enteredBy = get(fields, 10);
        _verifiedBy = get(fields, 11);
        _orderingProvider = get(fields, 12);
        _enterersLocation = get(fields, 13);
        _callBackPhoneNum = get(fields, 14);
        _orderEffectiveDateTime = get(fields, 15);
        _orderControlCodeRsn = get(fields, 16);
        _enteringOrg = get(fields, 17);
        _enteringDevice = get(fields, 18);
        _actionBy = get(fields, 19);
    }

    public String getOrderControl() {
        return _orderControl;
    }

    public String getPlacerOrderNum() {
        return _placerOrderNum;
    }

    public String getFillerOrderNum() {
        return _fillerOrderNum;
    }

    public String getPlacerGroupNumber() {
        return _placerGroupNumber;
    }

    public String getOrderStatus() {
        return _orderStatus;
    }

    public String getResponseFlag() {
        return _responseFlag;
    }

    public String getQuantityTiming() {
        return _quantityTiming;
    }

    public String getParentOrder() {
        return _parentOrder;
    }

    public String getDateTimeTransaction() {
        return _dateTimeTransaction;
    }

    public String getEnteredBy() {
        return _enteredBy;
    }

    public String getVerifiedBy() {
        return _verifiedBy;
    }

    public String getOrderingProvider() {
        return _orderingProvider;
    }

    public String getEnterersLocation() {
        return _enterersLocation;
    }

    public String getCallBackPhoneNum() {
        return _callBackPhoneNum;
    }

    public String getOrderEffectiveDateTime() {
        return _orderEffectiveDateTime;
    }

    public String getOrderControlCodeRsn() {
        return _orderControlCodeRsn;
    }

    public String getEnteringOrg() {
        return _enteringOrg;
    }

    public String getEnteringDevice() {
        return _enteringDevice;
    }

    public String getActionBy() {
        return _actionBy;
    }
}
