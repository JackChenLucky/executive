sample
===
* 注释

	select #use("cols")# from Sys_User_Role where #use("condition")#

cols
===

	id,userid,roleid

updateSample
===

	`id`=#id#,`userid`=#userid#,`roleid`=#roleid#

condition
===

	1 = 1  
	@if(!isEmpty(userid)){
	 and `userid`=#userid#
	@}
	@if(!isEmpty(roleid)){
	 and `roleid`=#roleid#
	@}
	
findUserByRole
===
	
	SELECT * FROM SYS_USER WHERE ID IN(SELECT USERID FROM SYS_USER_ROLE WHERE ROLEID=#id#) order by id