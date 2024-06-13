package paquete2;

/*
 existe un ERROR ya que no existe un constructor en la SubClase
 se anadie un constructor en la Subsclase ya que en la SuperClase "Estudiante"
 debe ser uso obligatoria de los constructores de sus SubClases.
*/

public class EstudianteDistancia extends Estudiante{
    
    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;
    
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }

}
