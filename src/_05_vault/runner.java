package _05_vault;

public class runner {
	public static void main(String[] args) {
		vault v = new vault(50);
		JamesBond j = new JamesBond();
		int x = j.findCode(v);
		System.out.println(x);
	}

}
