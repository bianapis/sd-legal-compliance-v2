package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceReportRecord
 */
public class CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceReportRecord   {
  private String legalComplianceAssessmentInstanceReportReference = null;

  private String legalComplianceAssessmentInstanceReportType = null;

  private String legalComplianceAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return legalComplianceAssessmentInstanceReportReference
  **/

  public String getLegalComplianceAssessmentInstanceReportReference() {
    return legalComplianceAssessmentInstanceReportReference;
  }

  public void setLegalComplianceAssessmentInstanceReportReference(String legalComplianceAssessmentInstanceReportReference) {
    this.legalComplianceAssessmentInstanceReportReference = legalComplianceAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return legalComplianceAssessmentInstanceReportType
  **/

  public String getLegalComplianceAssessmentInstanceReportType() {
    return legalComplianceAssessmentInstanceReportType;
  }

  public void setLegalComplianceAssessmentInstanceReportType(String legalComplianceAssessmentInstanceReportType) {
    this.legalComplianceAssessmentInstanceReportType = legalComplianceAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return legalComplianceAssessmentInstanceReportParameters
  **/

  public String getLegalComplianceAssessmentInstanceReportParameters() {
    return legalComplianceAssessmentInstanceReportParameters;
  }

  public void setLegalComplianceAssessmentInstanceReportParameters(String legalComplianceAssessmentInstanceReportParameters) {
    this.legalComplianceAssessmentInstanceReportParameters = legalComplianceAssessmentInstanceReportParameters;
  }


}

