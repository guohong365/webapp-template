<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<title>500 错误</title>

<!-- ajax layout which only needs content area -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->

		<!-- #section:pages/error -->
		<div class="error-container">
			<div class="well">
				<h1 class="grey lighter smaller">
					<span class="blue bigger-125">
						<i class="ace-icon fa fa-random"></i>
						500
					</span>
					系统错误
				</h1>

				<hr />
				<h3 class="lighter smaller">
					<i class="ace-icon fa fa-wrench icon-animated-wrench bigger-125"></i>系统错误!
				</h3>

				<div class="space"></div>

				<hr />
				<div class="space"></div>

				<div class="center">
					<a href="javascript:history.back()" class="btn btn-grey">
						<i class="ace-icon fa fa-arrow-left"></i>
						返回
					</a>

					<a href="javascript:document.location='<%="http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() %>'" class="btn btn-primary">
						<i class="ace-icon fa fa-home"></i>
						到首页
					</a>
				</div>
			</div>
		</div>

		<!-- /section:pages/error -->

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
