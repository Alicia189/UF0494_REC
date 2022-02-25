package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBD;
import modelo.Parte;


public class PartesDAO {
	
	private ConexionBD conexion;
	
    public PartesDAO() {
        this.conexion = new ConexionBD();
    }


    public ArrayList<Parte> obtenerPartes() {
    
		Connection con = conexion.getConexion();
		Statement consulta = null;
		ResultSet resultado = null;
		ArrayList<Parte> lista = new ArrayList<Parte>();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from partes");
			
			
			while(resultado.next()) {
				String bastidor = resultado.getString("bastidor");
				String marca = resultado.getString("marca");
				String modelo = resultado.getString("modelo");
				float importe = resultado.getFloat("importe");
				int año = resultado.getInt("año");
				
				Parte p = new Parte(bastidor, marca, modelo,importe,año);
				lista.add(p);
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta sobre partes: "+e.getMessage());
		} finally {
			try {
				resultado.close();
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return lista;
    }


    public int insertarParte(Parte p) {
    
		Connection con = conexion.getConexion();
		PreparedStatement consulta = null;
		int resultado=0;
		
		try {
			consulta = con.prepareStatement("INSERT INTO parte(bastidor,marca,modelo,importe, año) \r\n"
					+ "VALUES\r\n"
					+ "(?,?,?,?,?)");
			
			consulta.setString(1, p.getBastidor());
			consulta.setString(2, p.getMarca());
			consulta.setString(3, p.getModelo());
			consulta.setFloat(4, p.getImporte());
			consulta.setInt(5, p.getAño());
			
			
			resultado=consulta.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al realizar la inserción de un parte: "
		        +e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

