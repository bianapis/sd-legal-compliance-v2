package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentRequestOutputModelLegalComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRequestOutputModel
 */
public class CRLegalComplianceAssessmentRequestOutputModel   {
  private CRLegalComplianceAssessmentRequestOutputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord = null;

  private String legalComplianceAssessmentRequestActionTaskReference = null;

  private Object legalComplianceAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get legalComplianceAssessmentInstanceRecord
   * @return legalComplianceAssessmentInstanceRecord
  **/

  public CRLegalComplianceAssessmentRequestOutputModelLegalComplianceAssessmentInstanceRecord getLegalComplianceAssessmentInstanceRecord() {
    return legalComplianceAssessmentInstanceRecord;
  }

  public void setLegalComplianceAssessmentInstanceRecord(CRLegalComplianceAssessmentRequestOutputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord) {
    this.legalComplianceAssessmentInstanceRecord = legalComplianceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Legal Compliance Assessment instance request service call 
   * @return legalComplianceAssessmentRequestActionTaskReference
  **/

  public String getLegalComplianceAssessmentRequestActionTaskReference() {
    return legalComplianceAssessmentRequestActionTaskReference;
  }

  public void setLegalComplianceAssessmentRequestActionTaskReference(String legalComplianceAssessmentRequestActionTaskReference) {
    this.legalComplianceAssessmentRequestActionTaskReference = legalComplianceAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return legalComplianceAssessmentRequestActionTaskRecord
  **/

  public Object getLegalComplianceAssessmentRequestActionTaskRecord() {
    return legalComplianceAssessmentRequestActionTaskRecord;
  }

  public void setLegalComplianceAssessmentRequestActionTaskRecord(Object legalComplianceAssessmentRequestActionTaskRecord) {
    this.legalComplianceAssessmentRequestActionTaskRecord = legalComplianceAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

