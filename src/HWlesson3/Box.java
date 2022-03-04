package HWlesson3;

import java.util.ArrayList;

class Box<T extends Fruit> extends ArrayList {
    public Box() {
        super();
    }

    public Double getWeight(){
        Double result = 0.0;
        for (int i=0; i<this.size(); i++) {
            Fruit item = (Fruit) this.get(i);
            result+=item.getWeight();
        }
        return result;
    }

    public boolean compare(Box box){
        boolean result = false;
        Double selfWeight = this.getWeight();
        Double anotherWeight=box.getWeight();
        if (selfWeight.equals(anotherWeight)){
            result= true;
        }
        return result;
    }

    public void emptyTo(Box box){
        String donorType = this.get(0).getClass().getName();
        String recipientType = box.get(0).getClass().getName();


        if (donorType.equals(recipientType)) {
            for (int i=0; i<this.size(); i++) {
                Fruit item = (Fruit) this.get(i);
                box.add(item);
            }
            this.clear();
        } else {
            System.out.println("В коробках разные фрукты, объединить их нельзя !!!");
            return;
        }


    }

}