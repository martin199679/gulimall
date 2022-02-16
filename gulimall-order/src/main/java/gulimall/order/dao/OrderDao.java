package gulimall.order.dao;

import gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-29 13:48:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
