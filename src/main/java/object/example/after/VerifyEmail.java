package object.example.after;

public class VerifyEmail {

    public void verifyEmail(String token) throws Exception {
        Member1 member = findByToken(token);

        if (member == null) {
            throw new Exception();
        }

        // 데이터를 가져와서 판단하고 변경하는 유형의 코드는 통으로 변경
        member.verifyEmail();
    }

    private Member1 findByToken(String token) {
        return null;
    }

}

class Member1 {
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

    // 캡슐화
    public void verifyEmail() throws Exception {
        if (isEmailVerified()) {
            throw new Exception();
        } else {
            this.emailStatus = 2;
        }
    }
}
