package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentRequestInputModelLegalComplianceAssessmentInstanceRecord;
import org.bian.dto.CRLegalComplianceAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRequestInputModel
 */
public class CRLegalComplianceAssessmentRequestInputModel   {
  private String legalComplianceServicingSessionReference = null;

  private String legalComplianceAssessmentInstanceReference = null;

  private CRLegalComplianceAssessmentRequestInputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord = null;

  private Object legalComplianceAssessmentRequestActionTaskRecord = null;

  private CRLegalComplianceAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRLegalComplianceAssessmentRequestInputModelLegalComplianceAssessmentInstanceRecord getLegalComplianceAssessmentInstanceRecord() {
    return legalComplianceAssessmentInstanceRecord;
  }

  public void setLegalComplianceAssessmentInstanceRecord(CRLegalComplianceAssessmentRequestInputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord) {
    this.legalComplianceAssessmentInstanceRecord = legalComplianceAssessmentInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRLegalComplianceAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRLegalComplianceAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

