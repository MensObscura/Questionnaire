/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse Redirigable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.ReponseRedirigable#getQuestionRedirect <em>Question Redirect</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getReponseRedirigable()
 * @model
 * @generated
 */
public interface ReponseRedirigable extends Reponse {
	/**
	 * Returns the value of the '<em><b>Question Redirect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Redirect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Redirect</em>' reference.
	 * @see #setQuestionRedirect(Question)
	 * @see questionnaire.QuestionnairePackage#getReponseRedirigable_QuestionRedirect()
	 * @model annotation="gmf.link style='dash'"
	 * @generated
	 */
	Question getQuestionRedirect();

	/**
	 * Sets the value of the '{@link questionnaire.ReponseRedirigable#getQuestionRedirect <em>Question Redirect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Redirect</em>' reference.
	 * @see #getQuestionRedirect()
	 * @generated
	 */
	void setQuestionRedirect(Question value);

} // ReponseRedirigable
