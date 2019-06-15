package team.innovation.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/psi/test")
@Api(value = "psi", tags = "test")
public class TestController {

    @GetMapping("/key_word")
    @ApiOperation(value = "key_word")
    String restTest(HttpServletRequest request, @RequestParam String keyWord){
        return keyWord;
    }
}
