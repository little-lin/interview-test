import org.junit.Test;

import static org.junit.Assert.*;

public class FunGameTest {

    @Test
    public void thinking() {
        FunGame funGame = new FunGame();
//        funGame.thinking(55);
        for(int i = 1;i<=100;i++){
            funGame.thinking(i);
        }

    }

    @Test
    public void thinkingForNewRequirements() {
        FunGame funGame = new FunGame();
//        funGame.thinkingForNewRequirements(53);
        for(int i = 1;i<=100;i++){
            funGame.thinkingForNewRequirements(i);
        }
    }
}