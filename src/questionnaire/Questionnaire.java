/**
 */
package questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Questionnaire#getTitre <em>Titre</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getDep <em>Dep</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getQuestions <em>Questions</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getArr <em>Arr</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends ElementAvecNom {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' containment reference.
	 * @see #setTitre(Titre)
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Titre()
	 * @model containment="true"
	 * @generated
	 */
	Titre getTitre();

	/**
	 * Sets the value of the '{@link questionnaire.Questionnaire#getTitre <em>Titre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' containment reference.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(Titre value);

	/**
	 * Returns the value of the '<em><b>Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep</em>' containment reference.
	 * @see #setDep(Depart)
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Dep()
	 * @model containment="true"
	 * @generated
	 */
	Depart getDep();

	/**
	 * Sets the value of the '{@link questionnaire.Questionnaire#getDep <em>Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep</em>' containment reference.
	 * @see #getDep()
	 * @generated
	 */
	void setDep(Depart value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Questions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Arr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arr</em>' containment reference.
	 * @see #setArr(Arrive)
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Arr()
	 * @model containment="true"
	 * @generated
	 */
	Arrive getArr();

	/**
	 * Sets the value of the '{@link questionnaire.Questionnaire#getArr <em>Arr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arr</em>' containment reference.
	 * @see #getArr()
	 * @generated
	 */
	void setArr(Arrive value);

} // Questionnaire
