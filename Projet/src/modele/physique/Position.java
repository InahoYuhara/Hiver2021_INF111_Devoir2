package modele.physique;

public class Position {
    double x;
    double y;

    Position(double x, double y){
        this.x = x;
        this.y = y;

    }

    public double calculerDistance(double x1, double y1, double x2, double y2){
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
