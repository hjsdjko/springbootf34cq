package com.dao;

import com.entity.DiscussyouxigonglveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxigonglveVO;
import com.entity.view.DiscussyouxigonglveView;


/**
 * 游戏攻略评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:58:24
 */
public interface DiscussyouxigonglveDao extends BaseMapper<DiscussyouxigonglveEntity> {
	
	List<DiscussyouxigonglveVO> selectListVO(@Param("ew") Wrapper<DiscussyouxigonglveEntity> wrapper);
	
	DiscussyouxigonglveVO selectVO(@Param("ew") Wrapper<DiscussyouxigonglveEntity> wrapper);
	
	List<DiscussyouxigonglveView> selectListView(@Param("ew") Wrapper<DiscussyouxigonglveEntity> wrapper);

	List<DiscussyouxigonglveView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxigonglveEntity> wrapper);
	
	DiscussyouxigonglveView selectView(@Param("ew") Wrapper<DiscussyouxigonglveEntity> wrapper);
	

}
