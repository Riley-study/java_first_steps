import org.example.Notebook;

import java.util.HashSet;
import java.util.Set;

public class mainForNotebookTask {
    public static void main(String[] args) {
        Set<Notebook> notebooksCatalog = new HashSet();
        Notebook note1 = new Notebook(1,"Windows", 8, 512,
                "black");
        Notebook note2 = new Notebook(2,"Windows", 16, 512,
                "white");
        Notebook note3 = new Notebook(3,"IOS", 16, 512,
                "white");
        Notebook note4 = new Notebook(4,"IOS", 8, 512,
                "black");
        Notebook note5 = new Notebook(2,"Linux", 8, 512,
                "white");
        Notebook note6 = new Notebook(2,"Linux", 16, 512,
                "black");
        notebooksCatalog.add(note1);
        notebooksCatalog.add(note2);
        notebooksCatalog.add(note3);
        notebooksCatalog.add(note4);
        notebooksCatalog.add(note5);
        notebooksCatalog.add(note6);
        System.out.println(notebooksCatalog.toString());
    }

}
