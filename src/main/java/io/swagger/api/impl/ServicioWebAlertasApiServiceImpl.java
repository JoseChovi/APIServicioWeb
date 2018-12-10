package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.api.impl.alerta;
import java.sql.Timestamp;
import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;
import io.swagger.api.basededatos.ConexionDB;

import java.util.*;
import java.text.DateFormat;
import java.util.concurrent.ThreadLocalRandom;
import java.text.SimpleDateFormat;
import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.ArrayList;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")

public class ServicioWebAlertasApiServiceImpl extends ServicioWebAlertasApiService {
   alerta xds;
   
   
   public ArrayList<alerta> addalert(){
       ArrayList<alerta> xd = new ArrayList<alerta>();
       alerta a1 = new alerta(1,"222", "333");
       xd.add(a1);
       alerta a2 = new alerta(2,"32312", "123213");
       xd.add(a2);
       return xd;
   }
    
    @Override
    public Response getAlertaServicioWeb( Integer personaID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        
        //Conexion a la base de datos
        ConexionDB bd= new ConexionDB();
        bd.Conexion();
        //coment
        
        ArrayList<alerta> fin = this.addalert();
        
        for (int i = 0; i < fin.size(); i++) {
            System.out.println("MOSTRANDO LISTA: " + fin.get(i).getID() + " " + fin.get(i).getFecha() + " " + fin.get(i).getHora());
        }
        
        alerta x = new alerta();
        alerta n = new alerta();
        for (int i = 0; i < fin.size(); i++) {
            x = fin.get(i);
            if (x.getID() == personaID){
                n = fin.get(i);
            }
        }
        
        //Generar el fecha_hora
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date = new Date();
        Timestamp fecha_hora= new Timestamp(date.getTime());
        
        int t_respuesta=ThreadLocalRandom.current().nextInt(10, 30 + 1);

        //Insertar en la BD
         bd.insertarAlertas(t_respuesta, fecha_hora);
        
        return Response.ok().entity(n).build();
    }
    
}