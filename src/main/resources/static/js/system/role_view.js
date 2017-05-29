$(function(){
	$("#roleListGrid").jqGrid({
        url: '/role/list',
        mtype: "GET",
        datatype: "json",
        loadui:"disable",
        colModel: [
            { label: '登录名', name: 'loginname', width: 150 },
            { label: '姓名', name: 'username', width: 150 },
            { label: '别名', name: 'othername', width: 150 },
            { label: '联系电话', name: 'telphone', width: 150 },
            { label: 'Email', name: 'email', width: 150 },
            { label: 'QQ号码', name: 'qq', width: 150 },
            { label: '微信号', name: 'webchat', width: 150 },
            { label: '状态', name: 'status', width: 150 },
            { label: '过期日期', name: 'expiredate', width: 150 }
        ],
        rownumbers:true,
		viewrecords: true,
        width: $('#navTab').width()-4,
        height: $('#navTab').height()-152,
        rowNum: 20,
        pager: "#roleListGridPager"
    });
	
	$(window).on(DWZ.eventType.resizeGrid,function(event){
		$("#roleListGrid").setGridHeight($('#navTab').height()-152).setGridWidth($('#navTab').width()-4);
    });
})