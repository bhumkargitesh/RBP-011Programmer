
//Interface_Example
public class Vehicle {
    int noseats;
    String fuel;
    int speed;

    public Vehicle(int noseats, String fuel,int speed){
        this.noseats = noseats;
        this.fuel = fuel;
        this.speed=speed;
    }
    public String toString(){
        return "no of seats : " + noseats + " Fuel used : " + fuel + "Speed  : " +speed;
    }
}






