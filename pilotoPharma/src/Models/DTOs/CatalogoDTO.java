package Models.DTOs;

import java.sql.Date;
import java.sql.Timestamp;

public class CatalogoDTO {

	// ATRIBUTOS
	String md_uuid; 				// Código de metadato que indica el grupo de inserción al que pertenece el registro.
	Date md_fch; 					// Fecha en la que se define el grupo de inserción.
	int id_producto; 				// Código numérico autoincremental que identifica unívocamente al producto dentro del sistema.
	String cod_producto; 			// Código alfanumérico que identifica unívocamente al producto dentro del catálogo.
	String nombre_producto; 		// Nombre del producto
	String tipo_producto_origen; 	// Laboratorio en el que se desarrolla el producto: “Propio” o “Externo”.
	String tipo_producto_clase; 	// Tipo del producto: “Analgésico”, “Antiséptico”, etc.
	String des_producto; 			// Descripción básica del producto.
	Timestamp fch_alta_producto; 	// Fecha de alta del producto en el catálogo.
	Timestamp fch_baja_producto; 	// Fecha de baja del producto en el catálogo.
	
	
	// CONSTRUCTORES
	
	// constructor lleno
	public CatalogoDTO(String md_uuid, Date md_fch, int id_producto, String cod_producto, String nombre_producto,
			String tipo_producto_origen, String tipo_producto_clase, String des_producto, Timestamp fch_alta_producto,
			Timestamp fch_baja_producto) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_producto = id_producto;
		this.cod_producto = cod_producto;
		this.nombre_producto = nombre_producto;
		this.tipo_producto_origen = tipo_producto_origen;
		this.tipo_producto_clase = tipo_producto_clase;
		this.des_producto = des_producto;
		this.fch_alta_producto = fch_alta_producto;
		this.fch_baja_producto = fch_baja_producto;
	}

	// constructor vacío
	public CatalogoDTO() {
		super();
	}

	
	// GETTERS Y SETTERS
	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Date getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(Date md_fch) {
		this.md_fch = md_fch;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getCod_producto() {
		return cod_producto;
	}

	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getTipo_producto_origen() {
		return tipo_producto_origen;
	}

	public void setTipo_producto_origen(String tipo_producto_origen) {
		this.tipo_producto_origen = tipo_producto_origen;
	}

	public String getTipo_producto_clase() {
		return tipo_producto_clase;
	}

	public void setTipo_producto_clase(String tipo_producto_clase) {
		this.tipo_producto_clase = tipo_producto_clase;
	}

	public String getDes_producto() {
		return des_producto;
	}

	public void setDes_producto(String des_producto) {
		this.des_producto = des_producto;
	}

	public Timestamp getFch_alta_producto() {
		return fch_alta_producto;
	}

	public void setFch_alta_producto(Timestamp fch_alta_producto) {
		this.fch_alta_producto = fch_alta_producto;
	}

	public Timestamp getFch_baja_producto() {
		return fch_baja_producto;
	}

	public void setFch_baja_producto(Timestamp fch_baja_producto) {
		this.fch_baja_producto = fch_baja_producto;
	}
	
	
	// ToString
    @Override
    public String toString() {
    	return 
    		"\t" + md_uuid + 
    		"\t" + md_fch +
    		"\t" + id_producto +
    		"\t" + cod_producto +
    		"\t" + nombre_producto +
    		"\t" + tipo_producto_origen +
    		"\t" + tipo_producto_clase +
    		"\t" + des_producto +
    		"\t" + fch_alta_producto +
    		"\t" + fch_baja_producto;
    }
}
