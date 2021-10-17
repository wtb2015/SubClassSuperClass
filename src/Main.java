public class Main {

    public static void main(String[] args) {
        Shoe s = new Shoe("Asics",43.5);
        System.out.println(s.brand);
        Walking w = new Walking(true,"Brooks",45.5);
        System.out.println(w.brand);
        System.out.println(w.goreTex);
    }
}
