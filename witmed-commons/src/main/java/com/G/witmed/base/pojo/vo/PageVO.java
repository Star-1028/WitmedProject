package com.G.witmed.base.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * <b>基础信息功能 - 系统分页视图信息</b>
 * <p>
 *     系统分页视图信息设置了如下属性：
 *     1、pageNum：当前页码
 *     2、pageSize：每页西安市数量
 *     3、list：分页列表
 *     4、totalCount：总数量
 *     5、totalPage：总页数
 *     本项目所有功能分页信息都必须以本系统分页视图信息进行封装
 * </p>
 * @param <E>
 */
public class PageVO<E extends BaseVO> implements Serializable {
    private static final long serialVersionUID = 8927465690630623441L;
    private Integer pageNum;
    private Integer pageSize;
    private List<E> list;
    private Long totalCount;
    private Integer totalPage;

    public PageVO(Integer pageNum, Integer pageSize) {
        if(pageNum != null && pageNum > 0){
            this.pageNum = pageNum;
        }else {
            this.pageNum = 1;
        }
        if (pageSize != null && pageSize > 0){
            this.pageSize = pageSize;
        }else {
            this.pageSize = 10;
        }
    }

    public PageVO() {
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
