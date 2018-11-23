package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.util.ArrayList;
import io.swagger.api.impl.persona;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")

public class ServicioWebEstadisticasApiServiceImpl extends ServicioWebEstadisticasApiService {
   
   
   public ArrayList<persona> addPersona(){
       ArrayList<persona> xd = new ArrayList<persona>();
       persona a1 = new persona(1,12,123);
       xd.add(a1);
       persona a2 = new persona(2,11,0);
       xd.add(a2);
       return xd;
   }
    
    @Override
    public Response getEstadisticasServicioWeb( Integer personaID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
       ArrayList<persona> fin = this.addPersona();
        
        for (int i = 0; i < fin.size(); i++) {
            System.out.println("MOSTRANDO LISTA: " + fin.get(i).getID() + " " + fin.get(i).getPasos() + " " + fin.get(i).getRitmo());
        }
        
        persona x = new persona();
        persona n = new persona();
        for (int i = 0; i < fin.size(); i++) {
            x = fin.get(i);
            if (x.getID() == personaID){
                n = fin.get(i);
            }
        }
        
        
        return Response.ok().entity(n).build();
    }
    
}

