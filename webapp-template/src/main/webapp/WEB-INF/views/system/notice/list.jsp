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
        <form:form cssClass="form-horizontal" role="form" modelAttribute="queryInput" action="system/org/list" method="POST">
          <div class="col-xs-12 col-sm-6">
            <div class="form-group">
              <form:label path="queryTitle" cssClass="control-label col-xs-12 col-sm-4">标题：</form:label>
              <div class="col-xs-12 col-sm-8">
                <form:input cssClass="form-control" path="queryTitle" placeholder="输入全部或部分标题..." />
              </div>
            </div>
          </div>
          <div class="col-xs-12 col-sm-6">  
            <div class="form-group">
              <form:label path="queryLevel" cssClass="control-label col-xs-12 col-sm-4">级别：</form:label>
              <div class="col-xs-12 col-sm-8">
                <form:select path="queryLevel" cssClass="form-control">
                  <form:options items="${levels}" itemLabel="value" itemValue="code" />
                </form:select>
              </div>
            </div>
          </div>
          <div class="col-xs-12 col-sm-6">  
            <div class="form-group">
              <form:label path="queryPublishTimeFrom" cssClass="control-label col-xs-12 col-sm-4">发布时间：</form:label>              
              <div class="col-xs-12 col-sm-8">
                <div class="input-daterange input-group">
                  <form:input path="queryPublishTimeFrom" cssClass="form-control" />
                  <span class="input-group-addon">至 </span>
                  <form:input path="queryPublishTimeTo" cssClass="form-control" />
                  <span class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </span>
                </div>
              </div>
            </div>
          </div>
          <div class="col-xs-12 col-sm-6">  
            <div class="form-group">
              <form:label path="queryExpireTimeFrom" cssClass="control-label col-xs-12 col-sm-4">发布时间：</form:label>              
              <div class="col-xs-12 col-sm-8">
                <div class="input-daterange input-group">
                  <form:input path="queryExpireTimeFrom" cssClass="form-control" />
                  <span class="input-group-addon">至 </span>
                  <form:input path="queryExpireTimeTo" cssClass="form-control" />
                  <span class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </span>
                </div>
              </div>
            </div>
          </div>
          
          <div class="col-xs-12 col-sm-6">  
            <div class="form-group">
              <form:label path="queryIsAll" cssClass="control-label col-xs-12 col-sm-4">所有：</form:label>
              <div class="col-xs-12 col-sm-8">
                <form:checkbox path="queryIsAll" cssClass="checkbox-inline" />
              </div>
            </div>
          </div>
          <div class="col-xs-12">
            <div class="form-group align-right">
              <button class="btn btn-sm btn-success" id="btnReset" type="button">
                <i class="ace-icon fa fa-refresh"></i> 重置
              </button>
              <button class="btn btn-sm btn-primary" id="btnSearch" type="button">
                <i class="ace-icon fa fa-search"></i> 查询
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
        <form  role="form" id="FORM_TABLE_FUNCTION" action="#" method="POST">
          <div class="dataTables_wrapper form-inline no-footer">
            <div class="row">
              <!-- functon button begin -->
              <div class="col-xs-12">
                <button class="btn btn-sm btn-success" data-action="new" type="button">
                  <i class="ace-icon fa fa-pencil"></i>新增
                </button>
              </div>
            </div>
            <!-- function button end -->
            <!-- table data begin-->
            <input type="hidden" id="action" name="action" value="">            
            <input type="hidden" id="queryInput.queryTitle" name="queryInput.queryTitle"  />
            <input type="hidden" id="queryInput.queryLevel" name="queryInput.queryLevel" value="${queryInput.queryLevel}" />
            <input type="hidden" id="queryInput.queryPublishTimeFrom" name="queryInput.queryPublishTimeFrom" value="${queryInput.queryPublishTimeFrom}" />
            <input type="hidden" id="queryInput.queryPublishTimeTo" name="queryInput.queryPublishTimeTo" value="${queryInput.queryPublishTimeTo}" />
            <input type="hidden" id="queryInput.queryExpireTimeFrom" name="queryInput.queryExpireTimeFrom" value="${queryInput.queryExpireTimeFrom}" />
            <input type="hidden" id="queryInput.queryExpireTimeTo" name="queryInput.queryExpireTimeTo" value="${queryInput.queryExpireTimeTo}" />            
            <input type="hidden" id="queryInput.queryIsAll" name="queryInput.queryIsAll" value="${queryInput.queryIsAll }" />
                        
            <input type="hidden" id="queryInput.queryOrder" name="queryInput.queryOrder" value="${queryInput.queryOrder}" />
            <input type="hidden" id="queryInput.queryOrderBy" name="queryInput.queryOrderBy" value="${queryInput.queryOrderBy}" />
            <input type="hidden" id="pageCtrl.pageCount" name="pageCtrl.pageCount" value="${pageCtrl.pageCount}" />
            <input type="hidden" id="pageCtrl.total" name="pageCtrl.total" value="${pageCtrl.total }" />
            <input type="hidden" id="pageCtrl.current" name="pageCtrl.current" value="${pageCtrl.current }" />
            <input type="hidden" id="pageCtrl.action" name="pageCtrl.action" value="${pageCtrl.action }" />
            <input type="hidden" id="selectedId" name="selectedId" value="" />
            <table class="table table-striped table-bordered table-hover dataTable no-footer">
              <thead>
                <tr>
                  <c:choose>
                    <c:when test="${queryInput.queryOrderBy =='发布时间' }">
                      <th class="sorting_${queryInput.queryOrder }" data-active="true" data-column="发布时间">发布时间</th>
                    </c:when>
                    <c:otherwise>
                      <th class="sorting" data-column="发布时间">发布时间</th>
                    </c:otherwise>
                  </c:choose>
                  <c:choose>
                    <c:when test="${queryInput.queryOrderBy =='失效时间' }">
                      <th class="sorting_${queryInput.queryOrder }" data-active="true" data-column="失效时间">失效时间</th>
                    </c:when>
                    <c:otherwise>
                      <th class="sorting" data-column="失效时间">失效时间</th>
                    </c:otherwise>
                  </c:choose>
                  <c:choose>
                    <c:when test="${queryInput.queryOrderBy =='标题' }">
                      <th class="sorting_${queryInput.queryOrder }" data-active="true" data-column="标题">标题</th>
                    </c:when>
                    <c:otherwise>
                      <th class="sorting" data-column="标题">标题</th>
                    </c:otherwise>
                  </c:choose>
                  <c:choose>
                    <c:when test="${queryInput.queryOrderBy =='作者' }">
                      <th class="sorting_${queryInput.queryOrder }" data-active="true" data-column="作者">起草人</th>
                    </c:when>
                    <c:otherwise>
                      <th class="sorting" data-column="作者">起草人</th>
                    </c:otherwise>
                  </c:choose>
                  <c:choose>
                    <c:when test="${queryInput.queryOrderBy =='级别' }">
                      <th class="sorting_${queryInput.queryOrder }" data-active="true" data-column="级别">级别</th>
                    </c:when>
                    <c:otherwise>
                      <th class="sorting" data-column="级别">级别</th>
                    </c:otherwise>
                  </c:choose>                  
                  <th></th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="item" items="${records}">
                  <c:set var="invalidClass" value=""></c:set>
                  <c:if test="${item.expired!=0}">
                    <c:set var="invalidClass" value="deleted-text red"></c:set>
                  </c:if>
                  <tr class="${invalidClass}">
                    <td><fmt:formatDate value="${item.publishTime}" pattern="yyyy-MM-dd" /></td>
                    <td><fmt:formatDate value="${item.expireTime}" pattern="yyyy-MM-dd" /></td>
                    <td>${item.title}</td>
                    <td>${item.authorName }</td>
                    <td>${item.levelName}</td>
                    <td>
                      <div class="hidden-sm hidden-xs btn-group">
                        <button data-original-title="查看" data-rel="tooltip"  title="" class="btn btn-xs btn-info tooltip-info" data-action='view' data-item="${item.id }" type="button">
                          <i class="ace-icon fa fa-search bigger-120" ></i>
                        </button>
                        <button data-original-title="编辑" data-rel="tooltip"  title="" class="btn btn-xs btn-warning tooltip-warning" data-action="modify" data-item="${item.id }" type="button">
                          <i class="ace-icon fa fa-edit bigger-120"></i>
                        </button>
                        <c:choose>
                          <c:when test="${item.expired!=0}">
                            <button data-original-title="再发布" data-rel="tooltip"  title="" class="btn btn-xs btn-danger tooltip-success" data-action="reactive" data-item="${item.id }" type="button">
                              <i class="ace-icon fa fa-check bigger-120"></i>
                            </button>
                          </c:when>
                          <c:otherwise>
                            <button data-original-title="结束 " data-rel="tooltip"  title="" class="btn btn-xs btn-danger tooltip-error" data-action="cancel" data-item="${item.id }" type="button">
                              <i class="ace-icon fa fa-ban bigger-120"></i>
                            </button>                            
                          </c:otherwise>
                        </c:choose>                                                  
                      </div>
                      <div class="hidden-md hidden-lg">
                        <div class="inline position-relative">
                          <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown"
                            data-position="auto">
                            <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                          </button>

                          <ul
                            class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                            <li>
                              <a data-original-title="查看" href="#" class="tooltip-info" data-rel="tooltip" title="" data-action="view" data-item="${item.id }">
                                <span class="blue">
                                  <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                </span>
                              </a>
                            </li>

                            <li>
                              <a data-original-title="编辑" href="#" class="tooltip-success" data-rel="tooltip" title="" data-action="modify" data-item="${item.id }">
                                <span class="green">
                                  <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                </span>
                              </a>
                            </li>
                            <li>
                            <c:choose>
                              <c:when test="${item.expired!=0}">
                              <a data-original-title="再发布" href="#" class="tooltip-success" data-rel="tooltip" title="" data-action="reactive" data-item="${item.id }">
                                <span class="green">
                                  <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                </span>
                              </a>                    
                              </c:when>
                              <c:otherwise>
                              <a data-original-title="结束" href="#" class="tooltip-error" data-rel="tooltip" title="" data-action="cancel" data-item="${item.id }">
                                <span class="red">
                                  <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                </span>
                              </a>                    
                            </c:otherwise>
                          </c:choose>
                          </li>
                          </ul>
                        </div>
                      </div>

                    </td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
            <!-- table data end -->
            <div class="row">
              <!-- functon button begin -->
                <c:choose>
                  <c:when test="${pageCtrl.total > 0 }">
                    <div class="col-xs-12 col-sm-6">共${pageCtrl.pageCount }页${pageCtrl.total }条记录, 当前第${pageCtrl.current + 1}页</div>
                  </c:when>
                  <c:otherwise>
                    <div class="col-xs-12 col-sm-6">无记录</div>
                  </c:otherwise>
                </c:choose>
                <div class="col-xs-12 col-sm-6">
                  <div>
                    <c:set var="disableFirst" value="btn-info"></c:set>
                    <c:if test="${pageCtrl.current==0}">
                      <c:set var="disableFirst" value="disabled"></c:set>
                    </c:if>
                    <c:set var="disableLast" value="btn-info"></c:set>
                    <c:if test="${pageCtrl.current==pageCtrl.pageCount -1 }">
                      <c:set var="disableLast" value="disabled" ></c:set>
                    </c:if>                    
                    <ul class="pagination">
                      <li>
                        <button id="firstPage" class="btn btn-xs ${disableFirst }" data-page="first" type="button" >首页</button>
                      </li>
                      <li>
                        <button id="priorPage" class="btn btn-xs ${disableFirst }" data-page="prior" type="button"  >上一页</button>
                      </li>
                      <li>
                        <button id="nextPage" class="btn btn-xs ${disableLast }" data-page="next" type="button"  >下一页</button>
                      </li>
                      <li>
                        <button id="lastPage" class="btn btn-xs ${disableLast }" data-page="last" type="button" >末尾</button>
                      </li>
                    </ul>
                </div>
              </div>
            </div>
            <!-- function button end -->
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
	var scripts = [ null, "resources/js/jquery.hotkeys.min.js","resources/js/bootstrap-wysiwyg.min.js", null ]
	ace.load_ajax_scripts(scripts, function() {
		$('.input-daterange').datepicker({
			format: "yyyy-mm-dd",
			autoclose: true,
			todayHighlight: true,
			todayBtn: true,
			language: "zh-CN",
			endDate : new Date()
		});
		
		$('#content_container').bindPage({
			reset : function() {
				$('#queryInput [name="queryTitle"]').val("");
				$('#queryInput [name="queryLevel"]').val("");
				$('#queryInput [name="queryPublishTimeFrom"]').val("");
				$('#queryInput [name="queryPublishTimeTo"]').val("");
				$('#queryInput [name="queryExpireTimeFrom"]').val("");
				$('#queryInput [name="queryExpireTimeTo"]').val("");
				$('#queryInput [name="queryIsAll"]').prop("checked", false);
			},
			afterSave : function (){
				$('[id="pageCtrl.total"]').val("-1");
				return true;
			},
			beforeSave : function(){
				var content=$('#editor1').html();
				console.log(content);
				$('#detailInput #mainText').val(content);
				return true;
			},
			detailUrl : 'system/notice/detail',
			listUrl : 'system/notice/list',
			refreshUrl : 'system/notice/table'
		});

	});
</script>
