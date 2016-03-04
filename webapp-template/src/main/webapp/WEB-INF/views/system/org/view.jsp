<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="detail-dialog" class="modal" tabindex="-1" role="dialog" data-backdrop="static">
  <div class="modal-dialog">
    <div class="modal-content">
      <form:form modelAttribute="detailInput" cssClass="form-horizontal" role="form">
        <input type="hidden" id="action" name="action" value="${action }" />
        <form:hidden path="orgId" />
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
              <h4 class="widget-title">机构信息</h4>
            </div>
            <div class="widget-body">
              <div class="widget-main">
                <div class="row">
                  <div class="col-xs-12">
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">机构名称：</div>
                      <div class="blue col-xs-12 col-sm-9">${detailInput.orgName}</div>
                    </div>
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">所属地市：</div>
                      <div class="blue col-xs-12 col-sm-3">${detailInput.cityName}</div>
                      <div class="col-xs-12 col-sm-3">所属区县：</div>
                      <div class="blue col-xs-12 col-sm-3">${detailInput.areaName}</div>
                    </div>
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">上级机构：</div>
                      <div class="blue col-xs-12 col-sm-9">${detailInput.parentOrgName}</div>
                    </div>
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">机构类别：</div>
                      <div class="blue col-xs-12 col-sm-9">
                        <c:if test="${detailInput.orgType eq '1' }">管理机构</c:if>
                        <c:if test="${detailInput.orgType eq '2' }">交换站点</c:if>
                      </div>
                    </div>
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">字头:</div>
                      <div class="blue col-xs-12 col-sm-9">${detailInput.orgPrefix }</div>
                    </div>
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">联系人：</div>
                      <div class="blue col-xs-12 col-sm-9">${detailInput.orgLinkman }</div>
                    </div>
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">联系电话：</div>
                      <div class="blue col-xs-12 col-sm-9">${detailInput.orgTele }</div>
                    </div>
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">机构地址 ：</div>
                      <div class="blue col-xs-12 col-sm-9">${detailInput.orgAddr}</div>
                    </div>                    
                    <div class="form-group col-xs-12">
                      <div class="col-xs-12 col-sm-3">机构描述：</div>
                      <div class="blue col-xs-12 col-sm-9">${detailInput.orgDesc }</div>
                    </div>
                  </div>
                </div>
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