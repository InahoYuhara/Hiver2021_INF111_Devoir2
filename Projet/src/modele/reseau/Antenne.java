package modele.reseau;

import modele.communication.Message;
import modele.physique.ObjetPhysique;
import modele.physique.Position;

public class Antenne extends ObjetPhysique implements UniteCellulaire {

    private GestionnaireReseau copieGestionnaireReseau;

    public Antenne( Position position ){
        this.position = position;
    }

    public double distance(Position pos1, Position pos2){
        return this.position.calculerDistance(pos1, pos2);
    }

    @Override
    public int appeler(String numAppele, String numAppelant, Antenne antenneConnectee) {
        return 0;
    }

    @Override
    public Cellulaire repondre(String numAppele, String numAppelant, int numConnexion) {
        return null;
    }

    @Override
    public void finAppelLocal(String numAppele, int numConnexion) {

    }

    @Override
    public void finAppelDistant(String numAppele, int numConnexion) {

    }

    @Override
    public void envoyer(Message message, int numConnexion) {

    }

    @Override
    public void recevoir(Message message) {

    }

    public String toString(){
        return "(" + this.position.getX() + "," + this.position.getY() + ")";
    }
}
