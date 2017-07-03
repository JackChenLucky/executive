sample
===
* 注释

	select #use("cols")# from Sys_Role_Right where #use("condition")#

cols
===

	id,roleid,menuid,funcid

updateSample
===

	`id`=#id#,`roleid`=#roleid#,`menuid`=#menuid#,`funcid`=#funcid#

condition
===

	1 = 1  
	@if(!isEmpty(roleid)){
	 and `roleid`=#roleid#
	@}
	@if(!isEmpty(menuid)){
	 and `menuid`=#menuid#
	@}
	@if(!isEmpty(funcid)){
	 and `funcid`=#funcid#
	@}
	
findRightByRoleId
===

	select #use("cols")# from Sys_Role_Right where roleid=#roleid#
	
	