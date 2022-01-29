package Day2_120521;

public class forLoopWithArray {
    public static void main(String[] args) {

        //literate through all boroughs defined by dynamic array using for loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten";
        boroughs[5] = "LI";

        for (int i = 0; i <6; i++) {
            //print statement
            System.out.println("My current borough is " + boroughs[i]);
        }//end of for loop


    }//end of main


}// end of Java Class

