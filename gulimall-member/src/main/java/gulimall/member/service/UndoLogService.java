package gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-29 13:40:25
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

