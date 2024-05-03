package com.entity.view;

import com.entity.YouxigonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏攻略
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 17:58:23
 */
@TableName("youxigonglve")
public class YouxigonglveView  extends YouxigonglveEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxigonglveView(){
	}
 
 	public YouxigonglveView(YouxigonglveEntity youxigonglveEntity){
 	try {
			BeanUtils.copyProperties(this, youxigonglveEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
