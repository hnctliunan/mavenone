package com.base.datasource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DataSourceAspect {
	
	private final static String MASTER = "master";
	private final static String SLAVE = "slave";
	private final static String RESET = "reset";
	private final Logger logger = Logger.getLogger(this.getClass());
	
	private DynamicDataSourceHolder dynamicDataSourceHolder;
	public DynamicDataSourceHolder getDynamicDataSourceHolder() {
		return dynamicDataSourceHolder;
	}
	public void setDynamicDataSourceHolder(DynamicDataSourceHolder dynamicDataSourceHolder) {
		this.dynamicDataSourceHolder = dynamicDataSourceHolder;
	}

	public void before(JoinPoint point){
		Object targetObject = point.getTarget();
		String method = point.getSignature().getName();
		Class<?>[] classz = targetObject.getClass().getInterfaces();
		Class<?>[] paramTypes = ((MethodSignature)point.getSignature()).getMethod().getParameterTypes();
		try {
			Method m = classz[0].getMethod(method, paramTypes);
			if(this.logger.isDebugEnabled()){
				for(Annotation a : m.getAnnotations()){
					this.logger.debug(a.annotationType().getName());
				}
			}
			if(m != null && m.isAnnotationPresent(DataSourceSet.class)){
				DataSourceSet data = m.getAnnotation(DataSourceSet.class);
				if(null == data || data.value() == null){
					throw new RuntimeException("数据源必须指定!");
				}
				if(!dynamicDataSourceHolder.hasBindedDataSource()){//判断是否已经绑定数据源 如果绑定了数据源  则使用之前的数据源
					//已绑定
					if(!dynamicDataSourceHolder.isChoceMaster()){ // 判断是否已经选取Master数据源 如果已经选择了主数据源  则使用主数据源
						if(StringUtils.equalsIgnoreCase(data.value().getValue(),MASTER)){
							dynamicDataSourceHolder.markMaster();
						}else if(StringUtils.equalsIgnoreCase(data.value().getValue(), SLAVE)){
							dynamicDataSourceHolder.markSlave();
						}else if(StringUtils.equalsIgnoreCase(data.value().getValue(), RESET)){
							dynamicDataSourceHolder.markRemove();
						}else{
							dynamicDataSourceHolder.markMaster();
						}
					} else {
						this.logger.error("数据库切换为:"+(dynamicDataSourceHolder.isChoceMaster()?"主":"从"));
					}
				} else {
					this.logger.error("是否已经绑定数据源:"+(dynamicDataSourceHolder.hasBindedDataSource()?"是":"否"));
				}
			}else{
				this.logger.error("数据源:无");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}