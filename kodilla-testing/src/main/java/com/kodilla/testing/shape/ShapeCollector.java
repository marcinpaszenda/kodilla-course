package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> listOfFigures = new ArrayList<Shape>();

        public boolean addFigure(Shape shape) {
            listOfFigures.add(shape);
            return true;
        }

        public boolean removeFigure(Shape shape) {
            if (listOfFigures.contains(shape)) {
                listOfFigures.remove(shape);
                return true;
            } else {
                return false;
            }
        }

        public Shape getFigure(int n) {
            return listOfFigures.get(n);
        }

        public ArrayList<String> showFigures() {
            ArrayList<String> showFigureList = new ArrayList<String>();
            for (Shape currentShape : listOfFigures) {
                String currentShowFigure = (currentShape.getShapeName() + " " + currentShape.getField());
                showFigureList.add(currentShowFigure);
            }
            return showFigureList;
        }

        public int shapeListSize() {
            return listOfFigures.size();
        }

}
