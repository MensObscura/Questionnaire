/**
 */
package questionnaire.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionnairePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireSwitch() {
		if (modelPackage == null) {
			modelPackage = QuestionnairePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QuestionnairePackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseElementAvecNom(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TITRE: {
				Titre titre = (Titre)theEObject;
				T result = caseTitre(titre);
				if (result == null) result = caseElementAvecNom(titre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.DEPART: {
				Depart depart = (Depart)theEObject;
				T result = caseDepart(depart);
				if (result == null) result = caseEtape(depart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.ARRIVE: {
				Arrive arrive = (Arrive)theEObject;
				T result = caseArrive(arrive);
				if (result == null) result = caseEtape(arrive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_OUVERTE: {
				QuestionOuverte questionOuverte = (QuestionOuverte)theEObject;
				T result = caseQuestionOuverte(questionOuverte);
				if (result == null) result = caseQuestion(questionOuverte);
				if (result == null) result = caseElementAvecNom(questionOuverte);
				if (result == null) result = caseEtape(questionOuverte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_FERMEE: {
				QuestionFermee questionFermee = (QuestionFermee)theEObject;
				T result = caseQuestionFermee(questionFermee);
				if (result == null) result = caseQuestion(questionFermee);
				if (result == null) result = caseElementAvecNom(questionFermee);
				if (result == null) result = caseEtape(questionFermee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE: {
				QuestionChoixMultiple questionChoixMultiple = (QuestionChoixMultiple)theEObject;
				T result = caseQuestionChoixMultiple(questionChoixMultiple);
				if (result == null) result = caseQuestion(questionChoixMultiple);
				if (result == null) result = caseElementAvecNom(questionChoixMultiple);
				if (result == null) result = caseEtape(questionChoixMultiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.REPONSE_TEXT: {
				ReponseText reponseText = (ReponseText)theEObject;
				T result = caseReponseText(reponseText);
				if (result == null) result = caseReponse(reponseText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.REPONSE_OUI: {
				ReponseOui reponseOui = (ReponseOui)theEObject;
				T result = caseReponseOui(reponseOui);
				if (result == null) result = caseReponseRedirigable(reponseOui);
				if (result == null) result = caseReponse(reponseOui);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.REPONSE_NON: {
				ReponseNon reponseNon = (ReponseNon)theEObject;
				T result = caseReponseNon(reponseNon);
				if (result == null) result = caseReponseRedirigable(reponseNon);
				if (result == null) result = caseReponse(reponseNon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.REPONSE_CHOIX: {
				ReponseChoix reponseChoix = (ReponseChoix)theEObject;
				T result = caseReponseChoix(reponseChoix);
				if (result == null) result = caseElementAvecNom(reponseChoix);
				if (result == null) result = caseReponseRedirigable(reponseChoix);
				if (result == null) result = caseReponse(reponseChoix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseEtape(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.ETAPE: {
				Etape etape = (Etape)theEObject;
				T result = caseEtape(etape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.REPONSE: {
				Reponse reponse = (Reponse)theEObject;
				T result = caseReponse(reponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.REPONSE_REDIRIGABLE: {
				ReponseRedirigable reponseRedirigable = (ReponseRedirigable)theEObject;
				T result = caseReponseRedirigable(reponseRedirigable);
				if (result == null) result = caseReponse(reponseRedirigable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.ELEMENT_AVEC_NOM: {
				ElementAvecNom elementAvecNom = (ElementAvecNom)theEObject;
				T result = caseElementAvecNom(elementAvecNom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitre(Titre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepart(Depart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrive(Arrive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Ouverte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Ouverte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionOuverte(QuestionOuverte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Fermee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Fermee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionFermee(QuestionFermee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Choix Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Choix Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionChoixMultiple(QuestionChoixMultiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponseText(ReponseText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse Oui</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse Oui</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponseOui(ReponseOui object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse Non</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse Non</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponseNon(ReponseNon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse Choix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse Choix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponseChoix(ReponseChoix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtape(Etape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponse(Reponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse Redirigable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse Redirigable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponseRedirigable(ReponseRedirigable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Avec Nom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Avec Nom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementAvecNom(ElementAvecNom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuestionnaireSwitch
