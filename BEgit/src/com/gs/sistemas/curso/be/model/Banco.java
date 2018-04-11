package com.gs.sistemas.curso.be.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Banco {

    private final String nombre = "Java Bank";
    private Direccion dir;
    private String tel;
    private String rfc;
    private List<Persona> personas = new ArrayList<>();
    private static final Banco instancia = new Banco();

    private Banco() {
        this.dir = new Direccion();
        this.tel = "5555-4444";
        this.rfc = "RFC-123456";
        // HARDCODE
        personas.add(new Ejecutivo(1, "Ejecutivo 1", "1111-1111", new Domicilio("Calle 1", 1)));
        personas.add(new Ejecutivo(2, "Ejecutivo 2", "2222-2222", new Domicilio("Calle 2", 2)));
        personas.add(new Cliente(1000, "Cliente 1000", "1000-1000", new Domicilio("Calle 1000", 1000)));
        personas.add(new Cliente(2000, "Cliente 2000", "2000-2000", new Domicilio("Calle 2000", 2000)));
    }

    public static Banco getInstance() {
        return instancia;
    }

    public void muestraBienvenida() {
        StringBuilder sb = new StringBuilder();
        sb.append("||=======================================================||").append("\n");
        sb.append("||             WELCOME TO ").append(nombre).append("                      ");
        sb.append("||").append("\n");
        sb.append("||-------------------------------------------------------||").append("\n");
        System.out.println(sb.toString());
    }

    public Optional<Ejecutivo> loginEjecutivo(int id, String clave) {
        Optional<Ejecutivo> oE = Optional.empty();
        Stream flujoPersonas = personas.stream();
        oE = flujoPersonas.filter(p -> p instanceof Ejecutivo)
                .map(p -> (Ejecutivo) p)
                .filter(e -> ((Ejecutivo)e).getId() == id)
                .findFirst();
        return oE;
    }

    public void altaCliente(Cliente c) {
        personas.add(c);
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the dir
     */
    public Direccion getDir() {
        return dir;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @return the personas
     */
    public List<Persona> getPersonas() {
        return personas;
    }

    public void imprimeClientes() {
        personas.stream().filter(p -> p instanceof Cliente).forEach(
                c -> System.out.println(c)
        );
    }
}
