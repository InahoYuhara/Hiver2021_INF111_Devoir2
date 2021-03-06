package modele.reseau;

import modele.communication.Message;
import modele.physique.ObjetPhysique;
import modele.physique.Position;
import tda.Liste;

public class Antenne extends ObjetPhysique implements UniteCellulaire {

    private static GestionnaireReseau copieGestionnaireReseau = GestionnaireReseau.getInstance();
    private Liste cellulaires;

    public Antenne( Position position ){
        super(position);
        cellulaires = new Liste();
    }

    public double distance(Position pos1, Position pos2){
        return this.position.calculerDistance(pos1, pos2);
    }

    public Antenne ajouterCellulaire(Cellulaire cellulaire) throws Exception {
        this.cellulaires.ajouter(0, cellulaire );
        return this;
    }

    public Antenne retirerCellulaire(Cellulaire cellulaire) throws Exception{

        this.cellulaires.retirer(cellulaire);

        return null; //pour remplir la variable d'antenne connectee.
    }

    @Override
    public int appeler(String numAppele, String numAppelant, Antenne antenneConnectee) {
        int numeroConnexion = copieGestionnaireReseau.relayerAppel(numAppele, numAppelant, antenneConnectee);
        return numeroConnexion;
    }

    @Override
    public Cellulaire repondre(String numAppele, String numAppelant, int numConnexion) {

        int nombreElement = this.cellulaires.getNombreElement();
//        System.out.println("==== Antenne: " + this + " ====");
        for (int i = 0; i < nombreElement; i++){
            try {
               Cellulaire cellulaire = cellulaires.getElement(i);
               if (cellulaire.getNumeroLocal() == numAppele){
                   return cellulaire.repondre(numAppele, numAppelant, numConnexion);
               }

            }catch (Exception e){
                System.out.println("[loop cellulaires] Erreur");
            }
        }

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
