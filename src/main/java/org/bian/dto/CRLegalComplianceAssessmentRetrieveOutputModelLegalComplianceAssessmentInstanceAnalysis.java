package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceAnalysis
 */
public class CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceAnalysis   {
  private String legalComplianceAssessmentInstanceAnalysisData = null;

  private String legalComplianceAssessmentInstanceAnalysisReportType = null;

  private Object legalComplianceAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return legalComplianceAssessmentInstanceAnalysisData
  **/

  public String getLegalComplianceAssessmentInstanceAnalysisData() {
    return legalComplianceAssessmentInstanceAnalysisData;
  }

  public void setLegalComplianceAssessmentInstanceAnalysisData(String legalComplianceAssessmentInstanceAnalysisData) {
    this.legalComplianceAssessmentInstanceAnalysisData = legalComplianceAssessmentInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return legalComplianceAssessmentInstanceAnalysisReport
  **/

  public Object getLegalComplianceAssessmentInstanceAnalysisReport() {
    return legalComplianceAssessmentInstanceAnalysisReport;
  }

  public void setLegalComplianceAssessmentInstanceAnalysisReport(Object legalComplianceAssessmentInstanceAnalysisReport) {
    this.legalComplianceAssessmentInstanceAnalysisReport = legalComplianceAssessmentInstanceAnalysisReport;
  }


}

