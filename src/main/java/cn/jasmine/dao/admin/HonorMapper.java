package cn.jasmine.dao.admin;

import cn.jasmine.dao.GenericDao;
import cn.jasmine.entity.admin.Honor;
import java.util.List;

/**
 * 荣耀dao
 */
public interface HonorMapper extends GenericDao {

    /*
    查询所有荣耀
     */
    List<Honor> findAllHonor();

}