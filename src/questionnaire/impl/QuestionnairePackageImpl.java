/**
 */
package questionnaire.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import questionnaire.Arrive;
import questionnaire.Depart;
import questionnaire.ElementAvecNom;
import questionnaire.Etape;
import questionnaire.FirstEtape;
import questionnaire.FollowingEtape;
import questionnaire.Question;
import questionnaire.QuestionChoixMultiple;
import questionnaire.QuestionFermee;
import questionnaire.QuestionOuverte;
import questionnaire.Questionnaire;
import questionnaire.QuestionnaireFactory;
import questionnaire.QuestionnairePackage;
import questionnaire.Reponse;
import questionnaire.ReponseChoix;
import questionnaire.ReponseNon;
import questionnaire.ReponseOui;
import questionnaire.ReponseRedirigable;
import questionnaire.ReponseText;
import questionnaire.Titre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnairePackageImpl extends EPackageImpl implements QuestionnairePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionOuverteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionFermeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionChoixMultipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseOuiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseNonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseChoixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstEtapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass followingEtapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reponseRedirigableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementAvecNomEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see questionnaire.QuestionnairePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuestionnairePackageImpl() {
		super(eNS_URI, QuestionnaireFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QuestionnairePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuestionnairePackage init() {
		if (isInited) return (QuestionnairePackage)EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI);

		// Obtain or create and register package
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionnairePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQuestionnairePackage.createPackageContents();

		// Initialize created meta-data
		theQuestionnairePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuestionnairePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuestionnairePackage.eNS_URI, theQuestionnairePackage);
		return theQuestionnairePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Titre() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Dep() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Questions() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Arr() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitre() {
		return titreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepart() {
		return departEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepart_Nom() {
		return (EAttribute)departEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepart_Text() {
		return (EAttribute)departEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepart_FirstEtape() {
		return (EReference)departEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrive() {
		return arriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrive_Nom() {
		return (EAttribute)arriveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionOuverte() {
		return questionOuverteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionOuverte_Reponse() {
		return (EReference)questionOuverteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionFermee() {
		return questionFermeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionFermee_Oui() {
		return (EReference)questionFermeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionFermee_Non() {
		return (EReference)questionFermeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionChoixMultiple() {
		return questionChoixMultipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionChoixMultiple_Reponses() {
		return (EReference)questionChoixMultipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponseText() {
		return reponseTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponseText_Nom() {
		return (EAttribute)reponseTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponseOui() {
		return reponseOuiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponseOui_Nom() {
		return (EAttribute)reponseOuiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponseNon() {
		return reponseNonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReponseNon_Nom() {
		return (EAttribute)reponseNonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponseChoix() {
		return reponseChoixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_NextEtape() {
		return (EReference)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Intitule() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtape() {
		return etapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstEtape() {
		return firstEtapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFollowingEtape() {
		return followingEtapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponse() {
		return reponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReponseRedirigable() {
		return reponseRedirigableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReponseRedirigable_QuestionRedirect() {
		return (EReference)reponseRedirigableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementAvecNom() {
		return elementAvecNomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementAvecNom_Nom() {
		return (EAttribute)elementAvecNomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactory getQuestionnaireFactory() {
		return (QuestionnaireFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEReference(questionnaireEClass, QUESTIONNAIRE__TITRE);
		createEReference(questionnaireEClass, QUESTIONNAIRE__DEP);
		createEReference(questionnaireEClass, QUESTIONNAIRE__QUESTIONS);
		createEReference(questionnaireEClass, QUESTIONNAIRE__ARR);

		titreEClass = createEClass(TITRE);

		departEClass = createEClass(DEPART);
		createEAttribute(departEClass, DEPART__NOM);
		createEAttribute(departEClass, DEPART__TEXT);
		createEReference(departEClass, DEPART__FIRST_ETAPE);

		arriveEClass = createEClass(ARRIVE);
		createEAttribute(arriveEClass, ARRIVE__NOM);

		questionOuverteEClass = createEClass(QUESTION_OUVERTE);
		createEReference(questionOuverteEClass, QUESTION_OUVERTE__REPONSE);

		questionFermeeEClass = createEClass(QUESTION_FERMEE);
		createEReference(questionFermeeEClass, QUESTION_FERMEE__OUI);
		createEReference(questionFermeeEClass, QUESTION_FERMEE__NON);

		questionChoixMultipleEClass = createEClass(QUESTION_CHOIX_MULTIPLE);
		createEReference(questionChoixMultipleEClass, QUESTION_CHOIX_MULTIPLE__REPONSES);

		reponseTextEClass = createEClass(REPONSE_TEXT);
		createEAttribute(reponseTextEClass, REPONSE_TEXT__NOM);

		reponseOuiEClass = createEClass(REPONSE_OUI);
		createEAttribute(reponseOuiEClass, REPONSE_OUI__NOM);

		reponseNonEClass = createEClass(REPONSE_NON);
		createEAttribute(reponseNonEClass, REPONSE_NON__NOM);

		reponseChoixEClass = createEClass(REPONSE_CHOIX);

		questionEClass = createEClass(QUESTION);
		createEReference(questionEClass, QUESTION__NEXT_ETAPE);
		createEAttribute(questionEClass, QUESTION__INTITULE);

		etapeEClass = createEClass(ETAPE);

		firstEtapeEClass = createEClass(FIRST_ETAPE);

		followingEtapeEClass = createEClass(FOLLOWING_ETAPE);

		reponseEClass = createEClass(REPONSE);

		reponseRedirigableEClass = createEClass(REPONSE_REDIRIGABLE);
		createEReference(reponseRedirigableEClass, REPONSE_REDIRIGABLE__QUESTION_REDIRECT);

		elementAvecNomEClass = createEClass(ELEMENT_AVEC_NOM);
		createEAttribute(elementAvecNomEClass, ELEMENT_AVEC_NOM__NOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		questionnaireEClass.getESuperTypes().add(this.getElementAvecNom());
		titreEClass.getESuperTypes().add(this.getElementAvecNom());
		departEClass.getESuperTypes().add(this.getFirstEtape());
		arriveEClass.getESuperTypes().add(this.getFollowingEtape());
		questionOuverteEClass.getESuperTypes().add(this.getQuestion());
		questionOuverteEClass.getESuperTypes().add(this.getElementAvecNom());
		questionFermeeEClass.getESuperTypes().add(this.getQuestion());
		questionFermeeEClass.getESuperTypes().add(this.getElementAvecNom());
		questionChoixMultipleEClass.getESuperTypes().add(this.getQuestion());
		questionChoixMultipleEClass.getESuperTypes().add(this.getElementAvecNom());
		reponseTextEClass.getESuperTypes().add(this.getReponse());
		reponseOuiEClass.getESuperTypes().add(this.getReponseRedirigable());
		reponseNonEClass.getESuperTypes().add(this.getReponseRedirigable());
		reponseChoixEClass.getESuperTypes().add(this.getElementAvecNom());
		reponseChoixEClass.getESuperTypes().add(this.getReponseRedirigable());
		questionEClass.getESuperTypes().add(this.getFollowingEtape());
		firstEtapeEClass.getESuperTypes().add(this.getEtape());
		followingEtapeEClass.getESuperTypes().add(this.getEtape());
		reponseRedirigableEClass.getESuperTypes().add(this.getReponse());

		// Initialize classes and features; add operations and parameters
		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionnaire_Titre(), this.getTitre(), null, "titre", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Dep(), this.getDepart(), null, "dep", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Questions(), this.getQuestion(), null, "questions", null, 1, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Arr(), this.getArrive(), null, "arr", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titreEClass, Titre.class, "Titre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(departEClass, Depart.class, "Depart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepart_Nom(), ecorePackage.getEString(), "nom", "Depart", 0, 1, Depart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepart_Text(), ecorePackage.getEString(), "text", null, 0, 1, Depart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepart_FirstEtape(), this.getEtape(), null, "firstEtape", null, 0, 1, Depart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arriveEClass, Arrive.class, "Arrive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrive_Nom(), ecorePackage.getEString(), "nom", "Arrivee", 0, 1, Arrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionOuverteEClass, QuestionOuverte.class, "QuestionOuverte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionOuverte_Reponse(), this.getReponseText(), null, "reponse", null, 1, 1, QuestionOuverte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionFermeeEClass, QuestionFermee.class, "QuestionFermee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionFermee_Oui(), this.getReponseOui(), null, "oui", null, 1, 1, QuestionFermee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionFermee_Non(), this.getReponseNon(), null, "non", null, 1, 1, QuestionFermee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionChoixMultipleEClass, QuestionChoixMultiple.class, "QuestionChoixMultiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionChoixMultiple_Reponses(), this.getReponseChoix(), null, "reponses", null, 2, -1, QuestionChoixMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reponseTextEClass, ReponseText.class, "ReponseText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReponseText_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, ReponseText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reponseOuiEClass, ReponseOui.class, "ReponseOui", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReponseOui_Nom(), ecorePackage.getEString(), "nom", "oui", 0, 1, ReponseOui.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reponseNonEClass, ReponseNon.class, "ReponseNon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReponseNon_Nom(), ecorePackage.getEString(), "nom", "non", 0, 1, ReponseNon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reponseChoixEClass, ReponseChoix.class, "ReponseChoix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestion_NextEtape(), this.getFollowingEtape(), null, "nextEtape", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Intitule(), ecorePackage.getEString(), "intitule", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etapeEClass, Etape.class, "Etape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firstEtapeEClass, FirstEtape.class, "FirstEtape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(followingEtapeEClass, FollowingEtape.class, "FollowingEtape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reponseEClass, Reponse.class, "Reponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reponseRedirigableEClass, ReponseRedirigable.class, "ReponseRedirigable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReponseRedirigable_QuestionRedirect(), this.getQuestion(), null, "questionRedirect", null, 0, 1, ReponseRedirigable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementAvecNomEClass, ElementAvecNom.class, "ElementAvecNom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementAvecNom_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, ElementAvecNom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (questionnaireEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (departEClass, 
		   source, 
		   new String[] {
			 "label", "nom",
			 "label.text", "Depart",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (arriveEClass, 
		   source, 
		   new String[] {
			 "label", "nom",
			 "label.text", "Arrivee",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (reponseTextEClass, 
		   source, 
		   new String[] {
			 "label", "nom",
			 "label.text", "TextInput",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (reponseOuiEClass, 
		   source, 
		   new String[] {
			 "label", "nom",
			 "label.text", "Oui",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (reponseNonEClass, 
		   source, 
		   new String[] {
			 "label", "nom",
			 "label.text", "Non",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (questionEClass, 
		   source, 
		   new String[] {
			 "label", "intitule"
		   });	
		addAnnotation
		  (elementAvecNomEClass, 
		   source, 
		   new String[] {
			 "label", "nom"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getDepart_FirstEtape(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getQuestion_NextEtape(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getReponseRedirigable_QuestionRedirect(), 
		   source, 
		   new String[] {
			 "style", "dash"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getQuestionOuverte_Reponse(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getQuestionFermee_Oui(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getQuestionFermee_Non(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getQuestionChoixMultiple_Reponses(), 
		   source, 
		   new String[] {
		   });
	}

} //QuestionnairePackageImpl
