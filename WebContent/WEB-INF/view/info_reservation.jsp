<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
   
<div class="contentpanel">
    <div class="row">
        <div class="col-md-12"> 
            <div class="panel panel-default">
                <div class="panel-heading">
                    <div class="panel-btns">
                        <a href="#" class="panel-minimize tooltips" data-toggle="tooltip" title="Minimize Panel"><i class="fa fa-minus"></i></a>
                        <a href="#" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                    </div><!-- panel-btns -->
                    <h4 class="panel-title">Informations sur reservation</h4>
                    
                </div>
                <div class="panel-body">
                <c:if  test="${!empty reservation}">
                <fieldset disabled="">
                                        
               		<div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Responsable</label>
                                 <input type="text" placeholder="${reservation.admin.nom}" class="form-control" />
                             </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Etudiant</label>
                               <input type="text" placeholder="${reservation.etudiant.nom}" class="form-control" />
                               
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->
              
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Numero Salle</label>
                                <input type="text" placeholder="${reservation.salle.numero}"  class="form-control" />
                                
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Departement</label>
                                 <input type="text" placeholder="${reservation.salle.type}"  class="form-control" />
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->

                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Date debut</label>
                                <input type="text" placeholder="${reservation.debut}"  class="form-control" /> 
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Date fin</label>
                               <input type="text" placeholder="${reservation.fin}"  class="form-control" /> 
                             </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
					
					</c:if>	

                        
                    </div><!-- row -->
                </div><!-- panel-body -->
                <div class="panel-footer">
                	<a class="btn btn-primary" href="reservations" style="width: 100%"> Retour </a>
                	
                </div><!-- panel-footer -->
                
          </fieldset>     
            
        </div><!-- col-md-6 --> 
    </div><!-- row -->

</div><!-- contentpanel -->

<jsp:include page="footer.jsp" />
