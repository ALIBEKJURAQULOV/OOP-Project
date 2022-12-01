import java.util.Scanner;


public class project {
    static int[] kurs=new int[5];
    static String[] kursnomi=new String[5];
    public static void main(String[] args) {

        String admin="admin";
        String user="user";

        Scanner sc =new Scanner(System.in);
while (true){
        System.out.println("------------Assalom aleykum------------");
        System.out.println("1.Kirish    2.chiqish");
        int s= sc.nextInt();
        switch (s){
            case 1:
                System.out.println("login");
                String s1= sc.next();
                if(s1.equals(admin)){
                    System.out.println("1.Yangi kurs qo`shish  2.Qo`shilgan kurslarni kurish");
                    Scanner sa=new Scanner(System.in);
                    int s2= sa.nextInt();
                    if(s2==1){
                        while (true) {
                            for (int i=0;i<kursnomi.length;i++) {
                            System.out.println("Kursning nomi:");
                            Scanner sas=new Scanner(System.in);
                            String s3 = sas.next();
                            kursnomi[0] = s3;
                            System.out.println("Kurs davomiyligi");
                            Scanner sca=new Scanner(System.in);
                            int s4 = sca.nextInt();
                            kurs[0] = s4;
                            System.out.println("tugatish uchun 1");
                            Scanner scanner=new Scanner(System.in);
                            int s5= scanner.nextInt();
                            if (s5==1){
                                break;
                            }}
                            break;
                        }
                    }else if(s2==2){
                        for (int i=0;i< kursnomi.length;i++) {
                            System.out.println("Kurs nomi:"+kursnomi[i]);
                            System.out.println("Kurs davomiyligi:"+kurs[i]);
                        }
                    }
                }else if (s1.equals(user)){
                    System.out.println("1.Kursga  yozillish  2.Yozilgan kurslarni kurish");
                     Scanner co=new Scanner(System.in);
                     int commond=co.nextInt();
                    if(commond==1){
                        for (int i=0;i< kursnomi.length;i++) {
                            System.out.println("Kurs nomi:"+kursnomi[i]);
                            System.out.println("Kurs davomiyligi:"+kurs[i]);
                        }
                    } else if (commond==2) {
                        for (int i=0;i< kursnomi.length;i++) {
                            System.out.println("Kurs nomi:"+kursnomi[i]);
                            System.out.println("Kurs davomiyligi:"+kurs[i]);
                        }
                    }
                }
        }
}
    }
    }

