package Gün45;

public class S64_3_ {

    public static void main(String[] args) {

        String[] arr={"A","B","C","D"};

        for(int i=0; i < arr.length ; i++){
            System.out.println(arr[i]+" ");

            if (arr[i].equals("C")){
                break;
            }

            System.out.println("Work Done");
            continue; // etkisiz eleman
        }

    }
}
// A Work Done B Work Done C
   
