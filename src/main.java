import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String ones = read.nextLine();
		String DontCares = read.nextLine();
		FinalStageMinimizer obj = new FinalStageMinimizer(ones, DontCares);
		System.out.println(obj.getMinimizedResult()+"    "+FirstStepMinimizer.iterations);
	}

}
