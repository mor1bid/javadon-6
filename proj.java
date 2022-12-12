/**
 * proj
 */
import java.util.*;
public final class proj {
        Scanner work = new Scanner(System.in);
    public static void main(String[] args, Scanner work) {
        ArrayList<String> maci = new ArrayList<>();
        maci.add("8 GB, 50.0 GB, Mac OS, white");
        maci.add( "8 GB, 64.0 GB, Mac OS, green");
        maci.add("8 GB, 100.0 GB, Linux, blue");
        maci.add("16 GB, 1 TB, Windows 10, red");
        maci.add("8 GB, 50.0 GB, Mac OS, white");
        maci.add("16 GB, 84.0 GB, Windows 7, purple");
        maci.add("7 GB, 50.0 GB, Linux, black");
        Map<String, String> macc = new HashMap<>();
        macc.put(" ", maci.get(0));
        macc.put(" ", maci.get(1));
        macc.put(" ", maci.get(2));
        macc.put(" ", maci.get(3));
        macc.put(" ", maci.get(4));
        macc.put(" ", maci.get(5));
        macc.put(" ", maci.get(6));
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        String key = work.nextLine();
        if (key.equals("4"));
            colors(work, maci);
    }
    public static void colors(Scanner work, ArrayList<String> lib) {
        lib.get(0).split(",");
        System.out.println(Arrays.asList(lib.get(0)));
        System.out.println("Введите требуемый критерий по цвету:\n");
        String clr = work.nextLine();
        
    }
}