package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import java.util.Date;
import java.util.*;
import java.text.DateFormat;
import java.util.concurrent.ThreadLocalRandom;
import java.text.SimpleDateFormat;
import io.swagger.api.basededatos.ConexionDB;
import java.util.ArrayList;
import io.swagger.api.impl.persona;
import io.swagger.api.impl.personaPred;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.util.Date;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")

public class ServicioWebPrediccionApiServiceImpl extends ServicioWebPrediccionApiService {
    
     public ArrayList<personaPred> addPersonaPred(){
       ArrayList<personaPred> xd = new ArrayList<personaPred>();
      // String st = "1122-11-11";
       personaPred a1 = new personaPred(1,"1122-11-11",89.1);
       xd.add(a1);
       personaPred a2 = new personaPred(2,"11/02/2012",95.1);
       xd.add(a2);
       return xd;
   }
    
    
    @Override
    public Response getPrediccionPersona( Integer personaID,  String fecha, SecurityContext securityContext) throws NotFoundException {
        ArrayList<personaPred> fin = this.addPersonaPred();
        
        //Conexion a la base de datos
        ConexionDB bd= new ConexionDB();
        bd.Conexion();
        
        //Generar el fecha_hora
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date = new Date();
        String fecha_hora=dateFormat.format(date);
        
        for (int i = 0; i < fin.size(); i++) {
            System.out.println("MOSTRANDO LISTA: " + fin.get(i).getID() + " " + fin.get(i).getFecha() + " " + fin.get(i).getPrediccion());
        }
        
        personaPred x = new personaPred();
        personaPred n = new personaPred();
        for (int i = 0; i < fin.size(); i++) {
            x = fin.get(i);
            if (x.getID() == personaID && x.getFecha().equals(fecha)){
                n = fin.get(i);
            }
        }
        
        int t_respuesta=ThreadLocalRandom.current().nextInt(10, 30 + 1);
        int porcentaje=ThreadLocalRandom.current().nextInt(10, 90 + 1);
        
         //Insertar en la BD
         bd.insertarPrediccion(t_respuesta, fecha_hora, porcentaje);
        
        return Response.ok().entity(n).build();
    }
    
}

