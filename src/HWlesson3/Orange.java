package HWlesson3;

class Orange extends Fruit{
    public Orange(int count){
        super(count);
        this.weight = 1.5;
    }

    @Override
    public String toString() {
        return "Партия апельсинов " + count + " штук, массой "+getWeight();
    }

    public static Orange createOranges(int value){
        Orange oranges = new Orange(value);
        return oranges;
    }
};
