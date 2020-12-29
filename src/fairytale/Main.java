/*
Муми-тролль побежал прямо на музыку и внизу у реки увидел Снусмумрика.
Тот сидел на перилах моста, нахлобучив на лоб свою старую шляпу, и болтал над водой ногами.
Солнце только что поднялось над верхушками деревьев и светило им прямо в лицо.
А они жмурились от его лучей, болтали ногами над бегущей сверкающей водой, и на сердце у них было привольно и беззаботно.
 */

package fairytale;

public class Main {

    public static void main(String[] args) {
        Character mummytroll = new Character("Mummy-troll",35);
        Character snufkin = new Character("Snufkin",40);
        snufkin.playingMusic();
        mummytroll.running(TypeOfLocation.river);
        snufkin.sitting(TypeOfLocation.banister);
        snufkin.put_on(new Headdress("hat",50,"old"));
        snufkin.swingingLegs();
        Star sun = new Star("Sun", PlaceOfSky.invisible);
        sun.setPosition(PlaceOfSky.rise);
        sun.shining();
        sun.blinding(mummytroll);
        sun.blinding(snufkin);
        mummytroll.sitting(TypeOfLocation.bridge);
        mummytroll.swingingLegs();
        snufkin.sitting(TypeOfLocation.bridge);
        snufkin.swingingLegs();
        Reservoirs river = new Reservoirs("river", "running", 0);
        river.sparkling(new Character[]{mummytroll,snufkin});
        mummytroll.describeMood();
        snufkin.describeMood();
    }
}
