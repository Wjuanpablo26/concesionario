package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Consecionario {

    private String nombre;
    private List<Vehiculo> vehiculos;
    private List<Persona> personas;
    private List<Venta> ventas;
    private List<Compra> compras;
    private List<Alquiler> alquileres;

    /*
     * Constructor de la clase Consecionario
     */
    public Consecionario(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
        personas = new ArrayList<>();
        ventas = new ArrayList<>();
        compras = new ArrayList<>();
        alquileres = new ArrayList<>();
    }

    /*
     * Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    /*
     * Metodos CRUD
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public void eliminarPersona(Persona persona) {
        personas.remove(persona);
    }

    public void eliminarVenta(Venta venta) {
        ventas.remove(venta);
    }

    public void eliminarCompra(Compra compra) {
        compras.remove(compra);
    }

    public void eliminarAlquiler(Alquiler alquiler) {
        alquileres.remove(alquiler);
    }

    public Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    public Persona buscarPersona(String cedula) {
        for (Persona persona : personas) {
            if (persona.getCedula().equals(cedula)) {
                return persona;
            }
        }
        return null;
    }

    public Venta buscarVenta(String id) {
        for (Venta venta : ventas) {
            if (venta.getId().equals(id)) {
                return venta;
            }
        }
        return null;
    }

    public Compra buscarCompra(String id) {
        for (Compra compra : compras) {
            if (compra.getId().equals(id)) {
                return compra;
            }
        }
        return null;
    }

    public Alquiler buscarAlquiler(String id) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getId().equals(id)) {
                return alquiler;
            }
        }
        return null;
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    public List<Persona> listarPersonas() {
        return personas;
    }

    public List<Venta> listarVentas() {
        return ventas;
    }

    public List<Compra> listarCompras() {
        return compras;
    }

    public List<Alquiler> listarAlquileres() {
        return alquileres;
    }

    

    
}
