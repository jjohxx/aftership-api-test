package api.aftership.courier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import api.aftership.modul.HttpHeaderConfigs;


@RestController
public class CourierController extends HttpHeaderConfigs{
	
	
	
	public List<Couriers> getCouriers(List<Couriers> couriers, String uri){
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<CouriersInfo> entity = new HttpEntity<CouriersInfo>(HttpHeaderConfig());
		ResponseEntity<CouriersInfo> response = restTemplate.exchange(uri, HttpMethod.GET, entity, CouriersInfo.class);
		couriers = response.getBody().getData().getCouriers();
		if(response.getStatusCode()==HttpStatus.OK) {
			return couriers;
		}
		else{
			return null;
		}
	}
	
	@RequestMapping("/couriers")
	public List<Couriers> getMyCouriers() throws Exception{
		List<Couriers> couriers = new ArrayList<>();
		String uri = "https://api.aftership.com/v4/couriers";
		return getCouriers(couriers, uri);
	}
	
	@RequestMapping("/couriers/all")
	public List<Couriers> getAllCouriers() throws Exception{
		List<Couriers> couriers = new ArrayList<>();
		String uri = "https://api.aftership.com/v4/couriers/all";
		return getCouriers(couriers, uri);
	}
}
