package procedure03.problem03;

public class Plant extends Organism {
    private String Flowering; //개화시기
    private String Fruit; // 열매유무

    public Plant(String name, String bell, String habitat, String Flowering, String Fruit) {
        super(name, bell, habitat);
        this.Flowering = Flowering;
        this.Fruit = Fruit;
    }

    @Override // 부모 메서드 오버라이딩
    public String displayInfo() {
        return getName() + ", " + getBell() + ", " + getHabitat()
                + ", " + Flowering + ", " + Fruit;
    }
}
