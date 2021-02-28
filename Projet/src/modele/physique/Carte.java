package modele.physique;

import java.util.Random;

public class Carte {

    final Position DIMENSION_CARTE = new Position(1920, 1080);
    Random rand = new Random();

    public Position genererPositionAleatoire(){
        return new Position( getRandomInRange(0, this.DIMENSION_CARTE.getX()), getRandomInRange(0, this.DIMENSION_CARTE.getY()) );
    }

    public void ajusterPosition( Position p ){
        if ( p.getX() < 0 ){
            p.setX(DIMENSION_CARTE.getX());

        }else if ( p.getX() > DIMENSION_CARTE.getX() ){
            p.setX(0);

        }else if ( p.getY() < 0 ){
            p.setY(DIMENSION_CARTE.getY());

        }else if (p.getY() > DIMENSION_CARTE.getY() ){
            p.setY(0);
        }
    }

    private double getRandomInRange(double min, double max){
        double randNumber = rand.nextDouble();
        double result = (randNumber*(max-min))+min;
        return result;
    }
}
