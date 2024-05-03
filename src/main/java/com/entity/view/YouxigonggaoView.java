package com.entity.view;

import com.entity.YouxigonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 17:58:23
 */
@TableName("youxigonggao")
public class YouxigonggaoView  extends YouxigonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxigonggaoView(){
	}
 
 	public YouxigonggaoView(YouxigonggaoEntity youxigonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, youxigonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
