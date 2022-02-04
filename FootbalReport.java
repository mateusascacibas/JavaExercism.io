public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String response = "";
       switch(shirtNum){
           case 1:
               response = "goalie";
               break;
            case 2:
               response = "left back";
               break;
            case 3,4:
               response = "center back";
               break;
             case 5:
               response = "right back";
               break;
            case 6,7,8:
               response = "midfielder";
               break;
             case 9:
               response = "left wing";
               break;
            case 10:
               response = "striker";
               break;
            case 11:
               response = "right wing";
               break;
           default:   
               break;
       }
        if(response != ""){
            return response;
        }else{
            throw new IllegalArgumentException("test"); 
        }
    }
}
