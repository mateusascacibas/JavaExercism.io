public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double cars = speed * 221;
       if(speed >= 5 && speed <=8){
            cars = cars * 0.9;
       } else if(speed == 9){
           cars = cars * 0.8;
       } else if(speed == 10){
           cars = cars * 0.77;
       }
        return cars;
    }

    public int workingItemsPerMinute(int speed) {
        double cars = productionRatePerHour(speed);
        return (int) cars / 60;
    }
}
