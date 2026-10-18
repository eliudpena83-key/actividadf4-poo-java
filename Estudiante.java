/**
 * Clase que representa a un Estudiante dentro del Sistema de Gestión Escolar.
 * Aplica los principios de Programación Orientada a Objetos (POO):
 * encapsulamiento, atributos, constructor y métodos operativos.
 * 
 * @author Eliud Peña
 */
public class Estudiante {

    // --- 1. DECLARACIÓN DE ATRIBUTOS (Encapsulados) ---
    private String matricula;
    private String nombre;
    private String carrera;
    private double promedio;

    /**
     * --- 2. IMPLEMENTACIÓN DEL CONSTRUCTOR ---
     * Constructor para inicializar un nuevo objeto Estudiante con sus datos base.
     * 
     * @param matricula Identificador único del alumno.
     * @param nombre Nombre completo del estudiante.
     * @param carrera Carrera que cursa.
     * @param promedio Calificación promedio inicial.
     */
    public Estudiante(String matricula, String nombre, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // --- 3. IMPLEMENTACIÓN DE MÉTODOS ---

    /**
     * Muestra por consola la información completa del estudiante,
     * incluyendo su estatus académico evaluado por otro método.
     */
    public void mostrarInformacion() {
        System.out.println("Matrícula : " + matricula);
        System.out.println("Nombre    : " + nombre);
        System.out.println("Carrera   : " + carrera);
        System.out.println("Promedio  : " + promedio);
        System.out.println("Estatus   : " + evaluarEstatus());
        System.out.println("------------------------------------------");
    }

    /**
     * Método que evalúa si el estudiante está aprobado o en riesgo
     * basándose en su promedio actual.
     * 
     * @return String con el estatus ("Aprobado" o "En Riesgo / Regularización").
     */
    public String evaluarEstatus() {
        if (promedio >= 70.0) {
            return "Aprobado";
        } else {
            return "En Riesgo / Regularización";
        }
    }

    /**
     * Método para actualizar el promedio del estudiante.
     * 
     * @param nuevoPromedio El nuevo valor de la calificación.
     */
    public void actualizarPromedio(double nuevoPromedio) {
        this.promedio = nuevoPromedio;
        System.out.println("-> Promedio actualizado con éxito para " + nombre);
    }

    // Métodos Getters y Setters para acceso controlado a los atributos
    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }
}