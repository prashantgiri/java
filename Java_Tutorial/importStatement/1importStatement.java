//2 Types of import in jva

//1.Explicit import statement
//Recomended for readability of code
//import java.util.ArrayList;

//2.Implicit import statement
import java.util.*;

class importStatement {
    public static void main(String[] args) {
        // fully qualified name is also works
        // java.util.ArrayList l = new java.util.ArrayList<>();

        // this statements required import of package
        ArrayList L = new ArrayList<>();
    }
}

/*
 * Note : "java.lang" and "default" no need to import it consist general classes
 * required to write java program like "String", "Thread", "Exception",
 * "StringBuffer" etc class, cwd (current working directory)
 */