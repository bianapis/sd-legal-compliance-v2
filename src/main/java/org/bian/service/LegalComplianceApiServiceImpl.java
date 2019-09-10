/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class LegalComplianceApiServiceImpl implements LegalComplianceApiService {

	public SDLegalComplianceActivateOutputModel activate(SDLegalComplianceActivateInputModel request){
		return JsonReader.read("activate-SDLegalComplianceActivateOutputModel.json",new TypeReference<SDLegalComplianceActivateOutputModel>(){});
	}
	
	public SDLegalComplianceConfigureOutputModel configure(String sdReferenceId, SDLegalComplianceConfigureInputModel request){
		return JsonReader.read("configure-SDLegalComplianceConfigureOutputModel.json",new TypeReference<SDLegalComplianceConfigureOutputModel>(){});
	}
	
	public CRLegalComplianceAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRLegalComplianceAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRLegalComplianceAssessmentEvaluateOutputModel.json",new TypeReference<CRLegalComplianceAssessmentEvaluateOutputModel>(){});
	}
	
	public CRLegalComplianceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLegalComplianceAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRLegalComplianceAssessmentExchangeOutputModel.json",new TypeReference<CRLegalComplianceAssessmentExchangeOutputModel>(){});
	}
	
	public SDLegalComplianceFeedbackOutputModel feedback(String sdReferenceId, SDLegalComplianceFeedbackInputModel request){
		return JsonReader.read("feedback-SDLegalComplianceFeedbackOutputModel.json",new TypeReference<SDLegalComplianceFeedbackOutputModel>(){});
	}
	
	public CRLegalComplianceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLegalComplianceAssessmentRequestInputModel request){
		return JsonReader.read("request-CRLegalComplianceAssessmentRequestOutputModel.json",new TypeReference<CRLegalComplianceAssessmentRequestOutputModel>(){});
	}
	
	public CRLegalComplianceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRLegalComplianceAssessmentRetrieveOutputModel.json",new TypeReference<CRLegalComplianceAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDLegalComplianceRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDLegalComplianceRetrieveOutputModel.json",new TypeReference<SDLegalComplianceRetrieveOutputModel>(){});
	}
	
	public CRLegalComplianceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLegalComplianceAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRLegalComplianceAssessmentUpdateOutputModel.json",new TypeReference<CRLegalComplianceAssessmentUpdateOutputModel>(){});
	}
	
}
