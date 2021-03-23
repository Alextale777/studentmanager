package com.qxc.operate.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxc.domain.Course;
import com.qxc.domain.Score;
import com.qxc.mapper.ScoreMapper;
import com.qxc.operate.ScoreOperate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ScoreOperateImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreOperate {
    @Override
    public void Insert(Integer id, Integer studentId, Integer courseId, double score, String remark) {
        baseMapper.insert(new Score(id,studentId,courseId,score,remark));
    }

    @Override
    public void DeleteById(Integer id) {
        this.baseMapper.deleteById(id);

    }

    @Override
    public void DeleteBatchId(List<Integer> list) {
        this.baseMapper.deleteBatchIds(list);

    }

    @Override
    public void DeleteByMap(Map<String, Object> map) {
        baseMapper.deleteByMap(map);

    }

    @Override
    public Score SelectById(Integer id) {
        Score score = baseMapper.selectById(id);
        return  score;
    }

    @Override
    public List<Score> SelectBatchId(List<Long> ids) {
        List<Score> list = this.baseMapper.selectBatchIds(ids);
        list.forEach(System.out::println);
        return list;
    }

    @Override
    public List<Score> SelectAll() {
       List<Score>list = baseMapper.selectList(null);
        return list;

    }


}
