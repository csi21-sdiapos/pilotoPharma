package Models.Consultas;

import java.util.ArrayList;
import java.util.List;

import Models.Conexiones.ConexionPostgreSQL;
import Models.DTOs.CatalogoDTO;
import Models.ToDTOs.PostgreSQLToDTOs;
import Util.VariablesConexionPostgreSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasPostgreSQL {
	
/**************************************** CONSULTAS SELECT *********************************************/
	
    public static List<CatalogoDTO> ConsultaSelectCatalogo(Connection conexionGenerada)
    {
        List<CatalogoDTO> catalogo = new ArrayList<CatalogoDTO>();
        
        // Declaramos el Statement(declaraciónSQL) y el ResultSet(resultadoSQL) y los inicializamos como null
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		
		// También declaramos un objeto de nuestra clase ConexionPostgreSQL y lo inicializamos con su constructor vacío
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		// creamos la conexión a nuestra BBDD con el objeto de la clase Connection, y utilizando el método de generaConexion() de nuestra clase ConexionPostgreSQL, el cual nos pedirá los parámetros de conexión...
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				// Definimos la consulta y la ejecutamos
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"dlk_operacional_productos\".\"opr_cat_productos\"");
				
				// Recogemos en una lista los datos resultantes de llamar a nuestra consulta 
				catalogo = PostgreSQLToDTOs.ConsultaSelectCatalogoToDTO(resultadoConsulta);

				// Cerramos el resultado y la declaración de la consulta
				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    // Cerramos la conexión con la BBDD
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
		return catalogo;
    }

	/*************************************** CONSULTAS INSERTS ******************************************/
    public static void ConsultaInsertCatalogo(Connection conexionGenerada)
    {
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("INSERT INTO \"dlk_operacional_productos\".\"opr_cat_productos\" (md_uuid, md_fch, id_producto, cod_producto, nombre_producto, tipo_producto_origen, tipo_producto_clase, des_producto, fch_alta_producto, fch_baja_producto) VALUES ('111AAA', '2022-10-13', DEFAULT, 'a1', 'RedBull', 'denominacion EEUU', 'denominacion ESP', 'bebida energetica', TIMESTAMP '2022-10-12 13:00:00', TIMESTAMP '2022-10-13 14:00:00')");

				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
    }
}
