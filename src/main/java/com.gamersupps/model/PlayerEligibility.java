package com.gamersupps.model;

public class PlayerEligibility {
    private boolean canPlay;
    private boolean loggedIn;
    private int flag;
    private String message;

    public PlayerEligibility() {
        // Default constructor
    }

    public PlayerEligibility(boolean canPlay, boolean loggedIn, int flag, String message) {
        this.canPlay = canPlay;
        this.loggedIn = loggedIn;
        this.flag = flag;
        this.message = message;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "PlayerEligibility{" +
                "canPlay=" + canPlay +
                ", loggedIn=" + loggedIn +
                ", flag=" + flag +
                ", message='" + message + '\'' +
                '}';
    }
}
