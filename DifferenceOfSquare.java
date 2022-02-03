class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
         int count = 0;
        int i = 1;
        for(i = 1; i <= input; i++){
            count += i; 
        }
        return (int) Math.pow(count,2);
    }

    int computeSumOfSquaresTo(int input) {
       int count = 0;
        int i = 1;
        for(i = 1; i <= input; i++){
            count += (int) Math.pow(i,2); 
        }
        return count;
    }

    int computeDifferenceOfSquares(int input) {
       int sumTo = computeSquareOfSumTo(input);
        int SquaresTo = computeSumOfSquaresTo(input);
        return sumTo - SquaresTo;
    }

}
