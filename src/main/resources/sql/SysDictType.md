sample
===
* 注释

	select #use("cols")# from Sys_DictType where #use("condition")#

cols
===

	id,dicttype,note,status

updateSample
===

	`id`=#id#,`dicttype`=#dicttype#,`note`=#note#,`status`=#status#

condition
===

	1 = 1  
	@if(!isEmpty(dicttype)){
	 and `dicttype`=#dicttype#
	@}
	@if(!isEmpty(note)){
	 and `note`=#note#
	@}
	@if(!isEmpty(status)){
	 and `status`=#status#
	@}
	
selectAll
===
	
	SELECT * FROM SYS_DICTTYPE ORDER BY ID