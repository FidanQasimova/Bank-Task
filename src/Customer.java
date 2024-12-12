import java.util.Scanner;

public class Customer {
    public static void addAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Musterinin adi, Soyadi, Ata adi  : ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Tevelludu : ");
        long tevellud = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Sifre teyin edin : ");
        String code1 = scanner.next();
        scanner.nextLine();
        while (true) {
            System.out.println("Sifreni tesdiqlemek ucun yeniden daxil edin : ");
            String code2 = scanner.next();
            if (code1.equals(code2)) {
                System.out.println("Hesaba vesait daxil edin : ");
                long vesait=scanner.nextLong();
                System.out.println("Hesab yaradildi !");
                break;
            } else {
                System.out.println(" Sifre yanlisdir, yeniden daxil edin : ");
            }

            Account account = new Account(name, tevellud, code1, code2, Account.getvesait());

        }
    }

    public static void AddDepozit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hesabin sifresini daxil edin : ");
        String code3 = scanner.next();
        if (code3.equals(Account.getCode1())) {
            while (true){
            System.out.println("Depozit muddetini daxil edin : ");
            int depozit = scanner.nextInt();
            System.out.println(" Depozit faizi : ");
            int faiz = scanner.nextInt();
            System.out.println("Meblegi daxil edin : ");
            long mebleg = scanner.nextLong();
            System.out.println("Netice : ");
            double netice = 0;
            double netice1=1;
            for (int i = 0; i < depozit; i++) {
                netice = mebleg * (1 + (faiz*0.01));
                netice1 = netice1 * netice;
            }
            System.out.println(netice1);
         break;
   }
        }
        else {
            System.out.println("Sifre yanlisdir, yeniden daxil edin : ");
       }

}
public static void SendMoney(){
        Scanner scanner=new Scanner(System.in);
    System.out.println("Vesaiti qebul edecek hesabi daxil edin : ");
    long hesab2=scanner.nextLong();
    System.out.println("Gonderilecek mebleg : ");
    long mebleg=scanner.nextLong();
    System.out.println("Sifreni tesdiqle : ");
    String code4=scanner.next();
    while (true){
    if (code4.equals(Account.getCode1())){
    if (Account.getvesait()==0){
        System.out.println("Yeteri qeder vesait yoxdur !");
    }
    else {
        System.out.println(" Kocurme ugurlu !" + "   Hesabdan cixildi : " + mebleg);
        long sonmebleg = Account.getvesait() - mebleg;
        System.out.println("Son mebleg= " + sonmebleg);
    }
    }
    else {
        System.out.println("Sifre yanlisdir, yeniden daxil edin :");
   }
}}}
