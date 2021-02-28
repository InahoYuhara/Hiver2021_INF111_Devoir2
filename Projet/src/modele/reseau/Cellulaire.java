package modele.reseau;

import modele.physique.ObjetMobile;

import java.util.Random;

public class Cellulaire extends ObjetMobile implements UniteCellulaire {

    final int NON_CONNECTE = -1;
    final double PROB_APPELER = 0.05;
    final double PROB_ENVOI_MSG = 0.2;
    final double PROB_DECONNEXION = 0.1;

    private String numeroLocal;
    private int numeroConnexion = NON_CONNECTE;
    private String numeroConnecte = null;
    private Antenne antenneConnecte;
    private Random rand = new Random();
    private GestionnaireReseau copieGestionnaireReseau;

    public Cellulaire(String numeroLocal, Position pos, int vitesse, double deviation){

        this.numeroLocal = numeroLocal;
        this.position = pos;
        this.vitesse = vitesse;
        this.deviation = deviation;

    }

    public String getNumeroLocal(){
        return this.numeroLocal;
    }

    public int getNumeroConnexion(){
        return this.numeroConnexion;
    }

    public boolean verifieConnexion(){
        if (this.numeroConnexion == null){
            return true;
        }

        return false;
    }

    public boolean comparerNumero( String numero ){
        if (this.numeroLocal == numero ){
            return true;
        }
        return false;
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
        return "(" + this.x + "," + this.y + ") " + this.numeroLocal;
    }
}
