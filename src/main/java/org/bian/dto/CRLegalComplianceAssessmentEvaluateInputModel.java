package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentEvaluateInputModelLegalComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentEvaluateInputModel
 */
public class CRLegalComplianceAssessmentEvaluateInputModel   {
  private String legalComplianceServicingSessionReference = null;

  private Object legalComplianceAssessmentEvaluateActionRecord = null;

  private String legalComplianceAssessmentInstanceStatus = null;

  private CRLegalComplianceAssessmentEvaluateInputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return legalComplianceServicingSessionReference
  **/

  public String getLegalComplianceServicingSessionReference() {
    return legalComplianceServicingSessionReference;
  }

  public void setLegalComplianceServicingSessionReference(String legalComplianceServicingSessionReference) {
    this.legalComplianceServicingSessionReference = legalComplianceServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return legalComplianceAssessmentEvaluateActionRecord
  **/

  public Object getLegalComplianceAssessmentEvaluateActionRecord() {
    return legalComplianceAssessmentEvaluateActionRecord;
  }

  public void setLegalComplianceAssessmentEvaluateActionRecord(Object legalComplianceAssessmentEvaluateActionRecord) {
    this.legalComplianceAssessmentEvaluateActionRecord = legalComplianceAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Legal Compliance Assessment instance (e.g. initialised, pending, active) 
   * @return legalComplianceAssessmentInstanceStatus
  **/

  public String getLegalComplianceAssessmentInstanceStatus() {
    return legalComplianceAssessmentInstanceStatus;
  }

  public void setLegalComplianceAssessmentInstanceStatus(String legalComplianceAssessmentInstanceStatus) {
    this.legalComplianceAssessmentInstanceStatus = legalComplianceAssessmentInstanceStatus;
  }


  /**
   * Get legalComplianceAssessmentInstanceRecord
   * @return legalComplianceAssessmentInstanceRecord
  **/

  public CRLegalComplianceAssessmentEvaluateInputModelLegalComplianceAssessmentInstanceRecord getLegalComplianceAssessmentInstanceRecord() {
    return legalComplianceAssessmentInstanceRecord;
  }

  public void setLegalComplianceAssessmentInstanceRecord(CRLegalComplianceAssessmentEvaluateInputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord) {
    this.legalComplianceAssessmentInstanceRecord = legalComplianceAssessmentInstanceRecord;
  }


}

