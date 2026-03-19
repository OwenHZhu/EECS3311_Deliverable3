package main.models;

public class UserSession {
    private String currentUserId;
    private String currentUserName;

    public String getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUser(User user) {
        if (user == null) {
            this.currentUserId = null;
            this.currentUserName = null;
            return;
        }
        this.currentUserId = user.getUserId();
        this.currentUserName = user.getName();
    }

    public String getCurrentUserName() {
        return currentUserName;
    }
}

