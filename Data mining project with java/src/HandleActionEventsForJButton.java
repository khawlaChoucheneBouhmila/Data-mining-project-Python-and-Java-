import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
public class HandleActionEventsForJButton extends JFrame implements ActionListener {
    public static final long serialVersionUID = 1L;
     public HandleActionEventsForJButton() {   	
    	setTitle("Projet Weka");
    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);// set flow layout for the frame
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
        setJMenuBar(jMenuBar1);
        JLabel l = new JLabel();
        l.setBounds(0,0,585,540);
		ImageIcon imgThisImg = new ImageIcon("D:/workspaceeclipse/projetweka/src/p.png");
		l.setIcon(imgThisImg);
		l.setBackground(new java.awt.Color(204, 204, 204));
        add(l);
}
     protected void jMenuItem3ActionPerformed(ActionEvent evt) {
    		hide();
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
    	    newsTextPane.setText("<p class="+"small-heading"+"><strong>Source:</strong></p><p class="+"normal"+">Professor Dr. Hans Hofmann&nbsp;<br />Institut f"+"ur Statistik und "+"Okonometrie&nbsp;<br />Universit"+"at Hamburg&nbsp;<br />FB Wirtschaftswissenschaften&nbsp;<br />Von-Melle-Park 5&nbsp;<br />2000 Hamburg 13&nbsp;</p><p>&nbsp;</p><p class="+"small-heading"+"><strong>Data Set Information:</strong></p><p class="+"normal"+">Two datasets are provided. the original dataset, in the form provided by Prof. Hofmann, contains categorical/symbolic attributes and is in the file "+"german.data"+".&nbsp;<br /><br />For algorithms that need numerical attributes, Strathclyde University produced the file "+"german.data-numeric"+". This file has been edited and several indicator variables added to make it suitable for algorithms which cannot cope with categorical variables. Several attributes that are ordered categorical (such as attribute 17) have been coded as integer. This was the form used by StatLog.&nbsp;<br /><br />This dataset requires use of a cost matrix (see below)&nbsp;<br /><br />..... 1 2&nbsp;<br />----------------------------&nbsp;<br />1 0 1&nbsp;<br />-----------------------&nbsp;<br />2 5 0&nbsp;<br /><br />(1 = Good, 2 = Bad)&nbsp;<br /><br />The rows represent the actual classification and the columns the predicted classification.&nbsp;<br /><br />It is worse to class a customer as good when they are bad (5), than it is to class a customer as bad when they are good (1).&nbsp;</p><p>&nbsp;</p><p class="+"small-heading"+"><strong>Attribute Information:</strong></p><p class="+"normal"+">Attribute 1: (qualitative)&nbsp;<br />Status of existing checking account&nbsp;<br />A11 : ... &lt; 0 DM&nbsp;<br />A12 : 0 &lt;= ... &lt; 200 DM&nbsp;<br />A13 : ... &gt;= 200 DM / salary assignments for at least 1 year&nbsp;<br />A14 : no checking account&nbsp;<br /><br />Attribute 2: (numerical)&nbsp;<br />Duration in month&nbsp;<br /><br />Attribute 3: (qualitative)&nbsp;<br />Credit history&nbsp;<br />A30 : no credits taken/ all credits paid back duly&nbsp;<br />A31 : all credits at this bank paid back duly&nbsp;<br />A32 : existing credits paid back duly till now&nbsp;<br />A33 : delay in paying off in the past&nbsp;<br />A34 : critical account/ other credits existing (not at this bank)&nbsp;<br /><br />Attribute 4: (qualitative)&nbsp;<br />Purpose&nbsp;<br />A40 : car (new)&nbsp;<br />A41 : car (used)&nbsp;<br />A42 : furniture/equipment&nbsp;<br />A43 : radio/television&nbsp;<br />A44 : domestic appliances&nbsp;<br />A45 : repairs&nbsp;<br />A46 : education&nbsp;<br />A47 : (vacation - does not exist?)&nbsp;<br />A48 : retraining&nbsp;<br />A49 : business&nbsp;<br />A410 : others&nbsp;<br /><br />Attribute 5: (numerical)&nbsp;<br />Credit amount&nbsp;<br /><br />Attibute 6: (qualitative)&nbsp;<br />Savings account/bonds&nbsp;<br />A61 : ... &lt; 100 DM&nbsp;<br />A62 : 100 &lt;= ... &lt; 500 DM&nbsp;<br />A63 : 500 &lt;= ... &lt; 1000 DM&nbsp;<br />A64 : .. &gt;= 1000 DM&nbsp;<br />A65 : unknown/ no savings account&nbsp;<br /><br />Attribute 7: (qualitative)&nbsp;<br />Present employment since&nbsp;<br />A71 : unemployed&nbsp;<br />A72 : ... &lt; 1 year&nbsp;<br />A73 : 1 &lt;= ... &lt; 4 years&nbsp;<br />A74 : 4 &lt;= ... &lt; 7 years&nbsp;<br />A75 : .. &gt;= 7 years&nbsp;<br /><br />Attribute 8: (numerical)&nbsp;<br />Installment rate in percentage of disposable income&nbsp;<br /><br />Attribute 9: (qualitative)&nbsp;<br />Personal status and sex&nbsp;<br />A91 : male : divorced/separated&nbsp;<br />A92 : female : divorced/separated/married&nbsp;<br />A93 : male : single&nbsp;<br />A94 : male : married/widowed&nbsp;<br />A95 : female : single&nbsp;<br /><br />Attribute 10: (qualitative)&nbsp;<br />Other debtors / guarantors&nbsp;<br />A101 : none&nbsp;<br />A102 : co-applicant&nbsp;<br />A103 : guarantor&nbsp;<br /><br />Attribute 11: (numerical)&nbsp;<br />Present residence since&nbsp;<br /><br />Attribute 12: (qualitative)&nbsp;<br />Property&nbsp;<br />A121 : real estate&nbsp;<br />A122 : if not A121 : building society savings agreement/ life insurance&nbsp;<br />A123 : if not A121/A122 : car or other, not in attribute 6&nbsp;<br />A124 : unknown / no property&nbsp;<br /><br />Attribute 13: (numerical)&nbsp;<br />Age in years&nbsp;<br /><br />Attribute 14: (qualitative)&nbsp;<br />Other installment plans&nbsp;<br />A141 : bank&nbsp;<br />A142 : stores&nbsp;<br />A143 : none&nbsp;<br /><br />Attribute 15: (qualitative)&nbsp;<br />Housing&nbsp;<br />A151 : rent&nbsp;<br />A152 : own&nbsp;<br />A153 : for free&nbsp;<br /><br />Attribute 16: (numerical)&nbsp;<br />Number of existing credits at this bank&nbsp;<br /><br />Attribute 17: (qualitative)&nbsp;<br />Job&nbsp;<br />A171 : unemployed/ unskilled - non-resident&nbsp;<br />A172 : unskilled - resident&nbsp;<br />A173 : skilled employee / official&nbsp;<br />A174 : management/ self-employed/&nbsp;<br />highly qualified employee/ officer&nbsp;<br /><br />Attribute 18: (numerical)&nbsp;<br />Number of people being liable to provide maintenance for&nbsp;<br /><br />Attribute 19: (qualitative)&nbsp;<br />Telephone&nbsp;<br />A191 : none&nbsp;<br />A192 : yes, registered under the customers name&nbsp;<br /><br />Attribute 20: (qualitative)&nbsp;<br />foreign worker&nbsp;<br />A201 : yes&nbsp;<br />A202 : no&nbsp;</p>");
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
static JFrame f = new HandleActionEventsForJButton();
public static void main(String[] args) throws Exception {
    	
  //Schedule a job for the event-dispatching thread:
 
  //creating and showing this application's GUI.
      
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
public void run() {
 
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  //Display the window.
	  f.pack();
	  
	  f.setVisible(true);
	  
}
 
  });
    }


public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
 
}
