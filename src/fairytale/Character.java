package fairytale;
import java.util.Objects;

public class Character implements Skills, RelaxActions, PositionActions, ClothesActions, FaceActions  {
    private final String name;
    private final int clothes_size;
    private TypeOfLocation now_place = TypeOfLocation.UNKNOWN;
    private String[] clothes = new String[10];
    private int cnt_cl = 0;
    private String face_expression = "normal";
    private final String[] moodType = new String[]{"terrible","depressed","bad","normal","good","great","free","carefree"};
    private int moodIndex = 4;

    Character (String name, int clothes_size){
        this.name = name;
        this.clothes_size = clothes_size;
    }

    @Override
    public String toString() {
        return "Character {" + "name = " + name + ", " + "clothes size = " + clothes_size + ", " + "location = " + now_place + ", " + "mood = " + moodType[moodIndex] + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Character)) return false;
        Character eq_char = (Character)obj;
        return Objects.equals(name, eq_char.name) && Objects.equals(clothes_size, eq_char.clothes_size) && Objects.equals(now_place, eq_char.now_place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clothes_size, cnt_cl, moodType[moodIndex]);
    }

    @Override
    public void running(TypeOfLocation finish_place) {
        if(finish_place == now_place){
            System.out.println(name + " is running on the spot");
        }else {
            if (now_place == TypeOfLocation.UNKNOWN) {
                System.out.println(name + " is running to the " + finish_place);
            } else {
                System.out.println(name + " is running from the " + now_place + " to the " + finish_place);
            }
        }
        now_place = finish_place;
    }

    @Override
    public void sitting(TypeOfLocation place) {
        if(place == TypeOfLocation.UNKNOWN) System.out.println(name + " is sitting");
        else System.out.println(name + " is sitting on the " + place);
        now_place = place;
    }

    @Override
    public void playingMusic() {
        System.out.println(name + " is playing the music");
    }

    @Override
    public void swingingLegs() {
        if(moodIndex < moodType.length-1) moodIndex++;
        System.out.println(name + " is swinging legs, while sitting on the " + now_place);
    }

    @Override
    public void put_on(Object obj) {
        if(obj instanceof Headdress) {
            Headdress thing = (Headdress) obj;
            if (thing.getSize() >= clothes_size) {
                if(cnt_cl < 10){
                    clothes[cnt_cl] = thing.getType();
                    cnt_cl++;
                    System.out.println(name + " put on the " + thing.getType());
                }else{
                    System.out.println(name + " can't put on the " + thing.getType() + ". Too many clothes.");
                }
            }
        }
    }

    @Override
    public void squint() {
        face_expression = "squint";
    }

    public void moodUP(){
        if(moodIndex < moodType.length-1) moodIndex++;
    }

    public void describeMood(){
        System.out.println(name + " is in a " + moodType[moodIndex] + " mood");
    }

    public String getName(){return name;}
}
