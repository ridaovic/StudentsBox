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
                    <h4 class="panel-title">Informations sur plaint</h4>
                    
                </div>
                <div class="panel-body">
                <c:if  test="${!empty plaint}">
                <fieldset disabled="">
                                        
               		<div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Responsable</label>
                                 <input type="text" placeholder="${plaint.admin.nom}" class="form-control" />
                             </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Etudiant</label>
                               <input type="text" placeholder="${plaint.etudiant.nom}" class="form-control" />
                               
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->
              
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Sujet</label>
                                <input type="text" placeholder="${plaint.sujet}"  class="form-control" />
                                
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Type</label>
                                 <input type="text" placeholder="${plaint.type}"  class="form-control" />
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="form-group">
                                <label class="control-label">Contenu</label>
                                <textarea rows="5" class="form-control" placeholder="${plaint.contenu}" required=""></textarea>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
					
					</c:if>	

                        
                    </div><!-- row -->
                </div><!-- panel-body -->
                <div class="panel-footer">
                	<a class="btn btn-primary" href="plaints" style="width: 100%"> Retour </a>
                	
                </div><!-- panel-footer -->
                
          </fieldset>     
            
        </div><!-- col-md-6 --> 
    </div><!-- row -->

</div><!-- contentpanel -->

<jsp:include page="footer.jsp" />
