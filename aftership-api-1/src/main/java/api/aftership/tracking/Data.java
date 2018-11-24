package api.aftership.tracking;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	private int page;
	private int limit;
	private int count;
	private List<Trackings> trackings;
	public Data() {

	}
	public Data(int page, int limit, int count, List<Trackings> trackings) {
		super();
		this.page = page;
		this.limit = limit;
		this.count = count;
		this.trackings = trackings;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Trackings> getTrackings() {
		return trackings;
	}
	public void setTrackings(List<Trackings> trackings) {
		this.trackings = trackings;
	}
	@Override
	public String toString() {
		return "Data [page=" + page + ", limit=" + limit + ", count=" + count + ", trackings=" + trackings + "]";
	}
	
}
