package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Retangle;
import entities.Shape;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Retangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircleList = new ArrayList<>();
        myCircleList.add(new Circle(2.0));
        myCircleList.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircleList));
    }

        public static double totalArea(List<? extends Shape> list) {
            double sum = 0.0;
            for (Shape s : list) {
                sum += s.area();
            } 
            return sum;
            
        }
    }