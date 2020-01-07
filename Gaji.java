public class Gaji{
    public static void main(String[] args) {
        double Gapok = 4600897;
        double TunjanganAi = Gapok * 10 / 100;
        double TunjanganA = 4 * (Gapok * 2 / 10);
        double IP = Gapok * 4 / 100;
        double PBP = Gapok + TunjanganAi + TunjanganA;
        double PNB = PBP - IP;


        System.out.println();
        System.out.println("Gapok = 4600897");
        System.out.println("TunjanganAi = " + TunjanganAi);
        System.out.println("TunjanganA = " + TunjanganA);
        System.out.println("IP = " + IP);
        System.out.println("PBP = " + PBP);
        System.out.println("PNB = " + PNB);
    }
}