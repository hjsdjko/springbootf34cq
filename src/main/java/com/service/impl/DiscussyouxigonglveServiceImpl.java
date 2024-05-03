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


import com.dao.DiscussyouxigonglveDao;
import com.entity.DiscussyouxigonglveEntity;
import com.service.DiscussyouxigonglveService;
import com.entity.vo.DiscussyouxigonglveVO;
import com.entity.view.DiscussyouxigonglveView;

@Service("discussyouxigonglveService")
public class DiscussyouxigonglveServiceImpl extends ServiceImpl<DiscussyouxigonglveDao, DiscussyouxigonglveEntity> implements DiscussyouxigonglveService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxigonglveEntity> page = this.selectPage(
                new Query<DiscussyouxigonglveEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxigonglveEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxigonglveEntity> wrapper) {
		  Page<DiscussyouxigonglveView> page =new Query<DiscussyouxigonglveView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouxigonglveVO> selectListVO(Wrapper<DiscussyouxigonglveEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxigonglveVO selectVO(Wrapper<DiscussyouxigonglveEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxigonglveView> selectListView(Wrapper<DiscussyouxigonglveEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxigonglveView selectView(Wrapper<DiscussyouxigonglveEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
