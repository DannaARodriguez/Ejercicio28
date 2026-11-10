
package proyhospital;

/**
 *
 * @author danna
 */
public class Paciente {
    

    // Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private String calle;
    private String numero;
    private String ciudad;
    private String telefono;
    private boolean seguro;

    // Constructor
    public Paciente(String nombre, int edad, String sexo,
            String calle, String numero, String ciudad,
            String telefono, boolean seguro) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.seguro = seguro;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isSeguro() {
        return seguro;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
}


