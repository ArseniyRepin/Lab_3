package fairytale;

interface RelaxActions{
    void swingingLegs();
}

interface Skills{
    void playingMusic();
}

interface PositionActions{
    void running(TypeOfLocation finish_place);
    void sitting(TypeOfLocation place);
}

interface ClothesActions{
    void put_on(Object obj);
}

interface LightActions{
    void blinding(Character hero);
    void shining();
}

interface LightEffects{
    void sparkling(Character[] heroes);
}

interface FaceActions{
    void squint();
}