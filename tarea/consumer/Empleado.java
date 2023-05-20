package tarea.consumer;

public class Empleado {
    private String nombre;
    private Integer TiempoEmpresa;

    private float mensual;

    public Empleado(String nombre, int TiempoEmpresa, float mensual) {
        this.nombre = nombre;
        this.TiempoEmpresa = TiempoEmpresa;
        this.mensual = mensual;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTiempoEmpresa() {
        return TiempoEmpresa;
    }

    public float getMensual() {
        return mensual; }
    }