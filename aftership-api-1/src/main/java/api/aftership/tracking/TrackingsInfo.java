package api.aftership.tracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import api.aftership.tracking.Data;
import api.aftership.courier.Meta;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingsInfo {
	private Meta meta;
	private Data data;
	public TrackingsInfo() {

	}
	public TrackingsInfo(Meta meta, Data data) {
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
		return "TrackingsInfo [meta=" + meta + ", data=" + data + "]";
	}
	
}
