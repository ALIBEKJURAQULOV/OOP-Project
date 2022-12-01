public class Main {
    public static void main(String[] args) {
//        System.out.println(lastDigit(7,107));

//        System.out.println(deFront("heloool"));
//        System.out.println(allStar("hello"));

//        int[] som={4,4,1};
//        System.out.println(either24(som));
     }



    public static boolean lastDigit(int a,int b){
        int d=b%10;
        if (a==d){
            return true;
        }else return false;
    }


    public static String deFront(String str){
        String d="";
        String b;
        String s;
        String g;
    for (int i=0;i<str.length();i++){
        if(str.charAt(0)=='a'){
           d=str.substring(0,1);
           g=str.substring(2,str.length());
           return d+g;

        } else if (str.charAt(1)=='b') {
            s=str.substring(1,str.length());
            return s;
        }else {
            b=str.substring(2,str.length());
            return b;
        }
    }
    return d;
    }
    public static boolean either24(int[] som) {
        int cont=0;
        for (int i=0;i< som.length;i++) {
            if (som[i] == 2 && som[i + 1] == 2) {
                cont += 1;
            } else if (som[i] == 4 && som[i + 1] == 4) {
                cont += 1;
            }else return true;
        }
        if (cont==1){
            return true;
        } else if (cont==2) {
            return false;
        }else return true;
    }
    public static String allStar(String str) {
        if (str.equals("") || str.length() == 1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}