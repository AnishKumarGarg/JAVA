public class replace {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("mississippi");
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 's') {
				sb.setCharAt(i, 'z');
			}
		}
		System.out.println(sb);
	}
}
