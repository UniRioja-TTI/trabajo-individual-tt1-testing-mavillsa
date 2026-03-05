package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.*;
import servicios.ContactoSimService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.DatosSolicitud;

class ContactoSimServiceTest {

    private ContactoSimService servicio;

    @BeforeEach
    void setUp() {
        servicio = new ContactoSimService();
    }

    @Test
    void testServicioVacio() {
        assertTrue(servicio.getEntities().isEmpty(), "La lista de entidades debería estar vacía");
        assertFalse(servicio.isValidEntityId(), "Debería ser false por defecto");
        assertNull(servicio.descargarDatos(1), "Debería devolver null por defecto");
        
        DatosSolicitud mockDatos = new DatosSolicitud(null);
        assertEquals(-1, servicio.solicitarSimulation(mockDatos), "Debería devolver -1");
    }
}