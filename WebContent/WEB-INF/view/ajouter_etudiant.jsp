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
                <form:form method="post" action="add-etudiant" commandName="etudiant">
                <form:hidden path="motPasse" value="tttttttt"/>
                <form:hidden path="statut" value="1"/>
                
               		<div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Prenom</label>
                               <!--  <input type="text" name="firstname" class="form-control" /> -->
                                <form:input path="prenom"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Nom</label>
                                <!-- <input type="text" name="lastname" class="form-control" /> -->
                                <form:input path="nom"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->
              
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Email</label>
                                <!-- <input type="email" name="email" class="form-control" /> -->
                                <form:input path="mail"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Telephone</label>
                                <!-- <input type="url" name="tele" class="form-control" /> -->
                                <form:input path="telephone"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->
                    
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Groupe</label>
                                <!-- <input type="email" name="email" class="form-control" /> -->
                                <form:input path="groupe"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Filiere</label>
                                <!-- <input type="url" name="tele" class="form-control" /> -->
                                <form:input path="filiere"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->
                    
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Departement</label>
                                <!-- <input type="email" name="email" class="form-control" /> -->
                                <form:input path="departement"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">Niveau</label>
                                <!-- <input type="url" name="tele" class="form-control" /> -->
                                <form:input path="niveau"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                    </div><!-- row -->

                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">CNE</label>
                                <!-- <input type="email" name="fonction" class="form-control" /> -->
                                <form:input path="cne"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
                        
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label class="control-label">CIN</label>
                                <!-- <input type="url" name="cin" class="form-control" /> -->
                                <form:input path="cin"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-6 -->
						
						<div class="col-sm-12">
                            <div class="form-group">
                                <label class="control-label">Date Naissance</label>
                                <!-- <textarea class="form-control" rows="5" name="adresse"></textarea> -->
                                <form:input path="dateNaissance"  class="form-control" placeholder="mm/dd/yyyy" id="datepicker"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-12 -->
						
                        <div class="col-sm-12">
                            <div class="form-group">
                                <label class="control-label">Adresse</label>
                                <!-- <textarea class="form-control" rows="5" name="adresse"></textarea> -->
                                <form:input path="adresse"  class="form-control"/>
                            </div><!-- form-group -->
                        </div><!-- col-sm-12 -->

                        
                    </div><!-- row -->
                </div><!-- panel-body -->
                <div class="panel-footer">
                	<input type="submit" class="btn btn-primary" value="Ajouter">
                	<input type="reset" class="btn btn-default" value="Cancel">
                    <!-- <button class="btn btn-primary">Ajouter</button> -->
                    <!-- <button type="reset" class="btn btn-default">Cancel</button> -->
                </div><!-- panel-footer -->
                
                </form:form>
            </div><!-- panel -->
            
        </div><!-- col-md-6 --> 
    </div><!-- row -->

</div><!-- contentpanel -->

<jsp:include page="footer.jsp" />
