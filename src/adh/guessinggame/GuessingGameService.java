package adh.guessinggame;
import java.util.Random;

/**
 *
 * @Drew Holloway
 */
public class GuessingGameService {
    private int correctNumber;
    private Random generator;
    private int minGuess;
    private int maxGuess;
    
    public GuessingGameService(int minGuess, int maxGuess){
        generator = new Random(System.nanoTime());
        this.minGuess=minGuess;
        this.maxGuess=maxGuess;
    }
    
    public void setCorrectNumber(){
        correctNumber=generator.nextInt(maxGuess-minGuess+1)+minGuess;
    }
    
    public Feedback testGuess(int guess){
        if (guess<correctNumber){
            // guess was too low, return -1
            return Feedback.TOO_LOW;
        } else if (guess>correctNumber){
            // guess was too high, return 1
            return Feedback.TOO_HIGH;
        } else {
            // guess was correct, return 0
            return Feedback.CORRECT;
        }
    }
        
    
    public int getCorrectNumber(){
        return correctNumber;
    }
}
