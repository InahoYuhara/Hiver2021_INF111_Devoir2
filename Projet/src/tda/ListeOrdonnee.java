package tda;

import modele.communication.Connexion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListeOrdonnee {

    ArrayList<Connexion> connexions;

    public static Comparator<Connexion> comparateurConnexion = new Comparator<Connexion>() {
        @Override
        public int compare(Connexion o1, Connexion o2) {
            if (o1.getNumeroConnexion() > o2.getNumeroConnexion()){
                return 1;
            }else{
                return -1;
            }
        }
    };

    public ListeOrdonnee(){
        connexions = new ArrayList<>();
    }

    public void ajouter(Connexion connexion){
        connexions.add(connexion);
        Collections.sort(connexions, comparateurConnexion);

    }

    public void retirer(Connexion connexion){
        connexions.remove(connexion);
    }

    public void retirerIndex(int index){
        connexions.remove(index);
    }

    public Connexion trouverConnexionDansListe(int numeroConnexion){
        int first = 0; //premier indice de la liste
        int last = connexions.size(); //dernier indice de la liste
        int middle = 0; //indice de l'element au milieu

        //on compare l'indice du milieu a notre valeur, si plus petit on poursuit la recherche a droite,
        //si plus grand on regarde a gauche dans notre liste
        while(connexions.get(middle).getNumeroConnexion() != numeroConnexion && first<=last) {
            //permet d'ajuster le milieu a chaque iteration de boucle
            middle = (first + last) / 2;

            if (numeroConnexion < connexions.get(middle).getNumeroConnexion()) {
                last = middle - 1;
            } else if (numeroConnexion > connexions.get(middle).getNumeroConnexion()) {
                first = middle + 1;
            } else {
                return connexions.get(middle);
            }
        }
        return null;
    }

    public void ImprimerNoConnection(){
        for (Connexion conn: connexions) {
            System.out.println(conn.getNumeroConnexion());
        }
    }

}
