package strings;

public class ConvertMethod {
    public static void main(String[] args) {

        // 1. toCharArray()
        String msg = "hello name";
        char[] msgchar = msg.toCharArray();
        System.out.println("Characters from 'msg':");
        for (int i = 0; i < msgchar.length; i++) {
            System.out.println("char : " + msgchar[i]);
        }

        // 2. getBytes()
        String name = "sanskruti";
        byte[] namesb = name.getBytes();
        System.out.println("\nBytes from 'name':");
        for (int j = 0; j < namesb.length; j++) {
            System.out.println("Byte of name at index " + j + ": " + namesb[j]);
        }

        // 3. valueOf()
        int num = 123;
        String num1 = String.valueOf(num);
        System.out.println("\nValue of num converted to string: " + num1);

        // 4. toCharArray() again with different string
        String s1 = "Hello World";
        char[] chars = s1.toCharArray();
        System.out.println("\nCharacters from 's1':");
        for (int k = 0; k < chars.length; k++) {
            System.out.println(chars[k]);
        }
    }
}
