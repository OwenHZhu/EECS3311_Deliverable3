package main.models;

public final class AppBackend {
    private static AppBackend instance;

    private final ReservationFacade facade;
    private final UserSession session;

    private AppBackend() {
        this.facade = new ReservationFacade();
        this.session = new UserSession();
    }

    public static synchronized AppBackend getInstance() {
        if (instance == null) {
            instance = new AppBackend();
        }
        return instance;
    }

    public ReservationFacade getFacade() {
        return facade;
    }

    public UserSession getSession() {
        return session;
    }
}

