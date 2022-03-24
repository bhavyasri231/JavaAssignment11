package JavaAssignment11;
import java.util.*;
import  java.io.*;

public class JavaAssignment11 {
    public static void main(String[] args) throws IOException{

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));

        File f = new File("/home/bhavyasri.penta/IdeaProjects/JavaAssignment/src/JavaAssignment11/Output.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintWriter pw = new PrintWriter(fos);

        String st;
        String text="";
        while ((st = br.readLine()) != null)
            text+=st;
        char[] strArray = text.toCharArray();
        for (char c : strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            pw.write(entry.getKey() + " " + entry.getValue());
        }
        pw.close();
        fos.close();
    }
}
