package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ServicioWebAlertasApiService;
import io.swagger.api.factories.ServicioWebAlertasApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/ServicioWebAlertas")


@io.swagger.annotations.Api(description = "the ServicioWebAlertas API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")

public class ServicioWebAlertasApi  {
   private final ServicioWebAlertasApiService delegate;

   public ServicioWebAlertasApi(@Context ServletConfig servletContext) {
      ServicioWebAlertasApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ServicioWebAlertasApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ServicioWebAlertasApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ServicioWebAlertasApiServiceFactory.getServicioWebAlertasApi();
      }

      this.delegate = delegate;
   }


    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Alertas del servicio Web", notes = "Obtiene las alertas a través del servicio web de una persona", response = Void.class, tags={ "Alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response getAlertaServicioWeb(@ApiParam(value = "obtiene las alerta del servicio web dado el id de una persona") @QueryParam("personaID") Integer personaID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAlertaServicioWeb(personaID,securityContext);
    }

}

