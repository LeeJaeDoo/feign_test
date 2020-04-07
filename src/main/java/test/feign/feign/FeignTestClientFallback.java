package test.feign.feign;

import feign.Feign;
import feign.hystrix.FallbackFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
class FeignTestClientFallbackFactory implements FallbackFactory<FeignTestClient> {

    @Override
    public FeignTestClient create(Throwable cause) {
        log.debug("fallback called");
        return null;
    }
}
