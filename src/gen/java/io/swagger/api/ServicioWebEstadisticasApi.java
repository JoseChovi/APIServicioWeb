package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ServicioWebEstadisticasApiService;
import io.swagger.api.factories.ServicioWebEstadisticasApiServiceFactory;

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


@Path("/ServicioWebEstadisticas")


@io.swagger.annotations.Api(description = "the ServicioWebEstadisticas API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")

public class ServicioWebEstadisticasApi  {
   private final ServicioWebEstadisticasApiService delegate;

   public ServicioWebEstadisticasApi(@Context ServletConfig servletContext) {
      ServicioWebEstadisticasApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ServicioWebEstadisticasApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ServicioWebEstadisticasApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ServicioWebEstadisticasApiServiceFactory.getServicioWebEstadisticasApi();
      }

      this.delegate = delegate;
   }


    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "encontrar las estadísticas del ServicioWeb por ID", notes = "obtiene las estadísticas del ServicioWeb en el servidor", response = Void.class, tags={ "Estadisticas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response getEstadisticasServicioWeb(@ApiParam(value = "estadisticas del ID indicado") @QueryParam("personaID") Integer personaID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEstadisticasServicioWeb(personaID,securityContext);
    }

}

