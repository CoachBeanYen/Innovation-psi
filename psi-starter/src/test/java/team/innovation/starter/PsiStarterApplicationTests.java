package team.innovation.starter;

import io.swagger.annotations.ApiOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import team.innovation.security.User;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PsiStarterApplicationTests {

    @Autowired
    private EntityManager em;

    @Test
    public void testQuery() {
        User user = em.find(User.class, 1L);
        System.out.println(user);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testSave() {
        User user = new User();
        user.setCode(UUID.randomUUID().toString());
        user.setName("测试数据:" + user.getId());
        user.setPassword(UUID.randomUUID().toString());
        em.persist(user);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testMerge() {
        User user = new User();
        user.setId(1L);
        user.setCode(UUID.randomUUID().toString());
        user.setName("测试数据:" + user.getId());
        user.setPassword(UUID.randomUUID().toString());
        em.merge(user);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testDelete() {
        User user = em.find(User.class, 1L);
        em.remove(user);
    }
}
