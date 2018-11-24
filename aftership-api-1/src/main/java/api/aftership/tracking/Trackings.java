package api.aftership.tracking;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trackings {
	private String id;
	private String created_at;
	private String updated_at;
	private String last_updated_at;
	private String tracking_number;
	private String slug;
	private Boolean active;
	private String customer_name;
	private int delivery_time;
	private String destination_country_iso3;
	private String courier_destination_country_iso3;
	private List<String> emails;
	private String expected_delivery;
	private String note;
	private String order_id;
	private String order_id_path;
	private int shipment_package_count;
	private String shipment_pickup_date;
	private String shipment_delivery_date;
	private String shipment_type;
	private String shipment_weight;
	private String shipment_weight_unit;
	private String signed_by;
	private String source;
	private String tag;
	private String subtab;
	private String subtag_message;
	private String title;
	private int tracked_count; 
	private String last_mile_tracking_supported;
	private String language;
	private String unique_token;
	private List<CheckPoints> checkpoints;
	public Trackings() {

	}
	public Trackings(String tracking_number) {
		super();
		this.tracking_number = tracking_number;
	}
	public Trackings(String tracking_number, String slug, String order_id, String title,
			String language) {
		super();
		this.tracking_number = tracking_number;
		this.slug = slug;
		this.order_id = order_id;
		this.title = title;
		this.language = language;
	}

	public Trackings(String id, String created_at, String updated_at, String last_updated_at, String tracking_number,
			String slug, Boolean active, String customer_name, int delivery_time, String destination_country_iso3,
			String courier_destination_country_iso3, List<String> emails, String expected_delivery, String note,
			String order_id, String order_id_path, int shipment_package_count, String shipment_pickup_date,
			String shipment_delivery_date, String shipment_type, String shipment_weight, String shipment_weight_unit,
			String signed_by, String source, String tag, String subtab, String subtag_message, String title,
			int tracked_count, String last_mile_tracking_supported, String language, String unique_token,
			List<CheckPoints> checkpoints) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.last_updated_at = last_updated_at;
		this.tracking_number = tracking_number;
		this.slug = slug;
		this.active = active;
		this.customer_name = customer_name;
		this.delivery_time = delivery_time;
		this.destination_country_iso3 = destination_country_iso3;
		this.courier_destination_country_iso3 = courier_destination_country_iso3;
		this.emails = emails;
		this.expected_delivery = expected_delivery;
		this.note = note;
		this.order_id = order_id;
		this.order_id_path = order_id_path;
		this.shipment_package_count = shipment_package_count;
		this.shipment_pickup_date = shipment_pickup_date;
		this.shipment_delivery_date = shipment_delivery_date;
		this.shipment_type = shipment_type;
		this.shipment_weight = shipment_weight;
		this.shipment_weight_unit = shipment_weight_unit;
		this.signed_by = signed_by;
		this.source = source;
		this.tag = tag;
		this.subtab = subtab;
		this.subtag_message = subtag_message;
		this.title = title;
		this.tracked_count = tracked_count;
		this.last_mile_tracking_supported = last_mile_tracking_supported;
		this.language = language;
		this.unique_token = unique_token;
		this.checkpoints = checkpoints;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getLast_updated_at() {
		return last_updated_at;
	}
	public void setLast_updated_at(String last_updated_at) {
		this.last_updated_at = last_updated_at;
	}
	public String getTracking_number() {
		return tracking_number;
	}
	public void setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(int delivery_time) {
		this.delivery_time = delivery_time;
	}
	public String getDestination_country_iso3() {
		return destination_country_iso3;
	}
	public void setDestination_country_iso3(String destination_country_iso3) {
		this.destination_country_iso3 = destination_country_iso3;
	}
	public String getCourier_destination_country_iso3() {
		return courier_destination_country_iso3;
	}
	public void setCourier_destination_country_iso3(String courier_destination_country_iso3) {
		this.courier_destination_country_iso3 = courier_destination_country_iso3;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public String getExpected_delivery() {
		return expected_delivery;
	}
	public void setExpected_delivery(String expected_delivery) {
		this.expected_delivery = expected_delivery;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getOrder_id_path() {
		return order_id_path;
	}
	public void setOrder_id_path(String order_id_path) {
		this.order_id_path = order_id_path;
	}
	public int getShipment_package_count() {
		return shipment_package_count;
	}
	public void setShipment_package_count(int shipment_package_count) {
		this.shipment_package_count = shipment_package_count;
	}
	public String getShipment_pickup_date() {
		return shipment_pickup_date;
	}
	public void setShipment_pickup_date(String shipment_pickup_date) {
		this.shipment_pickup_date = shipment_pickup_date;
	}
	public String getShipment_delivery_date() {
		return shipment_delivery_date;
	}
	public void setShipment_delivery_date(String shipment_delivery_date) {
		this.shipment_delivery_date = shipment_delivery_date;
	}
	public String getShipment_type() {
		return shipment_type;
	}
	public void setShipment_type(String shipment_type) {
		this.shipment_type = shipment_type;
	}
	public String getShipment_weight() {
		return shipment_weight;
	}
	public void setShipment_weight(String shipment_weight) {
		this.shipment_weight = shipment_weight;
	}
	public String getShipment_weight_unit() {
		return shipment_weight_unit;
	}
	public void setShipment_weight_unit(String shipment_weight_unit) {
		this.shipment_weight_unit = shipment_weight_unit;
	}
	public String getSigned_by() {
		return signed_by;
	}
	public void setSigned_by(String signed_by) {
		this.signed_by = signed_by;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getSubtab() {
		return subtab;
	}
	public void setSubtab(String subtab) {
		this.subtab = subtab;
	}
	public String getSubtag_message() {
		return subtag_message;
	}
	public void setSubtag_message(String subtag_message) {
		this.subtag_message = subtag_message;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTracked_count() {
		return tracked_count;
	}
	public void setTracked_count(int tracked_count) {
		this.tracked_count = tracked_count;
	}
	public String getLast_mile_tracking_supported() {
		return last_mile_tracking_supported;
	}
	public void setLast_mile_tracking_supported(String last_mile_tracking_supported) {
		this.last_mile_tracking_supported = last_mile_tracking_supported;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getUnique_token() {
		return unique_token;
	}
	public void setUnique_token(String unique_token) {
		this.unique_token = unique_token;
	}
	public List<CheckPoints> getCheckpoints() {
		return checkpoints;
	}
	public void setCheckpoints(List<CheckPoints> checkpoints) {
		this.checkpoints = checkpoints;
	}
	@Override
	public String toString() {
		return "Trackings [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", last_updated_at=" + last_updated_at + ", tracking_number=" + tracking_number + ", slug=" + slug
				+ ", active=" + active + ", customer_name=" + customer_name + ", delivery_time=" + delivery_time
				+ ", destination_country_iso3=" + destination_country_iso3 + ", courier_destination_country_iso3="
				+ courier_destination_country_iso3 + ", emails=" + emails + ", expected_delivery=" + expected_delivery
				+ ", note=" + note + ", order_id=" + order_id + ", order_id_path=" + order_id_path
				+ ", shipment_package_count=" + shipment_package_count + ", shipment_pickup_date="
				+ shipment_pickup_date + ", shipment_delivery_date=" + shipment_delivery_date + ", shipment_type="
				+ shipment_type + ", shipment_weight=" + shipment_weight + ", shipment_weight_unit="
				+ shipment_weight_unit + ", signed_by=" + signed_by + ", source=" + source + ", tag=" + tag
				+ ", subtab=" + subtab + ", subtag_message=" + subtag_message + ", title=" + title + ", tracked_count="
				+ tracked_count + ", last_mile_tracking_supported=" + last_mile_tracking_supported + ", language="
				+ language + ", unique_token=" + unique_token + ", checkpoints=" + checkpoints + "]";
	}
	
}
