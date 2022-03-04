package HWlesson3;

abstract class Fruit{
    double weight;
    int count;

    public Fruit(int value){
        this.count = value;
    }

    public Double getWeight(){
        double result = this.count*this.weight;
        return result;
    };
}
