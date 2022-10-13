package Models.ToDTOs;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Models.DTOs.CatalogoDTO;

public class PostgreSQLToDTOs {

	public static List<CatalogoDTO> ConsultaSelectCatalogoToDTO(ResultSet resultadoConsulta)
    {
        List<CatalogoDTO> catalogo = new ArrayList<CatalogoDTO>();
		
        try {
        	while (resultadoConsulta.next()) {
    			catalogo.add
    				(
    					new CatalogoDTO
    						(
    								resultadoConsulta.getString("md_uuid"),
    								resultadoConsulta.getDate("md_fch"),
    								resultadoConsulta.getInt("id_producto"),
    								resultadoConsulta.getString("cod_producto"),
    								resultadoConsulta.getString("nombre_producto"),
    								resultadoConsulta.getString("tipo_producto_origen"),
    								resultadoConsulta.getString("tipo_producto_clase"),
    								resultadoConsulta.getString("des_producto"),
    								resultadoConsulta.getTimestamp("fch_alta_producto"),
    								resultadoConsulta.getTimestamp("fch_baja_producto")
    						)					
    				);
    	    }

        } catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		}
        
        return catalogo;
    }
	
}
