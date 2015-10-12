/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Question#getNextEtape <em>Next Etape</em>}</li>
 *   <li>{@link questionnaire.Question#getIntitule <em>Intitule</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestion()
 * @model annotation="gmf.node label='intitule'"
 * @generated
 */
public interface Question extends Etape {
	/**
	 * Returns the value of the '<em><b>Next Etape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Etape</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Etape</em>' reference.
	 * @see #setNextEtape(Etape)
	 * @see questionnaire.QuestionnairePackage#getQuestion_NextEtape()
	 * @model annotation="gmf.link target.decoration='arrow'"
	 * @generated
	 */
	Etape getNextEtape();

	/**
	 * Sets the value of the '{@link questionnaire.Question#getNextEtape <em>Next Etape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Etape</em>' reference.
	 * @see #getNextEtape()
	 * @generated
	 */
	void setNextEtape(Etape value);

	/**
	 * Returns the value of the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule</em>' attribute.
	 * @see #setIntitule(String)
	 * @see questionnaire.QuestionnairePackage#getQuestion_Intitule()
	 * @model
	 * @generated
	 */
	String getIntitule();

	/**
	 * Sets the value of the '{@link questionnaire.Question#getIntitule <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule</em>' attribute.
	 * @see #getIntitule()
	 * @generated
	 */
	void setIntitule(String value);

} // Question
