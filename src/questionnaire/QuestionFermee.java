/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Fermee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.QuestionFermee#getOui <em>Oui</em>}</li>
 *   <li>{@link questionnaire.QuestionFermee#getNon <em>Non</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionFermee()
 * @model
 * @generated
 */
public interface QuestionFermee extends Question, ElementAvecNom {
	/**
	 * Returns the value of the '<em><b>Oui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oui</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oui</em>' containment reference.
	 * @see #setOui(ReponseOui)
	 * @see questionnaire.QuestionnairePackage#getQuestionFermee_Oui()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReponseOui getOui();

	/**
	 * Sets the value of the '{@link questionnaire.QuestionFermee#getOui <em>Oui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oui</em>' containment reference.
	 * @see #getOui()
	 * @generated
	 */
	void setOui(ReponseOui value);

	/**
	 * Returns the value of the '<em><b>Non</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non</em>' containment reference.
	 * @see #setNon(ReponseNon)
	 * @see questionnaire.QuestionnairePackage#getQuestionFermee_Non()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReponseNon getNon();

	/**
	 * Sets the value of the '{@link questionnaire.QuestionFermee#getNon <em>Non</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non</em>' containment reference.
	 * @see #getNon()
	 * @generated
	 */
	void setNon(ReponseNon value);

} // QuestionFermee
