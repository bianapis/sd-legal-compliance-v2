package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentExchangeOutputModel
 */
public class CRLegalComplianceAssessmentExchangeOutputModel   {
  private String legalComplianceAssessmentExchangeActionTaskReference = null;

  private Object legalComplianceAssessmentExchangeActionTaskRecord = null;

  private String legalComplianceAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Legal Compliance Assessment instance exchange service call 
   * @return legalComplianceAssessmentExchangeActionTaskReference
  **/

  public String getLegalComplianceAssessmentExchangeActionTaskReference() {
    return legalComplianceAssessmentExchangeActionTaskReference;
  }

  public void setLegalComplianceAssessmentExchangeActionTaskReference(String legalComplianceAssessmentExchangeActionTaskReference) {
    this.legalComplianceAssessmentExchangeActionTaskReference = legalComplianceAssessmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return legalComplianceAssessmentExchangeActionResponse
  **/

  public String getLegalComplianceAssessmentExchangeActionResponse() {
    return legalComplianceAssessmentExchangeActionResponse;
  }

  public void setLegalComplianceAssessmentExchangeActionResponse(String legalComplianceAssessmentExchangeActionResponse) {
    this.legalComplianceAssessmentExchangeActionResponse = legalComplianceAssessmentExchangeActionResponse;
  }


}

