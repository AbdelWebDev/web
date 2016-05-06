package client;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author amri abdelouhab
 *
 */
public class addSTB extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;

	
	
	/**
	 * ajouter une STB
	 */
	public addSTB() {
		initComponents();
		Bclient.addActionListener(this);
		Bexigence_fonctionnel.addActionListener(this);
		Bfonctionalite.addActionListener(this);
		Bequipe.addActionListener(this);
		BAjouter.addActionListener(this);
	}

	@SuppressWarnings({ "unchecked", "serial" })
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		Ltitre = new javax.swing.JLabel();
		Lversion = new javax.swing.JLabel();
		Ldate = new javax.swing.JLabel();
		Ttitre = new javax.swing.JTextField();
		Tversion = new javax.swing.JTextField();
		Tdate = new javax.swing.JTextField();
		BAjouter = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		Tdescription = new javax.swing.JTextField();
		Tcommentaire = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		Tcp_client = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		Tcontact_client = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		Tentite = new javax.swing.JTextField();
		Bexigence_fonctionnel = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		Tclient = new javax.swing.JTable();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		Tpriorite = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		Tdescriptionexig = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		Tidentifiant = new javax.swing.JTextField();
		Bclient = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		Texigence_fonctionnel = new javax.swing.JTable();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		Tdescription_fonct = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		Tpriorite_fonct = new javax.swing.JTextField();
		jScrollPane3 = new javax.swing.JScrollPane();
		Tfonctionalite = new javax.swing.JTable();
		Bfonctionalite = new javax.swing.JButton();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		Tnomequipe = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		Tprenomequipe = new javax.swing.JTextField();
		jScrollPane4 = new javax.swing.JScrollPane();
		Tequipe = new javax.swing.JTable();
		Bequipe = new javax.swing.JButton();

		Ltitre.setText("Titre");
		Ltitre.setForeground(Color.BLUE);
		Ltitre.setFont(new Font("Monospaced", Font.BOLD, 14));

		Lversion.setText("Version");
		Lversion.setForeground(Color.BLUE);
		Lversion.setFont(new Font("Monospaced", Font.BOLD, 14));

		Ldate.setText("Date");
		Ldate.setForeground(Color.BLUE);
		Ldate.setFont(new Font("Monospaced", Font.BOLD, 14));

		Ttitre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TtitreActionPerformed(evt);
			}
		});

		Tversion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TversionActionPerformed(evt);
			}
		});

		Tdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TdateActionPerformed(evt);
			}
		});

		BAjouter.setText("Ajouter STB");
		BAjouter.setBackground(Color.BLUE);
		BAjouter.setForeground(Color.white);
		BAjouter.setFont(new Font("Monospaced", Font.BOLD, 12));

		jLabel1.setText("Description");
		jLabel1.setForeground(Color.BLUE);
		jLabel1.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel2.setText("Commentaire");
		jLabel2.setForeground(Color.BLUE);
		jLabel2.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel3.setText("<html><u>Client</u></html>");
		jLabel3.setForeground(Color.BLUE);
		jLabel3.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel4.setText("Code Postal");
		jLabel4.setForeground(Color.BLUE);
		jLabel4.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel5.setText("Contact");
		jLabel5.setForeground(Color.BLUE);
		jLabel5.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel6.setText("Entite");
		jLabel6.setForeground(Color.BLUE);
		jLabel6.setFont(new Font("Monospaced", Font.BOLD, 14));

		Bexigence_fonctionnel.setText("+");
		Bexigence_fonctionnel.setBackground(Color.BLUE);
		Bexigence_fonctionnel.setForeground(Color.white);
		Bexigence_fonctionnel.setFont(new Font("Monospaced", Font.BOLD, 12));

		Tclient.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "<html><font color=#4B0082><center>Code postal</center></font></html>", "<html><font color=#4B0082><center>Contact</center></font></html>", "<html><font color=#4B0082><center>Entite</center></font></html>" }) {
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, true, true };

			@SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(Tclient);
		

		jLabel7.setText("<html><u>Exigence Fonctionnel</u></html>");
		jLabel7.setForeground(Color.BLUE);
		jLabel7.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel8.setText("Identifiant");
		jLabel8.setForeground(Color.BLUE);
		jLabel8.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel9.setText("Description  Exigence");
		jLabel9.setForeground(Color.BLUE);
		jLabel9.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel10.setText("Priorite");
		jLabel10.setForeground(Color.BLUE);
		jLabel10.setFont(new Font("Monospaced", Font.BOLD, 14));

		Bclient.setText("+");
		Bclient.setBackground(Color.BLUE);
		Bclient.setForeground(Color.white);
		Bclient.setFont(new Font("Monospaced", Font.BOLD, 12));

		Texigence_fonctionnel.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "<html><font color=#4B0082><center>Identifiant</center></font></html>", "<html><font color=#4B0082><center>Desrirption Exigence</center></font></html>", "<html><font color=#4B0082><center>Priorite</center></font></html>" }) {
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false };

			@SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(Texigence_fonctionnel);

		jLabel11.setText("<html><u>Fonctionalité</u></html>");
		jLabel11.setForeground(Color.BLUE);
		jLabel11.setFont(new Font("Monospaced",Font.BOLD , 14));
		
		jLabel12.setText("Description Fonctionalite");
		jLabel12.setForeground(Color.BLUE);
		jLabel12.setFont(new Font("Monospaced", Font.BOLD, 14));

		Tdescription_fonct.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Tdescription_fonctActionPerformed(evt);
			}
		});

		jLabel13.setText("Priorite Fonctionalite ");
		jLabel13.setForeground(Color.BLUE);
		jLabel13.setFont(new Font("Monospaced", Font.BOLD, 14));

		Tpriorite_fonct.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Tpriorite_fonctActionPerformed(evt);
			}
		});

		Tfonctionalite.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "<html><font color=#4B0082><center>Description de la Fonctionalite</center></font></html>", "<html><font color=#4B0082><center>Priorite de la Fonctionalite</center></font></html>" }) {
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false };
			

			@SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane3.setViewportView(Tfonctionalite);

		Bfonctionalite.setText("+");
		Bfonctionalite.setBackground(Color.BLUE);
		Bfonctionalite.setForeground(Color.white);
		Bfonctionalite.setFont(new Font("Monospaced", Font.BOLD, 12));

		jLabel14.setText("<html><u>Equipe</u></html>");
		jLabel14.setForeground(Color.BLUE);
		jLabel14.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel15.setText("Nom de l'Equipe");
		jLabel15.setForeground(Color.BLUE);
		jLabel15.setFont(new Font("Monospaced", Font.BOLD, 14));

		jLabel16.setText("Prenom de l'Equipe");
		jLabel16.setForeground(Color.BLUE);
		jLabel16.setFont(new Font("Monospaced", Font.BOLD, 14));

		Tequipe.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "<html><font color=#4B0082><center>Nom de l'Equipe</center></font></html>", "<html><font color=#4B0082><center>Prenom de l'Equipe</center></font></html>" }) {
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { java.lang.String.class, java.lang.Integer.class };
			boolean[] canEdit = new boolean[] { false, false };

			@SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane4.setViewportView(Tequipe);

		Bequipe.setText("+");
		Bequipe.setBackground(Color.BLUE);
		Bequipe.setForeground(Color.white);
		Bequipe.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
	
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
														.addComponent(BAjouter))
										.addGroup(layout.createSequentialGroup().addComponent(jLabel8)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Tpriorite, javax.swing.GroupLayout.PREFERRED_SIZE,
														200, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel9)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Tdescriptionexig).addGap(18, 18, 18).addComponent(jLabel10)
												.addGap(18, 18, 18)
												.addComponent(Tidentifiant, javax.swing.GroupLayout.PREFERRED_SIZE,
														149, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Bexigence_fonctionnel))))
						.addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addComponent(Ltitre).addGap(15,
														15, 15))
												.addComponent(Lversion, javax.swing.GroupLayout.Alignment.TRAILING))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(Ttitre, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Tversion, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addComponent(jLabel2).addGap(18, 18, 18)
										.addComponent(Tcommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1).addComponent(Ldate))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(Tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												
												.addComponent(Tdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(Tcp_client, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(26, 26, 26).addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(Tcontact_client, javax.swing.GroupLayout.PREFERRED_SIZE, 199,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(29, 29, 29).addComponent(jLabel6).addGap(18, 18, 18)
								.addComponent(Tentite, javax.swing.GroupLayout.PREFERRED_SIZE, 266,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Bclient))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane2))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel7))
										.addGroup(layout.createSequentialGroup().addContainerGap()
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel11)
														.addGroup(layout.createSequentialGroup().addComponent(jLabel12)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(Tdescription_fonct,
																javax.swing.GroupLayout.PREFERRED_SIZE, 150,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel13)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Tpriorite_fonct,
																javax.swing.GroupLayout.PREFERRED_SIZE, 150,
																javax.swing.GroupLayout.PREFERRED_SIZE))))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(Bfonctionalite).addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 518,
												Short.MAX_VALUE)
										.addGroup(layout.createSequentialGroup().addComponent(jLabel15)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Tnomequipe, javax.swing.GroupLayout.PREFERRED_SIZE,
														151, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jLabel16)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Tprenomequipe, javax.swing.GroupLayout.PREFERRED_SIZE,
														50, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(Bequipe))
										.addGroup(layout.createSequentialGroup().addComponent(jLabel14).addGap(0, 0,
												Short.MAX_VALUE)))))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Ttitre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Ltitre, javax.swing.GroupLayout.Alignment.TRAILING))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(Tversion, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Lversion, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Ldate)
						.addComponent(Tdate, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
						.addComponent(Tdescription, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(Tcommentaire, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel3)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(Tcp_client, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel5)
						.addComponent(Tcontact_client, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6)
						.addComponent(Tentite, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Bclient))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel7)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8)
								.addComponent(Tpriorite, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9)
								.addComponent(Tdescriptionexig, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel10)
								.addComponent(Tidentifiant, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Bexigence_fonctionnel))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel11).addComponent(jLabel14))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel12)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(Tdescription_fonct, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel13)
												.addComponent(Tpriorite_fonct, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Bfonctionalite).addComponent(jLabel15)
												.addComponent(Tnomequipe, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel16)
												.addComponent(Tprenomequipe, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Bequipe)))
								.addGap(18, 18, 18).addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
										62, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(BAjouter).addContainerGap(16, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void TtitreActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void TversionActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void TdateActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void Tdescription_fonctActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void Tpriorite_fonctActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public Object[][] getTableData(JTable table) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
		Object[][] tableData = new Object[nRow][nCol];
		for (int i = 0; i < nRow; i++)
			for (int j = 0; j < nCol; j++)
				tableData[i][j] = dtm.getValueAt(i, j);
		return tableData;
	}

	public void createXMLSTB(String titre, String version, String date, String description, String commentaire, Object[][] client,
			Object[][] exigencefonctionnel, Object[][] fonctionalite, Object[][] equipe) throws SAXException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		try {
			docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("stb");
			doc.appendChild(rootElement);
			// date
			Element date1 = doc.createElement("date");
			rootElement.appendChild(date1);
			// description
			Element descrip = doc.createElement("description");
			rootElement.appendChild(descrip);

			// equipes
			for (Object[] c : equipe) {
				Element comp = doc.createElement("equipe");
				String n_e = c[1].toString();
				String p_e = c[0].toString();

				Element ne = doc.createElement("nomEquipe");
				ne.appendChild(doc.createTextNode(n_e));
				comp.appendChild(ne);

				Element pe = doc.createElement("prenomEquipe");
				pe.appendChild(doc.createTextNode(p_e));
				comp.appendChild(pe);

				rootElement.appendChild(comp);
			}

			// commentaire
			Element comment = doc.createElement("commentaire");
			rootElement.appendChild(comment);

			// client
			for (Object[] e : client) {
				Element clt = doc.createElement("client");
				String cp = e[0].toString();
				String ent = e[2].toString();
				String cont = e[1].toString();

				Element cpp = doc.createElement("Code_Postale");
				cpp.appendChild(doc.createTextNode(cp));
				clt.appendChild(cpp);

				Element entt = doc.createElement("entite");
				entt.appendChild(doc.createTextNode(ent));
				clt.appendChild(entt);

				Element contact = doc.createElement("contact");
				contact.appendChild(doc.createTextNode(cont));
				clt.appendChild(contact);

				rootElement.appendChild(clt);
			}

			// exigence_fonctionnel
			for (Object[] f : exigencefonctionnel) {

				Element exi__f = doc.createElement("exigencefonctionnel");
				String ex = f[2].toString();
				String des = f[1].toString();
				String pr = f[0].toString();

				Element ident = doc.createElement("identifiant_ex");
				ident.appendChild(doc.createTextNode(ex));
				exi__f.appendChild(ident);

				Element descri = doc.createElement("description_ex");
				descri.appendChild(doc.createTextNode(des));
				exi__f.appendChild(descri);

				Element prio = doc.createElement("priorite_ex");
				prio.appendChild(doc.createTextNode(pr));
				exi__f.appendChild(prio);

				rootElement.appendChild(exi__f);
			}

			// fonctionalite
			for (Object[] l : fonctionalite) {
				Element fonc = doc.createElement("fonctionalite");
				String dd = l[1].toString();
				String pp = l[0].toString();

				Element dc = doc.createElement("description_f");
				dc.appendChild(doc.createTextNode(dd));
				fonc.appendChild(dc);

				Element pc = doc.createElement("priorite_f");
				pc.appendChild(doc.createTextNode(pp));
				fonc.appendChild(pc);

				rootElement.appendChild(fonc);
			}

			// titre
						Element tit = doc.createElement("titre");
						rootElement.appendChild(tit);

						// version
						Element vers = doc.createElement("version");
						rootElement.appendChild(vers);

			// write the content into xml file
			

			String xml = "<titre>" + titre + "</titre><version>" + version + "</version><date>" + date + "</date><description>"
					+ description + "</description><commentaire>" + commentaire + "</commentaire>";
			String tete = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><stb>";
			String fin = "</stb>";

			Object[][] clien = getTableData(Tclient);
 
			

			for (Object[] e : clien) {
				String xmll = "<client><entite>" + e[2].toString() + "</entite><contact>" + e[1].toString()
						+ "</contact>" + "<code_postale>" + e[0].toString() + "</code_postale>" + "</client>";
				xml = xmll + xml;
			}

			Object[][] exig_fonc = getTableData(Texigence_fonctionnel);

			for (Object[] f : exig_fonc) {
				String xmll = "<exigencefonctionel><identifiant_ex>" + f[2].toString()
						+ "</identifiant_ex><description_ex>" + f[1].toString() + "</description_ex><priorite_ex>"
						+ f[0].toString() + "</priorite_ex></exigencefonctionel>";
				xml = xmll + xml;
			}
			Object[][] lang = getTableData(Tfonctionalite);
			for (Object[] l : lang) {

				for (int i = 0; i < l.length; i++) {

					String xmll = "<fonctionalite><description_f>" + l[i + 1].toString()
							+ "</description_f><priorite_f>" + l[i].toString()
							+ "</priorite_f></fonctionalite>";
					i++;
					xml = xmll + xml;

				}
			}
			Object[][] comp = getTableData(Tequipe);
			for (Object[] c : comp) {

				for (int i = 0; i < c.length; i++) {

					String xmll = "<equipe><nom>" + c[i + 1].toString() + "</nom><prenom>"
							+ c[i].toString() + "</prenom></equipe>";
					i++;
					xml = xmll + xml;

				}
			}
			xml = tete + xml + fin;
			
			//validateSTB(docFactory);
			
			 
			
			// some string containing an XML document
			
			
			DocumentBuilder builder = docFactory.newDocumentBuilder();
			builder.parse(new InputSource(new StringReader(xml)));

			URL url = new URL("http://amriabdelkatia-abdelouhab.rhcloud.com/projetWEB/depot/");
			//URL url = new URL("http://localhost:8080/PROJETWEB/depot/");
			
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/xml");

			OutputStream os = conn.getOutputStream();
			os.write(xml.getBytes());
			os.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;

			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		} catch (ParserConfigurationException ex) {
			Logger.getLogger(addSTB.class.getName()).log(Level.SEVERE, null, ex);
		} catch (MalformedURLException ex) {
			Logger.getLogger(addSTB.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ProtocolException ex) {
			Logger.getLogger(addSTB.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(addSTB.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	//validation avec le shema XSD
	
	/**
	 * @param dbf
	 * @throws SAXException
	 */
	private void validateSTB(DocumentBuilderFactory dbf) throws SAXException {
		// TODO Auto-generated method stub
		//validation stb
		
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema myschema=schemaFactory.newSchema(new File("./PROJETWEB/ressources/stb.xsd"));
		 
		//DocumentBuilderFactory domParserFactory = DocumentBuilderFactory.newInstance();
		
		// charger le doc factory pour la validation
		
		dbf.setValidating(true);
		dbf.setSchema(myschema);
		 
		
	}

	/**
	 * @param doc
	 * @return
	 */
	public String getStringFromDoc(org.w3c.dom.Document doc) {
		DOMImplementationLS domImplementation = (DOMImplementationLS) doc.getImplementation();
		LSSerializer lsSerializer = domImplementation.createLSSerializer();
		return lsSerializer.writeToString(doc);
	}

	/**
	 * @return
	 */
	private boolean checkEmptyFields() {

		return !(Ttitre.getText().isEmpty() || Tversion.getText().isEmpty() || Tdate.getText().isEmpty()
				|| Tdescription.getText().isEmpty() || Tcommentaire.getText().isEmpty());

	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Bclient) {
			String code_postale = Tcp_client.getText();
			String contact = Tcontact_client.getText();
			String entite = Tentite.getText();
			Object[] row = { code_postale, contact, entite };
			DefaultTableModel tb = (DefaultTableModel) Tclient.getModel();
			tb.addRow(row);

		}
		if (e.getSource() == Bexigence_fonctionnel) {
			String prio = Tpriorite.getText();
			String desc_exig = Tdescriptionexig.getText();
			String identif = Tidentifiant.getText();
			Object[] row = { prio, desc_exig, identif };
			DefaultTableModel tb = (DefaultTableModel) Texigence_fonctionnel.getModel();
			tb.addRow(row);
		}
		if (e.getSource() == Bfonctionalite) {
			String desc_fonctionalite = Tdescription_fonct.getText();
			String priorite_fonctionalite = Tpriorite_fonct.getText();
			Object[] row = { desc_fonctionalite, priorite_fonctionalite };
			DefaultTableModel tb = (DefaultTableModel) Tfonctionalite.getModel();
			tb.addRow(row);
		}
		if (e.getSource() == Bequipe) {
			String nom_equipe = Tnomequipe.getText();
			String prenom_equipe = Tprenomequipe.getText();
			Object[] row = { nom_equipe, prenom_equipe };
			DefaultTableModel tb = (DefaultTableModel) Tequipe.getModel();
			tb.addRow(row);
		}
		if (e.getSource() == BAjouter) {
			if (checkEmptyFields()) {
				String titre = Ttitre.getText();
				String version = Tversion.getText();
				String date = Tdate.getText();
				String description = Tdescription.getText();
				String commentaire = Tcommentaire.getText();
				Object[][] client = getTableData(Tclient);
				Object[][] exigencefonctionnel = getTableData(Texigence_fonctionnel);
				Object[][] fonctionalite = getTableData(Tfonctionalite);
				Object[][] equipe = getTableData(Tequipe);

				try {
					createXMLSTB(titre, version, date, description, commentaire, client, exigencefonctionnel, fonctionalite, equipe);
				} catch (SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				this.setVisible(false);
				new HomeSTB().setVisible(true);
				HomeSTB.ac.setVisible(false);
			} else {
				String message = "Veuillez au moins saisir les informations personnelles";
				JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private javax.swing.JButton BAjouter;
	private javax.swing.JButton Bequipe;
	private javax.swing.JButton Bclient;
	private javax.swing.JButton Bexigence_fonctionnel;
	private javax.swing.JButton Bfonctionalite;
	private javax.swing.JLabel Ldate;
	private javax.swing.JLabel Ltitre;
	private javax.swing.JLabel Lversion;
	private javax.swing.JTextField Tdescription;
	private javax.swing.JTextField Tdate;
	private javax.swing.JTextField Tidentifiant;//
	private javax.swing.JTable Tequipe;
	private javax.swing.JTextField Tcp_client;
	private javax.swing.JTextField Tentite;
	private javax.swing.JTextField Tcommentaire;
	private javax.swing.JTable Tclient;
	private javax.swing.JTable Texigence_fonctionnel;
	private javax.swing.JTable Tfonctionalite;
	private javax.swing.JTextField Tdescriptionexig;//
	private javax.swing.JTextField Tcontact_client;
	private javax.swing.JTextField Tprenomequipe;
	private javax.swing.JTextField Tpriorite_fonct;
	private javax.swing.JTextField Ttitre;
	private javax.swing.JTextField Tnomequipe;
	private javax.swing.JTextField Tpriorite;//
	private javax.swing.JTextField Tdescription_fonct;
	private javax.swing.JTextField Tversion;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;

}
