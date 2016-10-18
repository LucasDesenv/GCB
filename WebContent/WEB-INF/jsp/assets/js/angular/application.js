angular.module('gcb', ['ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'pages/home.html',
                controller: 'MainController'
            })
            .when('/autor', {
                templateUrl: 'pages/autor.html',
                controller: 'AutorController'
            })
            .when('/blog', {
                templateUrl: 'pages/blog.html',
                controller: 'BlogController'
            })
            .when('/categoria', {
                templateUrl: 'pages/categoria.html',
                controller: 'CategoriaController'
            })
            .when('/leitor', {
                templateUrl: 'pages/leitor.html',
                controller: 'LeitorController'
            })
            .when('/perfil', {
                templateUrl: 'pages/perfil.html',
                controller: 'PerfilController'
            })
            .when('/pessoa', {
                templateUrl: 'pages/pessoa.html',
                controller: 'PessoaController'
            })
            .when('/publicacao', {
                templateUrl: 'pages/publicacao.html',
                controller: 'PublicacaoController'
            })
            .when('/usuario', {
                templateUrl: 'pages/usuario.html',
                controller: 'UsuarioController'
            });
    });


