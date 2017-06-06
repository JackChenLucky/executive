sample
===
* 注释

	select #use("cols")# from Sys_User where #use("condition")#

cols
===

	id,loginname,sex,username,password,othername,telphone,email,qq,webchat,status,expiredate

updateSample
===

	`id`=#id#,`loginname`=#loginname#,`sex`=#sex#,`username`=#username#,`password`=#password#,`othername`=#othername#,`telphone`=#telphone#,`email`=#email#,`qq`=#qq#,`webchat`=#webchat#,`status`=#status#,`expiredate`=#expiredate#

condition
===

	1 = 1  
	@if(!isEmpty(loginname)){
	 and `loginname`=#loginname#
	@}
	@if(!isEmpty(sex)){
	 and `sex`=#sex#
	@}
	@if(!isEmpty(username)){
	 and `username`=#username#
	@}
	@if(!isEmpty(password)){
	 and `password`=#password#
	@}
	@if(!isEmpty(othername)){
	 and `othername`=#othername#
	@}
	@if(!isEmpty(telphone)){
	 and `telphone`=#telphone#
	@}
	@if(!isEmpty(email)){
	 and `email`=#email#
	@}
	@if(!isEmpty(qq)){
	 and `qq`=#qq#
	@}
	@if(!isEmpty(webchat)){
	 and `webchat`=#webchat#
	@}
	@if(!isEmpty(status)){
	 and `status`=#status#
	@}
	@if(!isEmpty(expiredate)){
	 and `expiredate`=#expiredate#
	@}
	
findUserBy
===

	SELECT 
	@pageTag(){
		#use("cols")#,
		if(status='1','停用','启用') status_nm,
		(SELECT DEPTNAME FROM SYS_DEPT WHERE DEPTCODE=SYS_USER.DEPT) dept_nm
	@} 
	FROM SYS_USER WHERE IFNULL(status,'0')!='-1'
	@if(!isBlank(status)){
		and status=#status#
	@} 
	@if(!isBlank(username)){
		and (username like #'%'+username+'%'# or loginname=#'%'+username+'%'#)
	@}
