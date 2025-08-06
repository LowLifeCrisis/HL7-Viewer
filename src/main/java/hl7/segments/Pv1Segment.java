package hl7.segments;

import hl7.segments.subsegments.PatientLocationSub;

public class Pv1Segment extends Hl7segment {
    //listing all fields in PV1
    private String _setIdPatVisit;
    private String _patClass;
    private String _assignedPatLocation;
    private String _admissionType;
    private String _preadmitNumber;
    private String _priorPatLocation;
    private String _attendingDoc;
    private String _referringDoc;
    private String _consultingDoc;
    private String _hospitalService;
    private String _tempLocation;
    private String _preadmitTestIndicator;
    private String _readmissionIndicator;
    private String _admitSource;
    private String _ambulatoryStatus;
    private String _vipIndicator;
    private String _admittingDoc;
    private String _patType;
    private String visitNum;
    private String financialClass;
    private String chargePriceIndicator;
    private String courtesyCode;
    private String creditRating;
    private String contractCode;
    private String contractEffectiveDate;
    private String contractAmount;
    private String contractPeriod;
    private String interestCode;
    private String transferToBadDebtCode;
    private String transferToBadDebtDate;
    private String dischargeDisposition;
    private String dischargedToLocation;
    private String dietType;
    private String servicingFac;
    private String bedStatus;
    private String accountStatus;
    private String pendingLocation;
    private String priorTemporaryLocation;
    private String admitDateTime;
    private String dischargeDateTime;
    private String currentPatBalance;
    private String totalCharges;
    private String totalAdjustments;
    private String totalPayments;
    private String alternateVisitId;
    private String visitIndicator;
    private String otherHealthcareProvider;

    public Pv1Segment(String[] fields) {
        _setIdPatVisit = get(fields, 1);
        _patClass = get(fields, 2);
        _assignedPatLocation = new PatientLocationSub(get(fields, 3)).toString();
        _admissionType = get(fields, 4);
        _preadmitNumber = get(fields, 5);
        _priorPatLocation = get(fields, 6);
        _attendingDoc = get(fields, 7);
        _referringDoc = get(fields, 8);
        _consultingDoc = get(fields, 9);
        _hospitalService = get(fields, 10);
        _tempLocation = get(fields, 11);
        _preadmitTestIndicator = get(fields, 12);
        _readmissionIndicator = get(fields, 13);
        _admitSource = get(fields, 14);
        _ambulatoryStatus = get(fields, 15);
        _vipIndicator = get(fields, 16);
        _admittingDoc = get(fields, 17);
        _patType = get(fields, 18);
        visitNum = get(fields, 19);
        financialClass = get(fields, 20);
        chargePriceIndicator = get(fields, 21);
        courtesyCode = get(fields, 22);
        creditRating = get(fields, 23);
        contractCode = get(fields, 24);
        contractEffectiveDate = get(fields, 25);
        contractAmount = get(fields, 26);
        contractPeriod = get(fields, 27);
        interestCode = get(fields, 28);
        transferToBadDebtCode = get(fields, 29);
        transferToBadDebtDate = get(fields, 30);
        dischargeDisposition = get(fields, 31);
        dischargedToLocation = get(fields, 32);
        dietType = get(fields, 33);
        servicingFac = get(fields, 34);
        bedStatus = get(fields, 35);
        accountStatus = get(fields, 36);
        pendingLocation = get(fields, 37);
        priorTemporaryLocation = get(fields, 38);
        admitDateTime = get(fields, 39);
        dischargeDateTime = get(fields, 40);
        currentPatBalance = get(fields, 41);
        totalCharges = get(fields, 42);
        totalAdjustments = get(fields, 43);
        totalPayments = get(fields, 44);
        alternateVisitId = get(fields, 45);
        visitIndicator = get(fields, 46);
        otherHealthcareProvider = get(fields, 47);

    }

    public String getSetIdPatVisit() {
        return _setIdPatVisit;
    }

    public String getPatClass() {
        return _patClass;
    }

    public String getAssignedPatLocation() {
        return _assignedPatLocation;
    }

    public String getAdmissionType() {
        return _admissionType;
    }

    public String getPreadmitNumber() {
        return _preadmitNumber;
    }

    public String getPriorPatLocation() {
        return _priorPatLocation;
    }

    public String getAttendingDoc() {
        return _attendingDoc;
    }

    public String getReferringDoc() {
        return _referringDoc;
    }

    public String getConsultingDoc() {
        return _consultingDoc;
    }

    public String getHospitalService() {
        return _hospitalService;
    }

    public String getTempLocation() {
        return _tempLocation;
    }

    public String getPreadmitTestIndicator() {
        return _preadmitTestIndicator;
    }

    public String getReadmissionIndicator() {
        return _readmissionIndicator;
    }

    public String getAdmitSource() {
        return _admitSource;
    }

    public String getAmbulatoryStatus() {
        return _ambulatoryStatus;
    }

    public String getVipIndicator() {
        return _vipIndicator;
    }

    public String getAdmittingDoc() {
        return _admittingDoc;
    }

    public String getPatType() {
        return _patType;
    }

    public String getVisitNum() {
        return visitNum;
    }

    public String getFinancialClass() {
        return financialClass;
    }

    public String getChargePriceIndicator() {
        return chargePriceIndicator;
    }

    public String getCourtesyCode() {
        return courtesyCode;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public String getContractCode() {
        return contractCode;
    }

    public String getContractEffectiveDate() {
        return contractEffectiveDate;
    }

    public String getContractAmount() {
        return contractAmount;
    }

    public String getContractPeriod() {
        return contractPeriod;
    }

    public String getInterestCode() {
        return interestCode;
    }

    public String getTransferToBadDebtCode() {
        return transferToBadDebtCode;
    }

    public String getTransferToBadDebtDate() {
        return transferToBadDebtDate;
    }

    public String getDischargeDisposition() {
        return dischargeDisposition;
    }

    public String getDischargedToLocation() {
        return dischargedToLocation;
    }

    public String getDietType() {
        return dietType;
    }

    public String getServicingFac() {
        return servicingFac;
    }

    public String getBedStatus() {
        return bedStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public String getPendingLocation() {
        return pendingLocation;
    }

    public String getPriorTemporaryLocation() {
        return priorTemporaryLocation;
    }

    public String getAdmitDateTime() {
        return admitDateTime;
    }

    public String getDischargeDateTime() {
        return dischargeDateTime;
    }

    public String getCurrentPatBalance() {
        return currentPatBalance;
    }

    public String getTotalCharges() {
        return totalCharges;
    }

    public String getTotalAdjustments() {
        return totalAdjustments;
    }

    public String getTotalPayments() {
        return totalPayments;
    }

    public String getAlternateVisitId() {
        return alternateVisitId;
    }

    public String getVisitIndicator() {
        return visitIndicator;
    }

    public String getOtherHealthcareProvider() {
        return otherHealthcareProvider;
    }
}


