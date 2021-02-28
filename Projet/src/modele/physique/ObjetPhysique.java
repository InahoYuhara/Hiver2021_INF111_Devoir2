package modele.physique;

public abstract class ObjetPhysique  {

    protected Position position;

    ObjetPhysique(Position pos){
        this.position.setY(pos.getY());
        this.position.setX(pos.getX());
    }

    public void getPosition(){

    }
}
