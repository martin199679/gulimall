package gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-29 13:48:14
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

