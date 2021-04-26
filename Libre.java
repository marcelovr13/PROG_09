public class Libre extends Alumno{

    private final float precio_hora;
    private int numeroHorasDiarias;

    public Libre(String nombre, int edad, float precio_hora, int numeroHorasDiarias) {
        super(nombre, edad);
        this.precio_hora = precio_hora;
        this.numeroHorasDiarias = numeroHorasDiarias;
    }


    @Override
    public double pagoMensual() {
        return precio_hora*numeroHorasDiarias*30;
    }

    @Override
    public String mostrarAsignaturas() {
        return "El estudiante libre " + getNombre() + "cursa " + getListaAsignaturas();
    }


}
