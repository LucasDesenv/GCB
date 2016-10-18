<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html ng-app="gcb">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Blogs</title>

    <link href="${linkTo[AssetsController].assets("")}css/bootstrap.min.css" rel="stylesheet">
    <link href="${linkTo[AssetsController].assets("")}font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="${linkTo[AssetsController].assets("")}css/plugins/dataTables/datatables.min.css" rel="stylesheet">

    <link href="${linkTo[AssetsController].assets("")}css/animate.css" rel="stylesheet">
    <link href="${linkTo[AssetsController].assets("")}css/style.css" rel="stylesheet">

</head>

<body ng-controller="MainController">

<div id="wrapper">

    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear">
                                <span class="block m-t-xs"> <strong class="font-bold">David Williams</strong>
                             </span>
                            </span>
                        </a>
                    </div>
                    <div class="logo-element">
                        GCB
                    </div>
                </li>
                <li>
                    <a href="index.html">
                        <i class="fa fa-edit"></i>
                        <span class="nav-label">Cadastro</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level collapse" style="">
                        <li><a href="#autor"><i class="fa fa-graduation-cap"></i> <span
                                class="nav-label">Autor</span></a></li>
                        <li><a href="#blog"><i class="fa fa-book"></i> <span class="nav-label">Blog</span></a></li>
                        <li><a href="#categoria"><i class="fa fa-bookmark"></i> <span class="nav-label">Categoria</span></a>
                        </li>
                        <li><a href="#leitor"><i class="fa fa-binoculars"></i> <span class="nav-label">Leitor</span></a>
                        </li>
                        <li><a href="#perfil"><i class="fa fa-male"></i> <span class="nav-label">Perfil</span></a></li>
                        <li><a href="#pessoa"><i class="fa fa-smile-o"></i> <span class="nav-label">Pessoa</span></a>
                        </li>
                        <li><a href="#publicacao"><i class="fa fa-envelope-o"></i> <span
                                class="nav-label">Publicação</span></a>
                        </li>
                        <li><a href="#usuario"><i class="fa fa-user"></i> <span class="nav-label">Usuário</span></a>
                        </li>
                    </ul>
                </li>
            </ul>

        </div>
    </nav>

    <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top white-bg" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i>
                    </a>
                </div>
                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <a href="#">
                            <i class="fa fa-sign-out"></i> SAIR
                        </a>
                    </li>
                </ul>

            </nav>
        </div>


        <div class="wrapper wrapper-content animated fadeInRight">
            <div id="main">
                <div ng-view></div>
            </div>
        </div>
    </div>
</div>


<script src="${linkTo[AssetsController].assets("")}js/jquery-2.1.1.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/bootstrap.min.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/plugins/jeditable/jquery.jeditable.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/plugins/dataTables/datatables.min.js"></script>

<!-- Mainly scripts -->
<script src="${linkTo[AssetsController].assets("")}js/angular.min.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular-route.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular-resource.min.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/application.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/MainController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/AutorController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/BlogController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/CategoriaController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/LeitorController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/PerfilController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/PessoaController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/PublicacaoController.jsp"></script>
<script src="${linkTo[AssetsController].assets("")}js/angular/controllers/UsuarioController.jsp"></script>

<!-- Custom and plugin javascript -->
<script src="${linkTo[AssetsController].assets("")}js/plugins/pace/pace.min.js"></script>
<script src="${linkTo[AssetsController].assets("")}js/inspinia.js"></script>





</body>

</html>