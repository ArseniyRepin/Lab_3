package fairytale;

import java.util.Objects;

public class Headdress extends Clothes{
    private final int size;
    private final String type;
    private final String condition;

    Headdress(String type, int size, String condition) {
        this.size = size;
        this.type = type;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Headdress {" + "type = " + type + ", " + "size = " + size + ", " + "condition = " + condition + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Headdress)) return false;
        Headdress headdress = (Headdress) obj;
        return Objects.equals(size, headdress.size) && Objects.equals(type, headdress.type) && Objects.equals(condition, headdress.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, type, condition);
    }

    @Override
    public String getCondition() {
        return condition;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getType(){return type;}
}
