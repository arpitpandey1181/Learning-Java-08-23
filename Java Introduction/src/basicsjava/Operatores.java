package basicsjava;

public class Operatores {
    public static void main(String[] args) {
        // binary op

        // 1. Arithmetic op
        // + , - , * , / , %

        int result;

        // BODMAS -
        // B – Brackets, O – Order of powers or roots, D – Division, M – Multiplication
        // A – Addition, and S – Subtraction

        result = 3 + 2 - 1 * (2 / 2 + 1); // ERROR In LOGIC

        // System.out.println(result);

        // 2. Assignment op
        // = , += , -=
        result = 34;
        result += 1; // result = result + 1
        result -= 1; // result = result - 1
        // 45 = result;

        // 3. Relactional op = tru.false
        // == , !=, > , < , <= , >=

        boolean ans = 45 == 56;

        // System.out.println(ans);

        // 4. Logical Op
        // && , || , !

        ans = 45 > 78 && 89 < 90;

        ans = 23 > 90 || 23 > 90 || 23 > 90 || 23 > 90 || 67 < 89 || 23 > 90 || 23 > 90;

        ans = !false;

        System.out.println(ans);

        // Ternary OP
        // ? :

        String v = 67 > 23 ? "yes!" : "No!";

        System.out.println(v);

    }
}
