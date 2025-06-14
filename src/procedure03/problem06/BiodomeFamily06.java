package procedure03.problem06;

import procedure03.problem06.entity.Animal;

import java.util.ArrayList;

import java.util.*;

public class BiodomeFamily06 {
    public static void main(String[] args) {
        Animal monkey = new Animal("제니", "원숭이", 4);
        Animal tiger = new Animal("타이", "호랑이", 9);
        Animal rhino = new Animal("로아", "코뿔소", 5);
        Animal deer = new Animal("바비", "사슴", 7);
        Animal elephant = new Animal("고먀", "코끼리", 4);


        ArrayList<Animal> list = new ArrayList<>();
        list.add(monkey);
        list.add(elephant);
        list.add(tiger);
        list.add(rhino);
        list.add(deer);

        Animal.printInfo(list);



    }
}

