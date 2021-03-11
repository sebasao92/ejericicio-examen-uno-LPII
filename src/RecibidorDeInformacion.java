import java.util.InputMismatchException;
import java.util.Scanner;

public class RecibidorDeInformacion {

    private final Scanner scanner = new Scanner(System.in);

    public void recibirInformacion(){
        Estudiante estudiante = ingresarInformacionEstudiante();
        Docente docente = ingresarInformacionDocente();
        definirGanador(estudiante, docente);
    }

    public Estudiante ingresarInformacionEstudiante(){
        System.out.println("Ingrese la Información del estudiante");
        Participante participante = ingresaInformacionParticipante();
        System.out.println("Ingrese el grupo");
        String grupo = scanner.nextLine();
        return new Estudiante(participante, grupo);
    }

    public Docente ingresarInformacionDocente(){
        System.out.println("Ingrese la información del docente");
        Participante participante = ingresaInformacionParticipante();
        System.out.println("Ingrese el asignatura");
        String asignatura = scanner.nextLine();
        return new Docente(participante, asignatura);
    }

    public Participante ingresaInformacionParticipante(){
        System.out.println("Ingrese el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = scanner.nextLine();
        int edad = obtenerEdad();
        return new Participante(nombre, apellido, edad);
    }

    public void definirGanador(Estudiante estudiante, Docente docente){
        if(estudiante.getNumeroAleatorio() > docente.getNumeroAleatorio()){
            imprimirGanador(estudiante);
        } else if(estudiante.getNumeroAleatorio() < docente.getNumeroAleatorio()){
            imprimirGanador(docente);
        } else {
            System.out.println("¡EMPATE!");
        }
    }

    public void imprimirGanador(Participante participante){
        System.out.println("El Ganador es:");
        System.out.println(participante);
    }

    public int obtenerEdad(){
        int edad = 0;
        boolean salir = false;

        while(!salir) {
            try {
                System.out.println("Ingrese la edad");
                edad = scanner.nextInt();
                salir = true;
            } catch (InputMismatchException ex) {
                System.out.println("La edad ingresada no tiene un formato válido");
            }
            scanner.nextLine();
        }

        return edad;
    }
}
