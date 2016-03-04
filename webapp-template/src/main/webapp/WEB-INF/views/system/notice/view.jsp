<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="detail-dialog" class="modal" tabindex="-1" role="dialog" data-backdrop="static">
  <div class="modal-dialog">
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
              <h4 class="widget-title">通知信息</h4>
            </div>
            <div class="widget-body">
              <div class="widget-main">
                <div class="row">
                  <div class="col-xs-12">
                    <div class="form-group">
                      <label class="control-label col-xs-12 col-sm-2">标题：</label>
                      <div class="col-xs-12 col-sm-10">
                        <p class="form-control-static blue">${detailInput.title}</p>
                      </div>
                    </div>
                  </div>  
                  <div class="col-xs-12 col-sm-6">
                    <div class="form-group">
                      <label class="control-label col-xs-12 col-sm-4">级别：</label>
                      <div class="col-xs-12 col-sm-8">
                        <p class="form-control-static blue">${detailInput.levelName}</p>
                      </div>
                    </div>
                  </div>                  
                  <div class="col-xs-12 col-sm-6"> 
                    <div class="form-group">
                      <label class="control-label col-xs-12 col-sm-4">发布人：</label>
                      <div class="col-xs-12 col-sm-8">
                        <p class="form-control-static blue">${detailInput.authorName}</p>
                      </div>
                    </div>
                  </div>
                  <div class="col-xs-12 col-sm-6">
                    <div class="form-group">
                      <label class="control-label col-xs-12 col-sm-4">发布时间：</label>
                      <div class="col-xs-12 col-sm-8">
                        <p class="form-control-static blue">
                          <fmt:formatDate value="${detailInput.publishTime}" pattern="yyyy年MM月dd日"/>
                        </p>
                      </div>
                    </div>  
                  </div>
                  <div class="col-xs-12 col-sm-6">
                    <div class="form-group">
                      <label class="col-xs-12 col-sm-4">失效时间：</label>
                      <div class="col-xs-12 col-sm-8">
                        <p class="form-control-static blue">
                          <fmt:formatDate value="${detailInput.expireTime}" pattern="yyyy年MM月dd日"/>
                        </p>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="space-4"></div> 
                <div id="mainText" class="wysiwyg-editor">${detailInput.mainText}</div>   
              </div>
            </div>
          </div>
          <!-- org detail edit fields end -->
        </div>
        <!-- end modal body -->
        <div class="modal-footer">
          <button id="btnCancel" class="btn btn-sm" data-dismiss="modal">
            <i class="ace-icon fa fa-times"></i> 取消
          </button>
          <button id="btnSave" class="btn btn-sm btn-primary" type="submit">
            <i class="ace-icon fa fa-check"></i> 保存
          </button>
        </div>
      </form:form>
    </div>
  </div>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		<c:if test="${action eq 'view' }">
      $("#btnSave").addClass("hide");
      $("#btnCancel").text("关闭");
		</c:if>
	});
</script>