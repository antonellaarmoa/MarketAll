package Menu;

import java.awt.EventQueue;
import java.awt.Menu;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;   
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import impl.Datos;
import impl.Administrador;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

@SuppressWarnings({ "serial", "unused" })
public class Catalogo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	
	private Administrador adm;
	
	private Administrador cod;
	@SuppressWarnings("rawtypes")
	private JList list_1;
	
	List<String> lista_cod = new ArrayList<>();
	
	private JTextField txtDesc;
	private JTextField txtCod;
	private JTextField txtST;
	private JTextField txtMin;
	private JTextField txtP;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catalogo ventana_catalogo = new Catalogo();
					ventana_catalogo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Catalogo() {
		setBackground(new Color(95, 158, 160));
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		 this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //aparece centrada en la pantalla
		setIconImage(Toolkit.getDefaultToolkit().getImage(Venta.class.getResource("/imagenes/icono_market.png")));
		setBounds(100, 100, 640, 460);
		setTitle("Market All - Catalogo");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Gadugi", Font.PLAIN, 12));
		menuBar.setBackground(new Color(95, 158, 160));
		menuBar.setBounds(0, 0, 763, 33);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnMenu.setBackground(new Color(255, 255, 255));
		menuBar.add(mnMenu);
		
		JMenuItem mnitGestion = new JMenuItem("Gestión Modificar Producto");
		mnitGestion.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnitGestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitarModificacion();
			}
		});
		mnMenu.add(mnitGestion);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Gestión Eliminar Producto");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitarEliminacion();
			}
		});
		mnMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmProductos = new JMenuItem("Cargar Productos");
		mntmProductos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CargarProducto();
			}
		});
		mnMenu.add(mntmProductos);
		
		JMenuItem mntmVenta = new JMenuItem("Venta");
		mntmVenta.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VenderProducto();
			}
		});
		mnMenu.add(mntmVenta);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setFont(UIManager.getFont("ToolTip.font"));
		btnMostrar.setForeground(new Color(0, 0, 0));
		btnMostrar.setBackground(new Color(250, 240, 230));
		btnMostrar.setSelectedIcon(null);
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar();
				
			}
		});
		btnMostrar.setBounds(382, 44, 89, 23);
		contentPane.add(btnMostrar);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setForeground(new Color(0, 0, 0));
		txtNombre.setBackground(new Color(250, 240, 230));
		txtNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtNombre.setBounds(344, 89, 200, 33);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		@SuppressWarnings("rawtypes")
		JList list_1 = new JList();
		list_1.setFont(UIManager.getFont("ToolTip.font"));
		list_1.setBackground(new Color(250, 240, 230));
		list_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.activeCaption));
		list_1.setBounds(47, 83, 156, 244);
		contentPane.add(list_1);
		this.list_1 = list_1;
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(UIManager.getFont("ToolTip.font"));
		lblNewLabel.setBounds(278, 98, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(UIManager.getFont("ToolTip.font"));
		lblDescripcion.setBounds(264, 334, 71, 14);
		contentPane.add(lblDescripcion);
		
		txtDesc = new JTextField();
		txtDesc.setEditable(false);
		txtDesc.setBackground(new Color(250, 240, 230));
		txtDesc.setColumns(10);
		txtDesc.setBounds(345, 317, 199, 74);
		contentPane.add(txtDesc);
		
		JLabel lblListaDeProductos = new JLabel("Lista De Productos");
		lblListaDeProductos.setFont(UIManager.getFont("ToolTip.font"));
		lblListaDeProductos.setBounds(83, 53, 137, 14);
		contentPane.add(lblListaDeProductos);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(UIManager.getFont("ToolTip.font"));
		lblCodigo.setBounds(278, 148, 46, 14);
		contentPane.add(lblCodigo);
		
		txtCod = new JTextField();
		txtCod.setBackground(new Color(250, 240, 230));
		txtCod.setEditable(false);
		txtCod.setColumns(10);
		txtCod.setBounds(344, 133, 200, 33);
		contentPane.add(txtCod);
		
		JLabel lblStockTotal = new JLabel("Stock Total");
		lblStockTotal.setFont(UIManager.getFont("ToolTip.font"));
		lblStockTotal.setBounds(263, 186, 75, 14);
		contentPane.add(lblStockTotal);
		
		txtST = new JTextField();
		txtST.setEditable(false);
		txtST.setBackground(new Color(250, 240, 230));
		txtST.setColumns(10);
		txtST.setBounds(344, 177, 200, 33);
		contentPane.add(txtST);
		
		JLabel lblStockMinimo = new JLabel("Stock Minimo");
		lblStockMinimo.setFont(UIManager.getFont("ToolTip.font"));
		lblStockMinimo.setBounds(263, 225, 89, 24);
		contentPane.add(lblStockMinimo);
		
		txtMin = new JTextField();
		txtMin.setBackground(new Color(250, 240, 230));
		txtMin.setEditable(false);
		txtMin.setColumns(10);
		txtMin.setBounds(344, 221, 200, 33);
		contentPane.add(txtMin);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(UIManager.getFont("ToolTip.font"));
		lblPrecio.setBounds(273, 270, 46, 23);
		contentPane.add(lblPrecio);
		
		txtP = new JTextField();
		txtP.setBackground(new Color(250, 240, 230));
		txtP.setEditable(false);
		txtP.setColumns(10);
		txtP.setBounds(344, 265, 200, 33);
		contentPane.add(txtP);
		
		adm = new Administrador();
	}
	@SuppressWarnings("unchecked")
	
	private void SolicitarModificacion() {
		Datos d = (Datos)list_1.getSelectedValue();
		
		if(d==null) {
			JOptionPane.showInternalMessageDialog(null, "Debe seleccionar un producto");
		}else {
			GestionMP ventana_GMP = new GestionMP();
			
			ventana_GMP.setdatoo(d.getNombre(), d.getDescripcion(), d.getPrecio(), d.getCodigo(),d.getStockTotal(),d.getStockMinimo());
			ventana_GMP.setModal(true);
			ventana_GMP.setVisible(true);
			
			Datos p = ventana_GMP.getDatos();
			
			
			d.setNombre(p.getNombre());
			d.setCodigo(p.getCodigo());
			d.setDescripcion(p.getDescripcion());
			d.setPrecio(p.getPrecio());
			d.setStockMinimo(p.getStockMinimo());
			d.setStockTotal(p.getStockTotal());
			list_1.setListData(adm.getLista().toArray());
			list_1.remove(txtCod);
			
		}
	}
	
	private void SolicitarEliminacion() {
		
		Datos d = (Datos)list_1.getSelectedValue();
		
		if(d==null) {
			JOptionPane.showInternalMessageDialog(null, "Debe seleccionar un producto");
		}else {
			GestionEP ventana_GEP= new GestionEP();
			
			ventana_GEP.setdatoo(d.getNombre(), d.getDescripcion(), d.getPrecio(), d.getCodigo(),d.getStockTotal(),d.getStockMinimo());
			ventana_GEP.setModal(true);
			ventana_GEP.setVisible(true);
			
			Datos p = ventana_GEP.getDatos();
			d.setNombre("");
			d.setCodigo(0);
			d.setDescripcion("");
			d.setPrecio(0);
			d.setStockMinimo(0);
			d.setStockTotal(0);
			
			list_1.remove(ventana_GEP);
			
			list_1.setListData(adm.getLista().toArray());
			
		}
	
	}
	
	
	@SuppressWarnings("unchecked")
	private void CargarProducto() {
		Productos ventana_productos = new Productos();
		ventana_productos.setModal(true);
		ventana_productos.setVisible(true);
		
		Datos p = ventana_productos.getDatos();
	
	
		adm.agregarP(p);

		list_1.setListData(adm.getLista().toArray());}
			
	
	private void VenderProducto() {
		Venta ventana_venta = new Venta();
		Datos d = (Datos)list_1.getSelectedValue();
		
		if(d==null) {
			JOptionPane.showInternalMessageDialog(null, "Debe seleccionar un producto");
		}if(d!=null) {
			if(d.getStockMinimo()>=d.getStockTotal()) {
				JOptionPane.showMessageDialog(null, "No hay stock suficiente para vender el producto seleccionado.", "", JOptionPane.WARNING_MESSAGE);
				}else {
					ventana_venta.setdatoo(d.getNombre(), d.getDescripcion(), d.getPrecio(), d.getCodigo(),d.getStockTotal(),d.getStockMinimo());
					ventana_venta.aceptar(d.getNombre(), d.getDescripcion(), d.getPrecio(), d.getCodigo(),d.getStockTotal()-1,d.getStockMinimo());	
					ventana_venta.setVisible(true);
				}
		}
		
		Datos p = ventana_venta.getDatos();
		
		
		if (p.getStockTotal() == d.getStockMinimo()) {
			d.setNombre(d.getNombre() + " - SM");
			d.setDescripcion(d.getDescripcion() + " - ESTE PRODUCTO LLEGO AL STOCK MINIMO -");
			} else {
				d.setNombre(d.getNombre());
				d.setDescripcion(d.getDescripcion());
			
			}
		
		d.setStockTotal(p.getStockTotal());
	}
	
	private void mostrar() {
		Datos d;
		String nom;
		String desc;
		int p;
		int cod;
		int st;
		int sm;
		d = (Datos)list_1.getSelectedValue();
		
		
		if(d!=null) {
			nom=d.getNombre();
			desc=d.getDescripcion();
			p=d.getPrecio();
			cod=d.getCodigo();
			st=d.getStockTotal();
			sm=d.getStockMinimo();
			txtNombre.setText(nom);
			txtDesc.setText(desc);
			txtCod.setText(Integer.toString(cod));
			txtST.setText(Integer.toString(st));
			txtMin.setText(Integer.toString(sm));
			txtP.setText(Integer.toString(p));
				
			
		}else
			JOptionPane.showInternalMessageDialog(null, "Debe seleccionar un producto");
			
	}}


	
	