<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container mt-3">
	<form action="/player/save" method="post">
		<div class="mb-3 mt-3">
			팀:
			<select>
				<option></option>
			</select>
			<br>
			선수명 : <input id="name" type="text" class="form-control" placeholder="선수명을 적어주세요" name="name">
			포지션 : <input id="position" type="text" class="form-control" placeholder="포지션을 적어주세요" name="position">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp" %>