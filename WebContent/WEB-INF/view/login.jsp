<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
    
<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Autentification</title>

        <link href="resources/css/style.default.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="resources/js/html5shiv.js"></script>
        <script src="resources/js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body class="signin">
        
        
        <section>
            
            <div class="panel panel-signin">
                <div class="panel-body">
                    <div class="logo text-center">
                        <img src="resources/images/logo-primary.png" alt="Chain Logo" >
                    </div>
                    <br /><!-- 
                    <h4 class="text-center mb5">Already a Member?</h4>
                    <p class="text-center">Sign in to your account</p>
                     -->
                    <div class="mb30">
                    	<c:if test="${not empty error}">
								<div class="error">${error}</div>
							</c:if>
							<c:if test="${not empty msg}">
								<div class="msg">${msg}</div>
							</c:if>
                    </div>
                    
                    <form name="f" action="<c:url value='j_spring_security_check'/>" method="POST">
                        <div class="input-group mb15">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input type="text" class="form-control" name="j_username" placeholder="Identifiant">
                        </div><!-- input-group -->
                        <div class="input-group mb15">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <input type="password" class="form-control" name="j_password" placeholder="Mot de passe">
                        </div><!-- input-group -->
                        
                        <div class="clearfix">
                            <div class="pull-left">
                                <div class="ckbox ckbox-primary mt10">
                                    <input type="checkbox" id="rememberMe" value="1">
                                    <label for="rememberMe">Se souvenir de moi</label>
                                </div>
                            </div>
                            <div class="pull-right">
                                <!-- <input name="submit" type="submit" class="btn btn-success"> -->
                                <button type="submit" name="submit" class="btn btn-success">Connexion <i class="fa fa-angle-right ml5"></i></button>
                            </div>
                        </div>                      
                    </form>
                    
                </div>
            </div><!-- panel -->
            
        </section>


        <script src="resources/js/jquery-1.11.1.min.js"></script>
        <script src="resources/js/jquery-migrate-1.2.1.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <script src="resources/js/modernizr.min.js"></script>
        <script src="resources/js/pace.min.js"></script>
        <script src="resources/js/retina.min.js"></script>
        <script src="resources/js/jquery.cookies.js"></script>

        <script src="resources/js/custom.js"></script>

    </body>

</html>
