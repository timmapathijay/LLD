package BuilderDesignPattern;

public class User {
    private String userName;
    private String userId;
    private String emailId;
    private User(UserBuilder userBuilder){
        this.userName = userBuilder.userName;
        this.userId = userBuilder.userId;
        this.emailId = userBuilder.emailId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    // Inner Class to create object
    static class UserBuilder{
        private String userName;
        private String userId;
        private String emailId;
        public UserBuilder(){

        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return  this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public User build(){
            User user = new User(this);
            return  user;
        }
    }
}
