package gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-22 23:45:10
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

