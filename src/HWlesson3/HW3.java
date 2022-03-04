package HWlesson3;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        anyArray<String> array1 = new anyArray<>("12", "dfg", "17", "25", "33", "yjnhm");
        System.out.println(array1);

        array1.excahge(2, 5);
        System.out.println(array1);

        anyArray<Integer> array2 = new anyArray<>(12, 26, 1, 33, 18, 25, 48);
        System.out.println(array2);

        array2.excahge(0, 6);
        System.out.println(array2);


        System.out.println(Apple.createApples(10));
        System.out.println(Orange.createOranges(3));


        Box<Apple> appleBox = new Box<>();
        appleBox.add(Apple.createApples(15));
        appleBox.add(Apple.createApples(5));
        appleBox.add(Apple.createApples(8));
        appleBox.add(Apple.createApples(17));
        System.out.println(appleBox);
        System.out.println("Общая масса коробки - " + appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(Orange.createOranges(12));
        orangeBox.add(Orange.createOranges(25));
        orangeBox.add(Orange.createOranges(6));
        System.out.println(orangeBox);
        System.out.println("Общая масса коробки - " + orangeBox.getWeight());


        if (orangeBox.compare(appleBox)) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки не равны");
        }
        ;

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        appleBox1.add(Apple.createApples(3));
        orangeBox1.add(Orange.createOranges(2));

        System.out.println(appleBox1);
        System.out.println(orangeBox1);
        if (orangeBox1.compare(appleBox1)) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки не равны");
        }
        ;


        System.out.println(appleBox);
        System.out.println(appleBox1);

        appleBox.emptyTo(appleBox1);
        System.out.println(appleBox);

        System.out.println(appleBox1);


        orangeBox.emptyTo(appleBox1);
        System.out.println(appleBox1);
        System.out.println(orangeBox);
    }


    static class anyArray<T> {

        private T[] obj;

        public anyArray(T... obj) {
            this.obj = obj;
        }

        public void excahge(int i, int j) {
            T value = obj[i];
            obj[i] = obj[j];
            obj[j] = value;
        }

        @Override
        public String toString() {
            return Arrays.toString(obj);
        }
    }

}










