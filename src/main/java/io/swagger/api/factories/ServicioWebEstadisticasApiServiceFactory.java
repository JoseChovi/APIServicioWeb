package io.swagger.api.factories;

import io.swagger.api.ServicioWebEstadisticasApiService;
import io.swagger.api.impl.ServicioWebEstadisticasApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")
public class ServicioWebEstadisticasApiServiceFactory {
    private final static ServicioWebEstadisticasApiService service = new ServicioWebEstadisticasApiServiceImpl();

    public static ServicioWebEstadisticasApiService getServicioWebEstadisticasApi() {
        return service;
    }
}
