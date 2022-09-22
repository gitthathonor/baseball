<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container mt-3">
	<form action="/stadium/save" method="post">
		<div class="mb-3 mt-3">
			<label for="email">경기장 : </label> 
			<input id="name" type="text" class="form-control" placeholder="경기장 이름을 적어주세요" name="name">
		</div>
		<button type="button" class="btn btn-primary">등록</button>
	</form>
</div>

<script>
$("#btnSave").click(()=>{
	
	let data = {
		name:$("#name").val()
	};
	console.log(data);
	
	$.ajax("/stadium/save",{
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res)=>{
		if(res.code == 1) {
			alert(res.msg);
			location.href="/stadium";
		} else {
			alert("경기장 등록이 제대로 되지 않았습니다.");
			history.back();
		}
	});
}); 
</script>
<%@ include file="../layout/footer.jsp" %>