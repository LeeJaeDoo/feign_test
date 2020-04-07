package test.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "http-bin-api", url = "${feign.http-bin-api.url}", fallbackFactory = FeignTestClientFallbackFactory.class)
@RequestMapping("/api/v1/users")
public interface FeignTestClient {

    @GetMapping("{idx}")
    String getUser(@PathVariable("idx") Long idx);


}
