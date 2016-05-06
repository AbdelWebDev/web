package client;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JScrollPane;
import javax.swing.JTable;
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

public class HomeSTB extends JFrame implements ActionListener {
	static HomeSTB ac;

	private static final long serialVersionUID = 1L;

	private JButton AjouterUneSTB;
	private JButton BDetails;
	private JTable ListeSTB;
	private JLabel Titre;
	private JScrollPane jScrollPane1;
	static String idd;
      Font f;
      
	public HomeSTB() {
	
		initComponents();
		AjouterUneSTB.addActionListener(this);

		BDetails.addActionListener(this);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		try {

			HttpClient httpClient = HttpClientBuilder.create().build();

			// HttpGet getRequest = new
			
			HttpGet getRequest = new HttpGet("http://amriabdelkatia-abdelouhab.rhcloud.com/projetWEB/resume");
			//HttpGet getRequest = new HttpGet("http://localhost:8080/PROJETWEB/resume");
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

				NodeList nList = doc.getElementsByTagName("stbe");

				for (int temp = 0; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;

						Object[] row = { eElement.getElementsByTagName("stbid").item(0).getTextContent(),
								eElement.getElementsByTagName("titre").item(0).getTextContent(),
								eElement.getElementsByTagName("version").item(0).getTextContent() };
						DefaultTableModel tb = (DefaultTableModel) ListeSTB.getModel();
						tb.addRow(row);

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
	}

	@SuppressWarnings("serial")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
	
		
		
		ListeSTB = new javax.swing.JTable();
		ListeSTB.setForeground(Color.BLUE);
		AjouterUneSTB = new javax.swing.JButton();
		BDetails = new javax.swing.JButton();
		Titre = new javax.swing.JLabel();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ListeSTB.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
        	
        }, 
			new String[] { "<html><font color=#5472AE><center>idSTB</center></font></html>", "<html><font color=#5472AE>Titre</font></html>", "<html><font color=#5472AE>Version</font></html>" }) {
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false };
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
		
			}
		});
		
		
		jScrollPane1.setViewportView(ListeSTB);
		
		

		AjouterUneSTB.setText("Ajouter une STB");
		AjouterUneSTB.setBackground(Color.BLUE);
		AjouterUneSTB.setForeground(Color.white);
		AjouterUneSTB.setFont(new Font("Monospaced", Font.BOLD, 12));
		
		BDetails.setText("Détailler une STB");
		BDetails.setBackground(Color.red);
		BDetails.setForeground(Color.white);
		BDetails.setFont(new Font("Monospaced", Font.BOLD, 12));

		//Titre.setText("Liste des STB");
		//Titre.setForeground(Color.BLUE);
		//Titre.setFont(new Font("Monospaced", Font.BOLD, 16));
		

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(AjouterUneSTB, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						
						
						.addComponent(BDetails, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(27, 27, 27))
				
				.addGroup(layout.createSequentialGroup().addGap(250, 250, 250)
						
						
						
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
				
						.addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						
						.addGap(18, 18, 18)
						
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								
							
								.addGroup(layout.createSequentialGroup().addComponent(AjouterUneSTB).addGap(30 ,30, 30)
										.addComponent(BDetails).addGap(40, 40, 40)))
						
						.addContainerGap(60, Short.MAX_VALUE)));

		pack();

	}

	public JTable getListeSTB() {
		return ListeSTB;
	}

	public void setListeSTB(JTable ListeSTB) {
		this.ListeSTB = ListeSTB;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BDetails) {
			int row = ListeSTB.getSelectedRow();
			if (row == -1) {
				String message = "Selectionner une STB";
				JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
			} else {
				idd = (String) ListeSTB.getModel().getValueAt(ListeSTB.getSelectedRow(), 0);

				new STB().setVisible(true);
			}
		}
		if (e.getSource() == AjouterUneSTB) {
			new addSTB().setVisible(true);
			ac = this;
		}
	}

}
