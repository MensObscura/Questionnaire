/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.ElementAvecNom;
import questionnaire.QuestionOuverte;
import questionnaire.QuestionnairePackage;
import questionnaire.ReponseText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Ouverte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionOuverteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionOuverteImpl#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionOuverteImpl extends QuestionImpl implements QuestionOuverte {
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
	 * The cached value of the '{@link #getReponse() <em>Reponse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponse()
	 * @generated
	 * @ordered
	 */
	protected ReponseText reponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionOuverteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTION_OUVERTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_OUVERTE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseText getReponse() {
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReponse(ReponseText newReponse, NotificationChain msgs) {
		ReponseText oldReponse = reponse;
		reponse = newReponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_OUVERTE__REPONSE, oldReponse, newReponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReponse(ReponseText newReponse) {
		if (newReponse != reponse) {
			NotificationChain msgs = null;
			if (reponse != null)
				msgs = ((InternalEObject)reponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION_OUVERTE__REPONSE, null, msgs);
			if (newReponse != null)
				msgs = ((InternalEObject)newReponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION_OUVERTE__REPONSE, null, msgs);
			msgs = basicSetReponse(newReponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_OUVERTE__REPONSE, newReponse, newReponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_OUVERTE__REPONSE:
				return basicSetReponse(null, msgs);
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
			case QuestionnairePackage.QUESTION_OUVERTE__NOM:
				return getNom();
			case QuestionnairePackage.QUESTION_OUVERTE__REPONSE:
				return getReponse();
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
			case QuestionnairePackage.QUESTION_OUVERTE__NOM:
				setNom((String)newValue);
				return;
			case QuestionnairePackage.QUESTION_OUVERTE__REPONSE:
				setReponse((ReponseText)newValue);
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
			case QuestionnairePackage.QUESTION_OUVERTE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case QuestionnairePackage.QUESTION_OUVERTE__REPONSE:
				setReponse((ReponseText)null);
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
			case QuestionnairePackage.QUESTION_OUVERTE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case QuestionnairePackage.QUESTION_OUVERTE__REPONSE:
				return reponse != null;
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
				case QuestionnairePackage.QUESTION_OUVERTE__NOM: return QuestionnairePackage.ELEMENT_AVEC_NOM__NOM;
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
				case QuestionnairePackage.ELEMENT_AVEC_NOM__NOM: return QuestionnairePackage.QUESTION_OUVERTE__NOM;
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

} //QuestionOuverteImpl
