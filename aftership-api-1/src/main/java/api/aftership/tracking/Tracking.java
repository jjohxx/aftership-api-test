package api.aftership.tracking;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tracking implements Serializable {

    private String tracking_number;

    public Tracking() {
    }    

    public Tracking(String tracking_number) {
        setTracking_number(tracking_number);
    }    

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }
}