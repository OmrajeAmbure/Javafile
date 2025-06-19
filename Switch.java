package Leran_the_basics;

public class Switch {
        public void whichWeekDay(int day) {
            switch(day){
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("Thusday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }

    public static void main(String[] args) {
        Switch s = new Switch();
        s.whichWeekDay(8);
    }
}
