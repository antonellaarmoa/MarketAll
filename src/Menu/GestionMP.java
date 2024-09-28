package Menu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import impl.Administrador;
import impl.Datos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class GestionMP extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtDescMP;
	private JTextField txtCodMP;
	private JTextField txtPMP;
	private JTextField txtSTMP;
	private JTextField txtMinMP;
	private JTextField txtNomMP;
	private JTextField txtNomProducto;
	private JTextField txtCodProducto;
	private JTextField txtDescripcion;
	private JTextField txtPrecioUnitario;
	private JTextField txtStockTotal;
	private JTextField txtStockMinimo;
	
	private Datos objDatos;
	@SuppressWarnings("unused")
	private Administrador adm;
	
	public static void main(String[] args) {
		try {
			GestionMP dialog = new GestionMP();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestionMP() {
		setBackground(new Color(0, 128, 128));
		setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		setTitle("Modificacion de Producto - Market All");
		setBounds(100, 100, 790, 430);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 235, 215));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCodigoMP = new JLabel("Modificar Codigo ");
			lblCodigoMP.setFont(UIManager.getFont("ToolTip.font"));
			lblCodigoMP.setBounds(367, 103, 125, 23);
			contentPanel.add(lblCodigoMP);
		}
		{
			txtDescMP = new JTextField();
			txtDescMP.setBounds(520, 272, 110, 62);
			contentPanel.add(txtDescMP);
			txtDescMP.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("Modificar Descripción");
			lblNewLabel.setFont(UIManager.getFont("ToolTip.font"));
			lblNewLabel.setBounds(367, 274, 148, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txtCodMP = new JTextField();
			txtCodMP.setColumns(10);
			txtCodMP.setBounds(520, 105, 110, 20);
			contentPanel.add(txtCodMP);
		}
		{
			JLabel lblPrecioUMP = new JLabel("Modificar Precio ");
			lblPrecioUMP.setFont(UIManager.getFont("ToolTip.font"));
			lblPrecioUMP.setBounds(367, 144, 125, 14);
			contentPanel.add(lblPrecioUMP);
		}
		{
			txtPMP = new JTextField();
			txtPMP.setColumns(10);
			txtPMP.setBounds(520, 144, 110, 20);
			contentPanel.add(txtPMP);
		}
		{
			JLabel lblStockMP = new JLabel("Modificar  Stock Total");
			lblStockMP.setFont(UIManager.getFont("ToolTip.font"));
			lblStockMP.setBounds(367, 175, 210, 14);
			contentPanel.add(lblStockMP);
		}
		{
			txtSTMP = new JTextField();
			txtSTMP.setColumns(10);
			txtSTMP.setBounds(520, 175, 110, 20);
			contentPanel.add(txtSTMP);
		}
		{
			JLabel lblModificarStockMinimo = new JLabel("Modificar Stock Minimo");
			lblModificarStockMinimo.setFont(UIManager.getFont("ToolTip.font"));
			lblModificarStockMinimo.setBounds(367, 222, 232, 14);
			contentPanel.add(lblModificarStockMinimo);
		}
		{
			txtMinMP = new JTextField();
			txtMinMP.setColumns(10);
			txtMinMP.setBounds(520, 220, 110, 20);
			contentPanel.add(txtMinMP);
		}
		{
			JLabel lblModificarNombreProducto = new JLabel("Modificar Nombre");
			lblModificarNombreProducto.setFont(UIManager.getFont("ToolTip.font"));
			lblModificarNombreProducto.setBounds(367, 69, 181, 23);
			contentPanel.add(lblModificarNombreProducto);
		}
		{
			txtNomMP = new JTextField();
			txtNomMP.setColumns(10);
			txtNomMP.setBounds(520, 71, 110, 20);
			contentPanel.add(txtNomMP);
		}
		
		JLabel lblNombreProducto = new JLabel("Nombre ");
		lblNombreProducto.setFont(UIManager.getFont("ToolTip.font"));
		lblNombreProducto.setBounds(38, 69, 181, 23);
		contentPanel.add(lblNombreProducto);
		
		txtNomProducto = new JTextField();
		txtNomProducto.setEditable(false);
		txtNomProducto.setToolTipText("");
		txtNomProducto.setBackground(new Color(250, 240, 230));
		txtNomProducto.setForeground(Color.BLACK);
		txtNomProducto.setColumns(10);
		txtNomProducto.setBounds(156, 71, 110, 20);
		contentPanel.add(txtNomProducto);
		
		JLabel lblCodigoProducto = new JLabel("Codigo ");
		lblCodigoProducto.setFont(UIManager.getFont("ToolTip.font"));
		lblCodigoProducto.setBounds(38, 104, 125, 23);
		contentPanel.add(lblCodigoProducto);
		
		txtCodProducto = new JTextField();
		txtCodProducto.setEditable(false);
		txtCodProducto.setColumns(10);
		txtCodProducto.setBounds(156, 105, 110, 20);
		contentPanel.add(txtCodProducto);
		
		JLabel lblDescripcin = new JLabel("Descripción");
		lblDescripcin.setFont(UIManager.getFont("ToolTip.font"));
		lblDescripcin.setBounds(36, 271, 110, 14);
		contentPanel.add(lblDescripcin);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setEditable(false);
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(156, 271, 125, 63);
		contentPanel.add(txtDescripcion);
		
		JLabel lblPrecioUnitario = new JLabel("Precio Unitario");
		lblPrecioUnitario.setFont(UIManager.getFont("ToolTip.font"));
		lblPrecioUnitario.setBounds(38, 144, 125, 14);
		contentPanel.add(lblPrecioUnitario);
		
		txtPrecioUnitario = new JTextField();
		txtPrecioUnitario.setEditable(false);
		txtPrecioUnitario.setColumns(10);
		txtPrecioUnitario.setBounds(156, 142, 110, 20);
		contentPanel.add(txtPrecioUnitario);
		
		JLabel lblCantidadDeStock = new JLabel("Cantidad de Stock");
		lblCantidadDeStock.setFont(UIManager.getFont("ToolTip.font"));
		lblCantidadDeStock.setBounds(38, 181, 133, 14);
		contentPanel.add(lblCantidadDeStock);
		
		txtStockTotal = new JTextField();
		txtStockTotal.setEditable(false);
		txtStockTotal.setColumns(10);
		txtStockTotal.setBounds(156, 179, 110, 20);
		contentPanel.add(txtStockTotal);
		
		JLabel lblStockMinimo = new JLabel("Stock Minimo");
		lblStockMinimo.setFont(UIManager.getFont("ToolTip.font"));
		lblStockMinimo.setBounds(38, 226, 133, 14);
		contentPanel.add(lblStockMinimo);
		
		txtStockMinimo = new JTextField();
		txtStockMinimo.setEditable(false);
		txtStockMinimo.setColumns(10);
		txtStockMinimo.setBounds(156, 224, 110, 20);
		contentPanel.add(txtStockMinimo);
		
		JLabel lblDatosActualesDel = new JLabel("Datos actuales");
		lblDatosActualesDel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblDatosActualesDel.setBounds(32, 12, 286, 23);
		contentPanel.add(lblDatosActualesDel);
		{
			JLabel lblNuevosDelProducto = new JLabel("Nuevos datos");
			lblNuevosDelProducto.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
			lblNuevosDelProducto.setBounds(373, 12, 286, 23);
			contentPanel.add(lblNuevosDelProducto);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(95, 158, 160));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton AceptarButton = new JButton("Aceptar");
				AceptarButton.setBackground(new Color(255, 250, 240));
				AceptarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validar();
						aceptar();
					}
				});
				AceptarButton.setActionCommand("OK");
				buttonPane.add(AceptarButton);
				getRootPane().setDefaultButton(AceptarButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancelar();
					}
				});
				cancelButton.setBackground(new Color(255, 250, 250));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		adm = new Administrador();
	}
	@SuppressWarnings("unused")
	private int pr;
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private int codigo;
	@SuppressWarnings("unused")
	private int stM;
	@SuppressWarnings("unused")
	private String descripcion;
	@SuppressWarnings("unused")
	private int stT;
	
	public void setdatoo(String nom,String descr,int precio, int cod, int StT, int StM){
		this.pr = precio;
		this.nombre = nom;
		this.codigo=cod;
		this.stT=StT;
		this.stM=StM;
		this.descripcion=descr;
		
		txtNomProducto.setText(nom);
		txtDescripcion.setText(descr);
		txtCodProducto.setText(Integer.toString(cod));
		txtStockTotal.setText(Integer.toString(StT));
		txtStockMinimo.setText(Integer.toString(StM));
		txtPrecioUnitario.setText(Integer.toString(precio));
	}
	
	
	private void aceptar() {
		if(!txtNomMP.getText().isEmpty() || !txtCodMP.getText().isEmpty() || !txtPMP.getText().isEmpty() || !txtSTMP.getText().isEmpty() || !txtMinMP.getText().isEmpty() || !txtDescMP.getText().isEmpty()){
			objDatos = new Datos(txtNomMP.getText(), Integer.parseInt(txtCodMP.getText()), Integer.parseInt(txtPMP.getText()), Integer.parseInt(txtSTMP.getText()),Integer.parseInt(txtMinMP.getText()), txtDescMP.getText());
			
			JOptionPane.showMessageDialog(null, "Dato Modificado", "",
					JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imagenes/icono_ok.png"));
			this.setVisible(false);}
		}
	
	
		
	public void validar() {
		
		if(txtNomMP.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
		}else if(txtCodMP.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
		}else if(txtPMP.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
		}else if(txtSTMP.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
		}else if(txtMinMP.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
		}else if(txtDescMP.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
	}
		}
	
	private void cancelar() {
		this.objDatos=null;
		this.setVisible(false);
	}
	
	public Datos getDatos() {
		return this.objDatos; //returnea los nuevos datos
	}
}
