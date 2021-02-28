package test;

import modele.physique.Carte;
import modele.physique.Position;

public class ProgrammeTest {
    public static void main(String[] args) {

        routineTest_ObjetMobile();

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
