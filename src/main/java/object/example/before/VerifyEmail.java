package object.example.before;

public class VerifyEmail {

    // 이 메소드가 중점
    public void verifyEmail(String token) throws Exception {
        Member1 member = findByToken(token);

        if (member == null) {
            throw new Exception();
        }

        // 데이터를 가져와서 판단
        if (member.getVerificationEmailStatus() == 2) {
            throw new Exception();
        } else {
            // 판단한 데이터를 직접 바꿈
            member.setVerificationEmailStatus(2);
        }
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
}
