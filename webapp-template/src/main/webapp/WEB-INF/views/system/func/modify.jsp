<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div id="detail-dialog" class="modal" tabindex="-1">
	<div class="modal-dialog">
		<div class="modal-content">
			<form:form modelAttribute="detailInput" cssClass="form-horizonal" role="form" action="#" >
				<input type="hidden" id="action" name="action" value="${action}" />
        <form:hidden path="funcId" />        
				<div class="modal-header no-padding">
					<div class="table-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							<span class="white">&times;</span></button>
						${actionName}
					</div>
				</div>
				<div class="modal-body no-padding">
					<div class="row">  <!-- role detail edit fields -->
						<div class="col-xs-12">
							<div class="widget-box">
								<div class="widget-header blue">
									<h4 class="widget-title">功能信息</h4>
								</div>
								<div class="widget-body">
									<div class="widget-main">
										<div>
											<form:label path="funcName" cssClass="control-label">功能名称 ：</form:label>
											<form:input path="funcName" placeholder="请输入功能名称..." cssClass="form-control"/>
										</div>	
										<div class="space-2"></div>
										<div>
											<form:label path="funcDesc" cssClass="control-label">功能描述：</form:label>
											<form:textarea path="funcDesc" cssClass="form-control" placeholder="请输入功能描述..." />
										</div>					
										<div class="space-2"></div>
										<div>
											<form:label path="funcUri" cssClass="control-label">功能页面：</form:label>
											<form:input path="funcUri" cssClass="form-control" placeholder="请输入功能页面URI..." />
										</div>						
										<div class="space-2"></div>
										<div>
											<form:label path="enableFlag" cssClass="control-label">启用</form:label>
											<span><form:checkbox path="enableFlag" /></span>
										</div>
									</div>	
								</div>	
							</div>
						</div>
					</div> <!-- role detail edit fields end -->
				</div>				
				<div class="modal-footer">
					<button id="btnSave" class="btn btn-sm btn-primary" type="submit" >
						<i class="ace-icon fa fa-check"></i> 保存
					</button>
          <button class="btn btn-sm" data-dismiss="modal">
            <i class="ace-icon fa fa-times"></i> 取消
          </button>
          
				</div>
			</form:form>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function(){
		var toSave=true;
		<c:if test="${action eq 'view' }">
			toSave=false; 				
		</c:if>
		$("#detailInput").submit(function(){
			$("#btnSave").attr("disabled", "disabled");
			if(toSave){
				$.ajax({
					type: "POST",
					url: '<c:url value="/system/func/detail" />',
					data: $("#detailInput").serialize(),
					dataType: "text"				
				})
				.done(function(data){
				
				})
				.fail(function(xhr, data, exp){
				
				});
			}	
			$("#detail-dialog").modal('hide');
			return false;
		});
		
		$('#detail-dialog').bindKeyMoveForm('#detailInput :input');
		
	});
</script>