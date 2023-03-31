package Seminars;


import java.util.HashMap;
import java.util.Map;

/*Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля
Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их
В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.

 */
public class FinalHW {
    public static void main(String[] args) {

        Person person1 = new Person ("Ivan","Ivanov",21,12547,Person.Type.MALE);
        Person person2 = new Person("Oleg", "Olegov", 24, 12346, Person.Type.FAMALE);
        Person person3 = new Person("Naim", "Pavlov", 29, 12306, Person.Type.FAMALE);
        Person person4 = new Person("M", "L", 19, 12996, Person.Type.MALE);

        Map map = new HashMap<>();
        map.put(0,person1);
        map.put(1,person2);
        map.put(2,person3);
        map.put(3,person4);


        System.out.println(howIsOlder(map));
    }
    public static Map<Object, Object> howIsOlder(Map mapa){
        Map<Object, Object> tempMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < mapa.size(); i++){
            Person tempPerson = (Person) mapa.get(i);
            if (tempPerson.getAge() >= 20){
                tempMap.put(count, tempPerson);
                count++;
            }
        }return  tempMap;
    }
}

