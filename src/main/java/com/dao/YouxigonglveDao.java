package com.dao;

import com.entity.YouxigonglveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxigonglveVO;
import com.entity.view.YouxigonglveView;


/**
 * 游戏攻略
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:58:23
 */
public interface YouxigonglveDao extends BaseMapper<YouxigonglveEntity> {
	
	List<YouxigonglveVO> selectListVO(@Param("ew") Wrapper<YouxigonglveEntity> wrapper);
	
	YouxigonglveVO selectVO(@Param("ew") Wrapper<YouxigonglveEntity> wrapper);
	
	List<YouxigonglveView> selectListView(@Param("ew") Wrapper<YouxigonglveEntity> wrapper);

	List<YouxigonglveView> selectListView(Pagination page,@Param("ew") Wrapper<YouxigonglveEntity> wrapper);
	
	YouxigonglveView selectView(@Param("ew") Wrapper<YouxigonglveEntity> wrapper);
	

}
