public class Diagnostico {
    private String descripcion;
    private String tratamiento;

    //Constructor

    public Diagnostico(String descripcion, String tratamiento) {
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }

    //Getters y Setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    //toString para imprimir mas facil
    @Override
    public String toString() {
        return "Diagnostico{" +
                "descripcion='" + descripcion + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                '}';
    }
}
