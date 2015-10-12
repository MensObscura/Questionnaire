/**
 */
package questionnaire.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionnairePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuestionnairePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireSwitch<Adapter> modelSwitch =
		new QuestionnaireSwitch<Adapter>() {
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseTitre(Titre object) {
				return createTitreAdapter();
			}
			@Override
			public Adapter caseDepart(Depart object) {
				return createDepartAdapter();
			}
			@Override
			public Adapter caseArrive(Arrive object) {
				return createArriveAdapter();
			}
			@Override
			public Adapter caseQuestionOuverte(QuestionOuverte object) {
				return createQuestionOuverteAdapter();
			}
			@Override
			public Adapter caseQuestionFermee(QuestionFermee object) {
				return createQuestionFermeeAdapter();
			}
			@Override
			public Adapter caseQuestionChoixMultiple(QuestionChoixMultiple object) {
				return createQuestionChoixMultipleAdapter();
			}
			@Override
			public Adapter caseReponseText(ReponseText object) {
				return createReponseTextAdapter();
			}
			@Override
			public Adapter caseReponseOui(ReponseOui object) {
				return createReponseOuiAdapter();
			}
			@Override
			public Adapter caseReponseNon(ReponseNon object) {
				return createReponseNonAdapter();
			}
			@Override
			public Adapter caseReponseChoix(ReponseChoix object) {
				return createReponseChoixAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseEtape(Etape object) {
				return createEtapeAdapter();
			}
			@Override
			public Adapter caseFirstEtape(FirstEtape object) {
				return createFirstEtapeAdapter();
			}
			@Override
			public Adapter caseFollowingEtape(FollowingEtape object) {
				return createFollowingEtapeAdapter();
			}
			@Override
			public Adapter caseReponse(Reponse object) {
				return createReponseAdapter();
			}
			@Override
			public Adapter caseReponseRedirigable(ReponseRedirigable object) {
				return createReponseRedirigableAdapter();
			}
			@Override
			public Adapter caseElementAvecNom(ElementAvecNom object) {
				return createElementAvecNomAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Titre
	 * @generated
	 */
	public Adapter createTitreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Depart <em>Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Depart
	 * @generated
	 */
	public Adapter createDepartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Arrive <em>Arrive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Arrive
	 * @generated
	 */
	public Adapter createArriveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.QuestionOuverte <em>Question Ouverte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.QuestionOuverte
	 * @generated
	 */
	public Adapter createQuestionOuverteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.QuestionFermee <em>Question Fermee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.QuestionFermee
	 * @generated
	 */
	public Adapter createQuestionFermeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.QuestionChoixMultiple <em>Question Choix Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.QuestionChoixMultiple
	 * @generated
	 */
	public Adapter createQuestionChoixMultipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.ReponseText <em>Reponse Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.ReponseText
	 * @generated
	 */
	public Adapter createReponseTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.ReponseOui <em>Reponse Oui</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.ReponseOui
	 * @generated
	 */
	public Adapter createReponseOuiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.ReponseNon <em>Reponse Non</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.ReponseNon
	 * @generated
	 */
	public Adapter createReponseNonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.ReponseChoix <em>Reponse Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.ReponseChoix
	 * @generated
	 */
	public Adapter createReponseChoixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Etape <em>Etape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Etape
	 * @generated
	 */
	public Adapter createEtapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.FirstEtape <em>First Etape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.FirstEtape
	 * @generated
	 */
	public Adapter createFirstEtapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.FollowingEtape <em>Following Etape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.FollowingEtape
	 * @generated
	 */
	public Adapter createFollowingEtapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Reponse
	 * @generated
	 */
	public Adapter createReponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.ReponseRedirigable <em>Reponse Redirigable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.ReponseRedirigable
	 * @generated
	 */
	public Adapter createReponseRedirigableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.ElementAvecNom <em>Element Avec Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.ElementAvecNom
	 * @generated
	 */
	public Adapter createElementAvecNomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuestionnaireAdapterFactory
