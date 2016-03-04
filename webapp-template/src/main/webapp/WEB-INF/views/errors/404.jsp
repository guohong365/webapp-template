<%@page import="com.uc.web.constant.SystemValueNames"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>404 页面不存在</title>

		<meta name="description" content="500 Error Page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
		<link rel="stylesheet" href="resources/css/font-awesome.min.css" />

		<!-- page specific plugin styles -->

		<!-- text fonts -->
		<link rel="stylesheet" href="resources/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="resources/css/ace.min.css" id="main-ace-style" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="resources/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="resources/css/ace-skins.min.css" />
		<link rel="stylesheet" href="resources/css/ace-rtl.min.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="resources/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->
		<script src="resources/js/ace-extra.min.js"></script>

		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		<!--[if lte IE 8]>
		<script src="resources/js/html5shiv.min.js"></script>
		<script src="resources/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">
		<!-- #section:basics/navbar.layout -->
		<div id="navbar" class="navbar navbar-default">

			<div class="navbar-container" id="navbar-container">
				<!-- #section:basics/sidebar.mobile.toggle -->

				<!-- /section:basics/sidebar.mobile.toggle -->
				<div class="navbar-header pull-left">
					<!-- #section:basics/navbar.layout.brand -->
					<a href="#" class="navbar-brand">
						<small>
							<i class="fa fa-leaf"></i>
							<%=SystemValueNames.SYSTEM_NAME %>
						</small>
					</a>

					<!-- /section:basics/navbar.layout.brand -->

					<!-- #section:basics/navbar.toggle -->

					<!-- /section:basics/navbar.toggle -->
				</div>

				<!-- #section:basics/navbar.dropdown -->

				<!-- /section:basics/navbar.dropdown -->
			</div><!-- /.navbar-container -->
		</div>

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<!-- /section:basics/sidebar -->
			<div class="main-content">

				<div class="page-content">
						<div class="page-content-area">
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->

								<!-- #section:pages/error -->
								<div class="error-container">
									<div class="well">
										<h1 class="grey lighter smaller">
											<span class="blue bigger-125">
												<i class="ace-icon fa fa-random"></i>
												404
											</span>
											您访问的页面不存在！
										</h1>

										<hr />
										<h3 class="lighter smaller">
											<i class="ace-icon fa fa-wrench icon-animated-wrench bigger-125"></i>页面不存在!
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
					</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->
			</div><!-- /.main-content -->

			<div class="footer">
				<div class="footer-inner">
					<!-- #section:basics/footer -->
					<div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">云南省药物依赖防治研究所</span>&copy; 2015
						</span>
					</div>

					<!-- /section:basics/footer -->
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='resources/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='resources/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='resources/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="resources/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->
		<script src="resources/js/ace-elements.min.js"></script>
		<script src="resources/js/ace.min.js"></script>
	</body>
</html>
