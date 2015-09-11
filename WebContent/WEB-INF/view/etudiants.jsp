<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
                    
                    <div class="contentpanel">
                       
                        <div class="panel panel-primary-head">
                            
                            <c:if  test="${!empty etudiantList}">
                            <table id="basicTable" class="table table-striped table-bordered responsive">
                                <thead class="">
                                    <tr>
                                        <th>Identifiant</th>
                                        <th>Nom</th>
                                        <th>Prenom</th>
                                        <th>Adresse</th>
                                        <th>Date de naissance</th>
                                        <th>Email</th>
                                        <th>Status</th>
                                    </tr>
                                </thead>
                         
                                <tbody>
                                <c:forEach items="${etudiantList}" var="emp">
                                    <tr>
                                        <td># ${emp.id}</td>
                                        <td>${ emp.nom }</td>
                                        <td>${ emp.prenom }</td>
                                        <td>${ emp.adresse }</td>
                                        <td>${ emp.dateNaissance }</td>
                                        <td>${ emp.mail }</td>
                                        <td>
                                         	<c:choose>
												    <c:when test="${emp.statut}"><a href="ed-etudiant/${emp.id}"><i style="width: 100%;" class="fa fa-thumbs-o-up blue"></i></a></c:when> 
												    <c:otherwise><a href="ed-etudiant/${emp.id}"><i style="width: 100%;" class="fa fa-thumbs-o-down rouge"></i></a></c:otherwise>   
											</c:choose>
                                       </td>
                                    </tr>
                                  </c:forEach>



                                    
                                </tbody>
                            </table>
                            </c:if>
                        </div><!-- panel -->
                        
                        <br />
                        
                       
                        
                    </div><!-- contentpanel -->

<jsp:include page="footer.jsp" />