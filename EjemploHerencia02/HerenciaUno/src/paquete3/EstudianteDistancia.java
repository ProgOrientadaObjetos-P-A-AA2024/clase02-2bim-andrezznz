
package paquete3;

public class EstudianteDistancia extends Estudiante{
    
    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;
    
    public EstudianteDistancia(String n, String ap, String iden, int e){
        super(n, ap, iden, e); // se los usa para llamar al constructor de la 
        // super clase
        // tiene lo que recibe, sea lo que sea y los envia a la SuperClase
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){ // todo calcular trabaja con lo que tiene en ese instante
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
    
    /*
    @Override
    public String toString(){
        String cadena = String.format(" Nombre estudiantes: %s\n"
                + "Numero De Asignaturas: %d\n"
                + " Valor de Asignatura: %.2f\n"
                + " Valor Matricula: %.2f\n", 
                obtenerNombresEstudiante(),
                numeroAsignaturas,
                costoAsignatura,
                matriculaDistancia);
        
        return cadena;
    }*/
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n"
                + "Numero De Asignaturas: %d\n"
                + "Valor de Asignatura: %.2f\n"
                + "Valor Matricula: %.2f\n", 
                super.toString(), 
                // se llama al toString de la SuperClase con la palabra reservada "super"
                numeroAsignaturas,
                costoAsignatura,
                matriculaDistancia);
        
        return cadena;
    }
    

}
