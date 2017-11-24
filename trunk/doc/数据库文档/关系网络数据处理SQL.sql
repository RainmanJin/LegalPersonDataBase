

truncate table frk.cs_relation_net_all;

-- 插入法定代表人
insert into frk.cs_relation_net_all(from_id,from_name,to_id,to_name,relation_name,to_type)
select frwybs as from_id,'' as from_name ,zjhm as to_id ,xm as to_name,'法定代表人' as relation_name,'1' as to_type from frk.ca_cy_fddbr_valid ;

-- 插入股东数据
insert into frk.cs_relation_net_all(from_id,from_name,to_id,to_name,relation_name,to_type)
select frwybs as from_id,'' as from_name ,zjhm_gd as to_id ,gd as to_name,'股东关系' as relation_name,'2' as to_type from frk.cd_zb_gdczxx_valid ;

-- 更新节点类型 P人 Q企业
update  frk.cs_relation_net_all set node_type = 'P'  ;
update  frk.cs_relation_net_all set node_type = 'Q' WHERE to_type = '2' and to_id is null or to_id = ''  ;

-- 更新企业名称
update frk.cs_relation_net_all r set  r.from_name = (select d.frmc  from  frk.ca_dj_jbxx  d where  r.from_id = d.frwybs) ;
-- 更新to_id
update frk.cs_relation_net_all r set  r.to_id = (select d.frwybs  from  frk.ca_dj_jbxx  d where  r.to_name = d.frmc) 
where r.to_type = '2' and r.to_id is null ;
   
delete from frk.cs_relation_net_all where to_id is null or to_id = '';