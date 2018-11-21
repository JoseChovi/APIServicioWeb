package io.swagger.api.factories;

import io.swagger.api.ServicioWebAlertasApiService;
import io.swagger.api.impl.ServicioWebAlertasApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")
public class ServicioWebAlertasApiServiceFactory {
    private final static ServicioWebAlertasApiService service = new ServicioWebAlertasApiServiceImpl();

    public static ServicioWebAlertasApiService getServicioWebAlertasApi() {
        return service;
    }
}
