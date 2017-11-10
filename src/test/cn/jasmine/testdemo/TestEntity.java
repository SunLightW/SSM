package cn.jasmine.testdemo;


import cn.jasmine.base.impl.BaseDaoImpl;
import cn.jasmine.entity.HonorAdminEntity;
import org.junit.Test;

public class TestEntity {


    @Test
    public void testEntity(){
        BaseDaoImpl baseDao = new BaseDaoImpl();
        String entity = baseDao.getStatement(HonorAdminEntity.class, "");
        System.out.print(entity);
    }
}
