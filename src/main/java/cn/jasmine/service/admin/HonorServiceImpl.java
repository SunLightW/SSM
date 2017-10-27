package cn.jasmine.service.admin;

import cn.jasmine.dao.admin.HonorMapper;
import cn.jasmine.entity.admin.Honor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 荣耀service实现类
 */
@Service()
@Transactional
public class HonorServiceImpl implements HonorService {

    @Resource(name = "honorMapper")
    private HonorMapper honorMapper;

    /**
     * 查询所有荣耀
     * @return honor
     */
    public List<Honor> findAllHonor() {
        List<Honor> honorList = honorMapper.findAllHonor();
        return honorList;
    }
}
