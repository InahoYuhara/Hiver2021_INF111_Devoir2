package test;

import modele.physique.ObjetMobile;
import modele.physique.Position;

public class TestObjetMobile extends ObjetMobile {

    public TestObjetMobile(int vitesse, double deviation, Position position){
        super(vitesse, deviation, position);
//        this.position = position;
    }

    public void deplacer(){
        this.seDeplacer();
    }

    public void afficherPosition(){
        System.out.println( "(" + this.position.getX() + "," + this.position.getY() + ")" );
    }

}
