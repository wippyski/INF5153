/*    UQAM / D�partement d'informatique                           *
 *    INF5153 - Gr10  											  *
 *    Hiver 2015 / TP3                                *
 *    										                      * 
 * 	  Identifiant d'�quipe: Gr07								  *
 *    Auteurs:	 												  *
 *    Maxime GAGNON (GAGM29038801)								  *
 *    Steeve SCHAWANN (SCHS25048606)							  *
 *    Jonathan MILOT (MILJ28019308)								  *
 * 	  Martin OUIMET (OUIM25097904) 								  *
 *    															  *									  
 * 																  */

package editeurcircuit;

import java.awt.EventQueue;

import editeurcircuit.impl.TableVeriteImpl;
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
					FenetreTableVerite affichage = FenetreTableVerite.getInstance();
					TableVeriteImpl tableVerite = TableVeriteImpl.getInstance(); 						
					tableVerite.attacher(affichage); //l'affichage de la table de v�rit� sera avertie des changements � la table					
					affichage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
