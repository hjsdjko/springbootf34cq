package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxigonglveEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxigonglveVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxigonglveView;


/**
 * 游戏攻略
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:58:23
 */
public interface YouxigonglveService extends IService<YouxigonglveEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxigonglveVO> selectListVO(Wrapper<YouxigonglveEntity> wrapper);
   	
   	YouxigonglveVO selectVO(@Param("ew") Wrapper<YouxigonglveEntity> wrapper);
   	
   	List<YouxigonglveView> selectListView(Wrapper<YouxigonglveEntity> wrapper);
   	
   	YouxigonglveView selectView(@Param("ew") Wrapper<YouxigonglveEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxigonglveEntity> wrapper);
   	

}

