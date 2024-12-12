public class Bank {
    private static double totalDeposit;

    static void totalDeposit() {
    }
    public Bank() {
        this.totalDeposit = 0;
    }
    public void NewTotalDeposit(double mebleg) {
        this.totalDeposit += mebleg;
    }
    public double getTotalDeposits() {
        return totalDeposit;
    }
    public void setTotalDeposit(){
        this.totalDeposit=totalDeposit;
    }
    public static void printMenu(){
            String menu = "1. Musteri ucun hesab yaratmaq \n" +
         "2. Musteri ucun depozit elave etmek \n" +
         "3. Pul kocurulmesi \n" +
         "4. Bankin umumi depozit meblegi \n" +
         "5. Cixis";
        System.out.println(menu);
    }
}
