public class ChainedException {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception ex) {
			System.out.println("Got all exception");
			ex.printStackTrace();// 印出Stack的內容(下面的紅字 Exception:... Caused by:...)
		} finally {
			System.out.println("Useless code");
		}
	}

	public static void method1() throws Exception {// throws用來宣告Exception
		try {
			method2();
		} catch (Exception ex) {
			System.out.println("Got an exception caused by method2");
			throw new Exception("New info from method1", ex);// 把Exception(message, cause)丟到Stack裡
		}
	}

	public static void method2() throws Exception {// throws用來宣告Exception
		System.out.println("method2 has an exception");
		throw new Exception("New info from method2");// 把Exception(message)丟到Stack裡
	}
}
