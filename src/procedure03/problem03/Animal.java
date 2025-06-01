package procedure03.problem03;

public class Animal extends Organism {
    private String eatingMethod; // 소화방식
    private String prey; // 먹이

    public Animal(String name, String bell, String habitat, String eatingMethod, String prey) {
        super(name, bell, habitat);
        this.eatingMethod = eatingMethod;
        this.prey = prey;
    }

    public String getEatingMethod() {
        return eatingMethod;
    }

    public void setEatingMethod(String eatingMethod) {
        this.eatingMethod = eatingMethod;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }

    @Override //부모 메서드 오버라이딩
    public String displayInfo() {
        return getName() + ", " + getBell() + ", " + getHabitat()
                + ", " + eatingMethod + ", " + prey;
    }
}
