/*      In problem 4 apply bedmas
        • Factor out the brain functionality of the calculator to another class. Call it calBrain     */

import jdk.jshell.JShell;
import java.io.IOException;
import java.util.Scanner;

public class CalBrain2 {
    public static void main(String[] args) throws IOException {
        //use Module jdk.jshell
        try (JShell js = JShell.create(); ) {

            //get expression from user
            System.out.println("Please enter your math expression:");
            Scanner input = new Scanner(System.in);
            String expression = input.next();

            //use JShell.onSnippetEvent(java.util.function.Consumer)
            js.onSnippetEvent(snip -> {
                if (snip.status() == jdk.jshell.Snippet.Status.VALID) {
                    System.out.println("Answer =  " + snip.value());
                }
            });
            js.eval(js.sourceCodeAnalysis().analyzeCompletion(expression).source());
        }
    }
}

