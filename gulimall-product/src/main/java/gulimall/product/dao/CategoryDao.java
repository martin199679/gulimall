package gulimall.product.dao;

import gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-22 23:45:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
