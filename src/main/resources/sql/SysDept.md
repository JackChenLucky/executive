sample
===
* 注释

	select #use("cols")# from Sys_Dept where #use("condition")#

cols
===

	id,deptcode,deptname,pid,status,orderseq

updateSample
===

	`id`=#id#,`deptcode`=#deptcode#,`deptname`=#deptname#,`pid`=#pid#,`status`=#status#,`orderseq`=#orderseq#

condition
===

	1 = 1  
	@if(!isEmpty(deptcode)){
	 and `deptcode`=#deptcode#
	@}
	@if(!isEmpty(deptname)){
	 and `deptname`=#deptname#
	@}
	@if(!isEmpty(pid)){
	 and `pid`=#pid#
	@}
	@if(!isEmpty(status)){
	 and `status`=#status#
	@}
	@if(!isEmpty(orderseq)){
	 and `orderseq`=#orderseq#
	@}

findDeptBy
===

	SELECT 
	@pageTag(){
		#use("cols")#,if(status='1','停用','启用') status_nm
	@} 
	FROM SYS_DEPT WHERE 1=1
	@if(!isBlank(status)){
		and status=#status#
	@} 
	@if(!isBlank(deptname)){
		and (id like #'%'+deptname+'%'# or deptname=#'%'+deptname+'%'#)
	@}
	
findDeptByPid
===

	SELECT #use("cols")#,if(status='1','停用','启用') status_nm
	FROM SYS_DEPT WHERE 1=1
	@if(!isBlank(id)){
		and pid=#id#
	@} 
	Order by orderseq