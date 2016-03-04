<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="detail-dialog" class="modal" tabindex="-1" role="dialog" data-backdrop="static">
  <div class="modal-dialog  modal-lg">
    <div class="modal-content">
      <form:form modelAttribute="detailInput" cssClass="form-horizontal" role="form">
        <input type="hidden" id="action" name="action" value="${action }" />
        <form:hidden path="id" />
        <div class="modal-header no-padding">
          <div class="table-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
              <span class="white">&times;</span>
            </button>
            ${actionName}
          </div>
        </div>
        <div class="modal-body">
          <!-- org detail edit fields -->
          <div class="widget-box">
            <div class="widget-header blue">
              <h4 class="widget-title">通知</h4>
            </div>
            <div class="widget-body">
              <div class="widget-main">
                <div class="row">
                  <div class="col-xs-12 ">
                    <div class="row">
                      <div class="col-xs-12">
                        <div class="form-group">
                          <form:label path="title" cssClass="control-label col-xs-12 col-sm-3">
                            <span class="red">*</span>标题：</form:label>
                          <div class="col-xs-12 col-sm-9">
                            <form:input path="title" cssClass="form-control" placeholder="请输入标题..." />
                          </div>
                        </div>
                      </div>
                      <div class="col-xs-12 col-sm-6">
                        <div class="form-group">
                          <form:label path="importantLevel" cssClass="control-label col-sx-12 col-sm-6">级别：</form:label>
                          <div class="col-xs-12 col-sm-6">
                            <form:select path="importantLevel" cssClass="form-control">
                              <form:options items="${levels}" itemLabel="value" itemValue="code" />
                            </form:select>
                          </div>
                        </div>
                      </div>
                      <div class="col-xs-12 col-sm-6">
                        <div class="form-group">
                          <form:label path="expireTime" cssClass="control-label col-xs-12 col-sm-6">失效时间：</form:label>
                          <div class="col-xs-12 col-sm-6">
                            <div class="input-group">
                              <form:input path="expireTime" cssClass="form-control date-picker" placeholder="选择失效时间..." />
                              <span class="input-group-addon">
                                <i class="fa fa-calendar"></i>
                              </span>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="col-xs-12">
                      <form:label path="mainText" cssClass="control-label col-xs-12">正文：</form:label>
                      <div class="wysiwyg-editor" id="editor1"></div>
                      <form:hidden path="mainText" />
                    </div>
                  </div>
                </div>
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
          </div>
        </div>    
      </form:form>
    </div>
  </div>
</div>

<script type="text/javascript">
	$(document).ready(
			function() {
				$('.date-picker').datepicker({
					format : "yyyy-mm-dd",
					autoclose : true,
					todayHighlight : true,
					todayBtn : true,
					language : "zh-CN",
					startDate : new Date()
				}).next().on('click', function() {
					$(this).prev().focus();
				});

				$('#editor1').ace_wysiwyg({
					toolbar : [ 'font', null, 'fontSize', null, {
						name : 'bold',
						className : 'btn-info'
					}, {
						name : 'italic',
						className : 'btn-info'
					}, {
						name : 'strikethrough',
						className : 'btn-info'
					}, {
						name : 'underline',
						className : 'btn-info'
					}, null, {
						name : 'insertunorderedlist',
						className : 'btn-success'
					}, {
						name : 'insertorderedlist',
						className : 'btn-success'
					}, {
						name : 'outdent',
						className : 'btn-purple'
					}, {
						name : 'indent',
						className : 'btn-purple'
					}, null, {
						name : 'justifyleft',
						className : 'btn-primary'
					}, {
						name : 'justifycenter',
						className : 'btn-primary'
					}, {
						name : 'justifyright',
						className : 'btn-primary'
					}, {
						name : 'justifyfull',
						className : 'btn-inverse'
					}, null, {
						name : 'createLink',
						className : 'btn-pink'
					}, {
						name : 'unlink',
						className : 'btn-pink'
					}, null, {
						name : 'insertImage',
						className : 'btn-success'
					}, null, 'foreColor', null, {
						name : 'undo',
						className : 'btn-grey'
					}, {
						name : 'redo',
						className : 'btn-grey'
					} ]
				}).prev().addClass('wysiwyg-style3');

				$('#detailInput').validate(
						{
							errorElement : 'div',
							errorClass : 'help-block align-right',
							focusInvalid : false,
							rules : {
								title : {
									required : true
								},
							},
							messages : {
								title : {
									required : "标题不能为空！"
								},
							},
							highlight : function(e) {
								$(e).closest('.form-group').removeClass(
										'has-success').addClass('has-error');
							},
							success : function(e) {
								$(e).closest('.form-group').removeClass(
										'has-error').addClass('has-success');
								$(e).remove();
							},
							errorPlacement : function(error, element) {
								element.closest('.form-group').append(error);
							},
							onsubmit : false
						});
				$('#editor1').html($('#mainText').val());
			});
</script>