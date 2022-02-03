class Scrabble {
    public String[] word;
    
    Scrabble(String word) {
        this.word = word.split("(?!^)");
    }

    int getScore() {
        int i = 0;
        int count = 0;
        for(i = 0; i < word.length; i++){
            switch(word[i].toUpperCase()){
                case "A","E","I","O","U","L","N","R","S","T":
                    count += 1;
                    break;
                case "D","G":
                    count += 2;
                    break;
                case "B","C", "M", "P":
                    count += 3;
                    break;
                case "F","H", "V", "W", "Y":
                    count += 4;
                    break;
                case "K":
                    count += 5;
                    break;
                case "J","X":
                    count += 8;
                    break;
                case "Q","Z":
                    count += 10;
                    break;
                    
            }
            }
        return count;
    }

}
