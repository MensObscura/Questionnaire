/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.ElementAvecNom;
import questionnaire.QuestionFermee;
import questionnaire.QuestionnairePackage;
import questionnaire.ReponseNon;
import questionnaire.ReponseOui;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Fermee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionFermeeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionFermeeImpl#getOui <em>Oui</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionFermeeImpl#getNon <em>Non</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionFermeeImpl extends QuestionImpl implements QuestionFermee {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

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
	 * The cached value of the '{@link #getOui() <em>Oui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOui()
	 * @generated
	 * @ordered
	 */
	protected ReponseOui oui;

	/**
	 * The cached value of the '{@link #getNon() <em>Non</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNon()
	 * @generated
	 * @ordered
	 */
	protected ReponseNon non;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionFermeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTION_FERMEE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_FERMEE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseOui getOui() {
		return oui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOui(ReponseOui newOui, NotificationChain msgs) {
		ReponseOui oldOui = oui;
		oui = newOui;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_FERMEE__OUI, oldOui, newOui);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOui(ReponseOui newOui) {
		if (newOui != oui) {
			NotificationChain msgs = null;
			if (oui != null)
				msgs = ((InternalEObject)oui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION_FERMEE__OUI, null, msgs);
			if (newOui != null)
				msgs = ((InternalEObject)newOui).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION_FERMEE__OUI, null, msgs);
			msgs = basicSetOui(newOui, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_FERMEE__OUI, newOui, newOui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseNon getNon() {
		return non;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNon(ReponseNon newNon, NotificationChain msgs) {
		ReponseNon oldNon = non;
		non = newNon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_FERMEE__NON, oldNon, newNon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNon(ReponseNon newNon) {
		if (newNon != non) {
			NotificationChain msgs = null;
			if (non != null)
				msgs = ((InternalEObject)non).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION_FERMEE__NON, null, msgs);
			if (newNon != null)
				msgs = ((InternalEObject)newNon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION_FERMEE__NON, null, msgs);
			msgs = basicSetNon(newNon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_FERMEE__NON, newNon, newNon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_FERMEE__OUI:
				return basicSetOui(null, msgs);
			case QuestionnairePackage.QUESTION_FERMEE__NON:
				return basicSetNon(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_FERMEE__NOM:
				return getNom();
			case QuestionnairePackage.QUESTION_FERMEE__OUI:
				return getOui();
			case QuestionnairePackage.QUESTION_FERMEE__NON:
				return getNon();
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
			case QuestionnairePackage.QUESTION_FERMEE__NOM:
				setNom((String)newValue);
				return;
			case QuestionnairePackage.QUESTION_FERMEE__OUI:
				setOui((ReponseOui)newValue);
				return;
			case QuestionnairePackage.QUESTION_FERMEE__NON:
				setNon((ReponseNon)newValue);
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
			case QuestionnairePackage.QUESTION_FERMEE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case QuestionnairePackage.QUESTION_FERMEE__OUI:
				setOui((ReponseOui)null);
				return;
			case QuestionnairePackage.QUESTION_FERMEE__NON:
				setNon((ReponseNon)null);
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
			case QuestionnairePackage.QUESTION_FERMEE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case QuestionnairePackage.QUESTION_FERMEE__OUI:
				return oui != null;
			case QuestionnairePackage.QUESTION_FERMEE__NON:
				return non != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElementAvecNom.class) {
			switch (derivedFeatureID) {
				case QuestionnairePackage.QUESTION_FERMEE__NOM: return QuestionnairePackage.ELEMENT_AVEC_NOM__NOM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElementAvecNom.class) {
			switch (baseFeatureID) {
				case QuestionnairePackage.ELEMENT_AVEC_NOM__NOM: return QuestionnairePackage.QUESTION_FERMEE__NOM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //QuestionFermeeImpl
