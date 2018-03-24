package at.refugeescode.piratesofthecodebean1thecursedcoin.model;

import org.springframework.stereotype.Component;

@Component
public class JackSparrow {

    private Compass compass;

    public JackSparrow(Compass compass) {
        this.compass = compass;
    }

    public String findCoursedCoin() {
        CursedCoin cursedCoin = compass.getCursedCoin();
        if (cursedCoin == null) {
            return "I didn't find it";
        }
        return "I got it!";
    }
}
