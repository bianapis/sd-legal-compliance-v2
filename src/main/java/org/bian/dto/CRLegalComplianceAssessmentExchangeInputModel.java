package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentExchangeInputModelLegalComplianceAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentExchangeInputModel
 */
public class CRLegalComplianceAssessmentExchangeInputModel   {
  private String legalComplianceServicingSessionReference = null;

  private String legalComplianceAssessmentInstanceReference = null;

  private Object legalComplianceAssessmentExchangeActionTaskRecord = null;

  private CRLegalComplianceAssessmentExchangeInputModelLegalComplianceAssessmentExchangeActionRequest legalComplianceAssessmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return legalComplianceAssessmentExchangeActionTaskRecord
  **/

  public Object getLegalComplianceAssessmentExchangeActionTaskRecord() {
    return legalComplianceAssessmentExchangeActionTaskRecord;
  }

  public void setLegalComplianceAssessmentExchangeActionTaskRecord(Object legalComplianceAssessmentExchangeActionTaskRecord) {
    this.legalComplianceAssessmentExchangeActionTaskRecord = legalComplianceAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get legalComplianceAssessmentExchangeActionRequest
   * @return legalComplianceAssessmentExchangeActionRequest
  **/

  public CRLegalComplianceAssessmentExchangeInputModelLegalComplianceAssessmentExchangeActionRequest getLegalComplianceAssessmentExchangeActionRequest() {
    return legalComplianceAssessmentExchangeActionRequest;
  }

  public void setLegalComplianceAssessmentExchangeActionRequest(CRLegalComplianceAssessmentExchangeInputModelLegalComplianceAssessmentExchangeActionRequest legalComplianceAssessmentExchangeActionRequest) {
    this.legalComplianceAssessmentExchangeActionRequest = legalComplianceAssessmentExchangeActionRequest;
  }


}

