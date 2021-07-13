package com.gof.STRUCTURAL_PATTERNS.Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        FacadeShapeMaker shapeMaker = new FacadeShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
