import java.util.ArrayList;
import java.util.Scanner;

public class XORMessageWithKey {
    public static void main(String[] args) {
        /**
         * The XOR encryption is a simple type of additive cipher that works by applying the bitwise XOR operator to every character using a given key. The XOR operator between two booleans is
         * a xor b = (a and not(b)) or (not(a) and b)
         * or can be easily understood with bits as
         * a xor b = 1 if a + b == 1 (ab is 01 or 10)
         *           0 otherwise     (ab is 00 or 11)
         *
         * Here is an example. To get the first bit of the encrypted message, you xor the first bit of the message (1) and the first bit of the key (0) which gives you 1 xor 0 = 1. You then repeat this for each bit as follow:
         * 1 0 0 1 0 0 1 1  (message)
         * 0 0 0 0 1 1 1 1  (key)
         * 1 0 0 1 1 1 0 0  (encrypted message)
         *
         * If the key is of a different size than the message, you should repeat it until it is long enough. Example:
         * 1 0 0 1 1 1 0 0    (message to encrypt)
         * 0 1 1              (key)
         * 0 1 1 0 1 1 0 1 1  (repeating key)
         * 1 0 0 1 0 0 1 1    (encrypted message)
         *
         * You will be given the binary representation of the message and the binary representation of the key. You are asked to encrypt the message with the key using a XOR cipher.
         *
         * For your curiosity, a cool property of this cipher is that if you try to encrypt again the encrypted message with the same key, you get your original message back. In mathematics, such a function is called an involution. Example:
         * 11001010 xor 1110 = 00100100
         * 00100100 xor 1110 = 11001010
         * Input
         * Line 1: A binary number M: the message to encrypt
         * Line 2: A binary number K: the key to use
         * Output
         * Line 1: The binary xor encryption of M using K as a key
         * Constraints
         * M and K have 512 bits or less
         * Example
         * Input
         * 00001111
         * 0
         * Output
         * 00001111
         */
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        String k = in.nextLine();
        String s="";
        int i=k.length(), j=0;
        String kc="";
        while (i!=m.length()){
            for(j=0;j<k.length();j++){
                if(i==m.length()){
                    break;
                }else{
                    kc+=k.charAt(j);
                    i++;
                }
            }
        }
        String r=k+kc;
        String ans= "";
        for(int f=0,g=0;f<m.length() && g<r.length();f++,g++){
            if(m.charAt(f)==r.charAt(g)){
                ans+='0';
            }
            else{
                ans+="1";
            }
        }
        System.out.println("The message is: "+ m);
        System.out.println("The key is: "+k);
        System.out.println("The XORed value is: "+ans);

    }
}
