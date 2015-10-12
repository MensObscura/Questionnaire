/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse Oui</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.ReponseOui#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getReponseOui()
 * @model annotation="gmf.node label='nom' label.text='Oui' label.readOnly='true'"
 * @generated
 */
public interface ReponseOui extends ReponseRedirigable {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * The default value is <code>"oui"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see questionnaire.QuestionnairePackage#getReponseOui_Nom()
	 * @model default="oui"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link questionnaire.ReponseOui#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // ReponseOui
