package Modulos.Ejercicio10;

public class CadenaTexto {

    // Atributos privados
    private String texto;        // Cadena principal
    private String idModulo;     // Identificador del módulo
    private int longitudMaxima;  // Longitud máxima permitida

    // Constructor
    public CadenaTexto(String texto, String idModulo, int longitudMaxima) {
        this.texto = texto;
        this.idModulo = idModulo;
        this.longitudMaxima = longitudMaxima;
    }

    // Metodo 1: añade un prefijo al inicio de la cadena
    public String agregarPrefijo(String prefijo) {
        texto = prefijo + texto;
        return texto;
    }

    // Metodo 2: cuenta la cantidad de espacios en blanco en la cadena
    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }

    // Getters
    public String getTexto() { return texto; }
    public String getIdModulo() { return idModulo; }
    public int getLongitudMaxima() { return longitudMaxima; }

    // Setters
    public void setTexto(String texto) { this.texto = texto; }
    public void setIdModulo(String idModulo) { this.idModulo = idModulo; }
    public void setLongitudMaxima(int longitudMaxima) { this.longitudMaxima = longitudMaxima; }

}
