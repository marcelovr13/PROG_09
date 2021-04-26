public class Presencial extends Alumno {

    private double matriculaCurso;
    private int numeroConvocatoria;
    private double plusPorConvocatoria;

    public Presencial(String nombre, int edad, double matriculaCurso, int numeroConvocatoria, double plusPorConvocatoria) {
        super(nombre, edad);
        this.matriculaCurso = matriculaCurso;
        this.numeroConvocatoria = numeroConvocatoria;
        this.plusPorConvocatoria = plusPorConvocatoria;
    }

    public double getMatriculaCurso() {
        return matriculaCurso;
    }

    public void setMatriculaCurso(double matriculaCurso) {
        this.matriculaCurso = matriculaCurso;
    }

    public int getNumeroConvocatoria() {
        return numeroConvocatoria;
    }

    public void setNumeroConvocatoria(int numeroConvocatoria) {
        this.numeroConvocatoria = numeroConvocatoria;
    }

    public double getPlusPorConvocatoria() {
        return plusPorConvocatoria;
    }

    public void setPlusPorConvocatoria(double plusPorConvocatoria) {
        this.plusPorConvocatoria = plusPorConvocatoria;
    }

    @Override
    public double pagoMensual() {
        return (matriculaCurso+plusPorConvocatoria*numeroConvocatoria) / 12;
    }

    @Override
    public String mostrarAsignaturas() {
        return null;
    }


}
