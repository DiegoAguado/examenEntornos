
/**
 * Esta clase tiene dos métodos, el primero devuelve una fila determinada
 * de un fichero determinado, y el segundo devuelve la latitud y la altitud 
 * dependiendo de las coordenadas.
 * 
 * @author (Diego Aguado) 
 * @version (Version documentada)
 */
public interface doc
{
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   public abstract String obtenerLinea(int x, String file);
   
   /**
    * Resumen: este método devuelve la posición geográfica (altitud y latitud)
    * según el nombre de la calle.
    * Entrada: una cadena con el nombre de la calle.
    * Salida: dos numeros con decimales: altitud y latitud.
    * Precondición: el nombre de la calle tiene que ser una cadena.
    * Postcondición: la localización de la calle mediante coordenadas (numeros )
    */
   public abstract String obtenerLocalizacion(String calle);
}
