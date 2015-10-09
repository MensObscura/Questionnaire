/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Depart#getFirstEtape <em>First Etape</em>}</li>
 *   <li>{@link questionnaire.Depart#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getDepart()
 * @model annotation="gmf.node label='nom' label.text='D\351part' label.readOnly='true'"
 * @generated
 */
public interface Depart extends Etape {
	/**
	 * Returns the value of the '<em><b>First Etape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Etape</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Etape</em>' reference.
	 * @see #setFirstEtape(Etape)
	 * @see questionnaire.QuestionnairePackage#getDepart_FirstEtape()
	 * @model annotation="gmf.link target.decoration='arrow'"
	 * @generated
	 */
	Etape getFirstEtape();

	/**
	 * Sets the value of the '{@link questionnaire.Depart#getFirstEtape <em>First Etape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Etape</em>' reference.
	 * @see #getFirstEtape()
	 * @generated
	 */
	void setFirstEtape(Etape value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see questionnaire.QuestionnairePackage#getDepart_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link questionnaire.Depart#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Depart
