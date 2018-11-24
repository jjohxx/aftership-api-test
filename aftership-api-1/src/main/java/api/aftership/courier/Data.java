package api.aftership.courier;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	private int total;
	private List<Couriers> couriers;
	public Data() {

	}
	public Data(int total, List<Couriers> couriers) {
		super();
		this.total = total;
		this.couriers = couriers;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Couriers> getCouriers() {
		return couriers;
	}
	public void setCouriers(List<Couriers> couriers) {
		this.couriers = couriers;
	}
	@Override
	public String toString() {
		return "Data [total=" + total + ", couriers=" + couriers + "]";
	}
	
	
	
}
