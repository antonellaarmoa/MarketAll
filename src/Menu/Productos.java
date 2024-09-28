package Menu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.lang.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.List;
import java.util.ArrayList;

import impl.Datos;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

@SuppressWarnings({ "serial", "unused" })
public class Productos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtDescripcion;
	private JTextField txtPrecio;
	private JTextField txtStockT;
	private JTextField txtStockMin;

	ArrayList<String> lista_cod = new ArrayList<String>();
	
	private Datos objDatos;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Productos dialog = new Productos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Productos() {
		setTitle("Carga de productos - Market All");
		setBounds(100, 100, 450, 404);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 235, 215));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCodigoMP = new JLabel("Codigo ");
			lblCodigoMP.setFont(UIManager.getFont("ToolTip.font"));
			lblCodigoMP.setBounds(26, 78, 125, 23);
			contentPanel.add(lblCodigoMP);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setColumns(10);
			txtCodigo.setBounds(145, 80, 139, 20);
			contentPanel.add(txtCodigo);
		}
		{
			JLabel lblDescripcin = new JLabel("Descripción");
			lblDescripcin.setFont(UIManager.getFont("ToolTip.font"));
			lblDescripcin.setBounds(26, 241, 110, 18);
			contentPanel.add(lblDescripcin);
		}
		{
			txtDescripcion = new JTextField();
			txtDescripcion.setColumns(10);
			txtDescripcion.setBounds(145, 241, 139, 56);
			contentPanel.add(txtDescripcion);
		}
		{
			JLabel lblPrecioUnitario = new JLabel("Precio Unitario");
			lblPrecioUnitario.setFont(UIManager.getFont("ToolTip.font"));
			lblPrecioUnitario.setBounds(26, 121, 125, 14);
			contentPanel.add(lblPrecioUnitario);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(145, 119, 139, 20);
			contentPanel.add(txtPrecio);
		}
		{
			JLabel lblStock = new JLabel("Cantidad de Stock");
			lblStock.setFont(UIManager.getFont("ToolTip.font"));
			lblStock.setBounds(26, 160, 133, 14);
			contentPanel.add(lblStock);
		}
		{
			txtStockT = new JTextField();
			txtStockT.setColumns(10);
			txtStockT.setBounds(145, 158, 140, 20);
			contentPanel.add(txtStockT);
		}
		{
			JLabel lblStockMinimo = new JLabel("Stock Minimo");
			lblStockMinimo.setFont(UIManager.getFont("ToolTip.font"));
			lblStockMinimo.setBounds(26, 203, 133, 14);
			contentPanel.add(lblStockMinimo);
		}
		{
			txtStockMin = new JTextField();
			txtStockMin.setColumns(10);
			txtStockMin.setBounds(145, 201, 139, 20);
			contentPanel.add(txtStockMin);
		}
		
		JLabel lblNombreProducto = new JLabel("Nombre");
		lblNombreProducto.setFont(UIManager.getFont("ToolTip.font"));
		lblNombreProducto.setBounds(26, 42, 125, 23);
		contentPanel.add(lblNombreProducto);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(145, 44, 139, 20);
		contentPanel.add(txtNombre);
		
		JLabel lblIngresarDatosDel = new JLabel("Ingresar Datos del Producto");
		lblIngresarDatosDel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblIngresarDatosDel.setBounds(18, 11, 199, 23);
		contentPanel.add(lblIngresarDatosDel);
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
	public Productos(String text, int parseInt) {
		// TODO Auto-generated constructor stub
	}

	private void aceptar() {
			objDatos = new Datos(txtNombre.getText(), Integer.parseInt(txtCodigo.getText()), Integer.parseInt(txtPrecio.getText()), Integer.parseInt(txtStockT.getText()),Integer.parseInt(txtStockMin.getText()), txtDescripcion.getText());
			
			JOptionPane.showMessageDialog(null, "Producto cargado con exito.","",
					JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imagenes/icono_ok.png"));
			
			
			this.setVisible(false);
				
				
			}
		
	
	public Datos getDatos() {
		return this.objDatos;
	}

	private void cancelar() {
		this.objDatos=null;
		this.setVisible(false);
	}
}
