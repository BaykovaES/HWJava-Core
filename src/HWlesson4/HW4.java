package HWlesson4;

import java.util.*;

public class HW4 {

    public static void main(String[] args){

        String[] wordsArray = {"яблоко","слива","банан","яблоко","ананас","апельсин","яблоко","киви","киви","банан","яблоко","слива","киви","апельсин"};
        System.out.println("Иcходный массив : "+ Arrays.toString(wordsArray));
        HashSet set = new HashSet(Arrays.asList(wordsArray));
        System.out.println("Список уникальных слов : " + set);
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String i:wordsArray){
            frequency.put(i, Collections.frequency(Arrays.asList(wordsArray),i));
        }
        System.out.println(frequency+"\n");
        System.out.println();
        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add("Иванов","+79185625858");
        phoneBook1.add("Петров","+74952220011");
        phoneBook1.add("Иванов","+79262260022");
        phoneBook1.add("Сидоров","84992260023");
        phoneBook1.add("Иванов","+749922560828");
        phoneBook1.add("Сидоров","84999582223");
        System.out.println("Телефонная книга : " + phoneBook1);                       // вся телефонная книга
        System.out.println("Совпадения для «Иванов» : " + phoneBook1.get("Иванов"));



    }

    static class Subscriber {

        String surname;
        String phoneNumber;

        public Subscriber(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return surname +" - " + phoneNumber;
        }
    }




    static class PhoneBook<T extends Subscriber> extends ArrayList {

        public PhoneBook(){
            super();
        }

        public void add(String surname, String phoneNumber){
            this.add(new Subscriber(surname, phoneNumber));
        }

        public ArrayList get(String surname){
            ArrayList<T> res = new ArrayList<>();
            for (int i=0; i<this.size(); i++){
                T record = (T) this.get(i);
                if (surname.equals(record.surname)){
                    res.add(record);
                 }
            }
            return res;
        }

    }

}
