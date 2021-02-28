package modele.physique;

public abstract class ObjetPhysique  {

    protected Position position;

    public ObjetPhysique(){

    }

    public ObjetPhysique(Position pos){
        this.position = new Position( pos.getX(), pos.getY() );
    }

    public Position getPosition(){
        return this.position;
    }
}
