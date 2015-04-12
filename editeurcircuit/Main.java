/*    UQAM / Département d'informatique                           *
 *    INF5153 - Gr10  											  *
 *    Hiver 2015 / TP3                                *
 *    										                      * 
 * 	  Identifiant d'équipe: Gr07								  *
 *    Auteurs:	 												  *
 *    Maxime GAGNON (GAGM29038801)								  *
 *    Steeve SCHAWANN (SCHS25048606)							  *
 *    Jonathan MILOT (MILJ28019308)								  *
 * 	  Martin OUIMET (OUIM25097904) 								  *
 *    															  *									  
 * 																  */

package editeurcircuit;

import java.awt.EventQueue;

import vue.EditeurVue;
import vueTableVerite.FenetreTableVerite;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {				
					EditeurcircuitPackage.eINSTANCE.eClass();					
					EditeurVue window = new EditeurVue();
					window.frmEditeurDeCircuit.setVisible(true);
					FenetreTableVerite window2 = new FenetreTableVerite();
					window2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
