class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int battery = 100;
    public int distance;
    
    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        if(this.batteryDrain > this.battery){
            return true;
        }else{
            return false;
        }
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
       if(this.battery >= this.batteryDrain){
               this.distance += this.speed;
               this.battery -= this.batteryDrain;
           }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed need = new NeedForSpeed(50,4);
        return need;
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    public int distance; 
    public RaceTrack(int distance){
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        int total;
           total = car.speed * (car.battery / car.batteryDrain);
           if(total >= this.distance){
               return true;
           }else {
               return false;
           }
       }
    }

