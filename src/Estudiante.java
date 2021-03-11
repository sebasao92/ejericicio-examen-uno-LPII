public class Estudiante extends Participante {

    private final String grupo;

    public Estudiante(String nombre, String apellido, int edad, String grupo) {
        super(nombre, apellido, edad);
        this.grupo = grupo;
    }

    public Estudiante(Participante participante, String grupo){
        super(participante);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Grupo: " + grupo;
    }
}
