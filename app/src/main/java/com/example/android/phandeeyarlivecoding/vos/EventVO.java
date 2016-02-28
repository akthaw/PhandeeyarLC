package com.example.android.phandeeyarlivecoding.vos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by akthaw on 2/28/16.
 */
public class EventVO {
    @SerializedName("event_title")
    private String eventTitle;

    @SerializedName("stock_photo")
    private String stockPhoto;

    @SerializedName("event_desc")
    private String eventDesc;

    @SerializedName("start_time")
    private String startTime;

    @SerializedName("start_time")
    private String endTime;

    public String getEventTitle() {
        return eventTitle;
    }

    public String getStockPhoto() {
        return stockPhoto;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
