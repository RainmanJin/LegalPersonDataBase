package com.icinfo.frk.common.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * bean工具类
 * Created by yushunwei on 2017-07-03.
 */
public class BeanUtils extends com.icinfo.framework.tools.utils.BeanUtils {

    /**
     * 列表拷贝
     * @param clazz 目标类
     * @param objs 源数据
     * @param <T> 目标类型
     * @param <Y> 源类型
     * @return 新列表
     * @throws Exception 异常
     */
    public static <T extends Y, Y> List<T> copyList(Class<T> clazz, List<Y> objs) throws Exception {
        List<T> rlts = new ArrayList<>();
        if (objs == null || objs.isEmpty()) {
            return rlts;
        }

        for (Y y : objs) {
            rlts.add(copy(clazz, y));
        }
        return rlts;
    }

    /**
     * 对象拷贝
     * @param clazz 目标类
     * @param y 源数据
     * @param <T> 目标类型
     * @param <Y> 源类型
     * @return 新对象
     * @throws Exception 异常
     */
    public static <T extends Y, Y> T copy(Class<T> clazz, Y y) throws Exception {
        T instance = clazz.newInstance();
        copyProperties(instance, y);
        return instance;
    }
}
