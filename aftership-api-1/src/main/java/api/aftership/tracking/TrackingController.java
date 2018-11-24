package api.aftership.tracking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import api.aftership.modul.HttpHeaderConfigs;

@RestController
public class TrackingController extends HttpHeaderConfigs {

    public List<Trackings> getTracking(List<Trackings> trackings, String uri) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<TrackingsInfo> entity = new HttpEntity<TrackingsInfo>(HttpHeaderConfig());
        ResponseEntity<TrackingsInfo> response = restTemplate.exchange(uri, HttpMethod.GET, entity, TrackingsInfo.class);
        trackings = response.getBody().getData().getTrackings();
        if (response.getStatusCode() == HttpStatus.OK) {
            return trackings;
        } else {
            return null;
        }
    }

    public void addNewTracking(Trackings tracking, String uri) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        HttpEntity<Trackings> entity = new HttpEntity<Trackings>(tracking, HttpHeaderConfig());
//		ResponseEntity<Trackings> response = restTemplate.exchange(uri, HttpMethod.POST, entity, Trackings.class);
        @SuppressWarnings("unused")
        Trackings response = restTemplate.postForObject(uri, entity, Trackings.class);
//		if(response.getStatusCode()==HttpStatus.OK) {
//			return response.getBody().toString();
//		}
//		else {
//			return null;
//		}
    }

    @RequestMapping("/trackings")
    public List<Trackings> getMyTrackings() {
        List<Trackings> trackings = new ArrayList<>();
        String uri = "https://api.aftership.com/v4/trackings";
        return getTracking(trackings, uri);
    }

    @RequestMapping("/trackings/{id}")
    public Trackings getTrackingByOrderId(@PathVariable String id) {
        return getMyTrackings().stream().filter(t -> t.getOrder_id().equals(id)).findFirst().get();
    }

    @RequestMapping("/trackings/add")
    public String addTracking() {
        final String uri = "https://api.aftership.com/v4/trackings";
        MainTracking mainTracking = new MainTracking();
        Tracking tracking = new Tracking();
        tracking.setTracking_number("7835112328"); // Be careful with this number has generated different every time.!!
        mainTracking.setTracking(tracking);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<MainTracking> entity = new HttpEntity<MainTracking>(mainTracking, HttpHeaderConfig());

        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
        return response.getBody().toString();
    }
//	@RequestMapping("/trackings/delete/{id}")
//	public void deleteTrackingByOrderId(@PathVariable String id) {
//		getMyTrackings().removeIf(t -> t.getOrder_id().equals(id));
//	}

}
