package com.zheng.hospital.dao.mapper;

import com.zheng.hospital.dao.model.ChcTravelSchedule;
import com.zheng.hospital.dao.model.ChcTravelScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChcTravelScheduleMapper {
    long countByExample(ChcTravelScheduleExample example);

    int deleteByExample(ChcTravelScheduleExample example);

    int deleteByPrimaryKey(Integer travelId);

    int insert(ChcTravelSchedule record);

    int insertSelective(ChcTravelSchedule record);

    List<ChcTravelSchedule> selectByExample(ChcTravelScheduleExample example);

    ChcTravelSchedule selectByPrimaryKey(Integer travelId);

    int updateByExampleSelective(@Param("record") ChcTravelSchedule record, @Param("example") ChcTravelScheduleExample example);

    int updateByExample(@Param("record") ChcTravelSchedule record, @Param("example") ChcTravelScheduleExample example);

    int updateByPrimaryKeySelective(ChcTravelSchedule record);

    int updateByPrimaryKey(ChcTravelSchedule record);
}