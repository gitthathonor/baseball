<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<button id="btn" type="button">테스트</button>
<div class="container">
	<h1 style="text-align:center">팀 등록</h1>
	<form>
      <div class="d-flex justify-content-center">
         <select id="stadium">
            <option value="none">== 구장 선택 ==</option>
            <c:forEach var="stadium" items="${stadiumList}">
               <option value="${stadium.id}">${stadium.name}</option>
            </c:forEach>
         </select>
         <div style="width: 500px">
            <input id="name" class="form-control" placeholder="구단 이름 작성" />
         </div>
         <button id="btnSave" type="button" class="btn btn-primary">등록</button>
      </div>
   </form>
</div>

<script>
	$("#btn").click(()=>{
		let id = $("#stadium").val();
		console.log(id);
	});

	$("#btnSave").click(()=>{
		
		let data = {
			stadiumId:$("#stadium").val(),
			name:$("#name").val()
		};
		console.log(data);
		
		$.ajax("/team/save",{
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: { // http header에 들고갈 요청 데이터
				"Content-Type": "application/json"
			}
		}).done((res)=>{
			if(res.code == 1) {
				alert(res.msg);
				location.href="/team";
			} else {
				alert("팀 등록이 제대로 되지 않았습니다.");
				history.back();
			}
		});
	}); 
</script>

<%@ include file="../layout/footer.jsp"%>