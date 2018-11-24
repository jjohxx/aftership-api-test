package api.aftership.courier;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {
	
	private int code;

	public Meta() {

	}

	public Meta(int code) {
		super();
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Meta [code=" + code + "]";
	}
	
	
}
