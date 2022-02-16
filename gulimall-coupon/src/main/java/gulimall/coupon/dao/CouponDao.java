package gulimall.coupon.dao;

import gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-29 13:31:51
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
