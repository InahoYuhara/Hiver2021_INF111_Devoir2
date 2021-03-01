package tda;

import javafx.scene.control.Cell;
import modele.reseau.Cellulaire;

public class Liste {

    public final int TAILLE_INITIALE = 10;
    private Cellulaire liste[];
    int nombreElement = 0;

    public Liste(){
        liste = new Cellulaire[TAILLE_INITIALE];
    }

    public void ajouter(int index, Cellulaire element) throws Exception{

        if ( index < 0 || index > liste.length ){
            throw new Exception("[Liste Ajouter] Index invalide " + index);
        }

        ajusterTailleListe();
        nombreElement++;
        decalerHaut(index);
        liste[index] = element;

    }

    public Cellulaire retirer(Cellulaire cellulaire) throws Exception {

//        try{
//            for (int i = 0; i < nombreElement; i++){
//                if (liste[i].equals(cellulaire)){
//                    return retirer(i);
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        for (int i = 0; i < nombreElement; i++){
            if (liste[i].equals(cellulaire)){
                return retirer(i);
            }
        }

        return null;
    }

    private Cellulaire retirer(int index) throws Exception{

        if ( index < 0 || index > liste.length ){
            throw new Exception("[Liste Retirer] Index invalide " + index);
        }

        Cellulaire retour = liste[index];
        decalerBas(index);
        nombreElement--;
        return retour;

    }

    public void decalerBas(int index){

        for (int i =  index; i < nombreElement; i++ ){
            liste[i] = liste[i+1];
        }

    }

    public void decalerHaut(int index){

        for (int i = nombreElement-1; i >= index; i-- ){
            liste[i+1] = liste[i];
        }

    }

    public void ajusterTailleListe(){

        if (nombreElement == liste.length){
            Cellulaire nouvelleListe[] = new Cellulaire[liste.length*2];
            System.arraycopy(liste, 0, nouvelleListe, 0, nombreElement);
            liste = nouvelleListe;
        }
    }

    public void sort(){

    }
}
