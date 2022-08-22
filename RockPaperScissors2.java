import java.util.Scanner;

public class RockPaperScissors2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Player 1 selection -> ");
		String player1selection = scanner.next();
		System.out.print("Player 2 selection -> ");
		String player2selection = scanner.next();
		scanner.close();
		rockPaperScissors(player1selection,player2selection);
	}
	public static void rockPaperScissors(String player1select,String player2select) {
		if(player1select.equalsIgnoreCase(player2select)) {
			System.out.println("TIE");
		} else if(player1select.equalsIgnoreCase("paper")&&(player2select.equalsIgnoreCase("rock")||player2select.equalsIgnoreCase("spock"))||player1select.equalsIgnoreCase("rock")&&(player2select.equalsIgnoreCase("scissors")||player2select.equalsIgnoreCase("lizard"))||player1select.equalsIgnoreCase("scissors")&&(player2select.equalsIgnoreCase("paper")||player2select.equalsIgnoreCase("lizard"))||player1select.equalsIgnoreCase("spock")&&(player2select.equalsIgnoreCase("rock")||player2select.equalsIgnoreCase("scissors"))||player1select.equalsIgnoreCase("lizard")&&(player2select.equalsIgnoreCase("paper")||player2select.equalsIgnoreCase("spock"))) {
			System.out.println("Player 1 wins");
		} else if(player2select.equalsIgnoreCase("paper")&&(player1select.equalsIgnoreCase("rock")||player1select.equalsIgnoreCase("spock"))||player2select.equalsIgnoreCase("rock")&&(player1select.equalsIgnoreCase("scissors")||player1select.equalsIgnoreCase("lizard"))||player2select.equalsIgnoreCase("scissors")&&(player1select.equalsIgnoreCase("paper")||player1select.equalsIgnoreCase("lizard"))||player2select.equalsIgnoreCase("spock")&&(player1select.equalsIgnoreCase("rock")||player1select.equalsIgnoreCase("scissors"))||player2select.equalsIgnoreCase("lizard")&&(player1select.equalsIgnoreCase("paper")||player1select.equalsIgnoreCase("spock"))) {
			System.out.println("Player 2 wins");
		} else {
			System.out.println("Player selection invalid!");
		}
	}
}