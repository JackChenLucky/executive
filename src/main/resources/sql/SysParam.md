selectUser
===

* 根据用户姓名查找

	select * from Sys_user where 1=1 
	@if(!isEmpty(name)){
	and username = #name#
	@}
	
queryNewUser
===

* 用一个sql做翻页查询，page将输出 count(1) 或者 u.*

	select #page("u.*")# from user u

updateAge
===

	update user set age = #age# where id = #id#


findSysParamByCde
===

* 根据参数代码查询系统参数信息

	select * from Sys_param where paramCde=#sParamCde#

selectSysParams
===

* 获取所有系统参数

	select #page("u.*")# from Sys_param u
	
insParam
===

* 添加系统参数

	insert into Sys_param (parmcde, parmval, note) values (upper(#parmcde#), #parmval#, #note#)
	
	
	
	
	