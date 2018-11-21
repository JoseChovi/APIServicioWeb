package io.swagger.api.factories;

import io.swagger.api.ServicioWebRutasApiService;
import io.swagger.api.impl.ServicioWebRutasApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")
public class ServicioWebRutasApiServiceFactory {
    private final static ServicioWebRutasApiService service = new ServicioWebRutasApiServiceImpl();

    public static ServicioWebRutasApiService getServicioWebRutasApi() {
        return service;
    }
}
