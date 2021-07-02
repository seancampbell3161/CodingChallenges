public class MethodOverride2 {

    static class Bicycle {

        String define_me() {
            return "a vehicle with pedals";
        }
    }

    static class Motorcycle extends Bicycle {

        @Override
        String define_me() {
            return "a cycle with an engine";
        }

        public Motorcycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());
            String temp = super.define_me();
            System.out.println("My ancestor is a cycle who is " + temp);
        }
    }

    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
    }
}
