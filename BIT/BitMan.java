public class BitMan{
    public static void main(String[] args) {
        // System.out.println((5 & 6)); // 1 & 1 ==> 1 others are 0
        // 1 0 1 (5) & 1 1 0 (6) ==> 1 0 0 (4)

        // System.out.println((5 | 6)); // 0 | 0 ==> 0 others are 1
        // 1 0 1 (5) | 1 1 0 (6) ==> 1 1 1 (7) 

        // System.out.println((5 ^ 6)); // 0 ^ 0 ==> 0, 1 ^ 1 ==> 0 others are 1
        // 1 0 1 (5) | 1 1 0 (6) ==> 0 1 1 (3) 

        // System.out.println((~5)); // ~0 ==> 1, ~1 ==> 0
        // ~(0 0 0 0 0 1 0 1) ==> (1 1 1 1 1 0 1 0)  

        System.out.println((~0));

    }
}