package com.felipe.di.Factura.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope //en este caso el cliente va tener una expiracion de session cuando se cierra el navegador.
//@JsonIgnoreProperties({"targetSource", "advisors"})
public class Client {
    @Value("${client.name}")
    private String name;
    @Value("${client.lastname}")
    private String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
