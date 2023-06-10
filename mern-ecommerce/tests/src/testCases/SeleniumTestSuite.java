package testCases;

public class SeleniumTestSuite {

	public static void main(String[] args) {
		LoginTestCase login = new LoginTestCase();
		AdminLoginTestCase adminLogin = new AdminLoginTestCase();
		RegisterTestCase register = new RegisterTestCase();
		SignoutTestCase signout = new SignoutTestCase();
		UpdateProfileTestCase update = new UpdateProfileTestCase();
		
		LoginTestCase.main(args);
		AdminLoginTestCase.main(args);
		RegisterTestCase.main(args);
		UpdateProfileTestCase.main(args);
		SignoutTestCase.main(args);

		

	}

}
