<%@ page contentType="application/javascript;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        angular.module('gcb', ['ngRoute'])
                .config(function ($routeProvider) {
                    $routeProvider
                            .when('/', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/home.html',
                                controller: 'MainController'
                            })
                            .when('/autor', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/autor.html',
                                controller: 'AutorController'
                            })
                            .when('/blog', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/blog.html',
                                controller: 'BlogController'
                            })
                            .when('/categoria', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/categoria.html',
                                controller: 'CategoriaController'
                            })
                            .when('/leitor', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/leitor.html',
                                controller: 'LeitorController'
                            })
                            .when('/perfil', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/perfil.html',
                                controller: 'PerfilController'
                            })
                            .when('/pessoa', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/pessoa.html',
                                controller: 'PessoaController'
                            })
                            .when('/publicacao', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/publicacao.html',
                                controller: 'PublicacaoController'
                            })
                            .when('/usuario', {
                                templateUrl: '${linkTo[AssetsController].assets("")}pages/usuario.html',
                                controller: 'UsuarioController'
                            });
                });


