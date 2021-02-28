package modele.physique;

import java.util.Random;

public class Carte {

    final Position dimensionCarte = new Position(1920, 1080);
    Random rand = new Random();

    public Position genererPositionAleatoire(){
        return new Position( getRandomInRange(0, this.dimensionCarte.getX()), getRandomInRange(0, this.dimensionCarte.getY()) );
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

    private double getRandomInRange(double min, double max){
        double randNumber = rand.nextDouble();
        double result = (randNumber*(max-min))+min;
        return result;
    }
}
