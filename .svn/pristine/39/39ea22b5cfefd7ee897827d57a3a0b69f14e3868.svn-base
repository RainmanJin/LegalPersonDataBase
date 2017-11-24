frk.dt_ywcl_nodes
select * from frk.dt_ywcl_nodes order by id desc where node_dim ='7'

select * from frk.dt_ywcl_links order by id desc where link_dim ='7' and link_source = '432'

SELECT N.id,node_name,node_fail,node_reason,node_success,node_date,node_dim,node_src,node_desc,
		link_target,link_target_name,link_value,link_dim
		FROM frk.dt_ywcl_nodes N
		LEFT JOIN frk.dt_ywcl_links L
		ON N.id=L.link_source
		where node_dim = '7' AND link_dim = '7'
		ORDER BY N.id
    
INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
--节点表
--最前节点
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim,node_fail,node_success,node_success_count,node_fail_count) VALUES (1227,'省工商局-严重违法失信企业名单信息','1','8','30','70','19','8')
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim,node_fail,node_success,node_success_count,node_fail_count) VALUES (1228,'省工商局-经营异常名录信息','1','8','1','99','603436','4521')
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim,node_fail,node_success,node_success_count,node_fail_count) VALUES (1229,'省电力公司-法人窃电信息','1','8','0','100','0','0')
--中间节点 异常经营名录
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1230,'严重违法失信(黑名单)临时表','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1231,'异常经营名录临时表','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1232,'窃电信息临时表','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1233,'严重违法失信(黑名单)','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1234,'异常经营名录','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1235,'窃电信息','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1236,'评价信息','0','8');

select * from frk.dt_ywcl_links order by id desc
--连接表
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2243,'1227','省工商局-严重违法失信企业名单信息','1230','严重违法失信(黑名单)临时表','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2244,'1230','严重违法失信(黑名单)临时表','1233','严重违法失信(黑名单)','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2245,'1233','严重违法失信(黑名单)','1236','评价信息','8');

INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2246,'1228','省工商局-经营异常名录信息','1231','异常经营名录临时表','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2247,'1231','异常经营名录临时表','1234','异常经营名录','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2248,'1234','异常经营名录','1236','评价信息','8');

INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2249,'1229','省电力公司-法人窃电信息','1232','窃电信息临时表','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2250,'1232','窃电信息临时表','1235','窃电信息','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2251,'1235','窃电信息','1236','评价信息','8');

delete from frk.dt_ywcl_links where id=2245

  jlv_stat