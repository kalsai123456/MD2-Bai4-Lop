public class QuadraticEquation {
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(){
        double delta;
        return delta = b * b - 4 * a * c;
    }

    public void timNghiem(){
        if (getDelta() > 0){
            double x1 = (-b + Math.sqrt(getDelta()))/ 2 * a;
            double x2 = (-b - Math.sqrt(getDelta()))/ 2 * a;
            System.out.println("Phuong trinh co 2 nghiem la:" +"x1:"+x1 + "va" + "x2:"+x2);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation(3,5,1);
        a.timNghiem();
    }

}
