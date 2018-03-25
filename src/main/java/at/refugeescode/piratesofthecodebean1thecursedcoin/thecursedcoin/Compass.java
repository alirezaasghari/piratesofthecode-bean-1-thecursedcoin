package at.refugeescode.piratesofthecodebean1thecursedcoin.thecursedcoin;

import org.springframework.stereotype.Component;

@Component
public class Compass {

    private CursedCoin cursedCoin;

    public Compass(CursedCoin cursedCoin) {
        this.cursedCoin = cursedCoin;
    }

    public CursedCoin getCursedCoin() {
        return cursedCoin;
    }
}
