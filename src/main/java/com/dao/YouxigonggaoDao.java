package com.dao;

import com.entity.YouxigonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxigonggaoVO;
import com.entity.view.YouxigonggaoView;


/**
 * 游戏公告
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:58:23
 */
public interface YouxigonggaoDao extends BaseMapper<YouxigonggaoEntity> {
	
	List<YouxigonggaoVO> selectListVO(@Param("ew") Wrapper<YouxigonggaoEntity> wrapper);
	
	YouxigonggaoVO selectVO(@Param("ew") Wrapper<YouxigonggaoEntity> wrapper);
	
	List<YouxigonggaoView> selectListView(@Param("ew") Wrapper<YouxigonggaoEntity> wrapper);

	List<YouxigonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<YouxigonggaoEntity> wrapper);
	
	YouxigonggaoView selectView(@Param("ew") Wrapper<YouxigonggaoEntity> wrapper);
	

}
