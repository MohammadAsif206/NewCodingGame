import java.util.ArrayList;

public class IntToBin {
    public static void main(String[] args) {
        long n =1234;
        ArrayList<String> ar = new ArrayList<>();
        String s="",b="",r="";
        s=Long.toBinaryString(n);
        for(int i=s.length();i<32;i++){
            b+="0";
        }
        r=b+s;
        for(int i=0;i<32;i+=8){
            ar.add(r.substring(i,i+8));
        }
        long num =0;
        for(String e: ar){
            num+=(Integer.parseInt(e,2));
        }
        System.out.println(num);
        System.out.println(bin2dec(1234));


    }
    public static long bin2dec(int n){
        long binanryNumber =0, rem=0,i=1;
        while (n!=0){
            rem = n%2;
            n/=2;
            binanryNumber+=rem*i;
            i*=10;
        }
        return binanryNumber;
    }
}
