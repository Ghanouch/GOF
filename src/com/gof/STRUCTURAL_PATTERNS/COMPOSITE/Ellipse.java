package com.gof.STRUCTURAL_PATTERNS.COMPOSITE;

/** "Leaf" **/
class Ellipse implements Graphic {
    //Prints the graphic.
    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}
