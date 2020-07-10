package cn.xpoet.service.impl;

import cn.xpoet.entity.Note;
import cn.xpoet.mapper.NoteMapper;
import cn.xpoet.service.NoteService;
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
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note> implements NoteService {

}
