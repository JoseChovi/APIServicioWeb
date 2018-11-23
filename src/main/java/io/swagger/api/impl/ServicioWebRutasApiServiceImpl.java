package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import java.util.Date;

import io.swagger.api.impl.personaRutas;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")

public class ServicioWebRutasApiServiceImpl extends ServicioWebRutasApiService {
    
    
     public ArrayList<personaRutas> addPersonaRutas(){
       ArrayList<personaRutas> xd = new ArrayList<personaRutas>();
      // String st = "1122-11-11";
       personaRutas a1 = new personaRutas(1,"1122-11-11",89.1,"18:00h","19:21h");
       xd.add(a1);
       personaRutas a2 = new personaRutas(2,"11/02/2012",95.1,"18:00h","19:21h");
       xd.add(a2);
       return xd;
   }
    
    @Override
    //ruta seguida, parameters: distacia horafin horainicio id
    public Response getRutaID( Integer personaID,  String fecha, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        ArrayList<personaRutas> fin = this.addPersonaRutas();
        for (int i = 0; i < fin.size(); i++) {
            System.out.println("MOSTRANDO LISTA: " + fin.get(i).getID() + " " + fin.get(i).getFecha() + " " + fin.get(i).getDistancia());
        }
        
        personaRutas x = new personaRutas();
        personaRutas n = new personaRutas();
        for (int i = 0; i < fin.size(); i++) {
            x = fin.get(i);
            if (x.getID() == personaID && x.getFecha().equals(fecha)){
                n = fin.get(i);
            }
        }
        
        
        return Response.ok().entity(n).build();
    }
    
}

