import java.util.Scanner;

public class tictactoe {
	
	static int Choice1;
	static Scanner scan = new Scanner(System.in);
	static boolean cross = false;
	static int A = 3;
	static int B = 3;
	static int C = 3;
	static int D = 3;
	static int E = 3;
	static int F = 3;
	static int G = 3;
	static int H = 3;
	static int I = 3;
	
	public static void main(String[] args) {
		begin();
	}
		
	static void begin() {
	Decide1();
		if (Choice1 == 1) {
			startNewGame();
		} else {
			System.out.println("Goodbye.");
		}
	}
	
	static void startNewGame() {
		
		System.out.println("Starting a new game...\n");
		System.out.println("How to play:");
		System.out.println("Whenever it is your turn, select the letter of the square you'd like to fill.");
		System.out.println("The letters are show in the box below.\n");
		System.out.println("-------------");
		System.out.println("| A | B | C |");
		System.out.println("-------------");
		System.out.println("| D | E | F |");
		System.out.println("-------------");
		System.out.println("| G | H | I |");
		System.out.println("-------------\n");
		System.out.println("Take note of these letters!, this will be the only time you see them.\n");
		System.out.println("It's time to decide who will be X and who will be O!\nX's will go first. press 'Enter' when you are ready to begin.");
		scan.nextLine();
		startGame();
	}
	
	static void startGame() {
		System.out.println("Great! Let's begin.\n");
		
		System.out.println("-------------");
		System.out.println("|   |   |   |");
		System.out.println("-------------");
		System.out.println("|   |   |   |");
		System.out.println("-------------");
		System.out.println("|   |   |   |");
		System.out.println("-------------\n");
		
		while (cross != true) {
			turnx();
			showboard();
			evalcross();
			if (cross != true) {
			turny();
			showboard();
			evalcross();
			}
		}
		begin();
	}
	
	static void showboard() {
		String A_;
		String B_;
		String C_;
		String D_;
		String E_;
		String F_;
		String G_;
		String H_;
		String I_;
		
		if (A == 1) {
			A_ = "X";
		} else if (A == 2) {
			A_ = "O";
		} else {
			A_ = " ";
		}
		
		if (B == 1) {
			B_ = "X";
		} else if (B == 2) {
			B_ = "O";
		} else {
			B_ = " ";
		}
		
		if (C == 1) {
			C_ = "X";
		} else if (C == 2) {
			C_ = "O";
		} else {
			C_ = " ";
		}
		
		if (D == 1) {
			D_ = "X";
		} else if (D == 2) {
			D_ = "O";
		} else {
			D_ = " ";
		}
		
		if (E == 1) {
			E_ = "X";
		} else if (E == 2) {
			E_ = "O";
		} else {
			E_ = " ";
		}
		
		if (F == 1) {
			F_ = "X";
		} else if (F == 2) {
			F_ = "O";
		} else {
			F_ = " ";
		}
		
		if (G == 1) {
			G_ = "X";
		} else if (G == 2) {
			G_ = "O";
		} else {
			G_ = " ";
		}
		
		if (H == 1) {
			H_ = "X";
		} else if (H == 2) {
			H_ = "O";
		} else {
			H_ = " ";
		}
		
		if (I == 1) {
			I_ = "X";
		} else if (I == 2) {
			I_ = "O";
		} else {
			I_ = " ";
		}
		
		System.out.println("-------------");
		System.out.format("| %s | %s | %s |\n", A_, B_, C_);
		System.out.println("-------------");
		System.out.format("| %s | %s | %s |\n", D_, E_, F_);
		System.out.println("-------------");
		System.out.format("| %s | %s | %s |\n", G_, H_, I_);
		System.out.println("-------------\n");
		
	}
	
	static void evalcross() {
		if (
				(A == 1 && D == 1 && G == 1) ||
				(B == 1 && E == 1 && H == 1) ||
				(C == 1 && F == 1 && I == 1) ||
				(A == 1 && B == 1 && C == 1) ||
				(D == 1 && E == 1 && F == 1) ||
				(G == 1 && H == 1 && I == 1) ||
				(A == 1 && E == 1 && I == 1) ||
				(G == 1 && E == 1 && C == 1)
			) {
			
			System.out.println("X wins!\n");
			cross = true;
			
		} else if (
				(A == 2 && D == 2 && G == 2) ||
				(B == 2 && E == 2 && H == 2) ||
				(C == 2 && F == 2 && I == 2) ||
				(A == 2 && B == 2 && C == 2) ||
				(D == 2 && E == 2 && F == 2) ||
				(G == 2 && H == 2 && I == 2) ||
				(A == 2 && E == 2 && I == 2) ||
				(G == 2 && E == 2 && C == 2)
				) {
			
			System.out.println("Y wins!\n");
			cross = true;
			
		} else if (cross != true && A != 3 && B != 3 && C != 3 && D != 3 && E != 3 && F != 3 && G != 3 && H != 3 && I != 3) {
			System.out.println("No Winners!\n");
			cross = true;
		}
	}
	
	static void takenx() {
		System.out.println("This square is already taken, please choose a different one.");
		turnx();
	}
	
	static void takeny() {
		System.out.println("This square is already taken, please choose a different one.");
		turny();
	}
	
	static int turnx() {
		System.out.println("X, please select a square.");
		String square = scan.nextLine();
		
		if (square.equals("A") || square.equals("a")) {
			if (A == 3) {
				A = 1;
			} else {
				takenx();
			}
		} else if (square.equals("B") || square.equals("b")) {
			if (B == 3) {
				B = 1;
			} else {
				takenx();
			}
		} else if (square.equals("C") || square.equals("c")) {
			if (C == 3) {
				C = 1;
			} else {
				takenx();
			}
		} else if (square.equals("D") || square.equals("d")) {
			if (D == 3) {
				D = 1;
			} else {
				takenx();
			}
		} else if (square.equals("E") || square.equals("e")) {
			if (E == 3) {
				E = 1;
			} else {
				takenx();
			}
		} else if (square.equals("F") || square.equals("f")) {
			if (F == 3) {
				F = 1;
			} else {
				takenx();
			}
		} else if (square.equals("G") || square.equals("g")) {
			if (G == 3) {
				G = 1;
			} else {
				takenx();
			}
		} else if (square.equals("H") || square.equals("h")) {
			if (H == 3) {
				H = 1;
			} else {
				takenx();
			}
		} else if (square.equals("I") || square.equals("i")) {
			if (I == 3) {
				I = 1;
			} else {
				takenx();
			}
		} else {
			incorrectx();
		}
		
		return 0;
	}
	
	static void incorrectx() {
		System.out.println("\nPlease select a valid option.");
		turnx();
	}
	
	static void incorrecty() {
		System.out.println("\nPlease select a valid option.");
		turny();
	}
	static int turny() {
		System.out.println("Y, please select a square.");
		String square = scan.nextLine();
		
		if (square.equals("A") || square.equals("a")) {
			if (A == 3) {
				A = 2;
			} else {
				takeny();
			}
		} else if (square.equals("B") || square.equals("b")) {
			if (B == 3) {
				B = 2;
			} else {
				takeny();
			}
		} else if (square.equals("C") || square.equals("c")) {
			if (C == 3) {
				C = 2;
			} else {
				takeny();
			}
		} else if (square.equals("D") || square.equals("d")) {
			if (D == 3) {
				D = 2;
			} else {
				takeny();
			}
		} else if (square.equals("E") || square.equals("e")) {
			if (E == 3) {
				E = 2;
			} else {
				takeny();
			}
		} else if (square.equals("F") || square.equals("f")) {
			if (F == 3) {
				F = 2;
			} else {
				takeny();
			}
		} else if (square.equals("G") || square.equals("g")) {
			if (G == 3) {
				G = 2;
			} else {
				takeny();
			}
		} else if (square.equals("H") || square.equals("h")) {
			if (H == 3) {
				H = 2;
			} else {
				takeny();
			}
		} else if (square.equals("I") || square.equals("i")) {
			if (I == 3) {
				I = 2;
			} else {
				takeny();
			}
		} else {
			incorrecty();
		}
		
		return 0;
	}
	static int Decide1() {
		
		System.out.println("Would you like to start a game of TicTacToe?\n1 = yes, 2 = no.");
		String choice = scan.nextLine();
		
		if (choice.equals("1")) {
			Choice1 = 1;
			cross = false;
			A = 3;
			B = 3;
			C = 3;
			D = 3;
			E = 3;
			F = 3;
			G = 3;
			H = 3;
			I = 3;
		} else if (choice.equals("2")) {
			Choice1 = 2;
		} else {
			System.out.println("Please select a valid option.");
			Decide1();
		}
		return Choice1;
		
	}
}
