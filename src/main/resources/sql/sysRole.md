sample
===
* 注释

	select #use("cols")# from Sys_Role where #use("condition")#

cols
===

	id,rolename,describle,status,orderseq

updateSample
===

	`id`=#id#,`rolename`=#rolename#,`describle`=#describle#,`status`=#status#,`orderseq`=#orderseq#

condition
===

	1 = 1  
	@if(!isEmpty(rolename)){
	 and `rolename`=#rolename#
	@}
	@if(!isEmpty(describle)){
	 and `describle`=#describle#
	@}
	@if(!isEmpty(status)){
	 and `status`=#status#
	@}
	@if(!isEmpty(orderseq)){
	 and `orderseq`=#orderseq#
	@}
	
findRoleBy
===

	
	SELECT 
	@pageTag(){
		#use("cols")#,if(status='1','停用','启用') status_nm
	@}
	FROM SYS_ROLE WHERE 1=1
	@if(!isBlank(rolename)){
		and rolename  like #'%'+rolename+'%'#
	@} 
	Order by orderseq