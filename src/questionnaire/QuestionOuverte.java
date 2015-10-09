/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Ouverte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.QuestionOuverte#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionOuverte()
 * @model
 * @generated
 */
public interface QuestionOuverte extends Question, ElementAvecNom {
	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reponse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' containment reference.
	 * @see #setReponse(ReponseText)
	 * @see questionnaire.QuestionnairePackage#getQuestionOuverte_Reponse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReponseText getReponse();

	/**
	 * Sets the value of the '{@link questionnaire.QuestionOuverte#getReponse <em>Reponse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reponse</em>' containment reference.
	 * @see #getReponse()
	 * @generated
	 */
	void setReponse(ReponseText value);

} // QuestionOuverte
