package api.aftership.tracking;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckPoints {
	private String slug;
	private String city;
	private String created_at;
	private String location;
	private String country_name;
	private String message;
	private String country_iso3;
	private String tag;
	private String subtag;
	private String subtag_message;
	private String checkpoint_time;
	private List<String> coordinates;
	private String state;
	private String zip;
	public CheckPoints() {

	}
	public CheckPoints(String slug, String city, String created_at, String location, String country_name,
			String message, String country_iso3, String tag, String subtag, String subtag_message,
			String checkpoint_time, List<String> coordinates, String state, String zip) {
		super();
		this.slug = slug;
		this.city = city;
		this.created_at = created_at;
		this.location = location;
		this.country_name = country_name;
		this.message = message;
		this.country_iso3 = country_iso3;
		this.tag = tag;
		this.subtag = subtag;
		this.subtag_message = subtag_message;
		this.checkpoint_time = checkpoint_time;
		this.coordinates = coordinates;
		this.state = state;
		this.zip = zip;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCountry_iso3() {
		return country_iso3;
	}
	public void setCountry_iso3(String country_iso3) {
		this.country_iso3 = country_iso3;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getSubtag() {
		return subtag;
	}
	public void setSubtag(String subtag) {
		this.subtag = subtag;
	}
	public String getSubtag_message() {
		return subtag_message;
	}
	public void setSubtag_message(String subtag_message) {
		this.subtag_message = subtag_message;
	}
	public String getCheckpoint_time() {
		return checkpoint_time;
	}
	public void setCheckpoint_time(String checkpoint_time) {
		this.checkpoint_time = checkpoint_time;
	}
	public List<String> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<String> coordinates) {
		this.coordinates = coordinates;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "CheckPoints [slug=" + slug + ", city=" + city + ", created_at=" + created_at + ", location=" + location
				+ ", country_name=" + country_name + ", message=" + message + ", country_iso3=" + country_iso3
				+ ", tag=" + tag + ", subtag=" + subtag + ", subtag_message=" + subtag_message + ", checkpoint_time="
				+ checkpoint_time + ", coordinates=" + coordinates + ", state=" + state + ", zip=" + zip + "]";
	}
	
}
