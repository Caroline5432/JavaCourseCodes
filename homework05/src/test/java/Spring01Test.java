import com.github.spring01.caroline.dao.StudentDao;
import com.github.spring01.caroline.pojo.Student;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName Spring01Test
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 13:02
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Spring01Test {

    @Autowired
    Student student111;

    @Autowired
    Student student222;

    @Autowired
    StudentDao studentDao;

    @Test
    public void xmlBeanTest() {
        System.out.println(student111);
        System.out.println(student222);
    }

    @Test
    public void annotationTest() {
        studentDao.save();
    }

}
