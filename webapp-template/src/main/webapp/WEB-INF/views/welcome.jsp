<%@page import="com.uc.web.config.ConfigMeta"%>
<%@page import="com.uc.web.config.ConfigManager"%>
<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>欢迎使用</title>

<!-- ajax layout which only needs content area -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->
		<div class="alert alert-block alert-success">
			<i class="icon-ok green"></i> 
			<h1>欢迎使用 <strong class="green">
			<%=ConfigManager.getApplicationConfig().getConfigString(ConfigMeta.KEY_SYSTEM_NAME, ConfigMeta.DEFAULT_SYSTEM_NAME) %>
      (<%=ConfigManager.getApplicationConfig().getConfigString(ConfigMeta.KEY_SYSTEM_VERSION, ConfigMeta.DEFAULT_SYSTEM_VERSION) %>)
			</strong>。</h1>
		</div>
    <div class="row">
      <div class="col-xs-12">
      </div>
    </div >
		<!-- PAGE CONTENT ENDS -->
	</div><!-- /.col -->
</div><!-- /.row -->

<!-- page specific plugin scripts -->
<script type="text/javascript">
	var scripts = [null, null]
	ace.load_ajax_scripts(scripts, function() {
	  //inline scripts related to this page
	});
</script>
