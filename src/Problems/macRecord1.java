package Problems;
public class macRecord1 {
    static class Monkey{
        private String hairType;
        public Monkey(String hairType){
            this.hairType = hairType;
        }
    }
    public static void main(String[] args){
        System.out.println("Hello World");
        Monkey Monkey = new Monkey("Thick");
        System.out.println(Monkey.hairType);
    }
}
