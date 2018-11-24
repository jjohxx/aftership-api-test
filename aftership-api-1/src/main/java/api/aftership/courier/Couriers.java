package api.aftership.courier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Couriers {
	private String slug;
	private String name;
	private String phone;
	private String other_name;
	private String web_url;
	public Couriers() {

	}
	public Couriers(String slug, String name, String phone, String other_name, String web_url) {
		super();
		this.slug = slug;
		this.name = name;
		this.phone = phone;
		this.other_name = other_name;
		this.web_url = web_url;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOther_name() {
		return other_name;
	}
	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	@Override
	public String toString() {
		return "Couriers [slug=" + slug + ", name=" + name + ", phone=" + phone + ", other_name=" + other_name
				+ ", web_url=" + web_url + "]";
	}
	
}
