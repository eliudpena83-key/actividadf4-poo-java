public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SISTEMA DE GESTIÓN ESCOLAR - UCNL");
        System.out.println("==========================================");

        // 4. Instanciación de objetos utilizando el constructor
        Estudiante est1 = new Estudiante("A001", "Eliud Peña", "Ingeniería de Software", 92.5);
        Estudiante est2 = new Estudiante("A002", "María García", "Sistemas Computacionales", 65.0);

        // 5. Uso de métodos
        System.out.println("\n--- REGISTRO INICIAL DE ESTUDIANTES ---\n");
        est1.mostrarInformacion();
        est2.mostrarInformacion();

        // Demostración de actualización de datos mediante métodos
        System.out.println("\n--- ACTUALIZACIÓN DE CALIFICACIONES ---\n");
        est2.actualizarPromedio(78.0);
        
        System.out.println("\n--- ESTADO FINAL DEL ESTUDIANTE ---\n");
        est2.mostrarInformacion();
    }
}