import java.util.ArrayList;
import java.util.Scanner;

public class Exec {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        Aluno A1 = new Aluno();
        Aluno A2 = new Aluno();

        System.out.println("Informe o nome do aluno");
        A1.setNome(input.nextLine());
    
        System.out.println("Informe a matricula");
        A1.setMatricula(input.nextLine());

        System.out.println("Informe o nome do aluno");
        A2.setNome(input.nextLine());
    
        System.out.println("Informe a matricula");
        A2.setMatricula(input.nextLine());

        alunos.add(A1);
        alunos.add(A2);

        for(Aluno i: alunos){ //pergunta pro prof sobre : e a criação do i
            System.out.println(i);
        } 

        input.close();
    }
}
