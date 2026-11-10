
package proyhospital;
import proyhospital.Paciente;
import proyhospital.ViewHospital;
/**
 *
 * @author danna
 */
public class ControlHospital {
 

    private Paciente pacientes[];
    private int cantidad;
    private ViewHospital vista;

    public ControlHospital(ViewHospital vista) {
        this.vista = vista;
        pacientes = new Paciente[100];
        cantidad = 0;
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    registrarPaciente();
                    break;

                case 2:
                    mostrarNombres();
                    break;

                case 3:
                    porcentajeEdades();
                    break;

                case 4:
                    porcentajeSexo();
                    break;

                case 5:
                    buscarPaciente();
                    break;

                case 6:
                    porcentajeSeguro();
                    break;

                case 7:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;

                default:
                    vista.mostrarMensaje("Opción no válida.");
            }

        } while (opcion != 7);
    }

    private void registrarPaciente() {

        if (cantidad >= pacientes.length) {
            vista.mostrarMensaje("No hay espacio para más pacientes.");
            return;
        }

        String nombre = vista.solicitarNombre();
        int edad = vista.solicitarEdad();
        String sexo = vista.solicitarSexo();
        String calle = vista.solicitarCalle();
        String numero = vista.solicitarNumero();
        String ciudad = vista.solicitarCiudad();
        String telefono = vista.solicitarTelefono();
        boolean seguro = vista.solicitarSeguro();

        pacientes[cantidad] = new Paciente(
                nombre, edad, sexo, calle,
                numero, ciudad, telefono, seguro);

        cantidad++;

        vista.mostrarMensaje("Paciente registrado correctamente.");
    }

    private void mostrarNombres() {

        if (cantidad == 0) {
            vista.mostrarMensaje("No hay pacientes registrados.");
            return;
        }

        vista.mostrarMensaje("===== LISTA DE PACIENTES =====");

        for (int i = 0; i < cantidad; i++) {
            vista.mostrarMensaje((i + 1) + ". "
                    + pacientes[i].getNombre());
        }
    }

    private void porcentajeEdades() {

        if (cantidad == 0) {
            vista.mostrarMensaje("No hay pacientes registrados.");
            return;
        }

        int ninos = 0;
        int jovenes = 0;
        int adultos = 0;

        for (int i = 0; i < cantidad; i++) {

            int edad = pacientes[i].getEdad();

            if (edad <= 13) {
                ninos++;
            } else if (edad < 30) {
                jovenes++;
            } else {
                adultos++;
            }
        }

        vista.mostrarMensaje("===== PORCENTAJE POR EDADES =====");
        vista.mostrarMensaje("Niños: "
                + (ninos * 100.0 / cantidad) + "%");
        vista.mostrarMensaje("Jóvenes: "
                + (jovenes * 100.0 / cantidad) + "%");
        vista.mostrarMensaje("Adultos: "
                + (adultos * 100.0 / cantidad) + "%");
    }

    private void porcentajeSexo() {

        if (cantidad == 0) {
            vista.mostrarMensaje("No hay pacientes registrados.");
            return;
        }

        int hombres = 0;
        int mujeres = 0;

        for (int i = 0; i < cantidad; i++) {

            if (pacientes[i].getSexo().equals("H")) {
                hombres++;
            } else {
                mujeres++;
            }
        }

        vista.mostrarMensaje("===== PORCENTAJE POR SEXO =====");
        vista.mostrarMensaje("Hombres: "
                + (hombres * 100.0 / cantidad) + "%");
        vista.mostrarMensaje("Mujeres: "
                + (mujeres * 100.0 / cantidad) + "%");
    }

    private void buscarPaciente() {

        if (cantidad == 0) {
            vista.mostrarMensaje("No hay pacientes registrados.");
            return;
        }

        String nombre = vista.solicitarNombreBuscar();
        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++) {

            if (pacientes[i].getNombre().equalsIgnoreCase(nombre)) {

                Paciente p = pacientes[i];

                vista.mostrarMensaje("===== DATOS DEL PACIENTE =====");
                vista.mostrarMensaje("Nombre: " + p.getNombre());
                vista.mostrarMensaje("Edad: " + p.getEdad());
                vista.mostrarMensaje("Sexo: " + p.getSexo());
                vista.mostrarMensaje("Calle: " + p.getCalle());
                vista.mostrarMensaje("Número: " + p.getNumero());
                vista.mostrarMensaje("Ciudad: " + p.getCiudad());
                vista.mostrarMensaje("Teléfono: " + p.getTelefono());
                vista.mostrarMensaje("Seguro médico: "
                        + (p.isSeguro() ? "Sí" : "No"));

                encontrado = true;
            }
        }

        if (!encontrado) {
            vista.mostrarMensaje("Paciente no encontrado.");
        }
    }

    private void porcentajeSeguro() {

        if (cantidad == 0) {
            vista.mostrarMensaje("No hay pacientes registrados.");
            return;
        }

        int asegurados = 0;

        for (int i = 0; i < cantidad; i++) {

            if (pacientes[i].isSeguro()) {
                asegurados++;
            }
        }

        double porcentaje = asegurados * 100.0 / cantidad;

        vista.mostrarMensaje("Porcentaje de pacientes con seguro médico: "
                + porcentaje + "%");
    }
}

