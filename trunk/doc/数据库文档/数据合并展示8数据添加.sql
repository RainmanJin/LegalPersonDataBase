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
    
INSERT INTO table_name (��1, ��2,...) VALUES (ֵ1, ֵ2,....)
--�ڵ��
--��ǰ�ڵ�
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim,node_fail,node_success,node_success_count,node_fail_count) VALUES (1227,'ʡ���̾�-����Υ��ʧ����ҵ������Ϣ','1','8','30','70','19','8')
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim,node_fail,node_success,node_success_count,node_fail_count) VALUES (1228,'ʡ���̾�-��Ӫ�쳣��¼��Ϣ','1','8','1','99','603436','4521')
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim,node_fail,node_success,node_success_count,node_fail_count) VALUES (1229,'ʡ������˾-�����Ե���Ϣ','1','8','0','100','0','0')
--�м�ڵ� �쳣��Ӫ��¼
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1230,'����Υ��ʧ��(������)��ʱ��','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1231,'�쳣��Ӫ��¼��ʱ��','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1232,'�Ե���Ϣ��ʱ��','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1233,'����Υ��ʧ��(������)','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1234,'�쳣��Ӫ��¼','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1235,'�Ե���Ϣ','0','8');
INSERT INTO frk.dt_ywcl_nodes (id, node_name,node_src,node_dim) VALUES (1236,'������Ϣ','0','8');

select * from frk.dt_ywcl_links order by id desc
--���ӱ�
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2243,'1227','ʡ���̾�-����Υ��ʧ����ҵ������Ϣ','1230','����Υ��ʧ��(������)��ʱ��','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2244,'1230','����Υ��ʧ��(������)��ʱ��','1233','����Υ��ʧ��(������)','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2245,'1233','����Υ��ʧ��(������)','1236','������Ϣ','8');

INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2246,'1228','ʡ���̾�-��Ӫ�쳣��¼��Ϣ','1231','�쳣��Ӫ��¼��ʱ��','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2247,'1231','�쳣��Ӫ��¼��ʱ��','1234','�쳣��Ӫ��¼','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2248,'1234','�쳣��Ӫ��¼','1236','������Ϣ','8');

INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2249,'1229','ʡ������˾-�����Ե���Ϣ','1232','�Ե���Ϣ��ʱ��','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2250,'1232','�Ե���Ϣ��ʱ��','1235','�Ե���Ϣ','8');
INSERT INTO frk.dt_ywcl_links (id, link_source,link_source_name,link_target,link_target_name,link_dim) VALUES (2251,'1235','�Ե���Ϣ','1236','������Ϣ','8');

delete from frk.dt_ywcl_links where id=2245

  jlv_stat