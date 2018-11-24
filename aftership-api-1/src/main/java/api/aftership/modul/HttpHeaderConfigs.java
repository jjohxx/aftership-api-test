package api.aftership.modul;

import java.util.Arrays;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class HttpHeaderConfigs {
	private static final HttpHeaders headers = new HttpHeaders();
	
	public HttpHeaderConfigs() {

	}

	public static HttpHeaders HttpHeaderConfig() {
		headers.set("aftership-api-key", "e7f28250-889d-48ce-80a1-52f4d163eca7");
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return headers;
	}

	public HttpHeaders getHeaders() {
		return headers;
	}
	
}
