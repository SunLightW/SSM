package cn.jasmine.testdao;


import cn.jasmine.entity.HonorAdminEntity;
import cn.jasmine.service.impl.HonorServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * dao层测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestDao {

    @Autowired
    private HonorServiceImpl honorService;

    @Test
    public void test(){
        List<HonorAdminEntity> honorList = honorService.findAllHonor();
        System.out.print(honorList);
    }
}
