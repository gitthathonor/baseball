<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container mt-3">
	<form action="/stadium/save" method="post">
		<div class="mb-3 mt-3">
			<label for="email">경기장 : </label> 
			<input id="name" type="text" class="form-control" 
				placeholder="경기장 이름을 적어주세요" name="name">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp" %>