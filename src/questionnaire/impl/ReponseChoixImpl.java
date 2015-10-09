/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.Question;
import questionnaire.QuestionnairePackage;
import questionnaire.Reponse;
import questionnaire.ReponseChoix;
import questionnaire.ReponseRedirigable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reponse Choix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.ReponseChoixImpl#getQuestionRedirect <em>Question Redirect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReponseChoixImpl extends ElementAvecNomImpl implements ReponseChoix {
	/**
	 * The cached value of the '{@link #getQuestionRedirect() <em>Question Redirect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionRedirect()
	 * @generated
	 * @ordered
	 */
	protected Question questionRedirect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReponseChoixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.REPONSE_CHOIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestionRedirect() {
		if (questionRedirect != null && questionRedirect.eIsProxy()) {
			InternalEObject oldQuestionRedirect = (InternalEObject)questionRedirect;
			questionRedirect = (Question)eResolveProxy(oldQuestionRedirect);
			if (questionRedirect != oldQuestionRedirect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT, oldQuestionRedirect, questionRedirect));
			}
		}
		return questionRedirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetQuestionRedirect() {
		return questionRedirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionRedirect(Question newQuestionRedirect) {
		Question oldQuestionRedirect = questionRedirect;
		questionRedirect = newQuestionRedirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT, oldQuestionRedirect, questionRedirect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT:
				if (resolve) return getQuestionRedirect();
				return basicGetQuestionRedirect();
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
			case QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT:
				setQuestionRedirect((Question)newValue);
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
			case QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT:
				setQuestionRedirect((Question)null);
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
			case QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT:
				return questionRedirect != null;
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
		if (baseClass == Reponse.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReponseRedirigable.class) {
			switch (derivedFeatureID) {
				case QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT: return QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT;
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
		if (baseClass == Reponse.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReponseRedirigable.class) {
			switch (baseFeatureID) {
				case QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT: return QuestionnairePackage.REPONSE_CHOIX__QUESTION_REDIRECT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReponseChoixImpl
