import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RoundUpToTowDecimalPlaces {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        double v =x*Math.PI;
        BigDecimal bd = new BigDecimal(v).setScale(5, RoundingMode.HALF_DOWN);
        double val2 = bd.doubleValue();
        if(val2==0){
            System.out.println(0);


        }else

            System.out.println(val2);
    }
    }

