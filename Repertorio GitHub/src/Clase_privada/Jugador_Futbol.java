package Clase_privada;

public class Jugador_Futbol {
    private int cedula;
    private String nombre;
    private int camiseta;

    public Jugador_Futbol(int cedula, String nombre, int camiseta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.camiseta = camiseta;
    }

    private void mostrar_info(){
        System.out.println("--- Jugador ---\nCedula: "+cedula+"--Nombre: "+nombre+"--Camiseta: "+camiseta);
    }
}

class Defensa extends probando.Jugador_Futbol {
    public String posicion;
    public int tarjetas;
    public int goles;
    public int faltas;

    public Defensa(int cedula, String nombre,int camiseta,String posicion, int tarjetas, int goles, int faltas){
        super(cedula, nombre, camiseta);
        this.posicion=posicion;
        this.tarjetas=tarjetas;
        this.goles=goles;
        this.faltas=faltas;
    }
    public void mostrar_info_Defensa(){
        super.mostrar_info();
        System.out.println("Posición: " + posicion);
        System.out.println("Tarjetas: " + tarjetas);
        System.out.println("Goles: " + goles);
        System.out.println("Faltas: " + faltas);
    }
}