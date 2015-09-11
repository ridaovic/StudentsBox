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
                    <h4 class="panel-title">Block Styled Form</h4>
                    <p>This is an example of form with block styled label.</p>
                </div>
                <div class="panel-body">
                <form:form method="post" action="add-salle" commandName="salle">
                	<div class="row">
                       <div class="col-sm-6">
                           <div class="form-group">
                               <label class="control-label">Numéro</label>
                               <form:input path="numero" class="form-control" />
                           </div><!-- form-group -->
                       </div><!-- col-sm-6 -->
                       
                       <div class="col-sm-6">
                           <div class="form-group">
                               <label class="control-label">Nombre de place</label>
                               <form:input path="nombre" class="form-control" />
                           </div><!-- form-group -->
                       </div><!-- col-sm-6 -->
                   </div><!-- row -->
             
                   <div class="row">
                       <div class="col-sm-12">
                           <div class="form-group">
                               <form:select path="type" id="select-search-hide" data-placeholder="Departement" class="width100p">
                                   <form:option value="dep1">dep1</form:option>
                                   <form:option value="dep2">dep2</form:option>
                                   <form:option value="dep3">dep3</form:option>
                                   
                               </form:select>
                           </div><!-- form-group -->
                       </div><!-- col-sm-6 -->
                       
                       
                   </div><!-- row -->
                                        
               		
                    	
                        
                    </div><!-- row -->
                </div><!-- panel-body -->
                <div class="panel-footer">
                	<input type="submit" class="btn btn-primary" value="Ajouter">
                	<input type="reset" class="btn btn-default" value="Cancel">
                    </div><!-- panel-footer -->
                
                </form:form>
            </div><!-- panel -->
            
        </div><!-- col-md-6 --> 
    </div><!-- row -->

</div><!-- contentpanel -->

<jsp:include page="footer.jsp" />
