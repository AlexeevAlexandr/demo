import java.util.Scanner;

class if_else_switch_case {
    public static void main(String args[]) {
        try {
            Scanner sd = new Scanner(System.in);
            String season, w;
            int month = sd.nextInt();
            if (month == 12 || month == 1 || month == 2) season = "зимa";
            else if (month == 3 || month == 4 || month == 5) season = "веснa";
            else if (month == 6 || month == 7 || month == 8) season = "летo";
            else if (month == 9 || month == 10 || month == 11) season = "осень";
            else season = "month not found, try again.";
            switch (month) {
                case 1:
                    w = "Январь";System.out.println(w);
                    break;
                case 2:
                    w = "Февраль";System.out.println(w);
                    break;
                case 3:
                    w = "Март";System.out.println(w);
                    break;
                case 4:
                    w = "Апрель";System.out.println(w);
                    break;
                case 5:
                    w = "Май";System.out.println(w);
                    break;
                case 6:
                    w = "Июнь";System.out.println(w);
                    break;
                case 7:
                    w = "Июль";System.out.println(w);
                    break;
                case 8:
                    w = "Август";System.out.println(w);
                    break;
                case 9:
                    w = "Сентябрь";System.out.println(w);
                    break;
                case 10:
                    w = "Октябрь";System.out.println(w);
                    break;
                case 11:
                    w = "Ноябрь";System.out.println(w);
                    break;
                case 12:
                    w = "Декабрь";System.out.println(w);
                    break;
            }
            System.out.println("Пора: " + season);
        }catch(Exception e){System.out.println("Пора: you enter incorrect number, try again "+e);}
    }
}
