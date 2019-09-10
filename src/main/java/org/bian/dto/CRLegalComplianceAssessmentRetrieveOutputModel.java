package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceAnalysis;
import org.bian.dto.CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceRecord;
import org.bian.dto.CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRetrieveOutputModel
 */
public class CRLegalComplianceAssessmentRetrieveOutputModel   {
  private CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord = null;

  private String legalComplianceAssessmentRetrieveActionTaskReference = null;

  private Object legalComplianceAssessmentRetrieveActionTaskRecord = null;

  private String legalComplianceAssessmentRetrieveActionResponse = null;

  private CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceReportRecord legalComplianceAssessmentInstanceReportRecord = null;

  private CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceAnalysis legalComplianceAssessmentInstanceAnalysis = null;


  /**
   * Get legalComplianceAssessmentInstanceRecord
   * @return legalComplianceAssessmentInstanceRecord
  **/

  public CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceRecord getLegalComplianceAssessmentInstanceRecord() {
    return legalComplianceAssessmentInstanceRecord;
  }

  public void setLegalComplianceAssessmentInstanceRecord(CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord) {
    this.legalComplianceAssessmentInstanceRecord = legalComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Legal Compliance Assessment instance retrieve service call 
   * @return legalComplianceAssessmentRetrieveActionTaskReference
  **/

  public String getLegalComplianceAssessmentRetrieveActionTaskReference() {
    return legalComplianceAssessmentRetrieveActionTaskReference;
  }

  public void setLegalComplianceAssessmentRetrieveActionTaskReference(String legalComplianceAssessmentRetrieveActionTaskReference) {
    this.legalComplianceAssessmentRetrieveActionTaskReference = legalComplianceAssessmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return legalComplianceAssessmentRetrieveActionResponse
  **/

  public String getLegalComplianceAssessmentRetrieveActionResponse() {
    return legalComplianceAssessmentRetrieveActionResponse;
  }

  public void setLegalComplianceAssessmentRetrieveActionResponse(String legalComplianceAssessmentRetrieveActionResponse) {
    this.legalComplianceAssessmentRetrieveActionResponse = legalComplianceAssessmentRetrieveActionResponse;
  }


  /**
   * Get legalComplianceAssessmentInstanceReportRecord
   * @return legalComplianceAssessmentInstanceReportRecord
  **/

  public CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceReportRecord getLegalComplianceAssessmentInstanceReportRecord() {
    return legalComplianceAssessmentInstanceReportRecord;
  }

  public void setLegalComplianceAssessmentInstanceReportRecord(CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceReportRecord legalComplianceAssessmentInstanceReportRecord) {
    this.legalComplianceAssessmentInstanceReportRecord = legalComplianceAssessmentInstanceReportRecord;
  }


  /**
   * Get legalComplianceAssessmentInstanceAnalysis
   * @return legalComplianceAssessmentInstanceAnalysis
  **/

  public CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceAnalysis getLegalComplianceAssessmentInstanceAnalysis() {
    return legalComplianceAssessmentInstanceAnalysis;
  }

  public void setLegalComplianceAssessmentInstanceAnalysis(CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceAnalysis legalComplianceAssessmentInstanceAnalysis) {
    this.legalComplianceAssessmentInstanceAnalysis = legalComplianceAssessmentInstanceAnalysis;
  }


}

