package dotcomgame;

public class dotcom {
    int[] locationCells;
    int numofHits;

    public int[] getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public int getNumofHits() {
        return numofHits;
    }

    public void setNumofHits(int numofHits) {
        this.numofHits = numofHits;
    }
    public String checkYourself(String userGuess){
        int guess = Integer.parseInt(userGuess);
        String result = "miss";

        for(int cell : locationCells){
            if(guess == cell){
                result="hit";
                numofHits++;
                break;
            }
        }
        if(numofHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        dotcom dot = new dotcom();

    int[] locations = {3,4,5};
        dot.setLocationCells(locations);

        String userGuess = "4";
        String result = dot.checkYourself(userGuess);

        String testResult= "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);


    }


}
