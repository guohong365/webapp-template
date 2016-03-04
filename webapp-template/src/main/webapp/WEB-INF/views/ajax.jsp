<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.uc.web.constant.*"%>
<%@page import="com.uc.web.constant.fields.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta charset="utf-8" />
<title><%=SystemValueNames.SYSTEM_NAME%></title>

<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<link rel="stylesheet" href="<c:url value="/resources/css/uc.data.css" />" />
<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" />" />

<!-- date picker -->
<link rel="stylesheet" href="<c:url value="/resources/css/datepicker.css" />" />
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-datetimepicker.css" />" />
<link rel="stylesheet" href="<c:url value="/resources/css/daterangepicker.css" />" />

<!-- text fonts -->
<link rel="stylesheet" href="<c:url value="/resources/css/ace-fonts.css" />" />

<!-- ace styles -->
<link rel="stylesheet" href="<c:url value="/resources/css/ace.min.css" />" id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="<c:url value="/resources/css/ace-part2.min.css" />" />
		<![endif]-->
<link rel="stylesheet" href="<c:url value="/resources/css/ace-skins.min.css" />" />
<link rel="stylesheet" href="<c:url value="/resources/css/ace-rtl.min.css" />" />


<style type="text/css">
.strike-out {
	text-decoration: line-through;
}
</style>
<!--[if lte IE 9]>
		  <link rel="stylesheet" href="<c:url value="/resources/css/ace-ie.min.css" />" />
		<![endif]-->

<!-- ace settings handler -->
<script src="<c:url value="/resources/js/ace-extra.min.js" />"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="<c:url value="/resources/js/html5shiv.js" />" ></script>
		<script src="<c:url value="/resources/js/respond.min.js" />" ></script>
		<![endif]-->
</head>

<body class="no-skin">
  <!-- #section:basics/navbar.layout -->
  <div id="navbar" class="navbar navbar-default">
    <script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

    <div class="navbar-container" id="navbar-container">
      <!-- #section:basics/sidebar.mobile.toggle -->
      <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
        <span class="sr-only">Toggle sidebar</span>
        <span class="icon-bar"></span>

        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>

      <!-- /section:basics/sidebar.mobile.toggle -->
      <div class="navbar-header pull-left">
        <!-- #section:basics/navbar.layout.brand -->
        <a href="#" class="navbar-brand">
          <small>
            <i class="fa fa-medkit bigger"></i>
            <%=SystemValueNames.SYSTEM_NAME%><small>
              Ver.<%=SystemValueNames.SYSTEM_VERSION%></small>
          </small>
        </a>

        <!-- /section:basics/navbar.layout.brand -->

        <!-- #section:basics/navbar.toggle -->

        <!-- /section:basics/navbar.toggle -->
      </div>

      <!-- #section:basics/navbar.dropdown -->
      <div class="navbar-buttons navbar-header pull-right" role="navigation">
        <ul class="nav ace-nav">

          <!-- #section:basics/navbar.user_menu -->
          <li class="light-blue">
            <a data-toggle="dropdown" href="#" class="dropdown-toggle">
              <i class="ace-icon fa fa-user nav-user-photo"></i>
              <span class="user-info">
                <small>欢迎,</small>
                ${userName}
              </span>
              <i class="ace-icon fa fa-caret-down"></i>
            </a>

            <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
              <li>
                <a href="#">
                  <i class="ace-icon fa fa-cog"></i> Settings
                </a>
              </li>

              <li>
                <a id="changePwd" href="#change_pwd_dlg" data-toggle="modal">
                  <i class="ace-icon fa fa-user"></i> 修改密码
                </a>
              </li>

              <li class="divider"></li>

              <li>
                <a href="#logout-dlg" data-toggle="modal">
                  <i class="ace-icon fa fa-power-off"></i> 注销
                </a>
              </li>
            </ul>
          </li>

          <!-- /section:basics/navbar.user_menu -->
        </ul>
      </div>

      <!-- /section:basics/navbar.dropdown -->
    </div>
    <!-- /.navbar-container -->
  </div>

  <!-- /section:basics/navbar.layout -->
  <div class="main-container" id="main-container">
    <script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

    <!-- #section:basics/sidebar -->
    <div id="sidebar" class="sidebar                  responsive">
      <script type="text/javascript">
					try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
				</script>
      ${menus }
      <!-- /.nav-list -->

      <!-- #section:basics/sidebar.layout.minimize -->
      <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
      </div>

      <!-- /section:basics/sidebar.layout.minimize -->
      <script type="text/javascript">
					try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
				</script>
    </div>

    <!-- /section:basics/sidebar -->
    <div class="main-content">
      <!-- #section:basics/content.breadcrumbs -->
      <div class="breadcrumbs" id="breadcrumbs">
        <script type="text/javascript">
						try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
					</script>

        <!-- /.breadcrumb -->
        <ul class="breadcrumb">
            <li>
              <i class="ace-icon fa fa-home home-icon"></i>
              <a href="javascript:document.location='<%="http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() %>'">首页</a>
            </li>
          </ul>
        <!-- #section:basics/content.searchbox -->
         <!-- /.nav-search -->

        <!-- /section:basics/content.searchbox -->
      </div>

      <!-- /section:basics/content.breadcrumbs -->
      <div class="page-content">
        <!-- #section:settings.box -->
        <div class="ace-settings-container" id="ace-settings-container">
          <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
            <i class="ace-icon fa fa-cog bigger-150"></i>
          </div>

          <div class="ace-settings-box clearfix" id="ace-settings-box">
            <div class="pull-left width-50">
              <!-- #section:settings.skins -->
              <div class="ace-settings-item">
                <div class="pull-left">
                  <select id="skin-colorpicker" class="hide">
                    <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                    <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                    <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                    <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                  </select>
                </div>
                <span>&nbsp; Choose Skin</span>
              </div>

              <!-- /section:settings.skins -->

              <!-- #section:settings.navbar -->
              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
                <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
              </div>

              <!-- /section:settings.navbar -->

              <!-- #section:settings.sidebar -->
              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
                <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
              </div>

              <!-- /section:settings.sidebar -->

              <!-- #section:settings.breadcrumbs -->
              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
                <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
              </div>

              <!-- /section:settings.breadcrumbs -->

              <!-- #section:settings.rtl -->
              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
                <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
              </div>

              <!-- /section:settings.rtl -->

              <!-- #section:settings.container -->
              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
                <label class="lbl" for="ace-settings-add-container">
                  Inside <b>.container</b>
                </label>
              </div>

              <!-- /section:settings.container -->
            </div>
            <!-- /.pull-left -->

            <div class="pull-left width-50">
              <!-- #section:basics/sidebar.options -->
              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" />
                <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
              </div>

              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" />
                <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
              </div>

              <div class="ace-settings-item">
                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" />
                <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
              </div>

              <!-- /section:basics/sidebar.options -->
            </div>
            <!-- /.pull-left -->
          </div>
          <!-- /.ace-settings-box -->
        </div>
        <!-- /.ace-settings-container -->

        <!-- /section:settings.box -->
        <div class="page-content-area">
          <!-- ajax content goes here -->
        </div>
        <!-- /.page-content-area -->
        <!-- change password modal dialog -->
        <div id="change_pwd_dlg" class="modal" tabindex="-1" data-backdrop="false">
          <div class="modal-dialog">
            <div class="modal-content">
              <form id="FORM_CHANGE_PWD" class="form-horizonal" role="from">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="blue bigger">修改密码</h4>
                </div>
                <div class="modal-body">
                  <div class="row">
                    <div class="col-xs-12 col-sm-5">
                      <div class="form-group middle">
                        <span>
                          <label for="tOldPwd"><span class="red">*</span>旧密码：</label>
                          <input id="tOldPwd" class="input-large" type="password" name="tOldPwd" placeholder="旧密码">
                        </span>
                      </div>
                      <div class="form-group">
                        <span>
                          <label for="tNewPwd"><span class="red">*</span>新密码：</label>
                          <input class="input-large" type="password" id="tNewPwd" name="tnNewPwd" placeholder="新密码">
                        </span>
                      </div>
                      <div class="form-group">
                        <span>
                          <label for="tNewPwdAgain"><span class="red">*</span>重复新密码</label>
                          <input class="input-large" type="password" id="tNewPwdAgain" name="tNewPwdAgain" placeholder="重复新密码">
                        </span>
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-xs-12">
                      <p class="warning" id="changePwdNotice"></p>
                    </div>
                  </div>
                </div>
                <div class="modal-footer">
                  <button class="btn btn-sm" data-dismiss="modal">
                    <i class="ace-icon fa fa-times"></i> 取消
                  </button>
                  <button id="btnChangePwd" class="btn btn-sm btn-primary">
                    <i class="ace-icon fa fa-save"></i> 保存
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
        <!-- change password modal dialog end -->
        <!--BEGIN logout modal dialog -->
        <div id="logout-dlg" class="modal" tabindex="-1">
          <div class="modal-dialog">
            <div class="modal-content">
              <form id="FORM_LOG_OUT" action='<c:url value="/logout"/>' method="get">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="warning bigger">警告</h4>
                </div>
                <div class="modal-body">
                  <h3 class="bigger">是否退出系统？</h3>
                </div>
                <div class="modal-footer">
                  <button class="btn btn-sm" data-dismiss="modal">
                    <i class="ace-icon fa fa-times"></i> 取消
                  </button>
                  <button id="btnLogout" class="btn btn-sm btn-primary" type="submit">
                    <i class="ace-icon fa fa-check"></i> 确定
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
        <!--END logout modal dialog -->
      </div>
      <!-- /.page-content -->
    </div>
    <!-- /.main-content -->

    <div class="footer">
      <div class="footer-inner">
        <!-- #section:basics/footer -->
        <div class="footer-content">
          <span class="bigger-120">
            <span class="blue bolder">云南省药物依赖防治研究所</span>
            &copy; 2016
          </span>
        </div>

        <!-- /section:basics/footer -->
      </div>
    </div>

    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
      <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
    </a>
  </div>
  <!-- /.main-container -->

  <!-- basic scripts -->
  <script type="text/javascript" src="<c:url value='/resources/js/jquery.min.js' />"></script>

  <!--[if !IE]> -->
  <script type="text/javascript">
			window.jQuery || document.write("<script src='<c:url value="/resources/js/jquery.min.js" />'>"+"<"+"/script>");
		</script>

  <!-- <![endif]-->

  <!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='<c:url value="/resources/js/jquery1x.min.js" />'>"+"<"+"/script>");
</script>
<![endif]-->
  <script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='<c:url value="/resources/js/jquery.mobile.custom.min.js" />'>"+"<"+"/script>");
		</script>
  <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

  <!-- ace scripts -->
  <script src="<c:url value="/resources/js/ace-elements.min.js" />"></script>
  <script src="<c:url value="/resources/js/ace.min.js" />"></script>
  <script src='<c:url value="/resources/js/jquery-ui.custom.min.js"></c:url>'></script>
  <script src='<c:url value="/resources/js/jquery.ui.touch-punch.min.js"></c:url>'></script>
  <script src='<c:url value="/resources/js/jquery.validate.min.js" />'></script>
  <script src='<c:url value="/resources/js/additional-methods.min.js" />'></script>
  <script src='<c:url value="/resources/js/bootbox.min.js" />'></script>
  <script src='<c:url value="/resources/js/date-time/moment.min.js" />'></script>
  <script src='<c:url value="/resources/js/date-time/bootstrap-datepicker.min.js" />'></script>  
  <script src='<c:url value="/resources/js/date-time/daterangepicker.min.js" />'></script>
  <script src='<c:url value="/resources/js/date-time/locales/bootstrap-datepicker.zh-CN.js" />'></script>
  <script src='<c:url value="/resources/js/uc/jquery.uc.page-helper.js" />'></script>
  <script src='<c:url value="/resources/js/uc/jquery.uc.form-helper.js" />'></script>
  <script src='<c:url value="/resources/js/uc/jquery.uc.validate.methods.js" />'></script>
  <script src='<c:url value="/resources/js/jquery.md5.js" />'></script>
  
  <script type="text/javascript">
	//Load content via ajax
	jQuery(function($) {
		if('enable_ajax_content' in ace) {
			var options = {
		  		content_url: function(url) {
		  			return url;
	  			},
				default_url: "welcome"
			};
			ace.enable_ajax_content($, options);
	 	}
		
		$('#change_pwd_dlg').on('shown.bs.modal', function(){
			$('#tOldPwd').val('');
			$('#tNewPwd').val('');
      $('#tNewPwdAgain').val('');
		});
						
		$('#FORM_CHANGE_PWD').submit(function(event){
			if($('#tOldPwd').val()==='' ||
				$('#tNewPwd').val()===''){
				$("#changePwdNotice").text("密码不能为空！");
				return false;
			}
			if($('#tNewPwd').val() != $('#tNewPwdAgain').val()) {
				$("#changePwdNotice").text("两次密码必须一致!");
				return false;
			}
			alert($('#tOldPwd').val());
			var oldPwdMd5=$.md5($('#tOldPwd').val());
			var newPwdMd5=$.md5($('#tNewPwd').val());
			$('#tOldPwd').val('');
			$('#tNewPwd').val('');
			$('#tNewPwdAgain').val('');			
			$.ajax({
				type : 'POST',
				url : '<c:url value="/changePwd" />',
				data : {
					<%=UserFields.PASSWORD %> : oldPwdMd5,
					<%=UserFields.NEW_PASSWORD %> : newPwdMd5
				}
			})
			.done(function(data, status) {
				if (data == 'OK') {
					$('#change_pwd_dlg').modal('hide');
				} else {
					$("#changePwdNotice").text("修改密码错误[" + data	+ "]！");
				}
			})
			.fail(function(xhr, status, excepts) {
				$("#changePwdNotice").text("修改密码错误[" + status	+ ":" + except	+ "]！");
			});
			return false;
		});
	});
</script>
</body>
</html>
