package Modelo;

public class Sucursal {

    public Sucursal() {
        this.codigo = " ";
        this.nombreCorto = " ";
        this.direccion = " ";
        this.porcentajeDeZonaje = 0.0;
        this.coordenada = new Coordenada();

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPorcentajeDeZonaje() {
        return porcentajeDeZonaje;
    }

    public void setPorcentajeDeZonaje(double porcentajeDeZonaje) {
        this.porcentajeDeZonaje = porcentajeDeZonaje;
    }
    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }
    private String codigo;
    private String nombreCorto;
    private String direccion;
    private double porcentajeDeZonaje;
    private Coordenada coordenada;




    public Sucursal(String codigo, String nombreCorto, String direccion, double porcentajeDeZonaje, Coordenada coordenada) {
        this.codigo = codigo;
        this.nombreCorto = nombreCorto;
        this.direccion = direccion;
        this.porcentajeDeZonaje = porcentajeDeZonaje;
        this.coordenada = coordenada;

    }
}