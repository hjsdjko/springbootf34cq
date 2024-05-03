package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxigonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxigonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxigonggaoView;


/**
 * 游戏公告
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:58:23
 */
public interface YouxigonggaoService extends IService<YouxigonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxigonggaoVO> selectListVO(Wrapper<YouxigonggaoEntity> wrapper);
   	
   	YouxigonggaoVO selectVO(@Param("ew") Wrapper<YouxigonggaoEntity> wrapper);
   	
   	List<YouxigonggaoView> selectListView(Wrapper<YouxigonggaoEntity> wrapper);
   	
   	YouxigonggaoView selectView(@Param("ew") Wrapper<YouxigonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxigonggaoEntity> wrapper);
   	

}

