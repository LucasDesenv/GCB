<%@ page contentType="application/javascript;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
angular.module('gcb')
    .controller('PublicacaoController', function ($scope,$resource) {
        $scope.users = [];
        $scope.user = {};
        var User = $resource('/GCB/usuarios/ ', null,{
            'login' : {method:'POST'}
        });

        $scope.logar = function () {
            User.login({user:$scope.user}).$promise.then(function (retorno) {
                $scope.usuarios.push(retorno);
            });
        }


    });
