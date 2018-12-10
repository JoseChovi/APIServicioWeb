package io.swagger.api.basededatos;

import java.sql.*;

public class ConexionDB {

    // Ruta de nuestra base de datos
    private String servidor = "jdbc:mysql://eu-cdbr-west-02.cleardb.net:3306/heroku_2775fdda06665ac";
    //private String servidor = "jdbc:mysql://eu-cdbr-west-02.cleardb.net:3306/heroku_2775fdda06665ac";

    // Nombre de usuario de mysql
    //private String username = "sql7267476";
    private String username = "b162b90eac8d6b";

    // Clave de usuario de mysql
    //private String password = "9EqPaz4ZjV";
    private String password = "e393c0d385012b0";

    // Nuestra librería mysql
   // private String driver = "com.mysql.jdbc.Driver";

    // Objeto del tipo Connection para crear la conexión
    private Connection con;
    
    

    public void Conexion()
    
    {
        
        
        try {
            // Cargar drivers de MySQL
            //Class.forName(driver);
            
            // Establecer la conexion con la base de datos
            //jdbc:postgresql://<host>:<port>/<dbname>?user=<username>&password=<password>
            
            con = DriverManager.getConnection(servidor, username, password);
            //con=DriverManager.getConnection(System.getenv("CLEARDB_DATABASE_URL"));
            //con = DriverManager.getConnection(urlTotal);


            System.out.println("Conexión realizada a la base de datos con éxito.");
        } catch (/*ClassNotFoundException |*/ SQLException e) {
            e.printStackTrace();
            System.out.println("Error!, conexión fallida a la base de datos.");
        }
        
    }

    public Connection getConnection() {
        return con; // Retorno el objeto Connection
    }
    
    public void insertarPrediccion(float t_respuesta, Timestamp fecha_hora, int porcentaje) {


        // Pasamos el objeto Connection de nuestra clase "ConexionBD" a esta instancia por medio del método getConnection()
        //Connection con = getConnection();
        
        PreparedStatement preparedStatement;

        // Crear sentencia SQL para insertar en la base de datos
       String insertTableSQL = "INSERT INTO web_prediccion"
                + "(t_respuesta, time, porcentaje) VALUES"
                + "(?,?,?)";

        try {
            Connection con = this.con;
            preparedStatement = con.prepareStatement(insertTableSQL);

            preparedStatement.setFloat(1, t_respuesta);
            preparedStatement.setTimestamp(2, fecha_hora); //Formato: "Y-m-d H:i:s"
            preparedStatement.setInt(3, porcentaje);
          
            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            System.out.println("Alerta insertada en la BD!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } 
    }
    
    public void insertarAlertas(float t_respuesta, Timestamp fecha_hora) {


        // Pasamos el objeto Connection de nuestra clase "ConexionBD" a esta instancia por medio del método getConnection()
        //Connection con = getConnection();
        
        PreparedStatement preparedStatement;

        // Crear sentencia SQL para insertar en la base de datos
       String insertTableSQL = "INSERT INTO web_alertas"
                + "(t_respuesta, time) VALUES"
                + "(?,?)";

        try {
            Connection con = this.con;
            preparedStatement = con.prepareStatement(insertTableSQL);

            preparedStatement.setFloat(1, t_respuesta);
            preparedStatement.setTimestamp(2, fecha_hora); //Formato: "Y-m-d H:i:s"
           
          
            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            System.out.println("Alerta insertada en la BD!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } 
    }
}