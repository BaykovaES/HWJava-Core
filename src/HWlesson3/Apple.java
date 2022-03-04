package HWlesson3;



class Apple extends Fruit{
    public Apple(int count){
        super(count);
        this.weight = 1;
    }

    @Override
    public String toString() {
        return "Партия яблок " + count + " штук, массой "+getWeight();
    }

    public static Apple createApples(int value){
        Apple apples = new Apple(value);
        return apples;
    }
};
