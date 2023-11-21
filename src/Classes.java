public class Classes {

    static class Car {
        public int hp;
        public String model;

        Car(int hp, String model) {
            this.hp = hp;
            this.model = model;
        }

        public void allInfo() {
            System.out.println("El coche " + this.model + " tiene " + this.hp + " caballos de fuerza");
        }
    }

    static class Person {
        public String name;
        public int dni;

        Person(String name, int dni) {
            this.name = name;
            this.dni = dni;
        }

        public void allInfo() {
            System.out.println("El DNI de la persona " + this.name + " es " + this.dni);
        }
    }

    public static void main(String[] args) {
        // to create an instance of a class, we have to make it on a "main"
        Car coche1 = new Car(1000, "Tesla");
        coche1.allInfo();

        Car coche2 = new Car(2000, "Supra");
        coche2.allInfo();

        Person persona1 = new Person("Joaquin", 1234567);
        persona1.allInfo();
    }
}
