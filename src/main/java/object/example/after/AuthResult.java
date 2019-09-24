package object.example.after;

public class AuthResult {
    private static final AuthResult NO_MATCH = new AuthResult();
    private static final AuthResult NO_EMAIL_VERIFIED = new AuthResult();
    private static final AuthResult SUCCESS = new AuthResult();
    private static final PasswordEncoder passwordEncoder = new PasswordEncoder();


    // 이 메소드가 중점
    public AuthResult authenticate(String id, String pw) {
        Member member = findOne(id);

        if (member == null) {
            return AuthResult.NO_MATCH;
        }

        // 판단해라
        if (member.isEmailVerified()) {
            return AuthResult.NO_EMAIL_VERIFIED;
        }

        if (passwordEncoder.isPasswordValid(member.getPassword(), pw, member.getId())) {
            return AuthResult.SUCCESS;
        }
        return AuthResult.NO_MATCH;
    }
    
    public Member findOne(String id) {
        return new Member();
    }

}

class Member {
    private String id;
    private String password;
    private int emailStatus;

    public int getVerificationEmailStatus() {
        return emailStatus;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public boolean isEmailVerified() {
        return emailStatus == 2;
    }

    public void setVerificationEmailStatus(int emailStatus) {
        this.emailStatus = emailStatus;
    }
}

class PasswordEncoder {
    public boolean isPasswordValid(String userPass, String inputPass, String userId) {
        return userPass.equals(inputPass);
    }
}