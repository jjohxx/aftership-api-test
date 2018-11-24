package api.aftership.courier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CouriersInfo {
	private Meta meta;
	private Data data;
	public CouriersInfo() {

	}
	public CouriersInfo(Meta meta, Data data) {
		super();
		this.meta = meta;
		this.data = data;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CouriersInfo [meta=" + meta + ", data=" + data + "]";
	}
	
}
