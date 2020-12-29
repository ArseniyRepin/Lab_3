package fairytale;

import java.util.Objects;

public class Star implements LightActions{
    private final String name;
    private PlaceOfSky position;

    Star(String name, PlaceOfSky position){
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Star {" + "name = " + name + ", " + "position = " + position + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Star)) return false;
        Star star = (Star) obj;
        return Objects.equals(name, star.name) && Objects.equals(position, star.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,position);
    }

    public void setPosition(PlaceOfSky pos){
        if(!(position == pos)) {
            System.out.println("The " + name + " has just entered the " + pos);
            position = pos;
        }
        if(position == PlaceOfSky.zenith){
            this.shining();
        }
    }

    @Override
    public void blinding(Character hero) {
        hero.squint();
        System.out.println(hero.getName() + " is squinting because of the " + name);
    }

    @Override
    public void shining() {
        System.out.println("The " + name + " is shining");
    }
}
