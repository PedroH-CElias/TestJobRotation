package application;


public class ProgramDistributor {

    public static double percent(double value, double total){

        double result;
        return result = ((value*100) / total);

    }

    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double ot = 19849.53;

        double total = sp + rj + mg + es + ot;

        System.out.println("spPercent: %" + String.format("%.2f", percent(sp,total)));
        System.out.println("rjPercent: %" + String.format("%.2f", percent(rj,total)));
        System.out.println("mgPercent: %" + String.format("%.2f", percent(mg,total)));
        System.out.println("esPercent: %" + String.format("%.2f", percent(es,total)));
        System.out.println("otPercent: %" + String.format("%.2f", percent(ot,total)));

    }
}
