package ActionItem;

public class Assignment2_12122021_DynamicArray_ElseIf {

    public static void main(String[] args) {


        //Dynamic Array
        String[] states = new String[4];
        states[0] = "New Jersey";
        states[1] = "New York";
        states[2] = "Pennsylvania";
        states[3] = "Connecticut";


        for (int i = 0; i <states.length; i++)
        if (states[i] == "New Jersey"){
            System.out.println(" " +states[i]);
        }else if (states[i] == "New York") {
            System.out.println(" " + states[i]);
        }


    }//end of main method

}//end of java class
