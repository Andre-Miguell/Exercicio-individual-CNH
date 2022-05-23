import java.util.Scanner;

public class ExercicioCNH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//variaveis
		int psicotecnico, teorico, pratico;

		//Perguntas/respostas 
		System.out.println("Bem vindo ao teste para obtencao da sua CNH!\n Lembrando que para responder voce deve usar 1 para sim e 2 para nao!\n Vamos comecar!\n");
		System.out.print("Voce passou no exame psicotecnico? \n (1)- Sim\n (2)- Nao\n Resposta: ");
		psicotecnico = sc.nextInt();

		System.out.print("Voce passou no exame de legislacao? \n (1)- Sim\n (2)- Nao\n Resposta: ");
		teorico = sc.nextInt();

		System.out.print("Voce passou no exame de direcao? \n (1)- Sim\n (2)- Nao\n Resposta: ");
		pratico = sc.nextInt();
		
		//Em caso de todas as alternativas resultarem como true
		if( psicotecnico == 1 && teorico == 1 && pratico == 1) {
			System.out.print("\nParabens! Voce passou em todos os requisitos e pode solicitar sua CNH!\n");
		}else{
			//Em caso de uma das alternativas resultar como false
			System.out.print("\nInfelizmente voce nao pode solicitar sua CNH, pois todos os requisitos sao nescessarios. Boa sorte na proxima vez.\n");
		}
		System.out.println(); //Quebra de linha
		
		sc.close();
		
	}

}
