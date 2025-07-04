public class Consulta {
    private String codigo;
    private String fecha;
    private Diagnostico diagnostico;

    // Constructor con parámetros
    public Consulta(String codigo, String fecha, Diagnostico diagnostico) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    // Método mostrarConsulta()
    public void mostrarConsulta() {
        System.out.println("Consulta #" + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Diagnóstico: " + diagnostico.getDescripcion());
        System.out.println("Tratamiento: " + diagnostico.getTratamiento());

        if (diagnostico.esTratamientoLargo()) {
            System.out.println("El tratamiento es extenso, se requiere seguimiento adicional.");
        }
    }
}
