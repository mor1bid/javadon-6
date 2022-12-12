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
        mac.add("8 GB, 50.0 GB, Mac OS, white");
        mac.add( "8 GB, 64.0 GB, Mac OS, green");
        mac.add("8 GB, 100.0 GB, Linux, blue");
        mac.add("16 GB, 1 TB, Windows 10, red");
        mac.add("8 GB, 40.0 GB, Ubuntu, white");
        mac.add("16 GB, 84.0 GB, Windows 7, purple");
        mac.add("7 GB, 50.0 GB, Linux, black");
        // Map<String, String> macc = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        filters(work, mac);
    }
    public static void filters(Scanner work, Set<String> lib) 
    {
        System.out.println("Введите требуемый критерии через пробел:");
        String crit = work.nextLine();
        for (String cha : lib) {
            String[] crits = crit.split(" ");
            String[] book = cha.split(", ");
            for (String rac : book) 
            {
                if (crit.equals(rac)) {
                    System.out.println(Arrays.toString(book));
                }
            }
        }
        
    }
}