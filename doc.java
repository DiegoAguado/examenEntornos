
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
}
