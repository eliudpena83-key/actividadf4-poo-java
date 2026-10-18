/**
 * Clase principal encargada de ejecutar la aplicación,
 * instanciar los objetos y probar el funcionamiento de los métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SISTEMA DE GESTIÓN ESCOLAR - POO");
        System.out.println("==========================================");

        // --- 4. INSTANCIACIÓN DE OBJETOS ---
        // Se crean dos objetos (est1 y est2) utilizando la clase molde Estudiante
        Estudiante est1 = new Estudiante("A001", "Eliud Peña", "Ingeniería de Software", 92.5);
        Estudiante est2 = new Estudiante("A002", "María García", "Sistemas Computacionales", 65.0);

        // --- 5. USO Y PRUEBA DE MÉTODOS ---
        System.out.println("\n[PRUEBA 1] Mostrando registros iniciales:\n");
        est1.mostrarInformacion();
        est2.mostrarInformacion();

        // Modificando datos mediante métodos para probar la lógica de negocio
        System.out.println("\n[PRUEBA 2] Actualizando calificación de estudiante en riesgo:\n");
        est2.actualizarPromedio(78.0);
        
        System.out.println("\n[PRUEBA 3] Verificando estado final después de cambios:\n");
        est2.mostrarInformacion();
    }
}