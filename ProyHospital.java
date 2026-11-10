
package proyhospital;
import java.util.Scanner;
import proyhospital.ViewHospital;
import proyhospital.ControlHospital;
/**
 *
 * @author danna
 */
public class ProyHospital {

   

    public static void main(String[] args) {

        ViewHospital vista = new ViewHospital();

        ControlHospital control = new ControlHospital(vista);

        control.iniciar();
    }
}
   
    
    

