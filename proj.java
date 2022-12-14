/**
 * proj
 */
import java.util.*;
public final class proj 
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        HashSet<String> mac = new HashSet<>();
        mac.add("8 GB, 50.0 GB, MAC OS, WHITE");
        mac.add( "8 GB, 64.0 GB, MAC OS, GREEN");
        mac.add("8 GB, 100.0 GB, LINUX, BLUE");
        mac.add("16 GB, 1.0 TB, WINDOWS 10, RED");
        mac.add("8 GB, 40.0 GB, UBUNTU, WHITE");
        mac.add("16 GB, 84.0 GB, WINDOWS 7, PURPLE");
        mac.add("7 GB, 50.0 GB, LINUX, BLACK");
        filters(work, mac);
    }
    public static void filters(Scanner work, Set<String> lib)
    {
        System.out.println("Доступные критерии: \n(1)Оперативная память, (2)Объём жёсткого диска, (3)Операционная система, (4)Цвет корпуса\nВводите номера требуемых критериев через Enter (максимум: 4 раза) \nДля завершения ввода нажмите Enter без ввода критерия:\n");

        ArrayList<Integer> crits = new ArrayList<>();
        for (int i = 0; i<4;) {
            String cr = work.nextLine();
            if (!cr.chars().allMatch(Character::isDigit)) { System.out.println("Ошибка!"); }
            else if (cr.equals("")) { i = 999; }
            else { 
                int it = Integer.parseInt(cr); 
                crits.add(it); 
                i++;
            }
        }
        crits.add(0);
        System.out.println("Вводите параметры по желаемым критериям в том же порядке\nДля завершения ввода нажмите Enter без ввода критерия:");
        ArrayList<String> stats = new ArrayList<>();
        for (int i = 0; i<crits.size(); i++) {
            String stat = work.nextLine();
            if (crits.get(i) == 1 && Character.isDigit(stat.charAt(0)) && Character.isDigit(stat.charAt(stat.length()-1))) {
                System.out.println("Введите единицу измерения (GB, TB)");
                String bytes = work.nextLine();
                stat = stat + " " + bytes;
                System.out.println("Вводите параметры по вашим критериям:");
            }
            else if (crits.get(i) == 2 && Character.isDigit(stat.charAt(0)) && Character.isDigit(stat.charAt(stat.length()-1))) {
                double hard = Double.parseDouble(stat); 
                System.out.println("Введите единицу измерения (GB, TB)");
                stat = Double.toString(hard);
                String bytes = work.nextLine();
                stat = stat + " " + bytes;
                System.out.println("Вводите параметры по вашим критериям:");
            }
            else if (crits.get(i) == 2 && Character.isDigit(stat.charAt(0))) {
                String[] starts = stat.split(" ");
                double hard = Double.parseDouble(starts[0]);
                stat = Double.toString(hard) + " " + starts[1];
            }
            if (stat.equals("")) { i = 999; }
            else {stat = stat.toUpperCase(); stats.add(stat); }
        }
        int co = 0;
        for (String cha : lib) {
            String[] book = cha.split(", ");
            for (int rac = 0; rac<stats.size(); rac++) {
                for (String ter : book)
                {
                    if (stats.get(rac).equals(ter)) {
                        co++;
                        System.out.println(co + ". " + Arrays.toString(book));
                    }
                }
            }
        }
        if (co == 0) {System.out.println("По запрашиваемым критериям ничего не найдено.");}
        
    }
}
/**
 * Innerproj
 */
class Innerproj {
    public static void main(String[] args, Scanner work) {
        
        proj notebook;
    }
    
}