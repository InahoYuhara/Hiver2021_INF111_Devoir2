package test;

import javafx.scene.control.Cell;
import modele.gestionnaires.GestionnaireScenario;
import modele.physique.Carte;
import modele.physique.Position;
import modele.reseau.Cellulaire;
import modele.reseau.GestionnaireReseau;
import tda.Liste;

public class ProgrammeTest {

    private static GestionnaireReseau gestionnaireReseau = GestionnaireReseau.getInstance();


    public static void main(String[] args) throws Exception {

       // routineTest_ObjetMobile();
        routineTest_Array();

    }

    public static void routineTest_Array() throws Exception{
        Liste list = new Liste();
        Carte carte = new Carte();
        for (int i = 0; i < 11; i++){
            list.ajouter(0, new Cellulaire(GestionnaireScenario.obtenirNouveauNumeroStandard(), carte.genererPositionAleatoire(),2,1.2));
        }
    }

    public void routineTest_Carte(){

    }

    public static void routineTest_ObjetMobile(){
        Carte carte = new Carte();
        Position mauvaisePositions = new Position(1999, -10);
//        TestObjetMobile testObj = new TestObjetMobile( 2, 1.2, carte.genererPositionAleatoire() );
        TestObjetMobile testObj = new TestObjetMobile( 2, 1.2, mauvaisePositions );

        System.out.println("-------------------------------");
        for (int i = 0; i < 20; i++){
            System.out.println(testObj.getPosition());
            testObj.seDeplacer();
        }
        System.out.println("-------------------------------");


    }
}
