package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

@Service 
public class ContactoSimService implements InterfazContactoSim {

    private List<DatosSolicitud> solicitudesGuardadas = new ArrayList<>();

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        solicitudesGuardadas.add(sol); 
        Random random = new Random();
        return random.nextInt(100000); 
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }

    @Override
    public List<Entidad> getEntities() {
        List<Entidad> lista = new ArrayList<>();
        
        Entidad e1 = new Entidad();
        e1.setId(1);
        e1.setName("Simulador Alpha");
        e1.setDescripcion("Proceso de alta prioridad");
        
        Entidad e2 = new Entidad();
        e2.setId(2);
        e2.setName("Simulador Beta");
        e2.setDescripcion("Proceso de baja prioridad");
        
        lista.add(e1);
        lista.add(e2);
        
        return lista;
    }

    @Override
    public boolean isValidEntityId() {
        return true;
    }
}