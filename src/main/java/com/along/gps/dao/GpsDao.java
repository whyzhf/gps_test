package com.along.gps.dao;

import com.along.gps.pojo.OutboundRoadlog;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GpsDao {
	@InsertProvider(type = SqlProvider.class, method = "saveGpsData")
	boolean saveGpsData(@Param("list") List<OutboundRoadlog> list);

	@Select(" SELECT  CONCAT_WS(' ',p.name,p.card)\n" +
			" FROM outboundmanage.outbound_prisoner  p \n" +
			" LEFT JOIN outboundmanage.outbound_equipment e on e.id=p.equipment_id\n" +
			" where e.card=#{id}")
	String getPrisoner(@Param("id") String id);

	@Select("select e.id ,e.card from outbound_task_prisoner_rel r \n" +
			"LEFT JOIN outbound_prisoner p on r.prisoner_id=p.id\n" +
			"LEFT JOIN outbound_equipment e on p.equipment_id=e.id\n" +
			"where r.task_id=25 AND e.id IS not NULL")
	String getKy();
}
