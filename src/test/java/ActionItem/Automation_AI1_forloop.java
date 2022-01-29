package ActionItem;

public class Automation_AI1_forloop {

    public static void main(String[] args) {

//Dynamic Array for zipcodes
        String[] zipcode = new String[5]; //you set the Limit/boundaries for your array
//define your values
        zipcode[0] = "14214";
        zipcode[1] = "07502";
        zipcode[2] = "12345";
        zipcode[3] = "67890";
        zipcode[4] = "11111";

        //integer dynamic array
        int[] streetnumber = new int[5];
        //define your integer dynamic array

        streetnumber[0] = 200;
        streetnumber[1] = 201;
        streetnumber[2] = 202;
        streetnumber[3] = 203;
        streetnumber[4] = 204;


//forloop
        for (int i = 0; i < zipcode.length; i++) {
            //print statement
            System.out.println("My current zipcode is " + zipcode[i] + " and my street number is " + streetnumber[i]);

        }//end of for loop


        //end of main
        }


//end of java
}
