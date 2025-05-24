package procedure02;

/*  Map : 순서를 유지 하지 않음
    Map<key,value>
    key :  중복을 허용  X
    value :  중복은 허용 O
    
    Map은 일종의 설계도(인터페이스)이고,
    HashMap은 그 설계도를 실제로 구현한 클래스(구체적인 코드)이다.

    map.getOrDefault()
    animal 키의 값이 있으면 그 값에 1을 더해서 저장하고, 없으면 0 + 1 = 1을 저장한다는 뜻이다.
    keySet()은 Map에서 **모든 키(key)를 모아서 Set(집합)**으로 반환하는 메서드
    Map.get(key)은 키로부터 값을 가지고 와라

    trim() : 문자열에서 앞뒤에 있는 공백 문자(스페이스, 탭, 줄바꿈 등) 를 제거

    Map.Entry를 이용하면 Map에 저장된 모든 key-value 쌍을 각각의 key-value를 갖고 있는 하나의 객체로 얻을 수 있다.

    compareTo() : result > 0 : a가 b보다 사전 순으로 뒤에 있음 (a > b)

*/

import java.util.HashMap;
import java.util.Map;

public class RoadToBiodome07 {
    public static void main(String[] args) {
        String joined = String.join(" ", args);  //join : 문자열 배열을 어떤 기준으로 하나의 문자열로 반환하는 것
        joined = joined.replace("[", "").replace("]",""); //양 끝 [,] 없애기

        String[] arr = joined.split(","); //,를 기준으로 arr배열에 값 넣기

        Map<String, Integer> freqMap = new HashMap<String, Integer>(); 

        count(freqMap, arr); //빈도수 세는 함수

        //Map.Entry를 이용해서 key-value를 하나의 객체로 만들고 이걸 각 배열로 만든다. 그냥두면 Object[]이므로 Map.Entry로 고정
        Map.Entry<String, Integer>[] entries = freqMap.entrySet().toArray(new Map.Entry[0]);  
        
        //버블정렬
        for(int i = 0; i < entries.length - 1; i++) {
            for(int j = 0; j < entries.length - 1; j++) {
                if(entries[j].getValue() < entries[j+1].getValue()) { //교환
                    Map.Entry<String, Integer> temp = entries[j];
                    entries[j] = entries[j+1];
                    entries[j+1] = temp;
                } else if (entries[j].getValue().equals(entries[j+1].getValue())) { //값이 같은 경우 키를 알파벳 순으로 정렬
                    if (entries[j].getKey().compareTo(entries[j + 1].getKey()) > 0) {
                        Map.Entry<String, Integer> temp = entries[j];
                        entries[j] = entries[j + 1];
                        entries[j + 1] = temp;
                    }
                }
            }
        }
        
        for (Map.Entry<String, Integer> entry : entries) { //출력
            System.out.print(entry.getKey()+", ");
        }


        
    }

    static void count(Map<String, Integer> freqMap, String[] arr) {
        for (String animal : arr) {
            animal = animal.trim(); //혹시나 있을 공백 제거
            freqMap.put(animal, freqMap.getOrDefault(animal, 0) + 1);
        }
    }
}
