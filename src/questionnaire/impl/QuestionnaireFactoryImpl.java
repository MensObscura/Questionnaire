/**
 */
package questionnaire.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireFactoryImpl extends EFactoryImpl implements QuestionnaireFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionnaireFactory init() {
		try {
			QuestionnaireFactory theQuestionnaireFactory = (QuestionnaireFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionnairePackage.eNS_URI);
			if (theQuestionnaireFactory != null) {
				return theQuestionnaireFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionnaireFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuestionnairePackage.QUESTIONNAIRE: return createQuestionnaire();
			case QuestionnairePackage.TITRE: return createTitre();
			case QuestionnairePackage.DEPART: return createDepart();
			case QuestionnairePackage.ARRIVE: return createArrive();
			case QuestionnairePackage.QUESTION_OUVERTE: return createQuestionOuverte();
			case QuestionnairePackage.QUESTION_FERMEE: return createQuestionFermee();
			case QuestionnairePackage.QUESTION_CHOIX_MULTIPLE: return createQuestionChoixMultiple();
			case QuestionnairePackage.REPONSE_TEXT: return createReponseText();
			case QuestionnairePackage.REPONSE_OUI: return createReponseOui();
			case QuestionnairePackage.REPONSE_NON: return createReponseNon();
			case QuestionnairePackage.REPONSE_CHOIX: return createReponseChoix();
			case QuestionnairePackage.QUESTION: return createQuestion();
			case QuestionnairePackage.ETAPE: return createEtape();
			case QuestionnairePackage.REPONSE: return createReponse();
			case QuestionnairePackage.REPONSE_REDIRIGABLE: return createReponseRedirigable();
			case QuestionnairePackage.ELEMENT_AVEC_NOM: return createElementAvecNom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titre createTitre() {
		TitreImpl titre = new TitreImpl();
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depart createDepart() {
		DepartImpl depart = new DepartImpl();
		return depart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrive createArrive() {
		ArriveImpl arrive = new ArriveImpl();
		return arrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionOuverte createQuestionOuverte() {
		QuestionOuverteImpl questionOuverte = new QuestionOuverteImpl();
		return questionOuverte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionFermee createQuestionFermee() {
		QuestionFermeeImpl questionFermee = new QuestionFermeeImpl();
		return questionFermee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionChoixMultiple createQuestionChoixMultiple() {
		QuestionChoixMultipleImpl questionChoixMultiple = new QuestionChoixMultipleImpl();
		return questionChoixMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseText createReponseText() {
		ReponseTextImpl reponseText = new ReponseTextImpl();
		return reponseText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseOui createReponseOui() {
		ReponseOuiImpl reponseOui = new ReponseOuiImpl();
		return reponseOui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseNon createReponseNon() {
		ReponseNonImpl reponseNon = new ReponseNonImpl();
		return reponseNon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseChoix createReponseChoix() {
		ReponseChoixImpl reponseChoix = new ReponseChoixImpl();
		return reponseChoix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etape createEtape() {
		EtapeImpl etape = new EtapeImpl();
		return etape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reponse createReponse() {
		ReponseImpl reponse = new ReponseImpl();
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReponseRedirigable createReponseRedirigable() {
		ReponseRedirigableImpl reponseRedirigable = new ReponseRedirigableImpl();
		return reponseRedirigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementAvecNom createElementAvecNom() {
		ElementAvecNomImpl elementAvecNom = new ElementAvecNomImpl();
		return elementAvecNom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnairePackage getQuestionnairePackage() {
		return (QuestionnairePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionnairePackage getPackage() {
		return QuestionnairePackage.eINSTANCE;
	}

} //QuestionnaireFactoryImpl
