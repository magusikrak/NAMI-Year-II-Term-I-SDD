/**
 * six
 */
public class six {

    public static void main(String[] args) {

        int a[] = { 1, 4, 9, 16, 9, 7, 4, 9, 11,11,11,11,11,11,11,11,11,111,2 };
        int b[] = { 11, 11, 7, 9, 16, 4, 1 };
        if (sameSet(a, b)) {
            System.out.println("Yes they match");
        } else { 
            System.out.println("No they dont match");
        }
    }

    public static boolean sameSet(int[] a, int[] b) {
        boolean match=false;
        for (int i = 0; i < a.length; i++) {
           boolean tempMatch=false;
            for (int j = 0; j < b.length; j++) {
             if(a[i]==b[j])
             {
                tempMatch=true;
                 break;
             }   
            }
            match=tempMatch;
            if(!tempMatch){
                break;
            }
        }

        return match;
    
}
}