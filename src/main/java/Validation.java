import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public boolean validateName(String userID) {
    String regex = "^[A-Z]{1}[a-z]{2,}$";
    Matcher matcher = Pattern.compile(regex).matcher(userID);
    return (matcher.matches())? true :false;
}

    public boolean validatePassword(String pwd) {
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*():<>?]).{8,20}";
        Matcher matcher = Pattern.compile(regex).matcher(pwd);
        return (matcher.matches())? true :false;

    }
}
