package operators;

public class Bitwise_operations {
	public static void main(String[] args) {
        int x = 12;  // binary: 1100
        int y = 5;   // binary: 0101

        // Bitwise operations
        int andResult = x & y;    // bitwise AND (1100 & 0101 = 0100) = 4
        int orResult = x | y;     // bitwise OR  (1100 | 0101 = 1101) = 13
        int xorResult = x ^ y;    // bitwise XOR (1100 ^ 0101 = 1001) = 9
        int notX = ~x;            // bitwise NOT (~1100 = 0011... but two's complement) = -13
        int leftShift = x << 2;   // left shift by 2 bits (1100 << 2 = 110000) = 48
        int rightShift = x >> 2;  // right shift by 2 bits (1100 >> 2 = 0011) = 3

     
        System.out.println("Bitwise AND (x & y) = " + andResult);
        System.out.println("Bitwise OR (x | y) = " + orResult);
        System.out.println("Bitwise XOR (x ^ y) = " + xorResult);
        System.out.println("Bitwise NOT (~x) = " + notX);
        System.out.println("Left shift (x << 2) = " + leftShift);
        System.out.println("Right shift (x >> 2) = " + rightShift);
    }
}

