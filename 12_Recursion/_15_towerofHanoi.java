public class _15_towerofHanoi {
    public static void calc(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Move Disk "+n+" from "+src+" to "+dest);
            return;
        }
        calc(n-1, src, dest, helper);//transfer top n-1 from src to helper using dest as 'helper'
        System.out.println("Move Disk "+n+" from "+src+" to "+dest);//transfer nth from src to dest
        calc(n-1, helper, src, dest);//transfer n-1 from helper to dest using src as 'helper'
    }

    public static void main(String[] args) {
        calc(3, "S", "H", "D");
    }
}
