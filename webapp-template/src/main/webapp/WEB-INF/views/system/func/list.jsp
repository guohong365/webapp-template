<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<title>${modelTitle }</title>
<!-- ajax layout which only needs content area -->
<div class="row">
  <div class="col-xs-12">
    <!-- PAGE CONTENT BEGINS -->
    <div class="row">
      <!-- search condition begin -->
      <div class="col-xs-12">
        <form:form class="form-horizontal" role="form" modelAttribute="queryInput">
          <div class="row">
            <div class="col-sm-2"></div>
            <div class="col-sm-4">
              <div class="form-group">
                <form:label path="queryFuncName" cssClass="control-label col-sm-3 no-padding-right">功能名称：</form:label>
                <div class="col-sm-9">
                  <form:input cssClass="form-control" path="queryFuncName" placeholder="输入功能部分或全部名称..." />
                </div>
              </div>
            </div>
            <div class="col-sm-4">
              <div class="form-group">
                <form:label path="queryFuncUri" cssClass="control-label col-sm-3 no-padding-right">功能URI：</form:label>
                <div class="col-xs-9">
                  <form:input path="queryFuncUri" cssClass="form-contorl" placeholder="输入功能部分或全部URI..." />
                </div>
              </div>
            </div>
            <div class="col-sm-2"></div>
          </div><!-- row 1 -->
          <div class="row">
            <div class="col-xs-2"></div>
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
              <div class="form-group">
                <form:label path="queryIsAll" cssClass="control-label col-sm-3 no-padding-right">包含注销：</form:label>
                <form:checkbox path="queryIsAll" class="align-right middle" />
              </div>
            </div>
            <div class="col-sm-2"></div>
          </div>
          <div class="row">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
              <div class="form-group align-right">
                <button class="btn btn-sm btn-success" id="btnReset" type="button">
                  <i class="ace-icon fa fa-refresh"></i> 重置
                </button>
                <button class="btn btn-sm btn-primary" id="btnSearch" type="submit">
                  <i class="ace-icon fa fa-search"></i> 查询
                </button>
              </div>
            </div>
            <div class="col-sm-2"></div>
          </div>
        </form:form>
      </div>
    </div>
    <!-- search condition end -->
    <div class="hr hr-8"></div>
    <div class="row">
      <!-- result table begin -->
      <div class="col-xs-12">
        <div id="listResult">
          <form id="FROM_TABLE_FUNCTION" role="form">
            <div class="dataTables_wrapper form-inline no-footer">
              <div class="row">
                <!-- functon button begin -->
                <div class="col-xs-12">
                  <button class="btn btn-sm btn-success" data-action="new" type="button">
                    <i class="ace-icon fa fa-pencil"></i> 新增
                  </button>
                  <button class="btn btn-sm btn-info" data-action="view" type="button" disabled="disabled">
                    <i class="ace-icon fa fa-search"></i> 查看
                  </button>
                  <button class="btn btn-sm btn-warning" data-action="modify" type="button" disabled="disabled">
                    <i class="ace-icon fa fa-edit"></i> 修改
                  </button>
                  <button class="btn btn-sm btn-danger" data-action="disable" type="button" disabled="disabled">
                    <i class="ace-icon fa fa-trash-o"></i> 禁用
                  </button>
                </div>
              </div>
              <!-- function button end -->
              <!-- table data begin-->
              <input type="hidden" id="action" name="action" value="${action}" />
              <input type="hidden" id="queryInput.queryOrgName" name="queryInput.queryUserName" value="${queryInput.queryFuncName }" />
              <input type="hidden" id="queryInput.queryOrgCity" name="queryInput.queryUserId" value="${queryInput.queryFuncUri }">
              <input type="hidden" id="queryInput.queryIsAll" name="queryInput.queryUserIsAll" value="${queryInput.queryIsAll }" />
              <table class="table table-striped table-bordered table-hover dataTable no-footer">
                <thead>
                  <tr>
                    <th></th>
                    <th>功能名称</th>
                    <th>功能URI</th>
                    <th>功能描述</th>
                    <th>启用</th>
                    <th></th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach var="item" items="${records}">
                    <c:set var="enabledFlag" value="否"></c:set>
                    <c:if test="${item.enableFlag}">
                      <c:set var="enabledFlag" value="是"></c:set>
                    </c:if>
                    <tr>
                      <td class="center">
                        <input type="radio" id="${item.funcId}" name="selectedId" value="${item.funcId}" />
                      </td>
                      <td>${item.funcName}</td>
                      <td>${item.funcUri }</td>
                      <td>${item.funcDesc}</td>
                      <td>${enabledFlag}</td>
                      <td>
                        <div class="hidden-sm hidden-xs btn-group">
                          <button class="btn btn-xs btn-info" data-action='view' data-item="${item.funcId }" type="button">
                            <i class="ace-icon fa fa-search bigger-120"></i>
                          </button>
                          <button class="btn btn-xs btn-warning" data-action="modify" data-item="${item.funcId }" type="button">
                            <i class="ace-icon fa fa-edit bigger-120"></i>
                          </button>
                          <c:choose>
                          <c:when test="${item.enableFlag}">
                          <button class="btn btn-xs btn-danger" data-action="disable" data-item="${item.funcId }" type="button">
                            <i class="ace-icon fa fa-ban bigger-120"></i>                  
                          </button>
                          </c:when>
                          <c:otherwise>
                          <button class="btn btn-xs btn-success" data-action="reactive" data-item="${item.funcId }" type="button">
                            <i class="ace-icon fa fa-check bigger-120"></i>                  
                          </button>
                          </c:otherwise>
                          </c:choose>
                        </div>
                        <div class="hidden-md hidden-lg">
                          
                          <div class="inline position-relative">
                            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                              <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                            </button>

                            <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                              <li>
                                <a data-original-title="查看" href="#" class="tooltip-info" data-rel="tooltip" title="" data-action="view" data-item="${item.funcId }">
                                  <span class="blue">
                                    <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                  </span>
                                </a>
                              </li>

                              <li>
                                <a data-original-title="编辑" href="#" class="tooltip-success" data-rel="tooltip" title="" data-action="modify" data-item="${item.funcId }">
                                  <span class="">
                                    <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                  </span>
                                </a>
                              </li>
                              
                              <c:choose>
                                <c:when test="${item.enableFlag}">
                              <li>
                                <a data-original-title="禁用" href="#" class="tooltip-error" data-rel="tooltip" title="" data-action="disable" data-item="${item.funcId }">
                                  <span class="red">
                                    <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                  </span>
                                </a>
                              </li>
                              </c:when>
                              <c:otherwise>
                              <li>
                                <a data-original-title="启用" href="#" class="tooltip-error" data-rel="tooltip" title="" data-action="reactive" data-item="${item.funcId }">
                                  <span class="green">
                                    <i class="ace-icon fa fa-check-circle-o bigger-120"></i>
                                  </span>
                                </a>
                              </li>
                              </c:otherwise> 
                              </c:choose>                             
                            </ul>
                          </div>
                        </div>

                      </td>
                    </tr>
                  </c:forEach>
                </tbody>
              </table>
              <!-- table data end -->
            </div>
          </form>
        </div>
        <div id="dialogPanel"></div>
      </div>
    </div>
    <!-- result table end -->

    <!-- PAGE CONTENT ENDS -->
  </div>
  <!-- /.col -->
</div>
<!-- /.row -->

<!-- page specific plugin scripts -->
<script type="text/javascript">
	var scripts = [ null, null ]
	ace.load_ajax_scripts(scripts, function() {

		$('[data-rel="tooltip"]').tooltip();
		
		$("#btnReset").on("click",function() {
			$('#queryInput [name="queryFuncName" ]').val("");
			$('#queryInput [name="queryIsAll" ]').attr("checked", false);
			$('#queryInput [name="queryfuncUri" ]').val("");
		});

		$("#queryInput").on("submit",function() {
			var reqData=$( "#queryInput").serialize();
			$.ajax({
				type : "POST",
				url : '<c:url value="/system/func/list" />',
				data : $("#queryInput").serialize(),
				dataType : "html"
			}).done(function(data) {
				$("#listResult").html(data);
			}).fail(function(xhr, code, exp) {
				alert("failed:" + exp);
			});
			return  false;
		});

	   $("#listResult").on("click","[data-action]",function() {
	          $('#action').val($(this).attr("data-action"));        
	          if($(this).attr("data-item")){
	            var sel="#" + $(this).attr("data-item");
	            $(sel).attr("checked", true);
	          }
	          $.ajax({
	            type : "GET",
	            url : '<c:url value="/system/func/detail" />',
	            data : $('#FROM_TABLE_FUNCTION').serialize(),
	            dataType  : "html"
	          }).done(function(data) {
	            $("#dialogPanel").html(data);
	            $("#detail-dialog").modal({
	              backdrop : true,
	              show :  true
	            });
	          }).fail(function(xhr, code, exp) {
	            alert("error:" + code + " exp:" + exp);
	          });
	          return false;
	  });

    $("#listResult").on("click change", "input[name='selectedId']", function() {
    	$("[data-action]").attr("disabled", false);
	  });
	});
</script>
