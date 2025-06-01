package procedure03.problem02;

public class BiodomeFamily02 {
    public static void main(String[] args) {
        Organism animal1 = new Organism("펭귄", "동물", "남극"); //2가지 동물 객체생성
        Organism animal2 = new Organism("코알라", "동물", "호주");

        Organism plant1 = new Organism("선인장", "식물", "사막"); // 2가지 식물 객체를 생성
        Organism plant2 = new Organism("페퍼민트", "식물", "정원");

        LifeNest nest = new LifeNest();
        nest.insert(animal1);
        nest.insert(animal2);
        nest.insert(plant1);
        nest.insert(plant2); //생성된 동식물을 저장소 목록에 저장한다.

        nest.printAll(); //모든 동식물을 출력한다.

        nest.delete(animal1); //1가지 동물과 1가지 식물을 삭제한다.
        nest.delete(plant1);

        nest.modify(animal2 , "남극"); //동물의 서식지를 변경한다.

        nest.printAll(); //모든 동식물을 출력한다.
    }
}
