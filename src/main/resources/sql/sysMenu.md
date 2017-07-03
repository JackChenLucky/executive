sample
===
* 注释

	select #use("cols")# from Sys_Menu where #use("condition")#

cols
===

	id,name,url,params,describle,pid,icon,orderseq

updateSample
===

	`id`=#id#,`name`=#name#,`url`=#url#,`params`=#params#,`describle`=#describle#,`pid`=#pid#,`icon`=#icon#,`orderseq`=#orderseq#

condition
===

	1 = 1  
	@if(!isEmpty(name)){
	 and `name`=#name#
	@}
	@if(!isEmpty(url)){
	 and `url`=#url#
	@}
	@if(!isEmpty(params)){
	 and `params`=#params#
	@}
	@if(!isEmpty(describle)){
	 and `describle`=#describle#
	@}
	@if(!isEmpty(pid)){
	 and `pid`=#pid#
	@}
	@if(!isEmpty(icon)){
	 and `icon`=#icon#
	@}
	@if(!isEmpty(orderseq)){
	 and `orderseq`=#orderseq#
	@}
findMenuBy
===

	SELECT 
	@pageTag(){
		#use("cols")#
	@} 
	FROM SYS_MENU WHERE 1=1
	@if(!isBlank(name)){
		and name like #'%'+name+'%'# 
	@}
	
findMenuByPid
===

	SELECT #use("cols")#
	FROM SYS_menu WHERE 1=1
	@if(!isBlank(id)){
		and pid=#id#
	@}
	Order by orderseq