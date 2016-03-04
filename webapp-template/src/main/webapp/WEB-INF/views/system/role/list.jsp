<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<title>${modelTitle }</title>
<!-- ajax layout which only needs content area -->
<div class="row" id="content_container">
  <div class="col-xs-12">
    <!-- PAGE CONTENT BEGINS -->
    <div class="row">
      <!-- search condition begin -->
      <div class="col-xs-12">
        <form:form class="form-horizontal" role="form" modelAttribute="queryInput" action="#">
          <div class="col-xs-12 col-sm-6">
            <div class="form-group">
              <form:label path="queryRoleName" cssClass="control-label col-xs-12 col-sm-4">角色名称：</form:label>
              <div class="col-xs-12 col-sm-8">
                <form:input cssClass="form-control" path="queryRoleName" placeholder="输入角色全部或部分名称..." />
              </div>
            </div>
          </div>
          <div class="col-xs-12 col-sm-6">
            <div class="form-group">
              <form:label path="queryIsAll" cssClass="control-label col-sm-offset-4">
              <form:checkbox path="queryIsAll" cssClass="checkbox-inline"></form:checkbox>&nbsp;包括注销角色</form:label>
            </div>
          </div>
          <div class="col-xs-12">
            <div class="form-group align-right">
              <button class="btn btn-sm btn-success" id="btnReset" type="button">
                <i class="ace-icon fa fa-refresh"></i>
                  重置
              </button>
              <button class="btn btn-sm btn-primary" id="btnSearch" type="button">
                <i class="ace-icon fa fa-search"></i>
                  查询
              </button>
            </div>
          </div>
        </form:form>
      </div>
    </div>
    <!-- search condition end -->
    <div class="hr hr-8"></div>
    <div class="row">
      <!-- result table begin -->
      <div class="col-xs-12" >
        <div id="listResult">
        <form id="FORM_TABLE_FUNCTION" role="form" action="#" method="post">          	
          <div class="dataTables_wrapper form-inline no-footer">
            <div class="row">
              <!-- functon button begin -->
              <div class="col-xs-12">
                <button class="btn btn-sm btn-success" data-action="new" type="button">
                  <i class="ace-icon fa fa-pencil"></i>
                  新增
                </button>
              </div>
            </div>
            <!-- function button end -->
            <!-- table data begin-->
            <input type="hidden" id="action" name="action" value="${action}" />
            <input type="hidden" id="selectedId" name="selectedId" value="" />
            <input type="hidden" id="queryInput.queryRoleName" name="queryInput.queryRoleName"
              value="${queryInput.queryRoleName }" />
            <input type="hidden" id="queryInput.queryIsAll" name="queryInput.queryIsAll"  value="${queryInput.queryIsAll }" />
            <input type="hidden" id="queryInput.queryOrderBy" name="queryInput.queryOrderBy" value="${queryInput.queryOrderBy }" />
            <input type="hidden" id="queryInput.queryOrder" name="queryInput.queryOrder" value="${queryInput.queryOrder}" />
            <table class="table table-striped table-bordered table-hover dataTable no-footer">
              <thead>
                <tr>
                  <c:choose>
                    <c:when test="${queryInput.queryOrderBy =='角色名称' }">
                      <th class="sorting_${queryInput.queryOrder}" data-active="true" data-column="角色名称">角色名称</th>
                    </c:when>
                    <c:otherwise>
                      <th class="sorting" data-column="角色名称">角色名称</th>          
                    </c:otherwise>
                  </c:choose>
                  <c:choose>
                    <c:when test="${queryInput.queryOrderBy =='有效' }">
                      <th class="sorting_${queryInput.queryOrder }" data-active="true" data-column="有效">有效</th>
                    </c:when>
                    <c:otherwise>
                      <th class="sorting" data-column="有效">有效</th>
                    </c:otherwise>
                  </c:choose>        
                  <th>角色描述</th>                  
                  <th></th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="item" items="${records}">
                  <c:set var="isValid" value="是"></c:set>
                  <c:set var="delClass" value=""></c:set>
                  <c:if test="${item.delFlag }">
                    <c:set var="isValid" value="否"></c:set>
                    <c:set var="delClass" value="deleted-text red"></c:set>
                  </c:if>
                  <tr class="${delClass }">
                    <td>${item.roleName}
                      <c:if test="${item.isInternal}">
                        <span class="red">(内部角色)</span>
                      </c:if>
                    </td>
                    <td>${isValid}</td>                    
                    <td>${item.roleDesc}</td>
                    <td>
                      <div class="hidden-sm hidden-xs btn-group">
                        <button data-original-title="查看" data-rel="tooltip"  title="" class="btn btn-xs btn-info tooltip-info" data-action='view' data-item="${item.roleId }" type="button">
                          <i class="ace-icon fa fa-search bigger-120" ></i>
                        </button>
                        <c:if test="${!item.isInternal }">
                          <button data-original-title="编辑" data-rel="tooltip"  title="" class="btn btn-xs btn-warning tooltip-warning" data-action="modify" data-item="${item.roleId }" type="button">
                            <i class="ace-icon fa fa-edit bigger-120"></i>
                          </button>
                          <c:choose>
                          <c:when test="${item.delFlag }">
                            <button data-original-title="激活" data-rel="tooltip"  title="" class="btn btn-xs btn-success tooltip-success" data-action="reactive" data-item="${item.roleId }" type="button">
                              <i class="ace-icon fa fa-check bigger-120"></i>
                            </button>                          
                          </c:when>
                          <c:otherwise>
                          <button data-original-title="注销" data-rel="tooltip"  title="" class="btn btn-xs btn-danger tooltip-error" data-action="cancel" data-item="${item.roleId }" type="button">
                            <i class="ace-icon fa fa-ban bigger-120"></i>
                          </button>
                          </c:otherwise>                          
                          </c:choose>
                        </c:if>
                      </div>
                      <div class="hidden-md hidden-lg">
                        <div class="inline position-relative">
                          <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown"
                            data-position="auto">
                            <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                          </button>

                          <ul  class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                            <li>
                              <a data-original-title="查看" href="#" class="tooltip-info" data-rel="tooltip" title="" data-action="view" data-item="${item.roleId }">
                                <span class="blue">
                                  <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                </span>
                              </a>
                            </li>
                            <c:if test="${!item.isInternal }">
                            <li>
                              <a data-original-title="编辑" href="#" class="tooltip-success" data-rel="tooltip" title="" data-action="modify" data-item="${item.roleId }">
                                <span class="green">
                                  <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                </span>
                              </a>
                            </li>
                            <c:choose>
                            <c:when test="${item.delFlag}">
                              <li>
                                <a data-original-title="激活" href="#" class="tooltip-error" data-rel="tooltip" title="" data-action="reactive" data-item="${item.roleId }">
                                  <span class="green">
                                    <i class="ace-icon fa fa-check bigger-120"></i>
                                  </span>
                                </a>                                
                              </li>
                            </c:when>
                            <c:otherwise>
                            <li>
                              <a data-original-title="注销" href="#" class="tooltip-error" data-rel="tooltip" title="" data-action="cancel" data-item="${item.roleId }">
                                <span class="red">
                                  <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                </span>
                              </a>
                            </li>
                            </c:otherwise>
                            </c:choose>
                            </c:if>
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
		
		$('#content_container').bindPage({
			bindPagation : false,
			reset : function() {
				$('#queryInput [name="queryRoleName"]').val("");
				$('#queryInput [name="queryIsAll"]').attr("checked", false);
			},
			afterSave : function (){
				return true;
			},		
			detailUrl : 'system/role/detail',
			listUrl : 'system/role/list',
			refreshUrl : 'system/role/table'
		});
	});
</script>
