package modele.physique;

import java.util.Random;

public class Carte {
    final Position dimensionCarte = new Position(1920, 1080);
    Random rand = new Random();

    public Position genererPositionAleatoire(){

        return new Position( rand.nextDouble(this.dimensionCarte.getX()),
                            rand.nextDouble(this.dimensionCarte.getY()));
    }

    public void ajusterPosition( Position p ){
        if ( p.getX() < 0 ){
            p.setX(dimensionCarte.getX());

        }else if ( p.getX() > dimensionCarte.getX() ){
            p.setX(0);

        }else if ( p.getY() < 0 ){
            p.setY(dimensionCarte.getY());

        }else if (p.getY() > dimensionCarte.getY() ){
            p.setY(0);
        }
    }
}
