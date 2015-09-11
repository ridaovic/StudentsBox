<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />

				<div class="contentpanel">

					<div class="panel panel-primary-head">

					<c:if  test="${!empty reclamationList}">
						<table id="basicTable"
							class="table table-striped table-bordered responsive">
							<thead class="">
								<tr>
									<th>Identifiant</th>
									<th>Responsable</th>
									<th>Édité par</th>
									<th>Type</th>
									<th>Sujet</th>
									<th>Date reclamation</th>
									<th>Visibilite </th>
									
									<th>Action</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach items="${reclamationList}" var="emp">
								<tr>
									<td># ${emp.id} </td>
									<td>${emp.admin.nom}</td>
                                    <td>${emp.etudiant.nom}</td>
									<td>${emp.type}</td>
									<td>${emp.sujet}</td>
									<td>${emp.date}</td>
									  
                                    <td>
											<c:choose>
												    <c:when test="${emp.visibilite}"><a href="vs-reclamation/${emp.id}"><i style="width: 100%;" class="fa fa-eye blue"></i></a></c:when> 
												    <c:otherwise><a href="vs-reclamation/${emp.id}"><i style="width: 100%;" class="fa fa-eye-slash rouge"></i></a></c:otherwise>   
											</c:choose>
									</td>
										
									<td><a href="info-reclamation-${emp.id}"> <i style="width: 100%;" class="fa fa-info"></i></a></td>
									</a></td>
								</tr>
							 </c:forEach>
							

							</tbody>
						</table>
						
					</c:if>
					</div>
					<!-- panel -->

					<br />



				</div>
				<!-- contentpanel -->
			
<jsp:include page="footer.jsp" />
