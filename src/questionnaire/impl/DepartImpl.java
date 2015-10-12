/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.Depart;
import questionnaire.Etape;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.DepartImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.impl.DepartImpl#getText <em>Text</em>}</li>
 *   <li>{@link questionnaire.impl.DepartImpl#getFirstEtape <em>First Etape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepartImpl extends FirstEtapeImpl implements Depart {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = "Depart";

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstEtape() <em>First Etape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEtape()
	 * @generated
	 * @ordered
	 */
	protected Etape firstEtape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.DEPART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.DEPART__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.DEPART__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etape getFirstEtape() {
		if (firstEtape != null && firstEtape.eIsProxy()) {
			InternalEObject oldFirstEtape = (InternalEObject)firstEtape;
			firstEtape = (Etape)eResolveProxy(oldFirstEtape);
			if (firstEtape != oldFirstEtape) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.DEPART__FIRST_ETAPE, oldFirstEtape, firstEtape));
			}
		}
		return firstEtape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etape basicGetFirstEtape() {
		return firstEtape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstEtape(Etape newFirstEtape) {
		Etape oldFirstEtape = firstEtape;
		firstEtape = newFirstEtape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.DEPART__FIRST_ETAPE, oldFirstEtape, firstEtape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.DEPART__NOM:
				return getNom();
			case QuestionnairePackage.DEPART__TEXT:
				return getText();
			case QuestionnairePackage.DEPART__FIRST_ETAPE:
				if (resolve) return getFirstEtape();
				return basicGetFirstEtape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionnairePackage.DEPART__NOM:
				setNom((String)newValue);
				return;
			case QuestionnairePackage.DEPART__TEXT:
				setText((String)newValue);
				return;
			case QuestionnairePackage.DEPART__FIRST_ETAPE:
				setFirstEtape((Etape)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.DEPART__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case QuestionnairePackage.DEPART__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case QuestionnairePackage.DEPART__FIRST_ETAPE:
				setFirstEtape((Etape)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.DEPART__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case QuestionnairePackage.DEPART__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case QuestionnairePackage.DEPART__FIRST_ETAPE:
				return firstEtape != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //DepartImpl
