package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentEvaluateOutputModelLegalComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentEvaluateOutputModel
 */
public class CRLegalComplianceAssessmentEvaluateOutputModel   {
  private String legalComplianceAssessmentInstanceReference = null;

  private String legalComplianceAssessmentEvaluateActionReference = null;

  private Object legalComplianceAssessmentEvaluateActionRecord = null;

  private String legalComplianceAssessmentInstanceStatus = null;

  private CRLegalComplianceAssessmentEvaluateOutputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Legal Compliance Assessment instance 
   * @return legalComplianceAssessmentInstanceReference
  **/

  public String getLegalComplianceAssessmentInstanceReference() {
    return legalComplianceAssessmentInstanceReference;
  }

  public void setLegalComplianceAssessmentInstanceReference(String legalComplianceAssessmentInstanceReference) {
    this.legalComplianceAssessmentInstanceReference = legalComplianceAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return legalComplianceAssessmentEvaluateActionReference
  **/

  public String getLegalComplianceAssessmentEvaluateActionReference() {
    return legalComplianceAssessmentEvaluateActionReference;
  }

  public void setLegalComplianceAssessmentEvaluateActionReference(String legalComplianceAssessmentEvaluateActionReference) {
    this.legalComplianceAssessmentEvaluateActionReference = legalComplianceAssessmentEvaluateActionReference;
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

  public CRLegalComplianceAssessmentEvaluateOutputModelLegalComplianceAssessmentInstanceRecord getLegalComplianceAssessmentInstanceRecord() {
    return legalComplianceAssessmentInstanceRecord;
  }

  public void setLegalComplianceAssessmentInstanceRecord(CRLegalComplianceAssessmentEvaluateOutputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord) {
    this.legalComplianceAssessmentInstanceRecord = legalComplianceAssessmentInstanceRecord;
  }


}

