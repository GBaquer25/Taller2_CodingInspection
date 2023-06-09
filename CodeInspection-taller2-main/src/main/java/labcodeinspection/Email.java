package labcodeinspection;

public class Email {

	private String m_firstName;
	private String m_lastName;
	private String password = null;
	private String department; 
	private int defaultpasswordLength = 8; // This variable needs a commentary.
	private String email;

	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		}
	}

	private String randomPassword(int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*"; // This variable needs a commentary.
		final char[] password = new char[length]; /** variable final*/
		for (int i = 0; i < length; i++) {
		final	int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	// This function needs a commentary.
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase() + this.m_lastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}
}
