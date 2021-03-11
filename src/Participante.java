import java.util.Random;

public class Participante {

    private final String nombre;
    private final String apellido;
    private final int edad;
    private final byte numeroAleatorio;

    public Participante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroAleatorio = (byte) (new Random().nextInt(6) + 1);
    }

    public Participante(Participante participante){
        this.nombre = participante.getNombre();
        this.apellido = participante.getApellido();
        this.edad = participante.getEdad();
        this.numeroAleatorio = participante.getNumeroAleatorio();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public byte getNumeroAleatorio() {
        return numeroAleatorio;
    }

    @Override
    public String toString() {
        return  "Nombre: " +  nombre +
                " Apellido: " + apellido +
                " Edad: " + edad +
                " Numero: " + numeroAleatorio;
    }
}
