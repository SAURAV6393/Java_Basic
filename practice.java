public class practice {
    // example of method chaining
    practice show1(practice o){
        System.out.println("from show1()");
        System.out.println(o);
        return  o;
    }
    static practice show2(practice o){
        System.out.println("from show2()");
        System.out.println(o);
        return o;
        //  return null;
    }
    practice show(practice o){
        System.out.println("from show() ");
        System.out.println(o);
        return o;
    }
    public static void main(String[] args) {
        practice obj  = new practice();
        System.out.println(practice.show2(obj).show1(obj).show(obj));
    }
}
