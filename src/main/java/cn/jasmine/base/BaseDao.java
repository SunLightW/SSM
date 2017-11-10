package cn.jasmine.base;


import cn.jasmine.utils.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 通用的DAO
 *
 * @author jasmine
 * @date 2017-07-30
 */
public interface BaseDao {

    /**
     * 增加一个实体
     * @param pojo
     * @return 影响的行数0:失败；1:成功。
     */
    public <T extends Serializable> int save(T pojo);

    /**
     * 通过id删除实体
     * @param clazz
     * @param id
     * @return
     */
    public <T extends Serializable> int deleteById(Class<T> clazz,Serializable id);

    /**
     * 更新
     * @param pojo
     * @return 影响的行数
     */
    public <T extends Serializable> int update(T pojo);


    /**
     * 通过主键获取实体
     * @param clazz
     * @param id
     * @return
     */
    public <T extends Serializable> T getById(Class<T> clazz, Serializable id);

    /**
     * 通过某个属性查询实体
     * @param clazz
     * @param propertyName
     * @param value
     * @return
     */
    public <T extends Serializable> T getBy(Class<T> clazz, String propertyName, Object value);

    /**
     * 查询所有实体
     * @param clazz
     * @return
     */
    public <T extends Serializable> List<T> listAll(Class<T> clazz);

    /**
     * 分页查询
     * @param clazz
     * @param p
     * @return
     */
    public <T extends Serializable> Page<T> pageSelect(Class<T> clazz, Page<T> p, String[]attrs, Object[]values);


    /**
     * 分页查询时，用来统计总条数
     * @param clazz
     * @param attrs
     * @param values
     * @return
     */
    public <T extends Serializable> int pageCount(Class<T> clazz,String[]attrs,Object[]values);

    /**
     * 统计总条数
     * @param clazz
     * @return
     */
    public <T extends Serializable> int countAll(Class<T> clazz);

    /**
     * 指定查询使用的命名sql，查询结果封装成map
     * @param statment
     * @param paraMap
     * @return
     */
    List<Map<String,Object>>  selectMap(String statment, Map<String, Object> paraMap);
}
