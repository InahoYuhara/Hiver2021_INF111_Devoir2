package modele.physique;

import javafx.geometry.Pos;

import java.util.Random;

public abstract class ObjetMobile extends ObjetPhysique {

    protected double direction = 0;
    protected int vitesse;
    protected double deviation;

    public ObjetMobile(){}

    public ObjetMobile(int vitesse, double deviation, Position position){
        super(position);
        this.vitesse = vitesse;
        this.deviation = deviation;

    }

    public void seDeplacer(){
        Random rand = new Random();
        Carte carte = new Carte();
        double posX = this.position.getX();
        double posY = this.position.getY();

        this.direction = rand.nextGaussian() * this.deviation;
        posX = posX + ( this.vitesse * Math.cos(this.direction) );
        posY = posY + ( this.vitesse * Math.sin(this.direction) );
        this.position.setX(posX);
        this.position.setY(posY);
        carte.ajusterPosition(this.position);


    }

}
