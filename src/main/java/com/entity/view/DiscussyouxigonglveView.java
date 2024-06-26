package com.entity.view;

import com.entity.DiscussyouxigonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏攻略评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 17:58:24
 */
@TableName("discussyouxigonglve")
public class DiscussyouxigonglveView  extends DiscussyouxigonglveEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyouxigonglveView(){
	}
 
 	public DiscussyouxigonglveView(DiscussyouxigonglveEntity discussyouxigonglveEntity){
 	try {
			BeanUtils.copyProperties(this, discussyouxigonglveEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
