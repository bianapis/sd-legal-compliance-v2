package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceAnalysis;
import org.bian.dto.CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRetrieveInputModel
 */
public class CRLegalComplianceAssessmentRetrieveInputModel   {
  private Object legalComplianceAssessmentRetrieveActionTaskRecord = null;

  private String legalComplianceAssessmentRetrieveActionRequest = null;

  private CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceReportRecord legalComplianceAssessmentInstanceReportRecord = null;

  private CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceAnalysis legalComplianceAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return legalComplianceAssessmentRetrieveActionTaskRecord
  **/

  public Object getLegalComplianceAssessmentRetrieveActionTaskRecord() {
    return legalComplianceAssessmentRetrieveActionTaskRecord;
  }

  public void setLegalComplianceAssessmentRetrieveActionTaskRecord(Object legalComplianceAssessmentRetrieveActionTaskRecord) {
    this.legalComplianceAssessmentRetrieveActionTaskRecord = legalComplianceAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return legalComplianceAssessmentRetrieveActionRequest
  **/

  public String getLegalComplianceAssessmentRetrieveActionRequest() {
    return legalComplianceAssessmentRetrieveActionRequest;
  }

  public void setLegalComplianceAssessmentRetrieveActionRequest(String legalComplianceAssessmentRetrieveActionRequest) {
    this.legalComplianceAssessmentRetrieveActionRequest = legalComplianceAssessmentRetrieveActionRequest;
  }


  /**
   * Get legalComplianceAssessmentInstanceReportRecord
   * @return legalComplianceAssessmentInstanceReportRecord
  **/

  public CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceReportRecord getLegalComplianceAssessmentInstanceReportRecord() {
    return legalComplianceAssessmentInstanceReportRecord;
  }

  public void setLegalComplianceAssessmentInstanceReportRecord(CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceReportRecord legalComplianceAssessmentInstanceReportRecord) {
    this.legalComplianceAssessmentInstanceReportRecord = legalComplianceAssessmentInstanceReportRecord;
  }


  /**
   * Get legalComplianceAssessmentInstanceAnalysis
   * @return legalComplianceAssessmentInstanceAnalysis
  **/

  public CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceAnalysis getLegalComplianceAssessmentInstanceAnalysis() {
    return legalComplianceAssessmentInstanceAnalysis;
  }

  public void setLegalComplianceAssessmentInstanceAnalysis(CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceAnalysis legalComplianceAssessmentInstanceAnalysis) {
    this.legalComplianceAssessmentInstanceAnalysis = legalComplianceAssessmentInstanceAnalysis;
  }


}

