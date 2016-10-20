<%@ page contentType="application/javascript;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        angular.module('gcb', ['ngRoute', 'ngResource'])
                .config(function ($routeProvider) {
                    $routeProvider
                            .when('/', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/home.jsp',
                                controller: 'MainController'
                            })
                            .when('/autor', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/autor.jsp',
                                controller: 'AutorController'
                            })
                            .when('/blog', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/blog.jsp',
                                controller: 'BlogController'
                            })
                            .when('/categoria', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/categoria.jsp',
                                controller: 'CategoriaController'
                            })
                            .when('/leitor', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/leitor.jsp',
                                controller: 'LeitorController'
                            })
                            .when('/perfil', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/perfil.jsp',
                                controller: 'PerfilController'
                            })
                            .when('/pessoa', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/pessoa.jsp',
                                controller: 'PessoaController'
                            })
                            .when('/publicacao', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/publicacao.jsp',
                                controller: 'PublicacaoController'
                            })
                            .when('/usuario', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/usuario.jsp',
                                controller: 'UsuarioController'
                            })
                            .when('/login', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/login.jsp',
                                controller: 'LoginController'
                            });
                });


