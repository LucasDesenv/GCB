<%@ page contentType="application/javascript;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        angular.module('gcb')
                .controller('AutorController', function ($scope, $resource) {
                    $scope.autor;
                    var Autor = $resource('/GCB/autor/ ', null,{isArray:false});
                    Autor.get().$promise.then(function (autor) {
                        $scope.autor = autor;
                    });
                });
