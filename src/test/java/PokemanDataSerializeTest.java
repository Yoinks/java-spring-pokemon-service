import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import pokemans.model.Pokeman;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PokemanDataSerializeTest {

    @Test
    void serializePokemanTest(){
        ObjectMapper mapper = new ObjectMapper();
        List<Pokeman> lp;
        try {
            lp = mapper.readValue(
                    new File("src/main/resources/pokedex.json"),
                    new TypeReference<List<Pokeman>>(){}
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
