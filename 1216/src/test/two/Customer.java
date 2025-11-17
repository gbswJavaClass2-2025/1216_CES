package test.two;

public class Customer {
    public String name;
    public String phone;
    public int point;

    Customer(){}
    Customer(String name, String phone, int point){
        this.name = name;
        this.phone = phone;
        this.point = point;
    }

    public int addPoint(int amount){
        point += amount;
        return point;
    }

    public int usePoint(int amount){
        point -= amount;
        return point;
    }

    public int getPoint(){
        return point;
    }
}
