//package test.feign.feign;
//
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.Value;
//
//@Value
//public class FeignDelayResponse {
//    public static FeignDelayResponse EMPTY = new FeignDelayResponse(null, null);
//
//    private String origin;
//    private String url;
//
//    @JsonCreator
//    public FeignDelayResponse(@JsonProperty("origin") String origin, @JsonProperty("url") String url) {
//        this.origin = origin;
//        this.url = url;
//    }
//}
