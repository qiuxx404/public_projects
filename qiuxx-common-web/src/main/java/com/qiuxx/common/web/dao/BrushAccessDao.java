package com.qiuxx.common.web.dao;

import com.qiuxx.common.web.entity.CfgEnumDict;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 16:36 2018/3/18
 */
@Repository
public interface BrushAccessDao {

    /**
     * 查询QXX_CSDN 枚举url
     * @return
     */
    Set<CfgEnumDict> getWebUrlList();

    /**
     * 批量更新博客url请求数字
     * @return
     */
    Integer updateStatisticsNumList(List<Long> list);

    /**
     * 单个 更新博客url请求数字
     */
    Integer updateStatisticsNum(Long enumId);
}
