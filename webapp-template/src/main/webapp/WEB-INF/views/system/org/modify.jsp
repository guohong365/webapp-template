<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="detail-dialog" class="modal" tabindex="-1" role="dialog"	data-backdrop="static">
	<div class="modal-dialog">
		<div class="modal-content">
			<form:form modelAttribute="detailInput" cssClass="form-horizontal"
				role="form">
				<input type="hidden" id="action" name="action" value="${action }" />
				<div class="modal-header no-padding">
					<div class="table-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">
							<span class="white">&times;</span>
						</button>
						${actionName}
					</div>
				</div>
				<div class="modal-body">
					<!-- org detail edit fields -->
					<div class="widget-box">
						<div class="widget-header blue">
							<h4 class="widget-title">机构信息</h4>
						</div>
						<div class="widget-body">
							<div class="widget-main">
								<div class="row">
									<div class="col-xs-12">
                      <c:choose>
                        <c:when test="${action eq 'new' }">
                          <div class="col-xs-12">
                            <div class="form-group">
                              <form:label path="id" cssClass="control-label col-xs-12 col-sm-3">
                                <span class="red">*</span>机构ID：
                              </form:label>
                              <div class="col-xs-12 col-sm-9">
                                <form:input path="id" cssClass="form-control"  placeholder="请输入机构ID..." />
                              </div>
                            </div>
                          </div>
                        </c:when>
                        <c:otherwise>
                          <div class="col-xs-12">
                            <div class="form-group">
                              <form:label path="id" cssClass="control-label col-xs-12 col-sm-3">机构ID： </form:label>
                              <div class="col-xs-12 col-sm-9">
                                <p class="form-control-static blue">${detailInput.id}</p>
                                <form:hidden path="id"/>
                              </div>
                            </div>
                          </div>
                        </c:otherwise>  
                      </c:choose>      
											<div class="col-xs-12 ">
												<div class="form-group">
													<form:label path="name"	cssClass="control-label col-xs-12 col-sm-3">
														<span class="red">*</span>机构名称：</form:label>
													<div class="col-xs-12 col-sm-9">
														<form:input path="name" cssClass="form-control"
															placeholder="请输入机构名称..." />
													</div>
												</div>
											</div>
										<c:if test="${(detailInput.parentId!=null and detailInput.parentId!='') or action eq 'new'}">
												<div class="col-xs-12">
													<div class="form-group">
														<form:label path="orgCity"
															cssClass="control-label col-xs-12 col-sm-3">
															<span class="red">*</span>所属地市：</form:label>
														<div class="col-xs-12 col-sm-9">
															<form:select path="orgCity"
																cssClass="form-control need-one">
																<form:options items="${cities }" itemLabel="value"
																	itemValue="code" />
															</form:select>
														</div>
													</div>
												</div>
												<div class="col-xs-12">
													<div class="form-group">
														<form:label path="orgArea"
															cssClass="control-label col-xs-12 col-sm-3">所属区县：</form:label>
														<div class="col-xs-12 col-sm-9">
															<form:select path="orgArea"
																cssClass="form-control need-one">
																<form:options items="${areas}" itemLabel="value"
																	itemValue="code" />
															</form:select>
														</div>
													</div>
												</div>
												<div class="col-xs-12">
													<div class="form-group">
														<form:label path="parentId"
															cssClass="control-label col-xs-12 col-sm-3">
															<span class="red">*</span>上级机构：</form:label>
														<div class="col-xs-12 col-sm-9">
															<form:select path="parentId" cssClass="form-control">
																<form:options items="${orgs}" itemLabel="value"	itemValue="code" />
															</form:select>
														</div>
													</div>
												</div>
										</c:if>
											<div class="col-xs-12">
												<div class="form-group">
													<form:label path="orgLinkman"
														cssClass="control-label col-xs-12 col-sm-3">联系人：</form:label>
													<div class="col-xs-12 col-sm-9">
														<form:input path="orgLinkman" cssClass="form-control"
															placeholder="请输入联系人..." />
													</div>
												</div>
											</div>
											<div class="col-xs-12">
												<div class="form-group">
													<form:label path="orgTele"
														cssClass="control-label col-xs-12 col-sm-3">联系电话：</form:label>
													<div class="col-xs-12 col-sm-9">
														<form:input path="orgTele" cssClass="form-control"	placeholder="请输入联系电话..." />
													</div>
												</div>
											</div>
											<div class="col-xs-12">
												<div class="form-group">
													<form:label path="orgAddr"
														cssClass="control-label col-xs-12 col-sm-3">机构地址 ：</form:label>
													<div class="col-xs-12 col-sm-9">
														<form:textarea path="orgAddr" placeholder="请输入机构地址..."
															cssClass="form-control" />
													</div>
												</div>
											</div>
											<div class="col-xs-12">
												<div class="form-group">
													<form:label path="description"
														cssClass="control-label col-xs-12 col-sm-3">机构描述：</form:label>
													<div class="col-xs-12 col-sm-9">
														<form:textarea path="description" cssClass="form-control"
															placeholder="请输入机构描述..." />
													</div>
												</div>
											</div>
									</div>
								</div>
							</div>
						</div>
						<!-- org detail edit fields end -->
					</div>
				</div>
				<!-- end modal body -->
				<div class="modal-footer">
					<button id="btnSave" class="btn btn-sm btn-primary" type="submit">
						<i class="ace-icon fa fa-check"></i> 保存
					</button>
          <button id="btnCancel" class="btn btn-sm" data-dismiss="modal">
            <i class="ace-icon fa fa-times"></i> 取消
          </button>
        </div>
			</form:form>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function() {

		$("#orgCity").on("change", function() {
			
			if ($("#orgCity").val() === "") {
				$("#orgArea").html('<option value="">请选择区县...</option>');
				return false;
			}
			$.ajax({
				type : "POST",
				url : 'util/area',
				data : "city=" + $("#orgCity").val()	+ "&action=" + $('#action').val(),
				dataType : "html"
			}).done(function(data) {
				$("#orgArea").html(data);
			}).fail(function(xhr, error, exp) {
						
			});
		});

		$('#detailInput').validate({
			errorElement : 'div',
			errorClass : 'help-block align-right',
			focusInvalid : false,
			rules : {
				id : { required : true },
				orgName : {	required : true	},
				parentId : {	required : true	},
				orgCity : {	required : true	},
				orgType : {	required : true	},
				orgPrefix : { required : '#orgType2:checked' }
			},
			messages : {
				orgName : { required : "机构ID不能为空！" },
				orgName : {	required : "机构名称不能为空！"	},
				orgParentId : {	required : "上级机构不能为空！"	},
				orgCity : {	required : "地州不能为空！" },
				orgType : {	required : "必须选择机构类型!"	},
			},
			highlight : function(e) {
				$(e).closest('.form-group').removeClass('has-success').addClass('has-error');
			},
			success : function(e) {
				$(e).closest('.form-group').removeClass('has-error').addClass('has-success');
				$(e).remove();
			},
			errorPlacement : function(error, element) {
				element.closest('.form-group').append(error);
			},
			onsubmit : false
		});
		
		$('#detail-dialog').bindKeyMoveForm('#detailInput :input');
		
	});
</script>