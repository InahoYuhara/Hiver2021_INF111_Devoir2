package tda;

public class FileSChainee<E> {

    public class Noeud{
        private Noeud suivant;
        private E objet;

        private Noeud(Noeud suivant, E objet){
            this.suivant = suivant;
            this.objet = objet;
        }
    }

    Noeud head;
    Noeud courant;

    public FileSChainee(){

    }

    public void enfiler(E obj){

        if (head == null){
            head = new Noeud(null, obj);
        }else{
            courant = head;
            while(courant.suivant != null){
                courant = courant.suivant;
            }
            courant.suivant = new Noeud(null, obj);
        }

    }

    public E defiler() throws Exception{

        if (head == null){
            throw new Exception("[FileSChainee] La file est vide");
        }
        E retour = head.objet;
        head = head.suivant;

        return retour;

    }
}
