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
        mac.add("8 GB, 50.0 GB, mac os, white");
        mac.add( "8 GB, 64.0 GB, mac os, green");
        mac.add("8 GB, 100.0 GB, linux, blue");
        mac.add("16 GB, 1 TB, windows 10, red");
        mac.add("8 GB, 40.0 GB, ubuntu, white");
        mac.add("16 GB, 84.0 GB, windows 7, purple");
        mac.add("7 GB, 50.0 GB, linux, black");
        // Map<String, String> macc = new HashMap<>();
        // System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        filters(work, mac);
    }
    public static void filters(Scanner work, Set<String> lib)
    {
        System.out.println("Доступные критерии: \n(1)Оперативная память (2)Объём жёсткого диска (3)Операционная система (4)Цвет корпуса\nВводите требуемые критерии через Enter. Для завершения ввода нажмите Enter без ввода критерия:\n");
        ArrayList<String> crits = new ArrayList<>();
        for (int i = 0; i<999; i++) {
            String crit = work.nextLine();
            if (crit.equals("")) { i = 999; }
            else { crits.add(crit); }
        }
        int co = 0;
        for (String cha : lib) {
            String[] book = cha.split(", ");
            for (int rac = 0; rac<crits.size(); rac++) {
                for (String ter : book)
                {
                    if (crits.get(rac).equals(ter)) {
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