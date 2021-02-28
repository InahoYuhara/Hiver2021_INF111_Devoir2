package modele.reseau;

public interface UniteCellulaire {

    public int appeler( String numAppele, String numAppelant, Antenne antenneConnectee ){

    }


    public Cellulaire repondre( String numAppele, String numAppelant, int numConnexion ){

    }

    public void finAppelLocal( String numAppele, int numConnexion ){

    }

    public void finAppelDistant( String numAppele, int numConnexion ){

    }

    public void envoyer( Message message, int numConnexion ){

    }

    public void recevoir( Message message ){

    }
}
