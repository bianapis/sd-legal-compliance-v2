package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLegalComplianceAssessmentUpdateInputModelLegalComplianceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentUpdateOutputModel
 */
public class CRLegalComplianceAssessmentUpdateOutputModel   {
  private CRLegalComplianceAssessmentUpdateInputModelLegalComplianceAssessmentInstanceRecord legalComplianceAssessmentInstanceRecord = null;

  private String legalComplianceAssessmentUpdateActionTaskReference = null;

  private Object legalComplianceAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return legalComplianceAssessmentUpdateActionTaskReference
  **/

  public String getLegalComplianceAssessmentUpdateActionTaskReference() {
    return legalComplianceAssessmentUpdateActionTaskReference;
  }

  public void setLegalComplianceAssessmentUpdateActionTaskReference(String legalComplianceAssessmentUpdateActionTaskReference) {
    this.legalComplianceAssessmentUpdateActionTaskReference = legalComplianceAssessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

