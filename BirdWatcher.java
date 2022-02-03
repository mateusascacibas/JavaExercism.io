
       

        






class BirdWatcher {
    private int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
            this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int i = 0;
        int response = 0;
         for(i = 0; i < this.birdsPerDay.length; i++){
            if(i == this.birdsPerDay.length - 1){
                response = (int) this.birdsPerDay[i];
            }
        }
        return response;
    }

    public void incrementTodaysCount() {
        int i = 0;
        
for(i = 0; i < this.birdsPerDay.length; i++){
            if(i == this.birdsPerDay.length - 1){
                this.birdsPerDay[i] = this.birdsPerDay[i] + 1;
            }
    }
        }

    public boolean hasDayWithoutBirds() {
        int count = 0;
        int i =0;
        for(i = 0; i < this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] == 0){
                count += 1;
            }
        }
        if(count > 0){
            return true;
        }else{
            return false;
        }
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int i = 0;
        if(numberOfDays > 7){
             for(i = 0; i <= 7 - 1; i++){
            count += (int) this.birdsPerDay[i];
        }
            }else{
             for(i = 0; i <= numberOfDays - 1; i++){
            count += (int) this.birdsPerDay[i];
        }
        }
       
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        int i =0;
        for(i = 0;  i < this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] >= 5){
                count += 1;
            }
        }
        return count;
    }
}
