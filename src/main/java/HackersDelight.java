/**
 * Created by rsingh13.
 */
public class HackersDelight {

    public static void main(String args[]) {

        System.out.println(~(9 & 222 ));
        System.out.println(~2);
        System.out.println(-2);
        System.out.println((~9 | ~222) );

        System.out.println("=========");
        System.out.println(Integer.toBinaryString( Integer.MAX_VALUE >>> 62)  );
        System.out.println(Integer.toBinaryString( Integer.MIN_VALUE>>> 62)  );
        System.out.println(Integer.MAX_VALUE>>>62);

        System.out.println("=========");
        System.out.println(Integer.valueOf( "10101010101010" ,2));
        System.out.println(Integer.numberOfLeadingZeros( Integer.valueOf( "10101010101010" ,2)));
        System.out.println(Integer.toBinaryString((10922 ^ Integer.MAX_VALUE)));

        System.out.println(Integer.toBinaryString(((10922 ^ Integer.MAX_VALUE))^
                ( Integer.MAX_VALUE <<
                Integer.numberOfLeadingZeros(Integer.valueOf( "10101010101010" ,2)) )));
        System.out.println(Integer.valueOf( "01010101010101" ,2));
    }
}
