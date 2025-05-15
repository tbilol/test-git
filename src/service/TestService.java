package service;

public class TestService {
    public boolean checkEmail(String email){
        if (email.matches("(A-Za-b1-9)@(a-z{6,})\\.(a-z{5})")) {
            return true;
        }
        return false;
    }
}
