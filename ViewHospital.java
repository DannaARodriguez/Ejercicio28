
package proyhospital;
import java.util.Scanner;

/**
 *
 * @author danna
 */
public class ViewHospital {
   

    Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n===== SISTEMA HOSPITALARIO =====");
        System.out.println("1. Registrar paciente");
        System.out.println("2. Mostrar nombres de pacientes");
        System.out.println("3. Porcentaje por edades");
        System.out.println("4. Porcentaje por sexo");
        System.out.println("5. Buscar paciente");
        System.out.println("6. Porcentaje con seguro médico");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");

        return entrada.nextInt();
    }

    public String solicitarNombre() {
        entrada.nextLine();
        System.out.print("Nombre del paciente: ");
        return entrada.nextLine();
    }

    public int solicitarEdad() {
        int edad;

        do {
            System.out.print("Edad: ");

            while (!entrada.hasNextInt()) {
                System.out.println("Ingrese una edad válida.");
                entrada.next();
                System.out.print("Edad: ");
            }

            edad = entrada.nextInt();

            if (edad < 0) {
                System.out.println("La edad no puede ser negativa.");
            }

        } while (edad < 0);

        return edad;
    }

    public String solicitarSexo() {
        String sexo;

        do {
            System.out.print("Sexo (H/M): ");
            sexo = entrada.next().toUpperCase();

            if (!sexo.equals("H") && !sexo.equals("M")) {
                System.out.println("Ingrese H o M.");
            }

        } while (!sexo.equals("H") && !sexo.equals("M"));

        return sexo;
    }

    public String solicitarCalle() {
        entrada.nextLine();
        System.out.print("Calle: ");
        return entrada.nextLine();
    }

    public String solicitarNumero() {
        System.out.print("Número: ");
        return entrada.nextLine();
    }

    public String solicitarCiudad() {
        System.out.print("Ciudad: ");
        return entrada.nextLine();
    }

    public String solicitarTelefono() {
        System.out.print("Teléfono: ");
        return entrada.nextLine();
    }

    public boolean solicitarSeguro() {
        String respuesta;

        do {
            System.out.print("¿Tiene seguro médico? (S/N): ");
            respuesta = entrada.next().toUpperCase();

        } while (!respuesta.equals("S") && !respuesta.equals("N"));

        return respuesta.equals("S");
    }

    public String solicitarNombreBuscar() {
        entrada.nextLine();
        System.out.print("Nombre del paciente que desea buscar: ");
        return entrada.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

