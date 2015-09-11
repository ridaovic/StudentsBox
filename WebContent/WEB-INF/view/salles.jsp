<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
                    
                    <div class="contentpanel">
                       
                        <div class="panel panel-primary-head">
                            
                            <c:if  test="${!empty salleList}">
                            <table id="basicTable" class="table table-striped table-bordered responsive">
                                <thead class="">
                                    <tr>
                                        <th>Identifiant</th>
                                        <th>Numero</th>
                                        <th>Type</th>
                                        <th>Nombre des places</th>
                                        <th>Status</th>
                                        <th>Modification</th>
                                        <th>Suppression</th>
                                    </tr>
                                </thead>
                         
                                <tbody>
                                <c:forEach items="${salleList}" var="emp">
                                    <tr>
                                        <td># ${emp.id}</td>
                                        <td>${emp.numero}</td>
                                        <td>${emp.type}</td>
                                        <td>${emp.nombre}</td>
                                        <td>
                                         	<c:choose>
												    <c:when test="${emp.statut}"><a href="ed-salle/${emp.id}"><i style="width: 100%;" class="fa fa-thumbs-o-up blue"></i></a></c:when> 
												    <c:otherwise><a href="ed-salle/${emp.id}"><i style="width: 100%;" class="fa fa-thumbs-o-down rouge"></i></a></c:otherwise>   
											</c:choose>
                                       </td>
                                        <td><a href="update-salle-${emp.id}"><i style="width: 100%;" class="fa fa-pencil-square-o blue"></i></a></td>
                                        <td><a href="delete-salle/${emp.id}"><i style="width: 100%;" class="fa fa-trash-o rouge"></i></a></td>
                                           
                                    </tr>
                                  </c:forEach>

                                    
                                </tbody>
                            </table>
                            </c:if>
                        </div><!-- panel -->
                        
                        <br />
                        
                       
                        
                    </div><!-- contentpanel -->

<jsp:include page="footer.jsp" />