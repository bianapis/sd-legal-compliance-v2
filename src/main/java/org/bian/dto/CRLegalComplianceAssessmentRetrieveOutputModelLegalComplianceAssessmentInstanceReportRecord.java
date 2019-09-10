package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceReportRecord
 */
public class CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceReportRecord   {
  private String legalComplianceAssessmentInstanceReportData = null;

  private String legalComplianceAssessmentInstanceReportType = null;

  private Object legalComplianceAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return legalComplianceAssessmentInstanceReportData
  **/

  public String getLegalComplianceAssessmentInstanceReportData() {
    return legalComplianceAssessmentInstanceReportData;
  }

  public void setLegalComplianceAssessmentInstanceReportData(String legalComplianceAssessmentInstanceReportData) {
    this.legalComplianceAssessmentInstanceReportData = legalComplianceAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return legalComplianceAssessmentInstanceReport
  **/

  public Object getLegalComplianceAssessmentInstanceReport() {
    return legalComplianceAssessmentInstanceReport;
  }

  public void setLegalComplianceAssessmentInstanceReport(Object legalComplianceAssessmentInstanceReport) {
    this.legalComplianceAssessmentInstanceReport = legalComplianceAssessmentInstanceReport;
  }


}

