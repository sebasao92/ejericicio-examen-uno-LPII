public class Docente extends Participante {

    private final String asignatura;

    public Docente(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public Docente(Participante participante, String asignatura){
        super(participante);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Asignatura: " + asignatura;
    }
}
