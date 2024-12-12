public class Account {
    private String name;
    private long tevellud;
    private static String code1;
    private String code2;
    private static long vesait;

    public Account(String name, long tevellud, String code1, String code2,long vesait) {
        this.name = name;
        this.tevellud = tevellud;
        this.code1 = code2;
        this.code2 = code2;
        this.vesait=vesait;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTevellud() {
        return tevellud;
    }

    public void setTevellud(long tevellud) {
        this.tevellud = tevellud;
    }

    public static String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code2;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
    public static long getvesait() {
        return vesait;
    }

    public void setvesait(long vesait) {
        this.vesait = vesait;
    }

    @Override
    public String toString() {
        return "name= " + name + "\n" +
                "price= " + tevellud + "\n" +
                "code1= " + code1 + "\n" +
                "code2= " + code2+"\n"+
                "vesait= " + vesait;

    }
}



