public class SpringSeason {
    public static boolean isSpringSeason(int month, int day){
        if ((month == 3 && day >= 20 && day <= 31) ||  // March 20–31
                (month == 4 && day >= 1 && day <= 30) ||   // April 1–30
                (month == 5 && day >= 1 && day <= 31) ||   // May 1–31
                (month == 6 && day >= 1 && day <= 20)) {   // June 1–20
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean springSeason = isSpringSeason(month, day);
        System.out.println(springSeason);
    }
}