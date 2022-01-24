import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("java is already in map");
        } else {
            languages.put("Java", "this course is about java");
            System.out.println("Java added successfully");
        }
        languages.put("Java", "a compiled high level object-oriented, platform independent language");
        languages.put("Python", "an interpreted object-orinterd, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "begginers all purpose symbolic instruction code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("java is already in map");
        } else {
            languages.put("Java", "this course is about java");
        }

        System.out.println("===========================================================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found.");
        }

        if (languages.replace("Lisp","Therein lies madness","A functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("This wasn't replaced.");
        }
//        System.out.println(languages.replace("Scala","This won't be added."));


        for (String key : languages.keySet()) {
            System.out.println("Key: " + key + ", Value: " + languages.get(key));
        }

    }
}
