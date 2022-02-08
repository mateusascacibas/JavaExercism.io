class RaindropConverter {

    String convert(int number) {
        String response = "";
        if(number % 3 == 0){
            response += "Pling";
        }
        if(number % 5 == 0){
            response += "Plang";
        }
        if(number % 7 == 0){
            response += "Plong";
        }
        if(response == ""){
            response = "" + number;
        }
        return response;
    }

}
