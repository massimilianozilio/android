package st.alr.mqttitude.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table WAYPOINT.
 */
public class Waypoint {

    private Long id;
    private String description;
    private Double latitude;
    private Double longitude;
    private String geocoder;
    private Boolean shared;
    private java.util.Date date;
    private Float radius;
    private Integer transitionType;
    private String geofenceId;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Waypoint() {
    }

    public Waypoint(Long id) {
        this.id = id;
    }

    public Waypoint(Long id, String description, Double latitude, Double longitude, String geocoder, Boolean shared, java.util.Date date, Float radius, Integer transitionType, String geofenceId) {
        this.id = id;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.geocoder = geocoder;
        this.shared = shared;
        this.date = date;
        this.radius = radius;
        this.transitionType = transitionType;
        this.geofenceId = geofenceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getGeocoder() {
        return geocoder;
    }

    public void setGeocoder(String geocoder) {
        this.geocoder = geocoder;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Integer getTransitionType() {
        return transitionType;
    }

    public void setTransitionType(Integer transitionType) {
        this.transitionType = transitionType;
    }

    public String getGeofenceId() {
        return geofenceId;
    }

    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
