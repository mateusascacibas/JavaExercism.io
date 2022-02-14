class Triangle {
    public double side1;
    public double side2;
    public double side3;
    
    Triangle(double side1, double side2, double side3) throws TriangleException {
        boolean cond1 = side1 > 0 || side2 > 0 || side3 > 0;
        boolean cond2 = side1 + side2 > side3 &&  side2 + side3 > side1 &&  side3 + side1 > side2;
        if( cond1 && cond2  ){
              this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            
        }else{
          throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        return side1 == side2 && side1 == side3;
    }

    boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    boolean isScalene() {
        return side1 != side2 && side2 != side3 && side3 != side1;
    }

}
