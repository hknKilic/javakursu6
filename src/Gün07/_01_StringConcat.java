package Gün07;

public class _01_StringConcat {
    public static void main(String[] args) {
        //concat: bir string digeri ile birlesir.

        String s1="merhaba";
        String s2="dünya";

        System.out.println("birlesik hali="+s1+s2);
        System.out.println("birlesik hali="+s1.concat(s2)); // birlesmis hali
        System.out.println("birlesik hali="+s1.concat(" ").concat(s2));
        System.out.println("birlesik hali="+s1.concat(" "+s2));

        System.out.println("s1="+s1); //s1 degeri degismedi
        System.out.println("s2="+s2); // s2 degeri degismedi

    }


}

