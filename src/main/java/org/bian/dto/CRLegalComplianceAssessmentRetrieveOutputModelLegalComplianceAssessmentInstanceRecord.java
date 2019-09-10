package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceRecord
 */
public class CRLegalComplianceAssessmentRetrieveOutputModelLegalComplianceAssessmentInstanceRecord   {
  private String legalAssessmentType = null;

  private String businessUnitReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String jurisdictionReference = null;

  private String lawReference = null;

  private String lawDefinition = null;

  private String lawComplianceandReportingRequirements = null;

  private String lawComplianceAccountability = null;

  private String legalPenalties = null;

  private String legalGuideline = null;

  private String documentReference = null;

  private String legalAssessmentWorkProducts = null;

  private String legalAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of law that is applied by the assessment action 
   * @return legalAssessmentType
  **/

  public String getLegalAssessmentType() {
    return legalAssessmentType;
  }

  public void setLegalAssessmentType(String legalAssessmentType) {
    this.legalAssessmentType = legalAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The business function or unit assessed if appropriate 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The associated product/service being assessed if appropriate 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer assessed if appropriate 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Indication of the legal jurisdiction that applies 
   * @return jurisdictionReference
  **/

  public String getJurisdictionReference() {
    return jurisdictionReference;
  }

  public void setJurisdictionReference(String jurisdictionReference) {
    this.jurisdictionReference = jurisdictionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the specific law 
   * @return lawReference
  **/

  public String getLawReference() {
    return lawReference;
  }

  public void setLawReference(String lawReference) {
    this.lawReference = lawReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A definition of the required behavior to remain within the law 
   * @return lawDefinition
  **/

  public String getLawDefinition() {
    return lawDefinition;
  }

  public void setLawDefinition(String lawDefinition) {
    this.lawDefinition = lawDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the measurements and reporting required to demonstrate legal compliance 
   * @return lawComplianceandReportingRequirements
  **/

  public String getLawComplianceandReportingRequirements() {
    return lawComplianceandReportingRequirements;
  }

  public void setLawComplianceandReportingRequirements(String lawComplianceandReportingRequirements) {
    this.lawComplianceandReportingRequirements = lawComplianceandReportingRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation of the business context, responsibility and accountability for legal compliance 
   * @return lawComplianceAccountability
  **/

  public String getLawComplianceAccountability() {
    return lawComplianceAccountability;
  }

  public void setLawComplianceAccountability(String lawComplianceAccountability) {
    this.lawComplianceAccountability = lawComplianceAccountability;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outline of the possible implications of breaking the law 
   * @return legalPenalties
  **/

  public String getLegalPenalties() {
    return legalPenalties;
  }

  public void setLegalPenalties(String legalPenalties) {
    this.legalPenalties = legalPenalties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines and requirements for following the law 
   * @return legalGuideline
  **/

  public String getLegalGuideline() {
    return legalGuideline;
  }

  public void setLegalGuideline(String legalGuideline) {
    this.legalGuideline = legalGuideline;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any documentation classified/archived as appropriate 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the legal assessment action 
   * @return legalAssessmentWorkProducts
  **/

  public String getLegalAssessmentWorkProducts() {
    return legalAssessmentWorkProducts;
  }

  public void setLegalAssessmentWorkProducts(String legalAssessmentWorkProducts) {
    this.legalAssessmentWorkProducts = legalAssessmentWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outcome/result of the legal assessment, this can include remedial actions 
   * @return legalAssessmentResult
  **/

  public String getLegalAssessmentResult() {
    return legalAssessmentResult;
  }

  public void setLegalAssessmentResult(String legalAssessmentResult) {
    this.legalAssessmentResult = legalAssessmentResult;
  }


}

