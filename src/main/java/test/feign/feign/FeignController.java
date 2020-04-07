package test.feign.feign;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FeignController {

    private final FeignTestClient feignTestClient;

    @GetMapping("users/{idx}")
    @ResponseBody
    public String getAllUsersOrderByCreatedDate(@PathVariable("idx") Long idx) {
        return feignTestClient.getUser(idx);
    }

}
