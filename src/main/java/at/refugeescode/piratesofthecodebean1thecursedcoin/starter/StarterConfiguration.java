package at.refugeescode.piratesofthecodebean1thecursedcoin.starter;

import at.refugeescode.piratesofthecodebean1thecursedcoin.thecursedcoin.JackSparrow;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfiguration {

    @Bean
    public ApplicationRunner startApplication(JackSparrow jackSparrow) {
        return args -> {
            String text = jackSparrow.findCoursedCoin();
            System.out.println(text);
        };
    }
}
