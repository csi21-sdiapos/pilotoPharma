import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import Models.Consultas.ConsultasPostgreSQL;
import Models.DTOs.CatalogoDTO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lo primero de todo será declarar un objeto de la clase Connection de java.sql. e inicializarlo como nulo (ya que esta clase no tiene un constructor vacío y no se puede dejar sólo declarado)
		Connection conexionGenerada = null; // este objeto será el que iremos pasando como parámetro a los métodos de consultas
				
		/****************** Obtener y mostrar la tabla "opr_cat_productos" de la BBDD *******************/
				
		List<CatalogoDTO> catalogo = new ArrayList<CatalogoDTO>();

		catalogo = ConsultasPostgreSQL.ConsultaSelectCatalogo(conexionGenerada);

		System.out.println("\n\n\tMd uuId\tMd Fecha\tID Producto\tCod Producto\tNom. Producto\tTipo Origen\t Tipo Clase\tDes. Producto\tFecha Alta\tFecha Baja");
		System.out.println("\t-------------------------------------------------------------------------------------------------");

		for(CatalogoDTO c : catalogo) {
			System.out.println(c.toString());
		}
		
		/************************* Hacemos un insert de un catálogo *********************/
        
        ConsultasPostgreSQL.ConsultaInsertCatalogo(conexionGenerada);
        
        /****************** Volvemos a obtener y mostrar la tabla "opr_cat_productos" de la BBDD *******************/
		
        catalogo = new ArrayList<CatalogoDTO>();

		catalogo = ConsultasPostgreSQL.ConsultaSelectCatalogo(conexionGenerada);

		System.out.println("\n\n\tMd uuId\tMd Fecha\tID Producto\tCod Producto\tNom. Producto\tTipo Origen\t Tipo Clase\tDes. Producto\tFecha Alta\tFecha Baja");
		System.out.println("\t-------------------------------------------------------------------------------------------------");

		for(CatalogoDTO c : catalogo) {
			System.out.println(c.toString());
		}
        
	}

}
