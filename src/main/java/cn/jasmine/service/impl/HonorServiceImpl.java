package cn.jasmine.service.impl;

import cn.jasmine.dao.HonorAdminDao;
import cn.jasmine.entity.HonorAdminEntity;
import cn.jasmine.service.HonorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 荣耀service实现类
 */
@Service
@Transactional
public class HonorServiceImpl implements HonorService {

    @Resource
    public HonorAdminDao honorAdminDao;

    /**
     * 查询所有荣耀
     * @return honor
     */
    public List<HonorAdminEntity> findAllHonor() {
        List<HonorAdminEntity> honorList = honorAdminDao.findAllHonor();
        return honorList;
    }
}
