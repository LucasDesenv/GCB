<%@ page contentType="application/javascript;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
angular.module('gcb')
    .controller('PublicacaoController', function ($scope,$resource) {
        $scope.publicacoes = [];
        $scope.publicacao = {};
        $scope.categorias;

        var Publicacao = $resource('/GCB/publicacoes/ ', null,{
            'save' : {method:'POST'}
        });

        var Categoria = $resource('/GCB/categorias/ ', null,{isArray:false});

        if(angular.isUndefined($scope.categorias)){
            Categoria.get().$promise.then(function (categorias) {
                $scope.categorias = categorias;
            });
        }

        var idPublicacao = 0;

        $scope.inserePublicacao = function () {
            idPublicacao++;
            $scope.publicacao["id"] = idPublicacao;
            Publicacao.save({publicacao:$scope.publicacao}).$promise.then(function (retorno) {
                $scope.publicacoes.push(retorno);
            });
        }


    });
