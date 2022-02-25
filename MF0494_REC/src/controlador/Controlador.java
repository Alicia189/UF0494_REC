/**
 * 
 */
package controlador;

import java.util.ArrayList;

import dao.PartesDAO;
import dao.SancionDAO;
import modelo.Sancion;
import vista.DialogoInsertarInfractor;
import vista.VentanaPpal;

/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema
	private VentanaPpal ventanaPpal;
	private DialogoInsertarInfractor dialogoInsertarInfractor;

	
	// Objetos DAO o CRUD de la base de datos
	private SancionDAO sancionDAO;
	
	private PartesDAO partesDAO;

	
	
	public Controlador() {
		// Creamos las ventanas de la aplicación
		ventanaPpal = new VentanaPpal();
		dialogoInsertarInfractor = new DialogoInsertarInfractor();
	
		
		// Dando acceso al controlador desde las vistas
		ventanaPpal.setControlador(this);
		dialogoInsertarInfractor.setControlador(this);

		
		
		// Creamos los objetos DAO
		sancionDAO = new SancionDAO();
		partesDAO = new partesDAO();
	}
	
	public void inciarPrograma() {
		ventanaPpal.setVisible(true);
	}
	

	public void mostrarInsertarInfractores () {
		ArrayList<Sancion> listaSanciones = new ArrayList<Sancion>();
		listaSanciones = sancionDAO.obtenerSanciones();
		dialogoInsertarInfractor.setListaSanciones(listaSanciones);
		dialogoInsertarInfractor.setVisible(true);
	}
	
	
}
