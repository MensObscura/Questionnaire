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

import questionnaire.Arrive;
import questionnaire.Depart;
import questionnaire.Question;
import questionnaire.Questionnaire;
import questionnaire.QuestionnairePackage;
import questionnaire.Titre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getDep <em>Dep</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getArr <em>Arr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireImpl extends ElementAvecNomImpl implements Questionnaire {
	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected Titre titre;

	/**
	 * The cached value of the '{@link #getDep() <em>Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDep()
	 * @generated
	 * @ordered
	 */
	protected Depart dep;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The cached value of the '{@link #getArr() <em>Arr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArr()
	 * @generated
	 * @ordered
	 */
	protected Arrive arr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titre getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitre(Titre newTitre, NotificationChain msgs) {
		Titre oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__TITRE, oldTitre, newTitre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(Titre newTitre) {
		if (newTitre != titre) {
			NotificationChain msgs = null;
			if (titre != null)
				msgs = ((InternalEObject)titre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__TITRE, null, msgs);
			if (newTitre != null)
				msgs = ((InternalEObject)newTitre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__TITRE, null, msgs);
			msgs = basicSetTitre(newTitre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__TITRE, newTitre, newTitre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depart getDep() {
		return dep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDep(Depart newDep, NotificationChain msgs) {
		Depart oldDep = dep;
		dep = newDep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__DEP, oldDep, newDep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDep(Depart newDep) {
		if (newDep != dep) {
			NotificationChain msgs = null;
			if (dep != null)
				msgs = ((InternalEObject)dep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__DEP, null, msgs);
			if (newDep != null)
				msgs = ((InternalEObject)newDep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__DEP, null, msgs);
			msgs = basicSetDep(newDep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__DEP, newDep, newDep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, QuestionnairePackage.QUESTIONNAIRE__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrive getArr() {
		return arr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArr(Arrive newArr, NotificationChain msgs) {
		Arrive oldArr = arr;
		arr = newArr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__ARR, oldArr, newArr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArr(Arrive newArr) {
		if (newArr != arr) {
			NotificationChain msgs = null;
			if (arr != null)
				msgs = ((InternalEObject)arr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__ARR, null, msgs);
			if (newArr != null)
				msgs = ((InternalEObject)newArr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__ARR, null, msgs);
			msgs = basicSetArr(newArr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__ARR, newArr, newArr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.QUESTIONNAIRE__TITRE:
				return basicSetTitre(null, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__DEP:
				return basicSetDep(null, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__ARR:
				return basicSetArr(null, msgs);
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
			case QuestionnairePackage.QUESTIONNAIRE__TITRE:
				return getTitre();
			case QuestionnairePackage.QUESTIONNAIRE__DEP:
				return getDep();
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return getQuestions();
			case QuestionnairePackage.QUESTIONNAIRE__ARR:
				return getArr();
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
			case QuestionnairePackage.QUESTIONNAIRE__TITRE:
				setTitre((Titre)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__DEP:
				setDep((Depart)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__ARR:
				setArr((Arrive)newValue);
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
			case QuestionnairePackage.QUESTIONNAIRE__TITRE:
				setTitre((Titre)null);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__DEP:
				setDep((Depart)null);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				return;
			case QuestionnairePackage.QUESTIONNAIRE__ARR:
				setArr((Arrive)null);
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
			case QuestionnairePackage.QUESTIONNAIRE__TITRE:
				return titre != null;
			case QuestionnairePackage.QUESTIONNAIRE__DEP:
				return dep != null;
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case QuestionnairePackage.QUESTIONNAIRE__ARR:
				return arr != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireImpl
