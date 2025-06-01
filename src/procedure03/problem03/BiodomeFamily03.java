package procedure03.problem03;


public class BiodomeFamily03 {
    public static void main(String[] args) {
        Organism animal1 = new Animal("펭귄", "동물", "남극", "육식", "물고기"); //2가지 동물 객체생성, 다형성
        Organism animal2 = new Animal("코알라", "동물", "호주", "초식", "유칼립투스");

        Organism plant1 = new Plant("선인장", "식물", "사막", "11월" , "열매 있음"); // 2가지 식물 객체를 생성, 다형성
        Organism plant2 = new Plant("페퍼민트", "식물", "정원", "7월", "열매 없음");

        LifeNest nest = new LifeNest();

        nest.addOrganism(animal1);
        nest.addOrganism(animal2);
        nest.addOrganism(plant1);
        nest.addOrganism(plant2);

        nest.displayAll();

        nest.removeOrganism(animal2);
        nest.removeOrganism(plant1);

        nest.displayAll();

    }
}
