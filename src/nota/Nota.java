package nota;


public class Nota {

    double quiz[];
    int indice;

    public Nota(int cantidadDeEstudiantes) {
        quiz = new double[cantidadDeEstudiantes];
        indice = 0;
    }

    public void agregarNota(double notaEstudiante) {
        try {
        
            try {
                quiz[indice++] = notaEstudiante;


            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de quices");
                indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndex() {
        return indice;
    }

    public double getNota(int i) {
        return quiz[i];
    }

}
