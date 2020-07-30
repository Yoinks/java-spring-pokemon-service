package pokemans.model;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Pokeman {
    private int id;
    private Map name;
    private String[] type;
    private PokemanStats base;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map getName() {
        return name;
    }

    public void setName(Map name) {
        this.name = name;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public PokemanStats getBase() {
        return base;
    }

    public void setBase(PokemanStats base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokeman pokeman = (Pokeman) o;
        return id == pokeman.id &&
                name.equals(pokeman.name) &&
                Arrays.equals(type, pokeman.type) &&
                base.equals(pokeman.base);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, base);
        result = 31 * result + Arrays.hashCode(type);
        return result;
    }
}
