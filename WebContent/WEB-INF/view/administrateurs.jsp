<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
                    
                    <div class="contentpanel">
                    
                       
                        <div class="panel panel-primary-head">
  						
						  <c:if  test="${!empty administrateurList}">
                            <table id="basicTable" class="table table-striped table-bordered responsive">
                                <thead class="">
                                    <tr>
                                        <th>Identifiant</th>
                                        <th>Nom</th>
                                        <th>Prenom</th>
                                        <th>Adresse</th>
                                        <th>Date de naissance</th>
                                        <th>Telephone</th>
                                        <th>Email</th>
                                        <th>Fonction</th>
                                        <th>Modification</th>
                                        <th>Suppression</th>
                                        
                                    </tr>
                                </thead>
                         
                                <tbody>
                                    <c:forEach items="${administrateurList}" var="emp">
                                        <tr>
                                        
                                            <td># ${emp.id} </td> 
                                            <td>${emp.nom}</td>
                                            <td>${emp.prenom}</td>
                                            <td>${emp.adresse} </td>
                                            <td>${emp.dateNaissance}</td>
                                            <td>${emp.telephone}</td>
                                            <td>${emp.mail}</td>
                                            <td>${emp.fonction}</td>
                                            <td><a href="update-admin-${emp.id}"><i style="width: 100%;" class="fa fa-pencil-square-o blue"></i></a></td>
                                            <td><a href="delete-admin/${emp.id}"><i style="width: 100%;" class="fa fa-trash-o rouge"></i></a></td>
                                            
                                        </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                            
                            </c:if>
                            
                        </div><!-- panel -->
                        
                        <br />
                        
                       
                        
                    </div><!-- contentpanel -->
                    
<jsp:include page="footer.jsp" />