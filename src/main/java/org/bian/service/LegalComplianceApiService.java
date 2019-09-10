/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LegalComplianceApiService {

	SDLegalComplianceActivateOutputModel activate(SDLegalComplianceActivateInputModel request);
	
	SDLegalComplianceConfigureOutputModel configure(String sdReferenceId, SDLegalComplianceConfigureInputModel request);
	
	CRLegalComplianceAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRLegalComplianceAssessmentEvaluateInputModel request);
	
	CRLegalComplianceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLegalComplianceAssessmentExchangeInputModel request);
	
	SDLegalComplianceFeedbackOutputModel feedback(String sdReferenceId, SDLegalComplianceFeedbackInputModel request);
	
	CRLegalComplianceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLegalComplianceAssessmentRequestInputModel request);
	
	CRLegalComplianceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDLegalComplianceRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRLegalComplianceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLegalComplianceAssessmentUpdateInputModel request);
	
}
