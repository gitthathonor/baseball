<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>팀명</th>
        <th>포지션</th>
        <th>선수명</th>
        <th>등록일</th>
        <th>수정</th>
        <th><button id="btnDelete" class="btn btn-danger">삭제</button></th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="player" items="${playerList}">
      <tr>
        <td>${player.rownum}</td>
        <td>${player.teamName}</td>
        <td>${player.position}</td>
        <td>${player.name}</td>
        <td>${player.createdAt}</td>
        <td><button id="btnUpdate" class="btn btn-warning">수정</button></td>
        <td><input onclick="getDeleteId(${player.id})" name="id" type="checkbox" class="form-check-input" value="${player.id}" ></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<script>
	/* function deletePlayer(id, obj) {
		let tr = $(obj).parent().parent();
		
		let data = {
				id : id
		}
		
		console.log(data);
		console.log(data.id);
		
		$.ajax("/player/"+data.id+"/delete",{
			type: "DELETE",
			dataType: "json",
			data:data
		}).done((res)=>{
			if(res.code == 1) {
				alert(res.msg);
				location.reload();
			} else {
				alert("해체에 실패하였습니다.");
			}
		});
	} */
	
	$("#btnDelete").click((id)=>{
		let ids = getDeleteId(id);
		console.log(ids);
		
		let data = {
			ids: ids
		};
		
		console.log(data);
		
		$.ajax("/player/delete",{
			type: "DELETE",
			dataType: "json",
			data:JSON.stringify(data),
			headers: { 
				"Content-Type": "application/json"
			}
		}).done((res)=>{
				if(res.code == 1) {
					alert("선수 삭제 완료");
					location.reload();
				} else {
					alert("퇴출에 실패하였습니다.");
				}
		}); 
	});
	
	
	
	
		/* for(let i = 0; i<arr.length; i++) {
		$.ajax("/player/"+data.arr[i]+"/delete",{
			type: "DELETE",
			dataType: "json",
			data:data
		}).done((res)=>{
			if(res.code == 1) {
				alert("선수 삭제 완료");
				location.reload();
			} else {
				alert("퇴출에 실패하였습니다.");
			}
			}); 
		} */

	
	
	function getDeleteId(id) {
		console.log(id);
		
		var arr = new Array();
		
		$("input:checkbox[name='id']").each(function(){
			if($(this).is(":checked") == true){
				arr.push($(this).val());
			}
		});
		
		//alert("성공" + arr);
		console.log(arr);
		
		/* let data = {
			arr:arr
		}; */
		
		// console.log(data);
		return arr;
	}
	
</script>

<%@ include file="../layout/footer.jsp" %>