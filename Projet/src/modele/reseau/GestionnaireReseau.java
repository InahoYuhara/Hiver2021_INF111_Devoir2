package modele.reseau;

/**
 * Le gestionnaire r�seau est responsable de g�rer les connexions cellulaires et de relayer
 * les appels, messages et fin d'appel.
 * 
 * Dans le cadre de la simulation, c'est �galement le gestionnaire r�seau qui instancie Antennes et
 * cellulaire et qui g�re l'ex�cution par tour des cellulaires.
 * 
 * Le gestionnaire r�seau est un singleton
 * 
 * @author Fred Simard
 * @version Hiver 2021
 */

import modele.physique.Carte;
import modele.gestionnaires.GestionnaireScenario;
import modele.physique.Carte;
import observer.MonObservable;
import tda.FileSChainee;
import tda.Liste;

import java.util.ArrayList;
import java.util.Random;

public class GestionnaireReseau extends MonObservable implements Runnable {

	public final int PERIODE_SIMULATION = 100;
	public final double VITESSE = 10;
	public final double DEVIATION_STANDARD = 0.05;
	public final int NB_CELLULAIRES = 30;
	public final int NB_CRIMINELS = 0;
	public final int NB_ANTENNES = 10;
	public final int CODE_NON_CONNECTE = -1;

	private boolean mondeEnVie = true;
	private static GestionnaireReseau instance = new GestionnaireReseau();
	private static Carte carte = new Carte();
//	private static GestionnaireScenario gestionnaireScenario = new GestionnaireScenario();

	Random rand = new Random();
	Liste listeConnexions;
	ArrayList colAntennes;
	ArrayList colCellulaires;

	public GestionnaireReseau(){
		colAntennes = new ArrayList();
		colCellulaires = new ArrayList();
	}

	/**
	 * m�thode permettant d'obtenir une r�f�rence sur le Gestionnaire R�seau
	 * @return instance
	 */
	public static GestionnaireReseau getInstance() {
		return instance;
	}

	/**
	 * permet de mettre fin � la simulation
	 * @param mondeEnVie
	 */
	public void finDeSimulation() {
		this.mondeEnVie = false;
	}


	/**
	 * s'ex�cute en continue pour simuler le syst�me
	 */
	@Override
	public void run() {
		
		/*
		creeAntennes();
		creeCellulaires();
		this.avertirLesObservers();

		while(this.mondeEnVie) {	
			
			for(Cellulaire cell : cellulaires) {
				cell.effectuerTour();
			}
			
			this.avertirLesObservers();
			
			
			try {
				Thread.sleep(PERIODE_SIMULATION_MS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}

	private void creeAntennes(){
		for (int i = 0; i < NB_ANTENNES; i++){
			colAntennes.add(new Antenne(carte.genererPositionAleatoire()));
		}
	}

	private void creeCellulaires(){
		for (int i = 0; i < NB_CELLULAIRES; i++){
			colAntennes.add( new Cellulaire( GestionnaireScenario.obtenirNouveauNumeroStandard(), carte.genererPositionAleatoire(), 1, 1) );
		}
	}
	
}
