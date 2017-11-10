package cn.jasmine.base.impl;

import cn.jasmine.base.BaseService;
import cn.jasmine.utils.Page;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 基本service实现类
 * @author jasmine
 */
@Service("baseService")
public class BaseServiceImpl implements BaseService{

    @Override
    public <T extends Serializable> int save(T pojo) {
        return 0;
    }

    @Override
    public <T extends Serializable> int deleteById(Class<T> clazz, Serializable id) {
        return 0;
    }

    @Override
    public <T extends Serializable> T getById(Class<T> clazz, Serializable id) {
        return null;
    }

    @Override
    public <T extends Serializable> List<T> listAll(Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends Serializable> Page<T> pageSelect(Class<T> clazz, Page<T> p, String[] attrs, Object[] values) {
        return null;
    }

    @Override
    public <T extends Serializable> int pageCount(Class<T> clazz, String[] attrs, Object[] values) {
        return 0;
    }

    @Override
    public <T extends Serializable> int countAll(Class<T> clazz) {
        return 0;
    }

    @Override
    public List<Map<String, Object>> selectMap(String statment, Map<String, Object> paraMap) {
        return null;
    }
}
