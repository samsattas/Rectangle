package model;
import java.lang.Math;

public class Rectangle{
	public double h;
	public double l;


	public Rectangle(double h, double l){
		this.h = h;
		this.l = l;
	}

	public double cPerimeter(double h, double l){
        return (2*h) + (2*l);
    }

    public double cArea(double h, double l){
    	return h*l;
    }

    public double cDiagonal(double h, double l){
    	double n = ((h*h)+(l*l));
    	return Math.sqrt(n);
    }

    
}