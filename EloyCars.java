public class ElonsToyCar {
    public int distanceDisplay = 0;
    public int batteryDisplay = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDisplay + " meters";
    }

    public String batteryDisplay() {
        if(this.batteryDisplay == 0){
            return "Battery empty";
        }else{
            return "Battery at " + this.batteryDisplay + "%";
        }
    }

    public void drive() {
        
        if(this.batteryDisplay > 0){
            this.batteryDisplay -= 1;
            this.distanceDisplay += 20;
        }
    }
}
