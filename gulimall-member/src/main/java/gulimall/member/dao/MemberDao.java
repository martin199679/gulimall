package gulimall.member.dao;

import gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lu
 * @email 574812239@qq.com
 * @date 2022-01-29 13:40:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
