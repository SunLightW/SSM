package cn.jasmine.base.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import cn.jasmine.base.BaseDao;
import cn.jasmine.utils.Page;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

/**
 * 基本dao实现类
 */
@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {

    @Resource(name = "sqlSessionFactory")
    protected SqlSessionFactory sqlSessionFactory;


    /**
     * 获得会话
     * @return
     */
    public SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * 获得实体类名
     * @param clazz
     * @param prefix
     * @param <T>
     * @return
     */
    public  <T> String getStatement(Class<T> clazz, String prefix) {
        String entityName = clazz.getSimpleName();
        if (entityName.endsWith("Entity")) {
            entityName = entityName.substring(0, entityName.length() - 6);
        }
        entityName = prefix + entityName;
        return entityName;
    }

    /**
     * 保存一个实体类
     * @param pojo 实体类
     * @param <T> 泛型
     * @return
     */
    @Override
    public <T extends Serializable> int save(T pojo) {
        String statement = getStatement(pojo.getClass(), "insert");
        return getSession().insert(statement, pojo);
    }

    /**
     * 更新
     * @param pojo
     * @param <T>
     * @return
     */
    @Override
    public <T extends Serializable> int update(T pojo) {
        // TODO Auto-generated method stub
        String statement = getStatement(pojo.getClass(), "update");
        return getSession().insert(statement, pojo);
    }

    /**
     * 根据id删除
     * @param clazz
     * @param id
     * @param <T>
     * @return
     */
    @Override
    public <T extends Serializable> int deleteById(Class<T> clazz,Serializable id) {
        String statement = getStatement(clazz, "idDelete");
        return getSession().update(statement, id);
    }

    /**
     * 根据id查询
     * @param clazz
     * @param id
     * @param <T>
     * @return
     */
    @Override
    public <T extends Serializable> T getById(Class<T> clazz, Serializable id) {
        String statement = getStatement(clazz, "idGet");
        return getSession().selectOne(statement, id);
    }

    /**
     *
     * @param clazz
     * @param propertyName
     * @param value
     * @param <T>
     * @return
     */
    @Override
    public <T extends Serializable> T getBy(Class<T> clazz,String propertyName, Object value) {
        String statement = getStatement(clazz, "propertyGet");
        Map<String, Object> map = new HashMap<>();
        map.put("field", propertyName);
        map.put("value", value);
        return getSession().selectOne(statement, map);
    }


    /**
     * 查询所有
     * @param clazz
     * @param <T>
     * @return
     */
    @Override
    public <T extends Serializable> List<T> listAll(Class<T> clazz) {
        String statement = getStatement(clazz, "list");
        return getSession().selectList(statement);
    }



    /**
     * 组装排序串
     * @param sort
     * @param order
     *            最好将order定义成枚举类型，传递一个枚举数组
     * @return
     */
    private String genOrderStr(String sort, String order) {
        String orderBy = "";
        if (StringUtils.isNotBlank(sort)) {
            if (StringUtils.isNotBlank(order)) {
                StringBuilder sb = new StringBuilder(" ");
                String[] aSort = sort.split(",");
                String[] aOrder = order.split(",");
                for (int i = 0; i < aSort.length; i++) {
                    sb.append(aSort[i]).append(" ");
                    if (i < aOrder.length) {
                        sb.append(aOrder[i]).append(",");
                    } else {
                        sb.append("ASC").append(",");
                    }
                }
                // 删除最后一个,
                sb.deleteCharAt(sb.length() - 1);
                orderBy = sb.toString();

            } else {
                orderBy = " order by " + sort;
            }
        }

        return orderBy;
    }

    @Override
    public <T extends Serializable> int pageCount(Class<T> clazz,String[] attrs, Object[] values) {
        Map<String, Object> paraMap = new HashMap<String, Object>();

        if (values != null && attrs != null) {
            for (int i = 0; i < values.length; i++) {
                if (i < attrs.length) {
                    paraMap.put(attrs[i], values[i]);
                }
            }
        }
        String statement = getStatement(clazz, "pageCount");
        Object o = getSession().selectOne(statement, paraMap);
        return Integer.parseInt(o.toString());
    }

    @Override
    public <T extends Serializable> Page<T> pageSelect(Class<T> clazz, Page<T> p, String[] attrs, Object[] values) {
        int startNum = p.getStartIndex();
        int pageSize = p.getPageSize();
        String orderBy = genOrderStr(p.getSort(), p.getOrder());
        Map<String, Object> paraMap = new HashMap<String, Object>();

        if (values != null && attrs != null) {
            for (int i = 0; i < values.length; i++) {
                if (i < attrs.length) {
                    paraMap.put(attrs[i], values[i]);
                }

            }
        }
        String statement = getStatement(clazz, "page");
        p.setTotal(pageCount(clazz, attrs, values));

        paraMap.put("startNum", startNum);
        paraMap.put("pageSize", pageSize);
        paraMap.put("endNum", startNum + pageSize);
        paraMap.put("orderBy", orderBy);
        List<T> list = getSession().selectList(statement,paraMap);
        p.setData(list);
        return p;
    }

    @Override
    public <T extends Serializable> int countAll(Class<T> clazz) {
        String statement = getStatement(clazz, "count");
        Object o = getSession().selectOne(statement);
        return Integer.parseInt(o.toString());
    }

    @Override
    public List<Map<String, Object>> selectMap(String statement,Map<String, Object> paraMap) {
        return getSession().selectList(statement, paraMap);
    }

}
