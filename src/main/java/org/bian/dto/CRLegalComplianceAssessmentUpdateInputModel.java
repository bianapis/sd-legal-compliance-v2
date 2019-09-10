package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentUpdateInputModelLegalComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentUpdateInputModel
 */
public class CRLegalComplianceAssessmentUpdateInputModel   {
  private String legalComplianceServicingSessionReference = null;

  private String legalComplianceAssessmentInstanceReference = null;

  private CRLegalComplianceAssessmentUpdateInputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord = null;

  private Object legalComplianceAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get legalComplianceAssessmentInstanceRecord
   * @return legalComplianceAssessmentInstanceRecord
  **/

  public CRLegalComplianceAssessmentUpdateInputModelLegalComplianceAssessmentInstanceRecord getLegalComplianceAssessmentInstanceRecord() {
    return legalComplianceAssessmentInstanceRecord;
  }

  public void setLegalComplianceAssessmentInstanceRecord(CRLegalComplianceAssessmentUpdateInputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord) {
    this.legalComplianceAssessmentInstanceRecord = legalComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return legalComplianceAssessmentUpdateActionTaskRecord
  **/

  public Object getLegalComplianceAssessmentUpdateActionTaskRecord() {
    return legalComplianceAssessmentUpdateActionTaskRecord;
  }

  public void setLegalComplianceAssessmentUpdateActionTaskRecord(Object legalComplianceAssessmentUpdateActionTaskRecord) {
    this.legalComplianceAssessmentUpdateActionTaskRecord = legalComplianceAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

