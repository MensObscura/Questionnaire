/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.Question;
import questionnaire.QuestionnairePackage;
import questionnaire.ReponseRedirigable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reponse Redirigable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.ReponseRedirigableImpl#getQuestionRedirect <em>Question Redirect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReponseRedirigableImpl extends ReponseImpl implements ReponseRedirigable {
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
	protected ReponseRedirigableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.REPONSE_REDIRIGABLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT, oldQuestionRedirect, questionRedirect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT, oldQuestionRedirect, questionRedirect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT:
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
			case QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT:
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
			case QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT:
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
			case QuestionnairePackage.REPONSE_REDIRIGABLE__QUESTION_REDIRECT:
				return questionRedirect != null;
		}
		return super.eIsSet(featureID);
	}

} //ReponseRedirigableImpl
