package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YouxigonggaoDao;
import com.entity.YouxigonggaoEntity;
import com.service.YouxigonggaoService;
import com.entity.vo.YouxigonggaoVO;
import com.entity.view.YouxigonggaoView;

@Service("youxigonggaoService")
public class YouxigonggaoServiceImpl extends ServiceImpl<YouxigonggaoDao, YouxigonggaoEntity> implements YouxigonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxigonggaoEntity> page = this.selectPage(
                new Query<YouxigonggaoEntity>(params).getPage(),
                new EntityWrapper<YouxigonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxigonggaoEntity> wrapper) {
		  Page<YouxigonggaoView> page =new Query<YouxigonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxigonggaoVO> selectListVO(Wrapper<YouxigonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxigonggaoVO selectVO(Wrapper<YouxigonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxigonggaoView> selectListView(Wrapper<YouxigonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxigonggaoView selectView(Wrapper<YouxigonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
