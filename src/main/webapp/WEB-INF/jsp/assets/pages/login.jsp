<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="middle-box text-center loginscreen animated fadeInDown">
		<div>
			<div>
				<h1 class="logo-name">Blog</h1>
			</div>
			<h3>Welcome to Login</h3>
			<p>Login in.</p>
			<form class="form-horizontal" ng-submit="logar()">
				<div class="form-group">
					<input type="text" ng-model="usuario.email" placeholder="E-mail" class="form-control">
				</div>
				<div class="form-group">
					<input type="password" ng-model="usuario.senha" class="form-control" placeholder="Password" required="">
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">Login</button>
				<a href="#"><small>Forgot password?</small></a>
				<p class="text-muted text-center">
					<small>Do not have an account?</small>
				</p>
				<a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>
			</form>
	</div>
</div>
