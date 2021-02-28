package modele.physique;

import javafx.geometry.Pos;

public class Position {

    double x;
    double y;

    Position(double x, double y){
        this.x = x;
        this.y = y;

    }

    public double calculerDistance(Position pos1, Position pos2 ){
        double result = Math.sqrt(Math.pow((pos2.getX() - pos1.getX()), 2) + Math.pow((pos2.getY() - pos1.getY()), 2));
        return result;
    }

    public double xcalculerDistance(double x1, double y1, double x2, double y2){
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
