import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

        double notas [];
        notas = new double [10];

        for (int i = 1; i <= 10; i++){
            double nota;
            System.out.print("Nota " + i + ": ");
            nota = leer.nextDouble();

            if (nota >= 0 && nota <= 5) {
                notas[i-1] = nota;
                if(nota >= 0 && nota <= 2.9) {
                    System.out.println("Deben habilitar");
                } else if (nota >=3 && nota <=3.5){
                    System.out.println("ganó la asignatura con lo justo");
                }else if (nota >=3.6 && nota <=4.2){
                    System.out.println("Buena nota");
                } else if (nota >=4.3 && nota <= 4.6) {
                    System.out.println("Excelente");
                } else if (nota >=4.7 && nota <= 5) {
                    System.out.println("Superior");
                }
            }else {
                System.out.println("Ingrese nota dentro del rango.");
                i -= 1;
            }
        }
	}
}