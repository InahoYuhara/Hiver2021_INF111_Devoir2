package modele.communication;

import modele.reseau.Antenne;

public class Connexion {

    public final int NB_ANTENNES = 2;
    int numeroConnexion;
    Antenne tableauAntenne[];

    public Connexion(int numeroConnexion, Antenne antenne1, Antenne antenne2){
        this.numeroConnexion = numeroConnexion;
        tableauAntenne = new Antenne[2];
        tableauAntenne[0] = antenne1;
        tableauAntenne[1] = antenne2;
    }

    public int getNumeroConnexion(){
        return this.numeroConnexion;
    }

    public Antenne getAntenne1(){
        return tableauAntenne[0];
    }

    public Antenne getAntenne2(){
        return tableauAntenne[1];
    }

    public Antenne[] getTableauAntenne(){
        return tableauAntenne;
    }

    public boolean equals(int numeroConnexion){
        if (this.numeroConnexion == numeroConnexion){
            return true;
        }
        return false;
    }




}
