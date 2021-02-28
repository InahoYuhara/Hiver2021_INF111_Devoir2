package modele.physique;

public abstract class ObjetPhysique  {

    protected Position position;

    public ObjetPhysique(){

    }

    public ObjetPhysique(Position pos){
        this.position.setY(pos.getY());
        this.position.setX(pos.getX());
    }

    public Position getPosition(){
        return this.position;
    }
}
