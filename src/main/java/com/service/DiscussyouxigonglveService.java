package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxigonglveEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxigonglveVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxigonglveView;


/**
 * 游戏攻略评论表
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:58:24
 */
public interface DiscussyouxigonglveService extends IService<DiscussyouxigonglveEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxigonglveVO> selectListVO(Wrapper<DiscussyouxigonglveEntity> wrapper);
   	
   	DiscussyouxigonglveVO selectVO(@Param("ew") Wrapper<DiscussyouxigonglveEntity> wrapper);
   	
   	List<DiscussyouxigonglveView> selectListView(Wrapper<DiscussyouxigonglveEntity> wrapper);
   	
   	DiscussyouxigonglveView selectView(@Param("ew") Wrapper<DiscussyouxigonglveEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxigonglveEntity> wrapper);
   	

}

