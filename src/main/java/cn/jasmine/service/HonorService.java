package cn.jasmine.service;


import cn.jasmine.entity.HonorAdminEntity;

import java.util.List;

/**
 * 荣耀service
 */
public interface HonorService {

    List<HonorAdminEntity> findAllHonor();
}
