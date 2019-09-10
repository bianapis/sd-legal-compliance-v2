package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceAnalysis
 */
public class CRLegalComplianceAssessmentRetrieveInputModelLegalComplianceAssessmentInstanceAnalysis   {
  private String legalComplianceAssessmentInstanceAnalysisReference = null;

  private String legalComplianceAssessmentInstanceAnalysisReportType = null;

  private String legalComplianceAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return legalComplianceAssessmentInstanceAnalysisReference
  **/

  public String getLegalComplianceAssessmentInstanceAnalysisReference() {
    return legalComplianceAssessmentInstanceAnalysisReference;
  }

  public void setLegalComplianceAssessmentInstanceAnalysisReference(String legalComplianceAssessmentInstanceAnalysisReference) {
    this.legalComplianceAssessmentInstanceAnalysisReference = legalComplianceAssessmentInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return legalComplianceAssessmentInstanceAnalysisReportType
  **/

  public String getLegalComplianceAssessmentInstanceAnalysisReportType() {
    return legalComplianceAssessmentInstanceAnalysisReportType;
  }

  public void setLegalComplianceAssessmentInstanceAnalysisReportType(String legalComplianceAssessmentInstanceAnalysisReportType) {
    this.legalComplianceAssessmentInstanceAnalysisReportType = legalComplianceAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return legalComplianceAssessmentInstanceAnalysisParameters
  **/

  public String getLegalComplianceAssessmentInstanceAnalysisParameters() {
    return legalComplianceAssessmentInstanceAnalysisParameters;
  }

  public void setLegalComplianceAssessmentInstanceAnalysisParameters(String legalComplianceAssessmentInstanceAnalysisParameters) {
    this.legalComplianceAssessmentInstanceAnalysisParameters = legalComplianceAssessmentInstanceAnalysisParameters;
  }


}

