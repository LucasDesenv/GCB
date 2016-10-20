<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="jumbotron text-center">
    <h1>Publicação Page</h1>
</div>

<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">
                <div class="ibox-content">
                    <form class="form-horizontal" ng-submit="inserePublicacao()">
                        <div class="form-group">
                            <label class="col-lg-2 control-label">Título</label>
                            <div class="col-lg-10">
                                <input type="text" ng-model="publicacao.titulo" placeholder="Título" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-lg-2 control-label">Subtítulo</label>
                            <div class="col-lg-10">
                                <input type="text" placeholder="Subtítulo" ng-model="publicacao.subtitulo" class="form-control">
                            </div>
                        </div>

                        <div class="form-group"><label class="col-lg-2 control-label">Descrição</label>
                            <div class="col-lg-10">
                                <textarea rows="5" cols="1" ng-model="publicacao.descricao" class="form-control"></textarea>
                            </div>
                        </div>

                        <div ><label class="col-lg-2 control-label">Categoria</label>
                            <div class="col-lg-10">
                                <select class="form-control m-b" name="account" ng-model="publicacao.categoria">
                                    <option value="ENTRETENIMENTO">ENTRETENIMENTO</option>
                                    <option value="DIVERSOS">DIVERSOS</option>
                                </select>
                            </div>

                        </div>

                        <div class="form-group">
                            <label class="col-lg-2 control-label">Tags</label>
                            <div class="col-lg-10">
                                <input type="text" placeholder="Tags" ng-model="publicacao.tags" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-lg-2 control-label"> Publicado </label>
                            <div class="col-lg-1">
                                <input type="checkbox" ng-model="publicacao.publicado" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-4 col-sm-offset-2">
                                <button class="btn btn-white" type="reset">Limpar</button>
                                <button class="btn btn-primary" type="submit">Adicionar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox float-e-margins">
                <div class="ibox-content">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover" DataTable>
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>Título</th>
                                <th>Subtítulo</th>
                                <th>Categoria</th>
                                <th>Data</th>
                                <th>Tags</th>
                                <th>Publicado</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr ng-repeat="pub in publicacoes">
                                <th>{{pub.id}}</th>
                                <th>{{pub.titulo}}</th>
                                <th>{{pub.subtitulo}}</th>
                                <th>{{pub.categoria}}</th>
                                <th>{{pub.dataCriacao}}</th>
                                <th>{{pub.tags}}</th>
                                <th>{{pub.publicado?'true':'false'}}</th>
                            </tr>
                            </tbody>
                            <tfoot>
                            <tr>
                                <th>ID</th>
                                <th>Título</th>
                                <th>Subtítulo</th>
                                <th>Categoria</th>
                                <th>Data</th>
                                <th>Tags</th>
                                <th>Publicado</th>
                            </tr>
                            </tfoot>
                        </table>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

<script>
    $('table').ready(function () {
        $('table').DataTable({});
    });
</script>