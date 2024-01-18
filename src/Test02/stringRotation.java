package Test02;

public class stringRotation {
    public static void main (String[] args)
    {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }

    static boolean areRotations(String str1, String str2)
    {
        System.out.println((str1+str2).indexOf(str2));
        return (str1.length()==str2.length() && (str1+str2).indexOf(str2)!= -1);
    }


}
