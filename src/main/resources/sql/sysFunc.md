sample
===
* 注释

	select #use("cols")# from Sys_Func where #use("condition")#

cols
===

	id,menuid,funcname,functype

updateSample
===

	`id`=#id#,`menuid`=#menuid#,`funcname`=#funcname#,`functype`=#functype#

condition
===

	1 = 1  
	@if(!isEmpty(menuid)){
	 and `menuid`=#menuid#
	@}
	@if(!isEmpty(funcname)){
	 and `funcname`=#funcname#
	@}
	@if(!isEmpty(functype)){
	 and `functype`=#functype#
	@}