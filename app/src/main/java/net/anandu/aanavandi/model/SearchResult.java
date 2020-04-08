package net.anandu.aanavandi.model;

public class SearchResult {
    private String busName;
    private String busType;
    private String startTime;
    private String fare;

    public SearchResult(String busName, String busType, String startTime, String fare) {
        this.busName = busName;
        this.busType = busType;
        this.startTime = startTime;
        this.fare = fare;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
}
