import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import pokemans.model.Pokeman;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GeneratePokemanSQLDump {
     List<Pokeman> serializePokemanTest(){
        ObjectMapper mapper = new ObjectMapper();
        List<Pokeman> lp = null;
        try {
            lp = mapper.readValue(
                    new File("src/main/resources/pokedex.json"),
                    new TypeReference<List<Pokeman>>(){}
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
         return lp;
    }

    @Test
    void generateSQLDumpTest(){
        List<Pokeman> lp = serializePokemanTest();
        StringBuilder sb = new StringBuilder();
        String query = "INSERT INTO pokeman (name, type, hp, attack, defense, sp_attack, sp_defense, speed) VALUES ('%s','{%s}',%s,%s,%s,%s,%s,%s);";
        lp.forEach(p -> sb.append(
                String.format(
                        query,
                        p.getName().get("english"),
                        String.join(",",p.getType()),
                        p.getBase().getHp(),
                        p.getBase().getAttack(),
                        p.getBase().getDefense(),
                        p.getBase().getSp_attack(),
                        p.getBase().getSp_defense(),
                        p.getBase().getSpeed()
                )
        ));
        System.out.println(sb);
    }

}
