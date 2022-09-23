<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container mt-3">
	<form>
		<div class="mb-3 mt-3">
			<label for="email">경기장 : </label> 
			<input id="name" type="text" class="form-control" placeholder="경기장 이름을 적어주세요" name="name">
		</div>
		<button id="btnSave" type="button" class="btn btn-primary">등록</button>
	</form>
</div>

<script src="/js/stadium.js">

</script>
<%@ include file="../layout/footer.jsp" %>