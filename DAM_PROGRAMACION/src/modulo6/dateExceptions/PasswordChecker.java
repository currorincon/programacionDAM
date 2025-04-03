package modulo6.dateExceptions;

class PasswordException extends Exception {
    private int errorCode;

    public PasswordException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

public class PasswordChecker {
    public static void validatePassword(String password) throws PasswordException {
        if (!password.matches("[0-9#*]+")) {
            throw new PasswordException("It’s not a number digit", 0);
        }
        if (password.matches(".*-[0-9]+.*")) {
            throw new PasswordException("It’s a negative number", 1);
        }
        if (!password.matches(".*[0-9].*{6,}")) {
            throw new PasswordException("It’s not a valid length", 2);
        }
        if (!password.contains("#")) {
            throw new PasswordException("It hasn’t a # symbol", 3);
        }
        if (!password.contains("*")) {
            throw new PasswordException("It hasn’t a * symbol", 4);
        }
    }

    public static void main(String[] args) {
        String[] testPasswords = {
            "09887#4*", "-145689#*", "09#1*", "08988*1", "9#01945", "Pwsik#*o", "03*s"
        };

        for (String password : testPasswords) {
            try {
                validatePassword(password);
                System.out.println("✅ Valid password: " + password);
            } catch (PasswordException e) {
                System.out.println("❌ Invalid password: " + password + " | Error Code: " + e.getErrorCode() + " | " + e.getMessage());
            } catch (Exception e) {
                System.out.println("❌ Invalid password: " + password + " | Error Code: 5 | Unexpected Error");
            }
        }
    }
}