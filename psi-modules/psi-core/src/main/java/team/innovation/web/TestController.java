package team.innovation.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.innovation.security.User;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping("/psi/test")
@Api(value = "psi", tags = "test")
public class TestController {

    @Autowired
    private EntityManager em;

    @GetMapping("/test_get")
    @ApiOperation(value = "根据ID查询用户")
    User testGet(HttpServletRequest request, @RequestParam Long userId){
        return em.find(User.class,userId);
    }

    @PostMapping("/test_post")
    @ApiOperation(value = "保存用户")
    void testPost(HttpServletRequest request, @RequestParam User user){
        em.persist(user);
    }
}
