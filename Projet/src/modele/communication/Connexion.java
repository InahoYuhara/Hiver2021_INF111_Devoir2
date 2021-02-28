package modele.communication;

import modele.reseau.Antenne;

public class Connexion {

    public final int NB_ANTENNES = 2;
    int numeroConnexion;
    Antenne tableauAntenne[];

    public Connexion(int numeroConnexion, Antenne antenne1, Antenne antenne2){

    }

    public int getNumeroConnexion(){
        return this.numeroConnexion;
    }

    public boolean equals(int numeroConnexion){
        if (this.numeroConnexion == numeroConnexion){
            return true;
        }
        return false;
    }




}
