// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fan {
    private int Slow = 1;
    private int Medium = 1;
    private int Fast = 1;
    private int Speed = 1;
    private double R = 5;
    private boolean On = false;
    private String color = "red";
    public int getSlow(){
        return Slow;
    }
    public void setSlow(int slow){
        Slow = slow;
    }
    public int getMedium(){
        return Medium;
    }
    public void setMedium(int medium){
        Medium = medium;
    }

    public int getFast() {
        return Fast;
    }

    public void setFast(int fast) {
        Fast = fast;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
    public Fan(int Speed, boolean On, double R, String color){
        this.Speed = Speed;
        this.On = On;
        this.R = R;
        this.color = color;
    }
    public String toString(){
        if (isOn()) {
            return ("Speed la: " + getSpeed() + "mau cua quat la: " + getColor() + "R cua quat la:  " + getR() + "fan is on");
        } else {
            return ("Mau cua quat la: " + getColor() + "R cua quat la: " + getR() + "fan is off");
        }
    }

    public static void main(String[] args) {
        Fan a = new Fan(3,true,3,"blue");
        System.out.println(a.toString());

    }
}