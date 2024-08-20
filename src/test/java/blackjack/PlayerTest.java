package blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    
    @Test
    void 생성() {
        // given
        String name = "pobi";

        // when
        Player player = Player.of(name);
        
        // then
        assertThat(player.getName()).isEqualTo(name);
    }
}
