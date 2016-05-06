package client;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * @author amri abdelouhab
 *
 */
public class STB extends JFrame {
	 
public static final long serialVersionUID = 1L;
                  
		//titre, version, date, description,
		// client:entite-contact-code_postale,
		// equipe:nom-version,
		// Fonctionalité:description-priorrite-exigencefonctionel:identifiant-description-priorite
		// commentaire

    private javax.swing.JLabel Ldescription;
    private javax.swing.JLabel Ldate;
    private javax.swing.JLabel Lexigence_fonctionel;
    private javax.swing.JLabel Lcommentaire;
    private javax.swing.JLabel Lclient;
    private javax.swing.JLabel Lequipe;
    private javax.swing.JLabel Lfonctionalite;
    private javax.swing.JLabel Ltitre;
    private javax.swing.JLabel Lversion;
    private javax.swing.JTextField Tdescription;
    private javax.swing.JTextField Tdate;
    private javax.swing.JTable Texigence_fonctionel;
    private javax.swing.JTextField Tcommentaire;
    private javax.swing.JTable Tclient;
    private javax.swing.JTable Tequipe;
    private javax.swing.JTable Tfonctionalite;
    private javax.swing.JTextField Ttitre;
    private javax.swing.JTextField Tversion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    
    
    public STB() {
        initComponents();
        try {

   			HttpClient httpClient = HttpClientBuilder.create().build();

   			HttpGet getRequest = new HttpGet("http://amriabdelkatia-abdelouhab.rhcloud.com/projetWEB/resume/"+HomeSTB.idd);
   			//HttpGet getRequest = new HttpGet("http://localhost:8080/PROJETWEB/resume/"+HomeSTB.idd);
   			getRequest.addHeader("accept", "application/xml");

   			HttpResponse response = httpClient.execute(getRequest);

   			if (response.getStatusLine().getStatusCode() != 200) {
   				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
   			}

   			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

   		      try {
   
   		         DocumentBuilder builder = factory.newDocumentBuilder();

   		         InputSource input = new InputSource((response.getEntity().getContent()));
   		         Document doc = builder.parse(input);

   		     	NodeList nList = doc.getElementsByTagName("stb");

   		     	for (int temp = 0; temp < nList.getLength(); temp++) {
   		      
   		     		Node nNode = nList.item(temp);

   		     		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
   		      
   		     			Element eElement = (Element) nNode;
   		     		
   		     	
   		     		getTtitre().setText(eElement.getElementsByTagName("titre").item(temp).getTextContent());
   		     		getTversion().setText(eElement.getElementsByTagName("version").item(temp).getTextContent());
   		     		getTdate().setText(eElement.getElementsByTagName("date").item(temp).getTextContent());
   		     		getTdescription().setText(eElement.getElementsByTagName("description").item(temp).getTextContent());
   		     		getTcommentaire().setText(eElement.getElementsByTagName("commentaire").item(temp).getTextContent());
   		     	
   		     for(int i = 0; i < eElement.getElementsByTagName("client").getLength(); i++){ 		    
   		    	Object[] row ={eElement.getElementsByTagName("client").item(i).getChildNodes().item(0).getTextContent(),
   		    			eElement.getElementsByTagName("client").item(i).getChildNodes().item(2).getTextContent(), 
   		    			eElement.getElementsByTagName("client").item(i).getChildNodes().item(1).getTextContent()};
   	         DefaultTableModel tb =(DefaultTableModel) Tclient.getModel();
   	         tb.addRow(row);
   		     }
   		     
   		  for(int j = 0; j < eElement.getElementsByTagName("equipe").getLength(); j++){ 		    
 		    	Object[] row ={
 		    			eElement.getElementsByTagName("equipe").item(j).getChildNodes().item(1).getTextContent(), 
 		    			eElement.getElementsByTagName("equipe").item(j).getChildNodes().item(0).getTextContent()};
 	         DefaultTableModel tb =(DefaultTableModel) Tequipe.getModel();
 	         tb.addRow(row);
 		     }
   		  
   	// Fonctionalité:description-priorite-exigencefonctionel:identifiant-description-priorite
   		  
   		for(int k = 0; k < eElement.getElementsByTagName("fonctionalite").getLength(); k++){ 		    
		    	Object[] row ={
		    			eElement.getElementsByTagName("fonctionalite").item(k).getChildNodes().item(2).getTextContent(),
		    			eElement.getElementsByTagName("fonctionalite").item(k).getChildNodes().item(1).getTextContent(),
		    			eElement.getElementsByTagName("fonctionalite").item(k).getChildNodes().item(0).getTextContent()};
	         DefaultTableModel tb =(DefaultTableModel) Tfonctionalite.getModel();
	         tb.addRow(row);
		     }
   		for(int m = 0; m < eElement.getElementsByTagName("exigence_fonctionel").getLength(); m++){ 		    
	    	Object[] row ={eElement.getElementsByTagName("exigence_fonctionel").item(m).getChildNodes().item(2).getTextContent(),
	    			eElement.getElementsByTagName("exigence_fonctionel").item(m).getChildNodes().item(1).getTextContent(),
	    			eElement.getElementsByTagName("exigence_fonctionel").item(m).getChildNodes().item(0).getTextContent()};
         DefaultTableModel tb =(DefaultTableModel) Texigence_fonctionel.getModel();
         tb.addRow(row);
	     }
	     		}
		
   		      
   		     		}
   		     	
   		         
   		      
   		      } catch (Exception ex) {
   		         ex.printStackTrace();
   		      }
    
   		} catch (ClientProtocolException e) {
   			e.printStackTrace();
    
   		} catch (IOException e) {
   			e.printStackTrace();
   		}
        
        // set
        Tdescription.setEditable(false);
        Tdate.setEditable(false);
        Tcommentaire.setEditable(false);
        Ttitre.setEditable(false);
        Tversion.setEditable(false);
        
       }
    

    public javax.swing.JTextField getTdescription() {
	return Tdescription;
}


public void setTdescription(javax.swing.JTextField tdescription) {
	Tdescription = tdescription;
}


public javax.swing.JTextField getTdate() {
	return Tdate;
}


public void setTdate(javax.swing.JTextField tdate) {
	Tdate = tdate;
}


public javax.swing.JTable getTexigence_fonctionel() {
	return Texigence_fonctionel;
}


public void setTexigence_fonctionel(javax.swing.JTable texigence_fonctionel) {
	Texigence_fonctionel = texigence_fonctionel;
}


public javax.swing.JTextField getTcommentaire() {
	return Tcommentaire;
}


public void setTcommentaire(javax.swing.JTextField tcommentaire) {
	Tcommentaire = tcommentaire;
}


public javax.swing.JTable getTclient() {
	return Tclient;
}


public void setTclient(javax.swing.JTable tclient) {
	Tclient = tclient;
}


public javax.swing.JTable getTequipe() {
	return Tequipe;
}


public void setTequipe(javax.swing.JTable tequipe) {
	Tequipe = tequipe;
}


public javax.swing.JTable getTfonctionalite() {
	return Tfonctionalite;
}


public void setTfonctionalite(javax.swing.JTable tfonctionalite) {
	Tfonctionalite = tfonctionalite;
}


public javax.swing.JTextField getTtitre() {
	return Ttitre;
}


public void setTtitre(javax.swing.JTextField ttitre) {
	Ttitre = ttitre;
}


public javax.swing.JTextField getTversion() {
	return Tversion;
}


public void setTversion(javax.swing.JTextField tversion) {
	Tversion = tversion;
}


	

@SuppressWarnings("serial")
private void initComponents() {

         Ltitre = new javax.swing.JLabel();
        Lversion = new javax.swing.JLabel();
        Ldate = new javax.swing.JLabel();
        Ldescription = new javax.swing.JLabel();
        Lcommentaire = new javax.swing.JLabel();
        Ttitre = new javax.swing.JTextField();
        Tversion = new javax.swing.JTextField();
        Tdate = new javax.swing.JTextField();
        Tdescription = new javax.swing.JTextField();
        Tcommentaire = new javax.swing.JTextField();
        Lclient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tclient = new javax.swing.JTable();
        Lequipe = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tequipe = new javax.swing.JTable();
        Lfonctionalite = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tfonctionalite = new javax.swing.JTable();
        Lexigence_fonctionel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Texigence_fonctionel = new javax.swing.JTable();

        

        Ltitre.setText("Titre");
        Ltitre.setForeground(Color.red);
        Ltitre.setFont(new Font("Monospaced", Font.BOLD, 14));

        Lversion.setText("Version");
        Lversion.setForeground(Color.red);
        Lversion.setFont(new Font("Monospaced", Font.BOLD, 14));
        
        Ldate.setText("Date");
        Ldate.setForeground(Color.red);
        Ldate.setFont(new Font("Monospaced", Font.BOLD, 14));

        Ldescription.setText("Description");
        Ldescription.setForeground(Color.red);
        Ldescription.setFont(new Font("Monospaced", Font.BOLD, 14));

        Lcommentaire.setText("Commentaire");
        Lcommentaire.setForeground(Color.red);
        Lcommentaire.setFont(new Font("Monospaced", Font.BOLD, 14));
        
        Tversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        Lclient.setText("<html><u>Client</u></html>");
        Lclient.setForeground(Color.red);
        Lclient.setFont(new Font("Monospaced", Font.BOLD, 14));

        Tclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><font color=#B22222><center>Code Postale</center></font></html>", "<html><font color=#B22222><center>Entité</center></font></html>", "<html><font color=#B22222><center>Contact</center></font></html>"
            }
        ){
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tclient);

        Lequipe.setText("<html><u>Equipe</u></html>");
        Lequipe.setForeground(Color.red);
        Lequipe.setFont(new Font("Monospaced", Font.BOLD, 14));

        Tequipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><font color=#B22222><center>Nom</center></font></html>", "<html><font color=#B22222><center>Prénom</center></font></html> "
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tequipe);

        Lfonctionalite.setText("<html><u>Fonctionalites</u></html>");
        Lfonctionalite.setForeground(Color.red);
        Lfonctionalite.setFont(new Font("Monospaced", Font.BOLD, 14));

        Tfonctionalite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><font color=#B22222><center>Description</center></font></html> ", "<html><font color=#B22222><center> Priorite</center></font></html>"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tfonctionalite);

        Lexigence_fonctionel.setText("<html><u>Exigence-Fonctionnel</u></html>");
        Lexigence_fonctionel.setForeground(Color.red);
        Lexigence_fonctionel.setFont(new Font("Monospaced", Font.BOLD, 14));
        

        Texigence_fonctionel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><font color=#B22222><center>Identifiant</center></font></html>", "<html><font color=#B22222><center>Description</center></font></html>"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Texigence_fonctionel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lclient)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Ldescription)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Ltitre)
                                        .addComponent(Lversion)
                                        .addComponent(Ldate))
                                    .addComponent(Lcommentaire, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Ttitre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(Tversion)
                                        .addComponent(Tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tdescription))
                                    .addComponent(Tcommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lequipe, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lfonctionalite, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Lexigence_fonctionel))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ltitre)
                    .addComponent(Ttitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lversion)
                    .addComponent(Tversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ldate)
                    .addComponent(Tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ldescription)
                    .addComponent(Tdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lcommentaire)
                    .addComponent(Tcommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Lclient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lequipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lfonctionalite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lexigence_fonctionel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }   
}