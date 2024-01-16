package com.gamersupps.model;

import java.util.List;

public class GameResponse {
    private boolean isWin;
    private List<Prize> prizes;
    private boolean error;
    private String message;
    private boolean canReplay;

    public GameResponse() {
        // Default constructor
    }

    public GameResponse(boolean isWin, List<Prize> prizes, boolean error, String message, boolean canReplay) {
        this.isWin = isWin;
        this.prizes = prizes;
        this.error = error;
        this.message = message;
        this.canReplay = canReplay;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "GameResponse{" +
                "isWin=" + isWin +
                ", prizes=" + prizes +
                ", error=" + error +
                ", message='" + message + '\'' +
                ", canReplay=" + canReplay +
                '}';
    }
}
