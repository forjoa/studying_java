public class Classes {
    public static void main(String[] args) {
        // to create an instance of a class, we have to make it on a "main"
        Person persona1 = new Person("Joaquin", 1234567, "hola");
        persona1.allInfo();
    }

    static class Person {
        public String name;
        public int dni;
        public String correo;

        Person(String name, int dni, String correo) {
            this.name = name;
            this.dni = dni;
            this.correo = correo;
        }

        public String allInfo() {
            System.out.println("El DNI de la persona " + this.name + " es " + this.dni);
            return "hola";
        }
    }
}
