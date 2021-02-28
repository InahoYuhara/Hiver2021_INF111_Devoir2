package modele.reseau;

import modele.communication.Message;
import modele.physique.ObjetMobile;
import modele.physique.Position;
import sun.net.www.http.PosterOutputStream;

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
    private static GestionnaireReseau copieGestionnaireReseau = GestionnaireReseau.getInstance();
    private Position position;

    public Cellulaire(String numeroLocal, Position pos, int vitesse, double deviation){
        super(vitesse, deviation, pos);
        this.numeroLocal = numeroLocal;

    }

    public String getNumeroLocal(){
        return this.numeroLocal;
    }

    public int getNumeroConnexion(){
        return this.numeroConnexion;
    }

    public boolean estConnecte(){
        if (this.numeroConnexion == NON_CONNECTE){
            return false;
        }
        return true;
    }

    public void effectuerTour(){

        this.seDeplacer();
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
//        return "(" + this.position.getX() + "," + this.position.getY() + ") " + this.numeroLocal;
        return "";
    }
}
