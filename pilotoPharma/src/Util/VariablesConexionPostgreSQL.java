package Util;

public class VariablesConexionPostgreSQL {

	//Datos de conexión a PostgreSQL
		static final String USER = "postgres";
		static final String PASS = "12345";
		static final String PORT = "5432";
		static final String HOST = "localhost";
		static final String DB = "opr_cat_productos";	
		
		public static String getUser() {
			return USER;
		}
		public static String getPass() {
			return PASS;
		}
		public static String getPort() {
			return PORT;
		}
		public static String getHost() {
			return HOST;
		}
		public static String getDb() {
			return DB;
		}
}
