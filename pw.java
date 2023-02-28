public class AssignmentOperator {
    public static void main(String[] args) {
        int p = 10;
        int q;
        //=
        q = p;
        System.out.println(q); //10
        p +=q; // p = p + q = 10 + 10 = 20
        System.out.println(p); //20
        p -=q; // p = p -q = 20 - 10 = 10
        System.out.println(p); //10
        p /=q;  // p = p /q = 10 / 10 = 1
        System.out.println(p);//1
        p = 83;

        p %=q;  // p = p % q = 1 % 10 = 0
        System.out.println(p); //0
        p*=q;
        System.out.println(p);
    }
}
hey i am for demo
