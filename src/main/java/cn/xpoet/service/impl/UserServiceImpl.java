package cn.xpoet.service.impl;

import cn.xpoet.entity.User;
import cn.xpoet.mapper.UserMapper;
import cn.xpoet.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XPoet
 * @since 2020-07-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
