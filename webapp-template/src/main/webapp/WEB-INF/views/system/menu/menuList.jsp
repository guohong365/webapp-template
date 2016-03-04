<%@page contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	

<title>菜单管理</title>

<!-- ajax layout which only needs content area -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->
		<div class="row">
			<div class="col-xs-12">		
				<div class="row"> <!--item edit  -->
					<div class="col-sm-6">
						<div class="widget-box">
							<div class="widget-header">
								<h4 class="widget-title">创建子菜单节点</h4>
							</div>					
							<div class="widget-body">
								<div class="row"><!-- tree node edit -->
									<div class="col-xs-12">
										<label class="control-label" for="menuNodename">节点名称：</label><input class="" id="menuNodeName">
										<span><button class="btn btn-sm btn-success">新增</button></span>
									</div>
								</div>	
								<div class="row"> <!-- menu tree begin -->
									<div class="col-xs-12">
										<div class="dd" id="menuTree">
											<ol class="dd-list">
												<li class="dd-item" data-id="0" data-name="root">
													<div class="dd-handle">root</div>
												</li>
											</ol>
										</div>
									</div>	
								</div><!-- menu tree end -->	
							</div>
						</div>
					</div>
			
					<div class="vspace-16"></div>
			
					<div class="col-sm-6">
						<div class="widget-box">
							<div class="widget-header">
								<h4 class="widget-title">所有功能</h4>						
							</div>
							<div class="widget-body">
								<div class="widget-main">
									<div class="row">
										<div class="col-xs-12">
											<div class="dd" id="funcList"> <!-- dragbale list begin -->
												<ol class="dd-list">
													<c:forEach var="func" items="${funcs}">
													<li class="dd-item" data-id="${func.funcId}" data-name="${func.funcName}">
														<div class="dd-handle">
															<span>${func.funcName}</span>
															<span class="lighter grey">${func.funcDesc}</span>
														
														</div>
													</li>									
													</c:forEach>
												</ol>
											</div> <!-- gragable list end -->
										</div>	
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>	
		</div>		
		<div class= "row">
			<div class="col-xs-12">
				<button class="btn btn-primary">保存</button>
			</div>
		</div>		
		<!-- PAGE CONTENT ENDS -->
	</div><!-- /.col -->
</div><!-- /.row -->

<!-- page specific plugin scripts -->
<script type="text/javascript">
	var scripts = [null,'<c:url value="/resources/js/jquery.nestable.min.js" />', null]
	ace.load_ajax_scripts(scripts, function() {
	  	//inline scripts related to this page
		jQuery(function($){	
			$('.dd').nestable();
	
			$('.dd-handle a').on('mousedown', function(e){
				e.stopPropagation();
			});
		
			$('[data-rel="tooltip"]').tooltip();
	
		});
	});
</script>
