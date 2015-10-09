/**
 */
package questionnaire.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import questionnaire.ElementAvecNom;
import questionnaire.QuestionChoixMultiple;
import questionnaire.QuestionnairePackage;
import questionnaire.ReponseChoix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Choix Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionChoixMultipleImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionChoixMultipleImpl#getReponse <em>Reponse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionChoixMultipleImpl extends QuestionImpl implements QuestionChoixMultiple {
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
	 * The cached value of the '{@link #getReponse() <em>Reponse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponse()
	 * @generated
	 * @ordered
	 */
	protected EList<ReponseChoix> reponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionChoixMultipleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTION_CHOIX_MULTIPLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReponseChoix> getReponse() {
		if (reponse == null) {
			reponse = new EObjectContainmentEList<ReponseChoix>(ReponseChoix.class, this, QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__REPONSE);
		}
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__REPONSE:
				return ((InternalEList<?>)getReponse()).basicRemove(otherEnd, msgs);
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
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__NOM:
				return getNom();
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__REPONSE:
				return getReponse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__NOM:
				setNom((String)newValue);
				return;
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__REPONSE:
				getReponse().clear();
				getReponse().addAll((Collection<? extends ReponseChoix>)newValue);
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
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__REPONSE:
				getReponse().clear();
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
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__REPONSE:
				return reponse != null && !reponse.isEmpty();
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
				case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__NOM: return QuestionnairePackage.ELEMENT_AVEC_NOM__NOM;
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
				case QuestionnairePackage.ELEMENT_AVEC_NOM__NOM: return QuestionnairePackage.QUESTION_CHOIX_MULTIPLE__NOM;
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

} //QuestionChoixMultipleImpl
