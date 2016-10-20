<%@ page contentType="application/javascript;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
angular.module('gcb')
    .controller('PublicacaoController', function ($scope,$resource) {
        $scope.publicacoes = [];
        $scope.publicacao = {};
        var Publicacao = $resource('/GCB/publicacoes/ ', null,{
            'save' : {method:'POST'}
        });

        $scope.inserePublicacao = function () {
            Publicacao.save({publicacao:$scope.publicacao}).$promise.then(function (retorno) {
                $scope.publicacoes.push(retorno);
            });
        }


    });
