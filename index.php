// Este archivo se ejecuta para mostrar en consola la información de los estudiantes 
// y su estatus académico basado en su promedio.
<?php
class Estudiante {
    // Atributos
    public $matricula;
    public $nombre;
    public $carrera;
    public $promedio;

    // Constructor
    public function __construct($matricula, $nombre, $carrera, $promedio) {
        $this->matricula = $matricula;
        $this->nombre = $nombre;
        $this->carrera = $carrera;
        $this->promedio = $promedio;
    }

    // Métodos
    public function mostrarInformacion() {
        echo "<strong>Matrícula:</strong> " . $this->matricula . "<br>";
        echo "<strong>Nombre:</strong> " . $this->nombre . "<br>";
        echo "<strong>Carrera:</strong> " . $this->carrera . "<br>";
        echo "<strong>Promedio:</strong> " . $this->promedio . "<br>";
        echo "<strong>Estatus:</strong> " . $this->evaluarEstatus() . "<br><hr>";
    }

    public function evaluarEstatus() {
        return ($this->promedio >= 70.0) ? "Aprobado" : "En Riesgo";
    }
}

// Instanciación de objetos -- Insumos
$est1 = new Estudiante("A001", "Eliud Peña", "Ingeniería de Software", 92.5);
$est2 = new Estudiante("A002", "María García", "Sistemas Computacionales", 65.0);

// Uso de métodos
$est1->mostrarInformacion();
$est2->mostrarInformacion();
?>