/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.Etape;
import questionnaire.Question;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionImpl#getNextEtape <em>Next Etape</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionImpl#getIntitule <em>Intitule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends EtapeImpl implements Question {
	/**
	 * The cached value of the '{@link #getNextEtape() <em>Next Etape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEtape()
	 * @generated
	 * @ordered
	 */
	protected Etape nextEtape;

	/**
	 * The default value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected String intitule = INTITULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etape getNextEtape() {
		if (nextEtape != null && nextEtape.eIsProxy()) {
			InternalEObject oldNextEtape = (InternalEObject)nextEtape;
			nextEtape = (Etape)eResolveProxy(oldNextEtape);
			if (nextEtape != oldNextEtape) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.QUESTION__NEXT_ETAPE, oldNextEtape, nextEtape));
			}
		}
		return nextEtape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etape basicGetNextEtape() {
		return nextEtape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextEtape(Etape newNextEtape) {
		Etape oldNextEtape = nextEtape;
		nextEtape = newNextEtape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION__NEXT_ETAPE, oldNextEtape, nextEtape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntitule() {
		return intitule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntitule(String newIntitule) {
		String oldIntitule = intitule;
		intitule = newIntitule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION__INTITULE, oldIntitule, intitule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION__NEXT_ETAPE:
				if (resolve) return getNextEtape();
				return basicGetNextEtape();
			case QuestionnairePackage.QUESTION__INTITULE:
				return getIntitule();
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
			case QuestionnairePackage.QUESTION__NEXT_ETAPE:
				setNextEtape((Etape)newValue);
				return;
			case QuestionnairePackage.QUESTION__INTITULE:
				setIntitule((String)newValue);
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
			case QuestionnairePackage.QUESTION__NEXT_ETAPE:
				setNextEtape((Etape)null);
				return;
			case QuestionnairePackage.QUESTION__INTITULE:
				setIntitule(INTITULE_EDEFAULT);
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
			case QuestionnairePackage.QUESTION__NEXT_ETAPE:
				return nextEtape != null;
			case QuestionnairePackage.QUESTION__INTITULE:
				return INTITULE_EDEFAULT == null ? intitule != null : !INTITULE_EDEFAULT.equals(intitule);
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
		result.append(" (intitule: ");
		result.append(intitule);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
