/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnaireFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionnairePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "questionnaire";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "questionnaire";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "questionnaire";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionnairePackage eINSTANCE = questionnaire.impl.QuestionnairePackageImpl.init();

	/**
	 * The meta object id for the '{@link questionnaire.impl.ElementAvecNomImpl <em>Element Avec Nom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ElementAvecNomImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getElementAvecNom()
	 * @generated
	 */
	int ELEMENT_AVEC_NOM = 15;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_AVEC_NOM__NOM = 0;

	/**
	 * The number of structural features of the '<em>Element Avec Nom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_AVEC_NOM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionnaireImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NOM = ELEMENT_AVEC_NOM__NOM;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__TITRE = ELEMENT_AVEC_NOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__DEP = ELEMENT_AVEC_NOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTIONS = ELEMENT_AVEC_NOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__ARR = ELEMENT_AVEC_NOM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = ELEMENT_AVEC_NOM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TitreImpl <em>Titre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TitreImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTitre()
	 * @generated
	 */
	int TITRE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE__NOM = ELEMENT_AVEC_NOM__NOM;

	/**
	 * The number of structural features of the '<em>Titre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE_FEATURE_COUNT = ELEMENT_AVEC_NOM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.EtapeImpl <em>Etape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.EtapeImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getEtape()
	 * @generated
	 */
	int ETAPE = 12;

	/**
	 * The number of structural features of the '<em>Etape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETAPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.DepartImpl <em>Depart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.DepartImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getDepart()
	 * @generated
	 */
	int DEPART = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPART__NOM = ETAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Etape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPART__FIRST_ETAPE = ETAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Depart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPART_FEATURE_COUNT = ETAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ArriveImpl <em>Arrive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ArriveImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getArrive()
	 * @generated
	 */
	int ARRIVE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVE__NOM = ETAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVE_FEATURE_COUNT = ETAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 11;

	/**
	 * The feature id for the '<em><b>Next Etape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NEXT_ETAPE = ETAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INTITULE = ETAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = ETAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionOuverteImpl <em>Question Ouverte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionOuverteImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuverte()
	 * @generated
	 */
	int QUESTION_OUVERTE = 4;

	/**
	 * The feature id for the '<em><b>Next Etape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE__NEXT_ETAPE = QUESTION__NEXT_ETAPE;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE__INTITULE = QUESTION__INTITULE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE__NOM = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reponse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE__REPONSE = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question Ouverte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionFermeeImpl <em>Question Fermee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionFermeeImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionFermee()
	 * @generated
	 */
	int QUESTION_FERMEE = 5;

	/**
	 * The feature id for the '<em><b>Next Etape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FERMEE__NEXT_ETAPE = QUESTION__NEXT_ETAPE;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FERMEE__INTITULE = QUESTION__INTITULE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FERMEE__NOM = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Oui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FERMEE__OUI = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Non</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FERMEE__NON = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Question Fermee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FERMEE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionChoixMultipleImpl <em>Question Choix Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionChoixMultipleImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionChoixMultiple()
	 * @generated
	 */
	int QUESTION_CHOIX_MULTIPLE = 6;

	/**
	 * The feature id for the '<em><b>Next Etape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CHOIX_MULTIPLE__NEXT_ETAPE = QUESTION__NEXT_ETAPE;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CHOIX_MULTIPLE__INTITULE = QUESTION__INTITULE;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CHOIX_MULTIPLE__NOM = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reponses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CHOIX_MULTIPLE__REPONSES = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question Choix Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CHOIX_MULTIPLE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ReponseImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 13;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ReponseTextImpl <em>Reponse Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ReponseTextImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseText()
	 * @generated
	 */
	int REPONSE_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_TEXT__NOM = REPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reponse Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_TEXT_FEATURE_COUNT = REPONSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ReponseRedirigableImpl <em>Reponse Redirigable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ReponseRedirigableImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseRedirigable()
	 * @generated
	 */
	int REPONSE_REDIRIGABLE = 14;

	/**
	 * The feature id for the '<em><b>Question Redirect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_REDIRIGABLE__QUESTION_REDIRECT = REPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reponse Redirigable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_REDIRIGABLE_FEATURE_COUNT = REPONSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ReponseOuiImpl <em>Reponse Oui</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ReponseOuiImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseOui()
	 * @generated
	 */
	int REPONSE_OUI = 8;

	/**
	 * The feature id for the '<em><b>Question Redirect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OUI__QUESTION_REDIRECT = REPONSE_REDIRIGABLE__QUESTION_REDIRECT;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OUI__NOM = REPONSE_REDIRIGABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reponse Oui</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OUI_FEATURE_COUNT = REPONSE_REDIRIGABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ReponseNonImpl <em>Reponse Non</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ReponseNonImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseNon()
	 * @generated
	 */
	int REPONSE_NON = 9;

	/**
	 * The feature id for the '<em><b>Question Redirect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_NON__QUESTION_REDIRECT = REPONSE_REDIRIGABLE__QUESTION_REDIRECT;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_NON__NOM = REPONSE_REDIRIGABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reponse Non</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_NON_FEATURE_COUNT = REPONSE_REDIRIGABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ReponseChoixImpl <em>Reponse Choix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ReponseChoixImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseChoix()
	 * @generated
	 */
	int REPONSE_CHOIX = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_CHOIX__NOM = ELEMENT_AVEC_NOM__NOM;

	/**
	 * The feature id for the '<em><b>Question Redirect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_CHOIX__QUESTION_REDIRECT = ELEMENT_AVEC_NOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reponse Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_CHOIX_FEATURE_COUNT = ELEMENT_AVEC_NOM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link questionnaire.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see questionnaire.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.Questionnaire#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titre</em>'.
	 * @see questionnaire.Questionnaire#getTitre()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Titre();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.Questionnaire#getDep <em>Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dep</em>'.
	 * @see questionnaire.Questionnaire#getDep()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Dep();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see questionnaire.Questionnaire#getQuestions()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Questions();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.Questionnaire#getArr <em>Arr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arr</em>'.
	 * @see questionnaire.Questionnaire#getArr()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Arr();

	/**
	 * Returns the meta object for class '{@link questionnaire.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titre</em>'.
	 * @see questionnaire.Titre
	 * @generated
	 */
	EClass getTitre();

	/**
	 * Returns the meta object for class '{@link questionnaire.Depart <em>Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depart</em>'.
	 * @see questionnaire.Depart
	 * @generated
	 */
	EClass getDepart();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Depart#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.Depart#getNom()
	 * @see #getDepart()
	 * @generated
	 */
	EAttribute getDepart_Nom();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.Depart#getFirstEtape <em>First Etape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Etape</em>'.
	 * @see questionnaire.Depart#getFirstEtape()
	 * @see #getDepart()
	 * @generated
	 */
	EReference getDepart_FirstEtape();

	/**
	 * Returns the meta object for class '{@link questionnaire.Arrive <em>Arrive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrive</em>'.
	 * @see questionnaire.Arrive
	 * @generated
	 */
	EClass getArrive();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Arrive#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.Arrive#getNom()
	 * @see #getArrive()
	 * @generated
	 */
	EAttribute getArrive_Nom();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionOuverte <em>Question Ouverte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Ouverte</em>'.
	 * @see questionnaire.QuestionOuverte
	 * @generated
	 */
	EClass getQuestionOuverte();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.QuestionOuverte#getReponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reponse</em>'.
	 * @see questionnaire.QuestionOuverte#getReponse()
	 * @see #getQuestionOuverte()
	 * @generated
	 */
	EReference getQuestionOuverte_Reponse();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionFermee <em>Question Fermee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Fermee</em>'.
	 * @see questionnaire.QuestionFermee
	 * @generated
	 */
	EClass getQuestionFermee();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.QuestionFermee#getOui <em>Oui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oui</em>'.
	 * @see questionnaire.QuestionFermee#getOui()
	 * @see #getQuestionFermee()
	 * @generated
	 */
	EReference getQuestionFermee_Oui();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.QuestionFermee#getNon <em>Non</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non</em>'.
	 * @see questionnaire.QuestionFermee#getNon()
	 * @see #getQuestionFermee()
	 * @generated
	 */
	EReference getQuestionFermee_Non();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionChoixMultiple <em>Question Choix Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Choix Multiple</em>'.
	 * @see questionnaire.QuestionChoixMultiple
	 * @generated
	 */
	EClass getQuestionChoixMultiple();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.QuestionChoixMultiple#getReponses <em>Reponses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponses</em>'.
	 * @see questionnaire.QuestionChoixMultiple#getReponses()
	 * @see #getQuestionChoixMultiple()
	 * @generated
	 */
	EReference getQuestionChoixMultiple_Reponses();

	/**
	 * Returns the meta object for class '{@link questionnaire.ReponseText <em>Reponse Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse Text</em>'.
	 * @see questionnaire.ReponseText
	 * @generated
	 */
	EClass getReponseText();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.ReponseText#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.ReponseText#getNom()
	 * @see #getReponseText()
	 * @generated
	 */
	EAttribute getReponseText_Nom();

	/**
	 * Returns the meta object for class '{@link questionnaire.ReponseOui <em>Reponse Oui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse Oui</em>'.
	 * @see questionnaire.ReponseOui
	 * @generated
	 */
	EClass getReponseOui();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.ReponseOui#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.ReponseOui#getNom()
	 * @see #getReponseOui()
	 * @generated
	 */
	EAttribute getReponseOui_Nom();

	/**
	 * Returns the meta object for class '{@link questionnaire.ReponseNon <em>Reponse Non</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse Non</em>'.
	 * @see questionnaire.ReponseNon
	 * @generated
	 */
	EClass getReponseNon();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.ReponseNon#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.ReponseNon#getNom()
	 * @see #getReponseNon()
	 * @generated
	 */
	EAttribute getReponseNon_Nom();

	/**
	 * Returns the meta object for class '{@link questionnaire.ReponseChoix <em>Reponse Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse Choix</em>'.
	 * @see questionnaire.ReponseChoix
	 * @generated
	 */
	EClass getReponseChoix();

	/**
	 * Returns the meta object for class '{@link questionnaire.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see questionnaire.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.Question#getNextEtape <em>Next Etape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Etape</em>'.
	 * @see questionnaire.Question#getNextEtape()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_NextEtape();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Question#getIntitule <em>Intitule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intitule</em>'.
	 * @see questionnaire.Question#getIntitule()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Intitule();

	/**
	 * Returns the meta object for class '{@link questionnaire.Etape <em>Etape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etape</em>'.
	 * @see questionnaire.Etape
	 * @generated
	 */
	EClass getEtape();

	/**
	 * Returns the meta object for class '{@link questionnaire.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see questionnaire.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for class '{@link questionnaire.ReponseRedirigable <em>Reponse Redirigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse Redirigable</em>'.
	 * @see questionnaire.ReponseRedirigable
	 * @generated
	 */
	EClass getReponseRedirigable();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.ReponseRedirigable#getQuestionRedirect <em>Question Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question Redirect</em>'.
	 * @see questionnaire.ReponseRedirigable#getQuestionRedirect()
	 * @see #getReponseRedirigable()
	 * @generated
	 */
	EReference getReponseRedirigable_QuestionRedirect();

	/**
	 * Returns the meta object for class '{@link questionnaire.ElementAvecNom <em>Element Avec Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Avec Nom</em>'.
	 * @see questionnaire.ElementAvecNom
	 * @generated
	 */
	EClass getElementAvecNom();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.ElementAvecNom#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.ElementAvecNom#getNom()
	 * @see #getElementAvecNom()
	 * @generated
	 */
	EAttribute getElementAvecNom_Nom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuestionnaireFactory getQuestionnaireFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionnaireImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__TITRE = eINSTANCE.getQuestionnaire_Titre();

		/**
		 * The meta object literal for the '<em><b>Dep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__DEP = eINSTANCE.getQuestionnaire_Dep();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTIONS = eINSTANCE.getQuestionnaire_Questions();

		/**
		 * The meta object literal for the '<em><b>Arr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__ARR = eINSTANCE.getQuestionnaire_Arr();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TitreImpl <em>Titre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TitreImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTitre()
		 * @generated
		 */
		EClass TITRE = eINSTANCE.getTitre();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.DepartImpl <em>Depart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.DepartImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getDepart()
		 * @generated
		 */
		EClass DEPART = eINSTANCE.getDepart();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPART__NOM = eINSTANCE.getDepart_Nom();

		/**
		 * The meta object literal for the '<em><b>First Etape</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPART__FIRST_ETAPE = eINSTANCE.getDepart_FirstEtape();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ArriveImpl <em>Arrive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ArriveImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getArrive()
		 * @generated
		 */
		EClass ARRIVE = eINSTANCE.getArrive();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRIVE__NOM = eINSTANCE.getArrive_Nom();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionOuverteImpl <em>Question Ouverte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionOuverteImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuverte()
		 * @generated
		 */
		EClass QUESTION_OUVERTE = eINSTANCE.getQuestionOuverte();

		/**
		 * The meta object literal for the '<em><b>Reponse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_OUVERTE__REPONSE = eINSTANCE.getQuestionOuverte_Reponse();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionFermeeImpl <em>Question Fermee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionFermeeImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionFermee()
		 * @generated
		 */
		EClass QUESTION_FERMEE = eINSTANCE.getQuestionFermee();

		/**
		 * The meta object literal for the '<em><b>Oui</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_FERMEE__OUI = eINSTANCE.getQuestionFermee_Oui();

		/**
		 * The meta object literal for the '<em><b>Non</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_FERMEE__NON = eINSTANCE.getQuestionFermee_Non();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionChoixMultipleImpl <em>Question Choix Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionChoixMultipleImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionChoixMultiple()
		 * @generated
		 */
		EClass QUESTION_CHOIX_MULTIPLE = eINSTANCE.getQuestionChoixMultiple();

		/**
		 * The meta object literal for the '<em><b>Reponses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_CHOIX_MULTIPLE__REPONSES = eINSTANCE.getQuestionChoixMultiple_Reponses();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ReponseTextImpl <em>Reponse Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ReponseTextImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseText()
		 * @generated
		 */
		EClass REPONSE_TEXT = eINSTANCE.getReponseText();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE_TEXT__NOM = eINSTANCE.getReponseText_Nom();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ReponseOuiImpl <em>Reponse Oui</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ReponseOuiImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseOui()
		 * @generated
		 */
		EClass REPONSE_OUI = eINSTANCE.getReponseOui();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE_OUI__NOM = eINSTANCE.getReponseOui_Nom();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ReponseNonImpl <em>Reponse Non</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ReponseNonImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseNon()
		 * @generated
		 */
		EClass REPONSE_NON = eINSTANCE.getReponseNon();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE_NON__NOM = eINSTANCE.getReponseNon_Nom();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ReponseChoixImpl <em>Reponse Choix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ReponseChoixImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseChoix()
		 * @generated
		 */
		EClass REPONSE_CHOIX = eINSTANCE.getReponseChoix();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Next Etape</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__NEXT_ETAPE = eINSTANCE.getQuestion_NextEtape();

		/**
		 * The meta object literal for the '<em><b>Intitule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__INTITULE = eINSTANCE.getQuestion_Intitule();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.EtapeImpl <em>Etape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.EtapeImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getEtape()
		 * @generated
		 */
		EClass ETAPE = eINSTANCE.getEtape();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ReponseImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ReponseRedirigableImpl <em>Reponse Redirigable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ReponseRedirigableImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getReponseRedirigable()
		 * @generated
		 */
		EClass REPONSE_REDIRIGABLE = eINSTANCE.getReponseRedirigable();

		/**
		 * The meta object literal for the '<em><b>Question Redirect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPONSE_REDIRIGABLE__QUESTION_REDIRECT = eINSTANCE.getReponseRedirigable_QuestionRedirect();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ElementAvecNomImpl <em>Element Avec Nom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ElementAvecNomImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getElementAvecNom()
		 * @generated
		 */
		EClass ELEMENT_AVEC_NOM = eINSTANCE.getElementAvecNom();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_AVEC_NOM__NOM = eINSTANCE.getElementAvecNom_Nom();

	}

} //QuestionnairePackage
