package at.refugeescode.piratesofthecodebean1thecursedcoin.Starter;

import at.refugeescode.piratesofthecodebean1thecursedcoin.model.JackSparrow;
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
