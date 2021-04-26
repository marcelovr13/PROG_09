import java.util.Arrays;

public abstract class Alumno extends Persona {

    private int curso;
    private String nivelAcademico;
    private String[] listaAsignaturas;

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String[] getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(String[] listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre=" + getNombre() +
                "curso=" + curso +
                ", nivelAcademico='" + nivelAcademico + '\'' +
                ", listaAsignaturas=" + Arrays.toString(listaAsignaturas) +
                '}';
    }


    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    public abstract double pagoMensual();
    public abstract String mostrarAsignaturas();
}
