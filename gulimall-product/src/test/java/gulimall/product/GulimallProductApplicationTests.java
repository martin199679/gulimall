package gulimall.product;

import gulimall.product.entity.BrandEntity;
import gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;


    @Test
    public void contextLoads() {
        List<BrandEntity> list = brandService.list();
        list.forEach(item-> System.out.println(item));
//        for (BrandEntity brandEntity : list) {
//            System.out.println(brandEntity);
//        }
    }



}
