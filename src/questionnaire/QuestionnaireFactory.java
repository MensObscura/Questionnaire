/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnairePackage
 * @generated
 */
public interface QuestionnaireFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionnaireFactory eINSTANCE = questionnaire.impl.QuestionnaireFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns a new object of class '<em>Titre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titre</em>'.
	 * @generated
	 */
	Titre createTitre();

	/**
	 * Returns a new object of class '<em>Depart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depart</em>'.
	 * @generated
	 */
	Depart createDepart();

	/**
	 * Returns a new object of class '<em>Arrive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrive</em>'.
	 * @generated
	 */
	Arrive createArrive();

	/**
	 * Returns a new object of class '<em>Question Ouverte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Ouverte</em>'.
	 * @generated
	 */
	QuestionOuverte createQuestionOuverte();

	/**
	 * Returns a new object of class '<em>Question Fermee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Fermee</em>'.
	 * @generated
	 */
	QuestionFermee createQuestionFermee();

	/**
	 * Returns a new object of class '<em>Question Choix Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Choix Multiple</em>'.
	 * @generated
	 */
	QuestionChoixMultiple createQuestionChoixMultiple();

	/**
	 * Returns a new object of class '<em>Reponse Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reponse Text</em>'.
	 * @generated
	 */
	ReponseText createReponseText();

	/**
	 * Returns a new object of class '<em>Reponse Oui</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reponse Oui</em>'.
	 * @generated
	 */
	ReponseOui createReponseOui();

	/**
	 * Returns a new object of class '<em>Reponse Non</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reponse Non</em>'.
	 * @generated
	 */
	ReponseNon createReponseNon();

	/**
	 * Returns a new object of class '<em>Reponse Choix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reponse Choix</em>'.
	 * @generated
	 */
	ReponseChoix createReponseChoix();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Etape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etape</em>'.
	 * @generated
	 */
	Etape createEtape();

	/**
	 * Returns a new object of class '<em>Reponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reponse</em>'.
	 * @generated
	 */
	Reponse createReponse();

	/**
	 * Returns a new object of class '<em>Reponse Redirigable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reponse Redirigable</em>'.
	 * @generated
	 */
	ReponseRedirigable createReponseRedirigable();

	/**
	 * Returns a new object of class '<em>Element Avec Nom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Avec Nom</em>'.
	 * @generated
	 */
	ElementAvecNom createElementAvecNom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuestionnairePackage getQuestionnairePackage();

} //QuestionnaireFactory
