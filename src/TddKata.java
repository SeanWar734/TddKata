public class TddKata {

	public static void main(String[] args) {
		
		System.out.println("Run the test, not the actual program(:");
	}
	
	public static int add(String nums) {
		int a = 0;
		nums = nums.replace(" ", "");
		nums = nums.replace(",", " ");
		nums = nums.replaceAll("([A-Za-z])", "");

		String[] array1 = nums.split(" ");

		if (nums.equals("")) {
			a = 0;
		} else {
			for (int i = 0; i < array1.length; i++) {
				int result = Integer.parseInt(array1[i]);
				a += result;
			}
		}
		return a;
	}

}
