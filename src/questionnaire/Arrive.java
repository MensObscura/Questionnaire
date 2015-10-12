/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Arrive#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getArrive()
 * @model annotation="gmf.node label='nom' label.text='Arrivee' label.readOnly='true'"
 * @generated
 */
public interface Arrive extends FollowingEtape {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * The default value is <code>"Arrivee"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see questionnaire.QuestionnairePackage#getArrive_Nom()
	 * @model default="Arrivee"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link questionnaire.Arrive#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Arrive
