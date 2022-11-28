/**
 * Provides a factory method for creating word search games. 
 *
 * @author Kirpa Chahal (ksc0037@auburn.edu)
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 11/3/19
 */
public class WordSearchGameFactory {
   public static WordSearchGame createGame() {
      return new WordSearchEngine();
   }
}