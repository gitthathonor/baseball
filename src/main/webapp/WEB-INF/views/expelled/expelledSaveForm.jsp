<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<label for="playerId" class="form-label">선수명 :</label> <select id="player" class="form-select">
				<option value="none">== 선수 선택 ==</option>
				<c:forEach var="player" items="${playerList}">
					<option value="${player.id}">${player.name}</option>
				</c:forEach>
			</select>
		</div>
		<div class="mb-3 mt-3">
			<label for="reason">퇴출사유 : </label> <input id="reason" type="text" class="form-control"
				placeholder="퇴출 사유를 적어주세요" name="reason">
		</div>
		<button id="btnSave" type="button" class="btn btn-primary">퇴출</button>
	</form>
</div>

<script>
$("#btnSave").click(()=>{
	
	let data = {
		playerId:$("#player").val(),
		reason:$("#reason").val()
	};
	console.log(data);
	
	$.ajax("/expelled",{
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res)=>{
		if(res.code == 1) {
			alert(res.msg);
			location.href="/expelled";
		} else {
			alert("선수가 퇴출되지 않았습니다.");
			history.back();
		}
	});
}); 
</script>

<%@ include file="../layout/footer.jsp"%>