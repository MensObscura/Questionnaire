/**
 */
package questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Choix Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.QuestionChoixMultiple#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionChoixMultiple()
 * @model
 * @generated
 */
public interface QuestionChoixMultiple extends Question, ElementAvecNom {
	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.ReponseChoix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reponse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionChoixMultiple_Reponse()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<ReponseChoix> getReponse();

} // QuestionChoixMultiple
