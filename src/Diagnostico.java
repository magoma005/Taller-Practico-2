public class Diagnostico {
    private String descripcion;
    private String tratamiento;

    // Constructor con parámetros
    public Diagnostico(String descripcion, String tratamiento) {
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }

    // Getters y Setters
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

    // Método esTratamientoLargo()
    public boolean esTratamientoLargo() {
        return tratamiento.length() > 30;
    }
}

