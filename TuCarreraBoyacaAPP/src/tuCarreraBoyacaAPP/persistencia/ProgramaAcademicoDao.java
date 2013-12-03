/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.logica.ProgramaAcademico;

/**
 * @author JUDIT
 *
 */
public class ProgramaAcademicoDao {
//Attributes----------------------------------
	private ProgramaAcademicoSql academicoSql;
	private Conexion conexion;
	
//Building------------------------------------
	public ProgramaAcademicoDao(){
		academicoSql=new ProgramaAcademicoSql();
		conexion=new Conexion();
	}

//Methods-------------------------------------
	/**
	 * 
	 * @param programa
	 * @return -1 si el comando sql no se ejecuta correctamente
	 */
	public int insertPrograma(ProgramaAcademico programa){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.insertPrograma(programa));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param idPrograma
	 * @return -1 si el comando sql no se ejecuta correctamente
	 */
	public int deletePrograma(int idPrograma){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.deletePrograma(idPrograma));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param programa
	 * @return -1 si el comando sql no se ejecuta correctamente
	 */
	public int updatePrograma(ProgramaAcademico programa){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.updatePrograma(programa));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}

	/**
	 * 
	 * @return null - si no hay registros en la base de datos, y en caso contrario retorna objeto de tipo ResultSet con los datos de la base de datos
	 * 
	 */
	public ArrayList<ProgramaAcademico> selectProgramas(){
		ResultSet datos;
		ProgramaAcademico programa;
		ArrayList<ProgramaAcademico> academicos = new ArrayList<ProgramaAcademico>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(academicoSql.selectProgramas());
				while (datos.next()) {
					int id = Integer.parseInt(datos.getString("ID_PROGRAMA_ACADEMICO"));
					int idArea = Integer.parseInt(datos.getString("ID_AREA"));
					String nombre = datos.getString("NOMBRE_PROGRAMA_ACADEMICO");
					String costo = datos.getString("COSTO_PROGRAMA");
					int idInstitucion = Integer.parseInt(datos.getString("ID_INSTITUCION"));
					programa = new ProgramaAcademico(id, idArea, nombre, costo, idInstitucion);
					
				}
				return academicos;
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @return null - si no hay registros en la base de datos, y en caso contrario retorna objeto de tipo ResultSet con los datos de la base de datos
	 */
	public ArrayList<String []> selectAreas(){
		ResultSet datos;
		ArrayList<String []> resultado = new ArrayList<String []>();
		String [] aux = new String[2];
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(academicoSql.selectAreas());
				while (datos.next()){
					aux[0] = datos.getString("ID_AREA");
					aux[1] = datos.getString("NOMBRE_AREA");
					resultado.add(aux);
				}
				
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
}
