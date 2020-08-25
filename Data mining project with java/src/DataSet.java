
import java.io.FileReader;
import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.lazy.KStar;
import weka.core.Instance;
import weka.core.Instances;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataSet extends JFrame implements ActionListener {
	public static final long serialVersionUID = 1L;
	
public DataSet() throws Exception {   	

    JFrame frame = new JFrame();
    frame.setLayout(null);
    setTitle("DataSet");
    JMenuBar jMenuBar1 = new JMenuBar();
    JMenu jMenu1 = new javax.swing.JMenu();
    JMenu jMenu3 = new javax.swing.JMenu();
    JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
    JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
    JMenuItem jMenuItem3 = new javax.swing.JMenuItem();
    JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
    jMenu1.setText("A propos");
    jMenu1.addActionListener(new java.awt.event.ActionListener() {
    	   public void actionPerformed(java.awt.event.ActionEvent e) {
    		      System.exit(0);
    		   }});
    jMenuItem3.setText("Projet");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
        }});
    jMenu1.add(jMenuItem3);
    jMenuItem4.setText("DataSet");
    jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem4ActionPerformed(evt);
        }});
    jMenu1.add(jMenuItem4);
    jMenuBar1.add(jMenu1);
    jMenu3.setText("Apprentissage");
    jMenuItem1.setText("KStar");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }});
    jMenu3.add(jMenuItem1);
    jMenuItem2.setText("IBk");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem2ActionPerformed(evt);}
    });
    jMenu3.add(jMenuItem2);
    jMenuBar1.add(jMenu3);
    frame.setJMenuBar(jMenuBar1);
    JPanel panneau = new JPanel();
    panneau.setLayout(null);
    panneau.setBounds(0,0, 580, 585);
    JTextPane newsTextPane = new JTextPane();
    newsTextPane.setContentType("text/html");
    newsTextPane.setEditable(false);
    newsTextPane.setText("<html>Les banques analysent une myriade de critères avant d'accorder un crédit. Celles-ci vont de l'âge, du montant et de l'objet du crédit, de la profession, du statut d'emploi et bien d'autres choses encore. Ils utilisent également des algorithmes sophistiqués de régression et d'apprentissage automatique logistique pour prédire si le demandeur de crédit est crédible ou non."+"<br> L'"+"objectif de ce projet est de produire une application interactive brillante dont l'utilisation est double : <br>Tout d'abord par les directeurs de banque pour obtenir un aperçu visuel préliminaire de la solvabilité d'un demandeur de crédit lors de l'analyse d'une demande de crédit. Étant donné que leurs modèles prédictifs exigent beaucoup de ressources et qu'ils peuvent durer longtemps, cette visualisation préliminaire peut être utile pour éliminer les demandes carrément insatisfaisantes avant d'exécuter les modèles sur le reste.<br>Deuxièmement, par les demandeurs de crédit pour estimer leur solvabilité avant de faire officiellement une demande à leurs banques. Cela les aidera à adapter leur demande de crédit en conséquence ou à la reporter jusqu'à ce qu'ils obtiennent une cote de crédibilité favorable.<br>L'ensemble de données utilisé pour ce projet a été obtenu à partir du référentiel UCI ML (ensemble de données GCD). Cet ensemble de données a été donné au public par le professeur Hans Hofmann de l'Université de Hambourg en 1994. Obtenir des données de crédit à jour est apparemment impossible, car cette information est très précieuse pour toute banque et la rendre publique donnera un avantage commercial.</html>");
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(newsTextPane);
    scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setBounds(0, 0, 582, 539);
    panneau.add(scrollPane);
    frame.add(panneau);
    frame.setSize(600, 600);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    
}


protected void jMenuItem4ActionPerformed(ActionEvent evt) {
	hide();
	
}


protected void jMenuItem3ActionPerformed(ActionEvent evt) {
	hide();
	JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextPane newsTextPane = new JTextPane();
    newsTextPane.setContentType("text/html");
    newsTextPane.setEditable(false);
    newsTextPane.setText("Les banques analysent une myriade de critères avant d'accorder un crédit. Celles-ci vont de l'âge, du montant et de l'objet du crédit, de la profession, du statut d'emploi et bien d'autres choses encore. Ils utilisent également des algorithmes sophistiqués de régression et d'apprentissage automatique logistique pour prédire si le demandeur de crédit est crédible ou non.L'"+"objectif de ce projet est de produire une application interactive brillante dont l'utilisation est double :Tout d'abord par les directeurs de banque pour obtenir un aperçu visuel préliminaire de la solvabilité d'un demandeur de crédit lors de l'analyse d'une demande de crédit. Étant donné que leurs modèles prédictifs exigent beaucoup de ressources et qu'ils peuvent durer longtemps, cette visualisation préliminaire peut être utile pour éliminer les demandes carrément insatisfaisantes avant d'exécuter les modèles sur le reste.Deuxièmement, par les demandeurs de crédit pour estimer leur solvabilité avant de faire officiellement une demande à leurs banques. Cela les aidera à adapter leur demande de crédit en conséquence ou à la reporter jusqu'à ce qu'ils obtiennent une cote de crédibilité favorable.L'ensemble de données utilisé pour ce projet a été obtenu à partir du référentiel UCI ML (ensemble de données GCD). Cet ensemble de données a été donné au public par le professeur Hans Hofmann de l'Université de Hambourg en 1994. Obtenir des données de crédit à jour est apparemment impossible, car cette information est très précieuse pour toute banque et la rendre publique donnera un avantage commercial.");
    JScrollPane scrollPane = new JScrollPane(newsTextPane);
    scrollPane.setVerticalScrollBarPolicy(
              javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    frame.add(scrollPane);
    frame.setSize(600, 600);
    frame.setVisible(true);
	
}


public void jMenu1ActionPerformed(ActionEvent evt) {
	
	hide();
	System.out.println("************KStar*******************");
	try {
		        	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}



protected void jMenuItem1ActionPerformed(ActionEvent evt) {
	hide();
	System.out.println("************KStar*******************");
	try {
		ClassKStar k=new ClassKStar();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


protected void jMenuItem2ActionPerformed(ActionEvent evt) {
	hide();
	System.out.println("**********IBK*************");
    try {
		ClassIBk h=new ClassIBk();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void main(String[] args) throws Exception {
	
	  //Schedule a job for the event-dispatching thread:
	 
	  //creating and showing this application's GUI.
	      
	  javax.swing.SwingUtilities.invokeLater(new Runnable() {
	 
	public void run() {
		DataSet f;
		try {
			f = new DataSet();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  //Display the window.
			  f.pack();
			  
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	}
	 
	  });
	    }


public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}