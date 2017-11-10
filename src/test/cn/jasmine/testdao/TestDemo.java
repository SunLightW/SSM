package cn.jasmine.testdao;

import cn.jasmine.entity.HonorAdminEntity;
import org.junit.Test;

public class TestDemo {


    @Test
    public void  test1(){
        HonorAdminEntity honor = new HonorAdminEntity();
        String simpleName = honor.getClass().getSimpleName();
        System.out.print(simpleName);
    }


}
