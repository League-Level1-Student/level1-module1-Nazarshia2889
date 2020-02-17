package _05_vault;

public class vault {
		int secretCode;
		
		public vault(int code) {
			secretCode = code;
		}
		
		boolean tryCode(int guess) {
			return guess == secretCode;
	
	}

}
