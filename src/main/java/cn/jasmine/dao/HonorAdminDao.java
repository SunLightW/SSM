package cn.jasmine.dao;

import cn.jasmine.entity.HonorAdminEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 荣耀dao
 */
@Repository
public interface HonorAdminDao {

    /*
    查询所有荣耀
     */
    List<HonorAdminEntity> findAllHonor();

}