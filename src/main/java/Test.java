import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
         * 01 Test 1
         * Input
         * Expected output
         * 2
         * 100 90%
         * 100 30%
         * 100 100%
         * 100 20%
         * 02 Test 2
         * Input
         * Expected output
         * 3
         * 20 60%
         * 20 60%
         * 20 60%
         * 20 100%
         * 20 80%
         * 03 Test 3
         * Input
         * Expected output
         * 3
         * 20 90%
         * 50 90%
         * 10 20%
         * 50 100%
         * 20 75%
         * 04 Test 4
         * Input
         * Expected output
         * 4
         * 100 80%
         * 20 100%
         * 50 60%
         * 200 10%
         * 200 75%
         * 05 Test 5
         * Input
         * Expected output
         * 12
         * 100 0%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 10 90%
         * 100 99%
         * 06 Test 6
         * Input
         * Expected output
         * 4
         * 100 99%
         * 50 98%
         * 20 95%
         * 10 30%
         * 100 100%
         * 50 100%
         * 20 100%
         * 07 Test 7
         * Input
         * Expected output
         * 6
         * 50 90%
         * 20 50%
         * 200 85%
         * 100 70%
         * 10 70%
         * 20 60%
         * 200 100%
         * 100 100%
         * 50 28%
         * 08 Test 8
         * Input
         * Expected output
         * 14
         * 100 36%
         * 10 80%
         * 5 20%
         * 20 20%
         * 20 85%
         * 50 14%
         * 20 45%
         * 100 47%
         * 50 22%
         * 10 30%
         * 20 35%
         * 10 60%
         * 5 40%
         */

        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> ar2 = new ArrayList<>();

        for (int i = 0; i < H; i++) {
            String bucket = in.nextLine();
            String [] str = bucket.split(" ");
            ar1.add(str[0]);
            ar2.add(str[1]);
        }
        ArrayList<String> ar3 = new ArrayList<>();
        String s="";
        int r=0;
        for(int i=0;i<ar2.size();i++){
            for(int j=0;j<ar2.get(i).length()-1;j++){
                s+=ar2.get(i).charAt(j);
            }
            //ar3.add(s);
            r+=Integer.parseInt(s);
        }
        for(int i=0;i<ar1.size();i++){
            System.out.println(ar1.get(i)+ " "+ r);

        }



    }

}
