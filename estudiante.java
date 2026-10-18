public class Estudiante {
    // 1. Declaración de atributos (Encapsulamiento)
    private String matricula;
    private String nombre;
    private String carrera;
    private double promedio;

    // 2. Implementación del constructor
    public Estudiante(String matricula, String nombre, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // 3. Implementación de métodos con lógica
    public void mostrarInformacion() {
        System.out.println("Matrícula : " + matricula);
        System.out.println("Nombre    : " + nombre);
        System.out.println("Carrera   : " + carrera);
        System.out.println("Promedio  : " + promedio);
        System.out.println("Estatus   : " + evaluarEstatus());
        System.out.println("------------------------------------------");
    }

    public String evaluarEstatus() {
        if (promedio >= 70.0) {
            return "Aprobado";
        } else {
            return "En Riesgo / Regularización";
        }
    }

    public void actualizarPromedio(double nuevoPromedio) {
        this.promedio = nuevoPromedio;
        System.out.println("-> Promedio actualizado para " + nombre + ": " + promedio);
    }

    // Getters y Setters
    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }
}