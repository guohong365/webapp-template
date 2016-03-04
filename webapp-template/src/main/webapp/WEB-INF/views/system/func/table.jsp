<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
          <i class="ace-icon fa fa-ban"></i> 禁用
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
                  <i class="ace-icon fa fa-check bigger-110"></i>                  
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
                        <span class="green">
                          <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                        </span>
                      </a>
                    </li>

                    <c:choose>
                      <c:when test="${item.enableFlag}">
                        <li>
                          <a data-original-title="禁用" href="#" class="tooltip-error" data-rel="tooltip" title="" data-action="disable" data-item="${item.funcId }">
                            <span class="red">
                              <i class="ace-icon fa fa-ban bigger-120"></i>
                            </span>
                          </a>
                        </li>
                      </c:when>
                      <c:otherwise>
                        <li>
                          <a data-original-title="启用" href="#" class="tooltip-error" data-rel="tooltip" title="" data-action="reactive" data-item="${item.funcId }">
                            <span class="red">
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


<!-- page specific plugin scripts -->
<script type="text/javascript">
	
</script>
