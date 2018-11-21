package io.swagger.api.factories;

import io.swagger.api.ServicioWebPrediccionApiService;
import io.swagger.api.impl.ServicioWebPrediccionApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")
public class ServicioWebPrediccionApiServiceFactory {
    private final static ServicioWebPrediccionApiService service = new ServicioWebPrediccionApiServiceImpl();

    public static ServicioWebPrediccionApiService getServicioWebPrediccionApi() {
        return service;
    }
}
