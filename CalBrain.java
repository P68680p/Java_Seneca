/*      In problem 4 apply bedmas
        • Factor out the brain functionality of the calculator to another class. Call it calBrain     */

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CalBrain {
    public static void main(String[] args) throws ScriptException {
        //get expression
        System.out.println("Please enter your math expression:");
        Scanner input = new Scanner(System.in);
        String expression = input.next();

        //use "public interface ScriptEngine" and his method "eval(String script)"
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result;
        result = engine.eval(expression);

        System.out.println(result);

    }
}
