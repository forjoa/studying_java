public class Classes {

    static class Car {
        public int hp;
        public String model;

        Car (int hp, String model) {
            this.hp = hp;
            this.model = model;
        }

        public void allInfo() {
            System.out.println("El coche " + this.model + " tiene " + this.hp + " caballos de fuerza");
        }
    }

    public static void main(String[] args) {
        // to create an instance of a class, we have to make it on a "main"
        Car coche1 = new Car(1000, "Tesla");
        coche1.allInfo();

        Car coche2 = new Car(2000, "Supra");
        coche2.allInfo();
    }
}
