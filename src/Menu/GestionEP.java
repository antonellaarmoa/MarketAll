package Menu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import impl.Datos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class GestionEP extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Datos objDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestionEP dialog = new GestionEP();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestionEP() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\antonela\\Downloads\\Captura de pantalla 2023-06-17 192545.png"));
		setTitle("Eliminar Producto - Market All");
		setBackground(new Color(95, 158, 160));
		setBounds(100, 100, 450, 172);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 235, 215));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Esta seguro que desea eliminar este producto?");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel.setBounds(75, 23, 296, 48);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(95, 158, 160));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setBackground(new Color(250, 240, 230));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						aceptar();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(new Color(250, 240, 230));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancelar();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private int pr;
	private String nombre;
	private int codigo;
	private int stM;
	private String descripcion;
	private int stT;
	
	public void setdatoo(String nom,String descr,int precio, int cod, int StT, int StM){
		this.pr = precio;
		this.nombre = nom;
		this.codigo=cod;
		this.stT=StT;
		this.stM=StM;
		this.descripcion=descr;
		
	}
	
	private void cancelar() {
		this.setVisible(false);
	}
	
	
	private void aceptar() {
		this.objDatos=null;
		this.setVisible(false);
		JOptionPane.showMessageDialog(null, "Producto eliminado con exito.","",
	              JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imagenes/icono_ok.png"));
		
	}
	
	public Datos getDatos() {
		return this.objDatos; //returnea los nuevos datos
	}
	
}
