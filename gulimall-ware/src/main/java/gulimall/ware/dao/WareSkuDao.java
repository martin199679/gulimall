package gulimall.ware.dao;

import gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-29 13:50:24
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
