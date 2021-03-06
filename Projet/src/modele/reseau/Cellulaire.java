package modele.reseau;

import modele.communication.Message;
import modele.gestionnaires.GestionnaireScenario;
import modele.physique.ObjetMobile;
import modele.physique.Position;

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

    public Cellulaire(String numeroLocal, Position pos, double vitesse, double deviation){
        super(vitesse, deviation, pos);
        this.numeroLocal = numeroLocal;
        connecterAntenneProche();


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

        connecterAntenneProche();

        appeler(GestionnaireScenario.obtenirNumeroStandardAlea(this.numeroLocal), this.numeroLocal, this.antenneConnecte);
//        imprimerInformations();
    }

    public void connecterAntenneProche(){
        Antenne antenneProche = copieGestionnaireReseau.getAntenneProche(this.getPosition());
        imprimerInformations();

        try {
            if ( this.antenneConnecte == null ){

                this.antenneConnecte = antenneProche.ajouterCellulaire(this);
                System.out.println("======================== PREMIERE CONNEXION==========================");

            }else if( this.antenneConnecte.equals(antenneProche) != true){
                System.out.println("========================CONNEXION==========================");
                this.antenneConnecte = antenneConnecte.retirerCellulaire(this);
                this.antenneConnecte = antenneProche.ajouterCellulaire(this);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean comparerNumero( String numero ){
        if (this.numeroLocal == numero ){
            return true;
        }
        return false;
    }

    @Override
    public int appeler(String numAppele, String numAppelant, Antenne antenneConnectee) {
        int numeroConn = this.antenneConnecte.appeler(numAppele, this.numeroLocal, this.antenneConnecte);
        this.numeroConnexion = numeroConn;
        return 0;
    }

    @Override
    public Cellulaire repondre(String numAppele, String numAppelant, int numConnexion) {

        if (this.numeroConnexion == NON_CONNECTE){
            this.numeroConnecte = numAppelant;
            this.numeroConnexion = numConnexion;
            return this;
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

    public void imprimerInformations(){
        System.out.println("(" + (int)super.position.getX() + "," + (int)super.position.getY() + ") NumeroConnexion: " + this.numeroConnexion );

    }

    public String toString(){
        return "(" + super.position.getX() + "," + super.position.getY() + ") " + this.numeroLocal;

    }
}
