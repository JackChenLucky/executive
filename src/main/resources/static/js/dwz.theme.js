/**
 * Theme Plugins
 * @author 张慧华 z@j-ui.com
 */
(function($){
	$.fn.extend({
		theme: function(options){
			var op = $.extend({themeBase:"themes",jqueryuiBase:"plugins/jqueryui"}, options);
			var _themeHref = op.themeBase + "/#theme#/style.css";
			var _jqueryuiHref = op.jqueryuiBase + "/#theme#/jquery-ui.css"; 
			return this.each(function(){
				var jThemeLi = $(this).find(">li[theme]");
				var setTheme = function(themeName){
					$("head").find("link[href$='style.css']").attr("href", _themeHref.replace("#theme#", themeName));
					jThemeLi.find(">div").removeClass("selected");
					jThemeLi.filter("[theme="+themeName+"]").find(">div").addClass("selected");
					
					// 设置jqueryui颜色  
                    // 获取head表头jquery对象，从其中获取属性值以jquery-ui.css结束的link标记，替换href属性中的变量theme为对应的主题风格  
                    $("head").find("link[href$='jquery-ui.css']").attr("href", _jqueryuiHref.replace("#theme#", themeName)); 
					if ($.isFunction($.cookie)) $.cookie("dwz_theme", themeName);
				}
				
				jThemeLi.each(function(index){
					var $this = $(this);
					var themeName = $this.attr("theme");
					$this.addClass(themeName).click(function(){
						setTheme(themeName);
					});
				});
					
				if ($.isFunction($.cookie)){
					var themeName = $.cookie("dwz_theme");
					if (themeName) {
						setTheme(themeName);
					}
				}
				
			});
		}
	});
})(jQuery);
